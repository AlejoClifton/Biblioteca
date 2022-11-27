package controlador;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import utils.ConfigHibernate;

@Controller
public class BibliotecaController {
	
	ModelAndView MV = new ModelAndView();

	@RequestMapping("Biblioteca.html")
	public ModelAndView Biblioteca(String usuarioActual) {
		
		MV.addObject("usuarioActual", usuarioActual);
		MV.setViewName("biblioteca");

		return MV;
	}
	
	/*@RequestMapping("AltaBiblioteca.html")
	public ModelAndView AltaBiblioteca() {
		
		
		
		return MV;
	}*/
	
}