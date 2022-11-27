package entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Prestamo")
public class Prestamo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private Integer ID;
	@Column(name = "ID_BIBLIOTECA")
	private Biblioteca biblioteca;
	@Column(name = "FECHA_PRESTAMO")
	private Date fecha_prestamo;
	@Column(name = "CANTIDAD_DIAS")
	private int cantidad_dias;
	
	@ManyToOne (cascade= {})
	@JoinColumn (name="Cliente")
	private Cliente cliente;
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Biblioteca getBiblioteca() {
		return biblioteca;
	}
	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}
	public Date getFecha_prestamo() {
		return fecha_prestamo;
	}
	public void setFecha_prestamo(Date fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}
	public int getCantidad_dias() {
		return cantidad_dias;
	}
	public void setCantidad_dias(int cantidad_dias) {
		this.cantidad_dias = cantidad_dias;
	}
	
}