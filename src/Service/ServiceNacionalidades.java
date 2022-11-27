package Service;

import java.util.ArrayList;

import entidad.Nacionalidad;


public interface ServiceNacionalidades {
	public boolean Agregar(Nacionalidad nacionalidad);
	public boolean Modificar(Nacionalidad nacionalidad);
	public Nacionalidad obtenerNacionalidad(int n);
	public ArrayList<Nacionalidad> GetAll();
	public boolean Eliminar(Nacionalidad nacionalidad);
}
