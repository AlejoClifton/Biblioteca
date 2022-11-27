package controlador;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import entidad.Nacionalidad;
import utils.ConfigHibernate;

@Controller
public class NacionalidadController {

	@RequestMapping("Nacionalidad.html")
	public ModelAndView Biblioteca(String usuarioActual) {
		ModelAndView MV = new ModelAndView();
		MV.addObject("usuarioActual", usuarioActual);
		MV.setViewName("nacionalidad");
		//ConfigHibernate ch = new ConfigHibernate();

		// System.out.println(session.get(Nacionalidad.class,1));
		// System.out.println((Object)
		// session.createCriteria(Nacionalidad.class).list());

		//List<Nacionalidad> nacionalidades = session.createCriteria(Nacionalidad.class).list();

		// List<Nacionalidad> nacionalidades = new LinkedList<>();

		// Nacionalidad n1 = new Nacionalidad();
		// n1.setDescripcion("aaa");
		// nacionalidades.add(n1);
		//
		// Nacionalidad n2 = new Nacionalidad();
		// n2.setDescripcion("bbb");
		// nacionalidades.add(n2);

		//MV.addObject("nacionalidades", nacionalidades);


		return MV;
	}
}
