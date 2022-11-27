package Service;

import java.util.ArrayList;

import entidad.Cliente;

public interface ServiceCliente {

	public boolean Agregar(Cliente cliente);
	public boolean Modificar(Cliente cliente);
	public ArrayList<Cliente> GetAll();
	public boolean Eliminar(Cliente cliente);
	Cliente obtenerCliente(int n);
}
