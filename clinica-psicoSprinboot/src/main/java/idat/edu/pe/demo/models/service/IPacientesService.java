package idat.edu.pe.demo.models.service;

import java.util.List;

import idat.edu.pe.demo.models.entity.Paciente;

public interface IPacientesService {

	List<Paciente> listarPacientes();
	Paciente guardarPaciente(Paciente paciente);
	Paciente buscarPorId(Long id);
	Paciente actualizarPaciente(Paciente paciente);

}