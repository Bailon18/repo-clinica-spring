package idat.edu.pe.demo.models.service;

import java.util.List;

import idat.edu.pe.demo.models.entity.EstadoCivil;
import idat.edu.pe.demo.models.entity.Ocupacion;
import idat.edu.pe.demo.models.entity.Paciente;

public interface IPacientesService {

	//Pacientes
	List<Paciente> listarPacientes();
	Paciente guardarPaciente(Paciente paciente);
	Paciente buscarPorId(Long id);
	Paciente actualizarPaciente(Paciente paciente);

	List<Ocupacion> listarOcupacion();
	List<EstadoCivil> listarEstadoCivil();

}