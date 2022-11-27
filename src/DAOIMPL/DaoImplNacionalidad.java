package DAOIMPL;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import DAO.DaoNacionalidad;
import DAOIMPL.Conexion;
import entidad.Nacionalidad;

public class DaoImplNacionalidad implements DaoNacionalidad {

	@Autowired
	private Conexion conexion;
	public DaoImplNacionalidad() {
		conexion = new Conexion();
	}
	
	public boolean Agregar(Nacionalidad nacionalidad) {
		conexion.abrirConexion();
		boolean agregado = true;
		try {
			conexion.IniciarTransaccion();
			conexion.GuardarObjeto(nacionalidad);
			conexion.CommitTransaccion();
			
		}catch(Exception e) {
			conexion.RollbackearTransaccion();
			agregado = false;
		}
		conexion.cerrarSession();
		return agregado;
	}

	@Override
	public boolean Modificar(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean Eliminar(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		return false;
	}
//
	@Override
	public ArrayList<Nacionalidad> GetAll() {
		conexion.abrirConexion();
		ArrayList<Nacionalidad> lista = (ArrayList<Nacionalidad>)conexion.getSession().createQuery("FROM Nacionalidad").list();
		conexion.cerrarSession();
		return lista;
	}
	
	@Override
	public Nacionalidad obtenerNacionalidad(int idNacionalidad) {
		conexion.abrirConexion();
		Nacionalidad n = new Nacionalidad();
		try {
			n = (Nacionalidad)conexion.ObtenerObjeto(Nacionalidad.class, idNacionalidad);
		} catch (Exception e) {
			n = null;
		}
		conexion.cerrarSession();
		return n;
	}
}
