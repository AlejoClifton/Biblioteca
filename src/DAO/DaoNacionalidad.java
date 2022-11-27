package DAO;

import java.util.ArrayList;

import entidad.Nacionalidad;

public interface DaoNacionalidad {
	public boolean Agregar(Nacionalidad nacionalidad);
	public boolean Modificar(Nacionalidad nacionalidad);
	public ArrayList<Nacionalidad> GetAll();
	public boolean Eliminar(Nacionalidad nacionalidad);
	Nacionalidad obtenerNacionalidad(int idNacionalidad);
}
