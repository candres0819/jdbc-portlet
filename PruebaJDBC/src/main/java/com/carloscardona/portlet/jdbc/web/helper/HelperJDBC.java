package com.carloscardona.portlet.jdbc.web.helper;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.PortletRequest;

import org.springframework.web.portlet.ModelAndView;

/**
 * 
 * 
 * @author carlos.cardona
 *
 */
public interface HelperJDBC {

	/**
	 * 
	 * 
	 * @param request
	 * @param model
	 * @return ModelAndView view
	 * @throws Exception
	 */
	ModelAndView render(PortletRequest request, ModelAndView model) throws Exception;

	/**
	 * 
	 * @param request
	 * @param uploadFile
	 * @param mv
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
	ModelAndView submit(ActionRequest request, ModelAndView mv) throws IOException, Exception;
}
