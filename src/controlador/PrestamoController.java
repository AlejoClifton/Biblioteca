package controlador;

import java.util.ArrayList;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DAOIMPL.DaoImplBiblioteca;
import DAOIMPL.DaoImplCliente;
import entidad.Biblioteca;
import entidad.Cliente;
import utils.ConfigHibernate;

@Controller
public class PrestamoController {
	
	@RequestMapping("prestamos.html")
	public ModelAndView Prestamo(String usuarioActual) {
		DaoImplCliente daoCliente = new DaoImplCliente();
		DaoImplBiblioteca daoBiblioteca = new DaoImplBiblioteca();
		
		ArrayList<Cliente> clientes = daoCliente.GetAll();
		ArrayList<Biblioteca> biblioteca = daoBiblioteca.getLibroXbilioteca();
		
		ModelAndView MV = new ModelAndView();
		
		MV.addObject("usuarioActual", usuarioActual);
		
		MV.addObject("clientesList",clientes);
		MV.addObject("bibliotecaList",biblioteca);
		
		MV.setViewName("prestamos");

		return MV;
	}
	
	@RequestMapping("pedirPrestamo.html")
	public ModelAndView PedirPrestamo(int biblioteca, String fecha, int cantdias, int cliente) {
		
		ModelAndView MV = new ModelAndView();
		
		
		
		/* ArrayList<Prestamo> prestamos = ;
		if (loans.size() > 0)
			MV.addObject("Prestamos", prestamos); */
		

	/*	ArrayList<Biblioteca> listBibliotecas = ();
		if (listBibliotecas.size() > 0)
			MV.addObject("bibliotecas", listBibliotecas); */
		
		DaoImplCliente dic = new DaoImplCliente();
		ArrayList<Cliente> list = dic.GetAll();
		
		if (list.size() > 0) {
		 MV.addObject("clientesList", list);
		}
		
		return MV;
	}
	
}
