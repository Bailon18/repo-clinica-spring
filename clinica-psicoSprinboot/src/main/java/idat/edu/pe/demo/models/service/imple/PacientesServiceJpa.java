package idat.edu.pe.demo.models.service.imple;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.demo.models.entity.EstadoCivil;

import idat.edu.pe.demo.models.entity.Ocupacion;
import idat.edu.pe.demo.models.entity.Paciente;
import idat.edu.pe.demo.models.repository.IEstadoCivilRepo;
import idat.edu.pe.demo.models.repository.IOcupacionRepo;
import idat.edu.pe.demo.models.repository.IPacientesRepo;
import idat.edu.pe.demo.models.service.IPacientesService;

@Service
public class PacientesServiceJpa implements IPacientesService {



	@Autowired
	private IPacientesRepo pacientesrepo;

	@Autowired
	private IOcupacionRepo ocupacionrepo;

	@Autowired
	private IEstadoCivilRepo estadocivilrepo;
	

	@Override
	public List<Paciente> listarPacientes() {
		return pacientesrepo.findAll(Sort.by(Sort.Direction.DESC, "id"));
	}

	@Override
	public Paciente guardarPaciente(Paciente paciente) {
		return pacientesrepo.save(paciente);
	}

	@Override
	public Paciente buscarPorId(Long id) {
		Optional<Paciente> pacienteretorno = pacientesrepo.findById(id);
		if(pacienteretorno.isPresent()){
			return pacienteretorno.get();
		} else {
			return null;
		}
	}

	@Override
	public Paciente actualizarPaciente(Paciente paciente){
		Paciente pacienteActual = pacientesrepo.findById(paciente.getId()).get();
		pacienteActual.setNombre(paciente.getNombre());
	    pacienteActual.setApellidos(paciente.getApellidos());
	    pacienteActual.setFechanacimiento(paciente.getFechanacimiento());
	    pacienteActual.setSexo(paciente.getSexo());
	    pacienteActual.setDocumento(paciente.getDocumento());
	    pacienteActual.setDistrito(paciente.getDistrito());
	    pacienteActual.setDireccion(paciente.getDireccion());
	    pacienteActual.setEstadocivil(paciente.getEstadocivil());
	    pacienteActual.setOcupacion(paciente.getOcupacion());
	    pacienteActual.setCorreo(paciente.getCorreo());
	    pacienteActual.setTelefono(paciente.getTelefono());
	    Paciente pacienteActualizado =  pacientesrepo.save(pacienteActual);
		return pacienteActualizado;
	}

	@Override
	public List<Ocupacion> listarOcupacion() {
		return ocupacionrepo.findAll();
	}

	@Override
	public List<EstadoCivil> listarEstadoCivil() {
		return estadocivilrepo.findAll();
	}

}