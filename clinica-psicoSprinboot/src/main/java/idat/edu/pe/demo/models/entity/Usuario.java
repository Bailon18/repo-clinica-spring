package idat.edu.pe.demo.models.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombres;

	private String apellidos;

	private String correo;

	private String contrasena;

	private String celular;

	private String sexo;

	private String estado;

	private String avatar;

	// tabla intermedia
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "permisos", 
				joinColumns = @JoinColumn(name = "usuarios_id", referencedColumnName = "id"),
				inverseJoinColumns = @JoinColumn(name = "roles_id", referencedColumnName = "id")
	)
	private Collection<Roles> roles;

	public Usuario() {

	}

	public Usuario(Long id) {
		this.id = id;
	}

	public Usuario(Long id, String nombres, String apellidos, String correo, String contrasena, String celular,
			String sexo, String estado, String avatar, Collection<Roles> roles) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.contrasena = contrasena;
		this.celular = celular;
		this.sexo = sexo;
		this.estado = estado;
		this.avatar = avatar;
		this.roles = roles;
	}

	public Long getId() {
		return id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Collection<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Roles> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [id=");
		builder.append(id);
		builder.append(", nombres=");
		builder.append(nombres);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", correo=");
		builder.append(correo);
		builder.append(", contrasena=");
		builder.append(contrasena);
		builder.append(", celular=");
		builder.append(celular);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", avatar=");
		builder.append(avatar);
		builder.append(", roles=");
		builder.append(roles);
		builder.append("]");
		return builder.toString();
	}

	private static final long serialVersionUID = 1L;

}
