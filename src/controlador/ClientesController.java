package controlador;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ServiceImpl.ServiceClienteImpl;
import ServiceImpl.ServiceNacionalidadesImpl;
import entidad.Cliente;
import entidad.Nacionalidad;

@Controller
public class ClientesController {
	
	ServiceNacionalidadesImpl nacionalidades = new ServiceNacionalidadesImpl();
	ServiceClienteImpl Clientes = new ServiceClienteImpl();
	ModelAndView MV = new ModelAndView();
	
	@RequestMapping("ListaCliente.html")
	public ModelAndView ListaClientes() {
		ArrayList<Cliente> lista_clientes = Clientes.GetAll();
		MV.addObject("data", lista_clientes);
		MV.setViewName("ListaCliente");

		return MV;
	}
	
	@RequestMapping("AltaCliente.html")
	public ModelAndView AltaCliente() {
		List<Nacionalidad> nacionalidad = nacionalidades.GetAll();
		MV.addObject("nacionalidades",nacionalidad);
		MV.setViewName("AltaCliente");
		return MV;
	}
	
	@RequestMapping("AgregarCliente.html")
	public ModelAndView agregar_Cliente(String dni, String nombre, String apellido, 
			String nacionalidad, String email,String direccion, String localidad, String telefono, Date fechanacimiento) {
		
		ServiceClienteImpl Clientes = new ServiceClienteImpl();
		Cliente cliente = new Cliente();
		cliente.setApellido(apellido);
		cliente.setDireccion(direccion);
		cliente.setDni(Integer.parseInt(dni));
		cliente.setEmail(email);
		cliente.setFechaNacimiento(fechanacimiento);
		cliente.setLocalidad(localidad);
		cliente.setNombre(nombre);
		cliente.setTelefono(Integer.parseInt(telefono));
		cliente.setNacionalidad(nacionalidades.obtenerNacionalidad(Integer.parseInt(nacionalidad)));
		
		Clientes.Agregar(cliente);
		
		MV.setViewName("ListaCliente");

		return MV;
	}
	
	@RequestMapping("eliminarCliente.html")
	public ModelAndView eliminarCliente(@RequestParam(value = "id", required = false) int idCliente){
		
		try {
			Cliente cliente = Clientes.obtenerCliente(idCliente);
			
			if(Clientes.Eliminar(cliente)) 
			{
				MV.setViewName("ListaCliente");
				}
			else {
				MV.setViewName("ListaCliente");
				}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return MV;
	}
}