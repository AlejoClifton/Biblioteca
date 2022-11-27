package DAO;

import java.util.ArrayList;

import entidad.Biblioteca;


public interface DaoBiblioteca{

	public boolean addBiblioteca(Biblioteca biblioteca);
	public ArrayList<Biblioteca> getBibliotecas();
	public ArrayList<Biblioteca> getAllAvailableBibliotecas();
	public boolean deleteBiblioteca(Biblioteca biblioteca);
	public Biblioteca getBibliotecaById(int id);
	public boolean modifyBiblioteca(Biblioteca biblioteca);
	
	
 //esta implementacion trae libros por bilioteca
	public ArrayList<Biblioteca> getLibroXbilioteca();
	
}
