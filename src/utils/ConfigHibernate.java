package utils;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ConfigHibernate {

	private SessionFactory sessionFactory;
	public Session session;

	public ConfigHibernate() {
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}

	public void abrirConexion() {
		session = sessionFactory.openSession();
	}
	// TODO: Para que funcione el login
	public Session abrirConexion1() {
		session = sessionFactory.openSession();
		return session;
	}
	
	public void Guardar(Object object) {
		session.save(object);
	}
	
	public void Actualizar(Object object) {
		session.update(object);
	}
	
	public void Eliminar(Object object) {
		session.delete(object);
	}
	
	public void CrearTransaccion() {
		session.beginTransaction();
	}
	
	public void RollBackTransaccion() {
		session.getTransaction().rollback();
	}
	
	public void ConfimarTransaccion() {
		session.getTransaction().commit();
	}
	
	public void cerrarSession() {
		session.close();
		cerrarSessionFactory();
	}

	private void cerrarSessionFactory() {
		sessionFactory.close();
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
