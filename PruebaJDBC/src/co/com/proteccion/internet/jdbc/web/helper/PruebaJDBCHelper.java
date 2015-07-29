package co.com.proteccion.internet.jdbc.web.helper;

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
public interface PruebaJDBCHelper {

	/**
	 * 
	 * 
	 * @param request
	 * @param mv
	 * @return
	 * @throws Exception
	 */
	ModelAndView render(PortletRequest request, ModelAndView mv) throws Exception;

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
