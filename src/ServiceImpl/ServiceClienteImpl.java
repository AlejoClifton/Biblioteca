package ServiceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAOIMPL.DaoImplCliente;
import Service.ServiceCliente;
import entidad.Cliente;
import entidad.Nacionalidad;

@Service("ServiceClienteImpl")
public class ServiceClienteImpl implements ServiceCliente{
	
	@Autowired
	DaoImplCliente daoImplCliente = new DaoImplCliente();
	
	@Override
	public boolean Agregar(Cliente cliente) {
		return daoImplCliente.Agregar(cliente);
	}

	@Override
	public boolean Modificar(Cliente cliente) {
		return daoImplCliente.Modificar(cliente);
	}

	@Override
	public ArrayList<Cliente> GetAll() {
		return daoImplCliente.GetAll();
	}

	@Override
	public boolean Eliminar(Cliente cliente) {
		return daoImplCliente.Eliminar(cliente);
	}
	
	@Override
	public Cliente obtenerCliente(int n) {
		return daoImplCliente.obtenerCliente(n);
	}

}
