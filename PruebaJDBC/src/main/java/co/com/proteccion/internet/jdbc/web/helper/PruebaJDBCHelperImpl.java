package co.com.proteccion.internet.jdbc.web.helper;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.PortletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.portlet.ModelAndView;

/**
 * 
 * 
 * @author carlos.cardona
 * 
 */
@Repository
public class PruebaJDBCHelperImpl implements PruebaJDBCHelper {

	public static final Logger LOGGER = LoggerFactory.getLogger(PruebaJDBCHelperImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public ModelAndView render(PortletRequest request, ModelAndView mv) throws Exception {
		mv.addObject("mensaje", "Inicio JDBC");
		mv.setViewName("inicio");
		return mv;
	}

	@Override
	public ModelAndView submit(ActionRequest request, ModelAndView mv) throws IOException, Exception {
		try {
			this.jdbcTemplate.execute("ALTER TABLE TGCE_ESTADOS MODIFY ESTDSCOMENTARIO Varchar2(1000)");
			mv.addObject("mensaje", "Se ha alterado la tabla correctamente");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("mensaje", e.getMessage());
		}
		mv.setViewName("result");
		return mv;
	}

}