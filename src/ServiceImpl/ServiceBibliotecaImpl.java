package ServiceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAOIMPL.DaoImplBiblioteca;
import Service.ServiceBiblioteca;
import entidad.Biblioteca;

@Service("ServiceBibliotecaImpl")
public class ServiceBibliotecaImpl implements ServiceBiblioteca{

	@Autowired
	DaoImplBiblioteca daoImplBiblioteca;

	
	@Override
	public boolean addBiblioteca(Biblioteca biblioteca) {
		return daoImplBiblioteca.addBiblioteca(biblioteca);
	}

	@Override
	public ArrayList<Biblioteca> getBibliotecas() {
		return daoImplBiblioteca.getBibliotecas();
	}

	@Override
	public boolean deleteBiblioteca(Biblioteca biblioteca) {
		return daoImplBiblioteca.deleteBiblioteca(biblioteca);
	}

	@Override
	public Biblioteca getBibliotecaById(int id) {
		return daoImplBiblioteca.getBibliotecaById(id);
	}

	@Override
	public ArrayList<Biblioteca> getAllAvailableBibliotecas() {
		return daoImplBiblioteca.getAllAvailableBibliotecas();
	}

	@Override
	public boolean modifyBiblioteca(Biblioteca biblioteca) {
		return daoImplBiblioteca.modifyBiblioteca(biblioteca);
	}
	
}
