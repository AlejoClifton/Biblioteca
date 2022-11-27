package DAOIMPL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import DAO.DaoCliente;
import entidad.Cliente;

public class DaoImplCliente implements DaoCliente {

	@Autowired
	private Conexion conexion;
	public DaoImplCliente() {
		conexion = new Conexion();
	}
	
	@Override
	public boolean Agregar(Cliente cliente) {
		conexion.abrirConexion();
		boolean exito = true;
		try {
			conexion.IniciarTransaccion();
			conexion.GuardarObjeto(cliente);
			conexion.CommitTransaccion();
		} catch (Exception e) {
			conexion.RollbackearTransaccion();
			exito = false;
		}
		conexion.cerrarSession();
		return exito;
	}
	
	@Override
	public ArrayList<Cliente> GetAll() {
		conexion.abrirConexion();
		ArrayList<Cliente> lista = (ArrayList<Cliente>)conexion.getSession().createQuery("FROM Cliente").list();
		conexion.cerrarSession();
		return lista;
	}
	
	@Override
	public boolean Modificar(Cliente cliente) {
		conexion.abrirConexion();
		boolean exito = true;
		try {
			conexion.IniciarTransaccion();
			conexion.ActualizarObjeto(cliente);
			conexion.CommitTransaccion();
		} catch (Exception e) {
			conexion.RollbackearTransaccion();
			exito = false;
		}
		conexion.cerrarSession();
		return exito;
	}
	
	@Override
	public boolean Eliminar(Cliente cliente) {
		conexion.abrirConexion();
		boolean exito = true;
		try {
			conexion.IniciarTransaccion();
			conexion.BorrarObjeto(cliente);
			conexion.CommitTransaccion();
		} catch (Exception e) {
			conexion.RollbackearTransaccion();
			exito = false;
		}
		conexion.cerrarSession();
		return exito;
	}
	
	@Override
	public Cliente obtenerCliente(int idCliente){
		conexion.abrirConexion();
		Cliente a = new Cliente();
		try {
			a = (Cliente)conexion.ObtenerObjeto(Cliente.class, idCliente);
		} catch (Exception e) {
			a = null;
		}
		conexion.cerrarSession();
		return a;
	}
}