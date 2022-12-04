package idat.edu.pe.demo.models.service.imple;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import idat.edu.pe.demo.models.entity.Citas;
import idat.edu.pe.demo.models.repository.ICitasRepo;
import idat.edu.pe.demo.models.service.ICitasService;

@Service
public class CitasServiceJpa implements ICitasService{

	private ICitasRepo citasrepo;
	
	@Override
	public List<Citas> listarCitas() {
		return citasrepo.findAll();
	}

	@Override
	public Citas agregarCita(Citas cita) {
		return citasrepo.save(cita);
	}

	@Override
	public Citas buscarCitaPorId(Long id) {
		Optional<Citas> citasretorno = citasrepo.findById(id);
		if(citasretorno.isPresent()){
			return citasretorno.get();
		} else {
			return null;
		}
	}

	@Override
	public Citas actualizarCita(Citas cita) {
		return citasrepo.save(cita);
	}

}
