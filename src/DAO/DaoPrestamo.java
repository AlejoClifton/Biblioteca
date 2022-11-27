package DAO;

import java.util.ArrayList;

import entidad.Prestamo;

public interface DaoPrestamo {
	public boolean Agregar(Prestamo pres);
	public boolean Modificar(Prestamo pres);
	public ArrayList<Prestamo> GetAll();
	public boolean Eliminar(Prestamo pres);
}
