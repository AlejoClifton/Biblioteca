package entidad;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String usuarioLogeo;
	private String contrasenia;

	public Usuario() {}
	public Usuario(String usuarioLogeo, String contrasenia) {this.usuarioLogeo = usuarioLogeo; this.contrasenia = contrasenia;}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuarioLogeo() {
		return usuarioLogeo;
	}

	public void setUsuarioLogeo(String usuarioLogeo) {
		this.usuarioLogeo = usuarioLogeo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usuarioLogeo=" + usuarioLogeo + ", contrasenia=" + contrasenia + "]";
	}




}
