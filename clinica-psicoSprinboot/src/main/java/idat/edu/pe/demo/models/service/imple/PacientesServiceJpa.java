package idat.edu.pe.demo.models.service.imple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.demo.models.entity.Paciente;
import idat.edu.pe.demo.models.repository.IPacientesRepo;
import idat.edu.pe.demo.models.service.IPacientesService;

@Service
public class PacientesServiceJpa implements IPacientesService {

	@Autowired
	private IPacientesRepo pacientesrepo;
	
	@Override
	public List<Paciente> listarPacientes() {
		return pacientesrepo.findAll();
	}

	@Override
	public Paciente guardarPaciente(Paciente paciente) {
		return pacientesrepo.save(paciente);
	}

	@Override
	public Optional<Paciente> buscarPorId(Long id) {
		return pacientesrepo.findById(id);
	}

}