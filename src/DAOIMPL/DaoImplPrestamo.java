package DAOIMPL;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import DAO.DaoPrestamo;
import entidad.Prestamo;

public class DaoImplPrestamo implements DaoPrestamo{

	@Autowired
	private Conexion conexion;
	public DaoImplPrestamo() {
		conexion = new Conexion();
	}
	
	@Override
	public boolean Agregar(Prestamo pres) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean Modificar(Prestamo pres) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public ArrayList<Prestamo> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean Eliminar(Prestamo pres) {
		// TODO Auto-generated method stub
		return false;
	}

//	public boolean Agregar(Prestamo pres) {
//		ch.abrirConexion();
//		ch.CrearTransaccion();
//		boolean agregado = false;
//		try {
//			ch.Guardar(pres);
//			ch.ConfimarTransaccion();
//			agregado = true;
//		}catch(Exception e) {
//			ch.RollBackTransaccion();
//		}
//		ch.cerrarSession();
//		return agregado;
//	}
//
//
//	public boolean Modificar(Prestamo pres) {
//		ch.abrirConexion();
//		ch.CrearTransaccion();
//		boolean agregado = false;
//		try {
//			ch.Actualizar(pres);
//			ch.ConfimarTransaccion();
//			agregado = true;
//		}catch(Exception e) {
//			ch.RollBackTransaccion();
//		}
//		ch.cerrarSession();
//		return agregado;
//	}
//
//
//	public ArrayList<Prestamo> GetAll() {
//		ch.abrirConexion();
//		ArrayList<Prestamo> lista = (ArrayList<Prestamo>)ch.getSession().createQuery("FROM prestamo").list();
//		ch.cerrarSession();
//		return lista;
//	}
//
//
//	public boolean Eliminar(Prestamo pres) {
//		ch.abrirConexion();
//		ch.CrearTransaccion();
//		boolean eliminado = false;
//		try {
//			ch.Eliminar(pres);
//			ch.ConfimarTransaccion();
//			eliminado = true;
//		}catch(Exception e) {
//			ch.RollBackTransaccion();
//		}
//		ch.cerrarSession();
//		return eliminado;
//	}
//	
}
