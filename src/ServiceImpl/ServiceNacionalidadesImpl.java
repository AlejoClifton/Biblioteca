package ServiceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAOIMPL.DaoImplNacionalidad;
import Service.ServiceNacionalidades;
import entidad.Nacionalidad;

@Service("ServiceNacionalidadesImpl")
public class ServiceNacionalidadesImpl implements ServiceNacionalidades{

	@Autowired
	DaoImplNacionalidad daoImplNacionalidad = new DaoImplNacionalidad();
	
	@Override
	public boolean Agregar(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Modificar(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Nacionalidad> GetAll() {
		return (ArrayList<Nacionalidad>)daoImplNacionalidad.GetAll();
	}

	@Override
	public boolean Eliminar(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Nacionalidad obtenerNacionalidad(int n) {
		return daoImplNacionalidad.obtenerNacionalidad(n);
	}

}
