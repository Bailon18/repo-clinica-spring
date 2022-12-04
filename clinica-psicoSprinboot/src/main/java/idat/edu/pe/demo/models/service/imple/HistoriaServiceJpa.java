package idat.edu.pe.demo.models.service.imple;

import java.util.List;
import java.util.Optional;
import idat.edu.pe.demo.models.entity.Historia;
import idat.edu.pe.demo.models.repository.IHistoriaRepo;
import idat.edu.pe.demo.models.service.IHistoriaService;

public class HistoriaServiceJpa implements IHistoriaService{

	private IHistoriaRepo historiarepo;
	
	@Override
	public List<Historia> listarHistorias() {
		return historiarepo.findAll();
	}

	@Override
	public Historia agregarHistoria(Historia historia) {
		return historiarepo.save(historia);
	}

	@Override
	public Historia buscarHistoriaPorId(Long id) {
		Optional<Historia> historiaretorno = historiarepo.findById(id);
		if(historiaretorno.isPresent()){
			return historiaretorno.get();
		} else {
			return null;
		}
	}

}
