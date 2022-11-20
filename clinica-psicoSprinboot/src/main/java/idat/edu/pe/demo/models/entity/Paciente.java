package idat.edu.pe.app.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int tipoDoc;
	
	private String numDoc;
	
	private String nombres;
	
	private String apellidos;
	
	private int estado;
	
	private String sexo;
	
	public Paciente(){
	}

    public Paciente(int id, int tipoDoc, String numDoc, String nombres, String apellidos, 
                    int estado, String sexo){
        super();
		this.id = id;
		this.tipoDoc = tipoDoc;
		this.numDoc = numDoc;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.estado = estado;
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(int tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
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

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}