package DAO;

import java.util.ArrayList;

import entidad.Libro;

public interface DaoLibro {
	public boolean Agregar(Libro libro);
	public boolean Modificar(Libro libro);
	public ArrayList<Libro> GetAll();
	public boolean Eliminar(Libro libro);
}
