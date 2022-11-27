package entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer ID;
	@Column (name="DNI")
	private int Dni;
	@Column (name="Nombre")
	private String Nombre;
	@Column (name="Apellido")
	private String Apellido;
	@Column (name="Email")
	private String Email;
	@Column (name="Direccion")
	private String Direccion;
	@Column (name="Localidad")
	private String Localidad;
	@Column (name="Telefono")
	private int Telefono;
	@Column (name="FechaNacimiento")
	private Date FechaNacimiento;
	
	@ManyToOne (cascade= {})
	@JoinColumn (name="Nacionalidad")
	private Nacionalidad nacionalidad;
	
	public Cliente() {}
	public Cliente(int dni, String nombre, String apellido, String email, String direccion, String localidad, int telefono, Date fechaNacimiento, Nacionalidad nacionalidad) {
		this.Dni = dni;
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Email = email;
		this.Direccion = direccion;
		this.Localidad = localidad;
		this.Telefono = telefono;
		this.FechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public int getDni() {
		return Dni;
	}

	public void setDni(int dni) {
		Dni = dni;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getLocalidad() {
		return Localidad;
	}

	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
}
