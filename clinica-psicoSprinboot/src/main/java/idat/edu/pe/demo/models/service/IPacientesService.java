package idat.edu.pe.demo.models.service;

import java.util.List;
import java.util.Optional;

import idat.edu.pe.demo.models.entity.Paciente;

public interface IPacientesService {

	List<Paciente> listarPacientes();
	Usuario guardarPaciente(Paciente paciente);
	Usuario actualizarPaciente(Paciente paciente);
	Optional<Paciente> buscarPorId(Long id);

}