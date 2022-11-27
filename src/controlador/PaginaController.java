package controlador;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DAO.DaoNacionalidad;
import DAOIMPL.DaoImplCliente;
import DAOIMPL.DaoImplNacionalidad;
import entidad.Cliente;
import entidad.Nacionalidad;
import entidad.Usuario;
import utils.ConfigHibernate;

@Controller
public class PaginaController {
	private boolean dataCargada = false;
	
	@RequestMapping("login.html")
	public ModelAndView login(String txtUsuario, String txtContrasenia) {
		
		if(!dataCargada) {
			this.cargarData();
			dataCargada = true;
		}
		System.out.println("Estoy dentro de login");
		
		ModelAndView MV = new ModelAndView();
		MV.addObject("usuarioActual", txtUsuario);
		MV.setViewName("login");
		ModelAndView MVException = new ModelAndView();
		MVException.setViewName("login");

		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion1();

		try {
			Usuario usuario = (Usuario) session.createQuery("FROM Usuario u where u.usuarioLogeo =:usuarioParametro")
					.setParameter("usuarioParametro", txtUsuario).uniqueResult();
			if (usuario != null && usuario.getContrasenia().equals(txtContrasenia)) {
				ch.cerrarSession();
				return MV;
			}
			ch.cerrarSession();
			return MVException;
		} catch (Exception e) {
			System.out.printf("EXCEPCI”N");
			ch.cerrarSession();
			e.printStackTrace();
			return MVException;
		}
	}

	@RequestMapping("agregarUsuario.html")
	public ModelAndView agregarUsuario(String txtNombre, String txtApellido) {
		ModelAndView MV = new ModelAndView();
		MV.setViewName("index");

		// TODO - Agregar en un DaoUsuario
		SessionFactory sessionFactory;

		Configuration configuration = new Configuration();
		configuration.configure();

		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();

		sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		Usuario usuario = new Usuario();
		// usuario.setApellido(txtApellido);
		// usuario.setNombre(txtNombre);

		session.save(usuario);

		session.getTransaction().commit();

		session.close();

		sessionFactory.close();

		return MV;
	}

	@RequestMapping("index.html")
	public ModelAndView logeo(String txtUsuario, String txtContrasenia) {
		ModelAndView MV = new ModelAndView();
		MV.addObject("usuarioActual", txtUsuario);
		MV.setViewName("index");
		return MV;
	}
	
	private void cargarData() {
		DaoImplNacionalidad daoImplNacionalidad = new DaoImplNacionalidad();
		ArrayList<Nacionalidad> aux = new ArrayList<Nacionalidad>();
		
		Nacionalidad nacionalidad = new Nacionalidad("Argentina");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Paraguay");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Bolivia");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Chile");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Uruguay");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Mexico");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Costa Rica");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Bahamas");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Estados Unidos");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Canada");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Inglaterria");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Rusia");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Suecia");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Australia");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Japon");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Nueva Zelanda");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Brasil");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Magadascar");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Polonia");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Ucrania");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Armenia");
		aux.add(nacionalidad);

		nacionalidad = new Nacionalidad("Espa√±a");
		aux.add(nacionalidad);
		
		for (Nacionalidad n : aux) {
			daoImplNacionalidad.Agregar(n);
		}
	}

}
