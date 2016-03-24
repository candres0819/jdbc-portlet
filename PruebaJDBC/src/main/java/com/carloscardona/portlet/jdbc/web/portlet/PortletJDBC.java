package com.carloscardona.portlet.jdbc.web.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.carloscardona.portlet.jdbc.web.helper.HelperJDBC;

/**
 * A sample portlet
 */
@Controller
@RequestMapping("VIEW")
public class PortletJDBC {

	@Autowired
	private HelperJDBC helper;

	/**
	 * Presenta las vistas tipo render y pos action.
	 * 
	 * @param request
	 * @param response
	 * @param mv
	 * @return
	 * @throws Exception
	 */
	@RenderMapping
	protected ModelAndView processView(PortletRequest request, ModelAndView mv) throws Exception {
		try {
			if (null == mv.getViewName()) {
				mv = helper.render(request, mv);
			}
		} catch (Exception e) {
			System.out.println(":::::::::::::::Render Error");
			e.printStackTrace();
		}
		return mv;
	}

	@ActionMapping(params = "action=submit")
	public void processAction(ActionRequest request, ActionResponse response, ModelAndView mv) throws IOException, Exception {
		mv = helper.submit(request, mv);
	}

	@ExceptionHandler
	public ModelAndView error(Exception e) {
		ModelAndView mv = new ModelAndView();
		System.out.println(":::::::::::::::Vista Error");
		e.printStackTrace();
		System.out.println(":::::::::::::::mesaje " + e.getMessage());
		System.out.println(":::::::::::::::causa " + e.getCause());
		mv.addObject("mensaje", e.getMessage() + " :::::::::: " + e.getCause());
		mv.setViewName("result");
		return mv;
	}

}