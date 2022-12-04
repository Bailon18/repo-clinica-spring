package idat.edu.pe.demo.models.service;

import java.util.List;

import idat.edu.pe.demo.models.entity.Citas;

public interface ICitasService {
	
	List<Citas> listarCitas();
	Citas agregarCita(Citas cita);
	Citas buscarCitaPorId(Long id);
	Citas actualizarCita(Citas cita);
}
