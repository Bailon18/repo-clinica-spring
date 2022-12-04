package idat.edu.pe.demo.models.service;

import java.util.List;

import idat.edu.pe.demo.models.entity.Historia;

public interface IHistoriaService {
	List<Historia> listarHistorias();
	Historia agregarHistoria(Historia historia);
	Historia buscarHistoriaPorId(Long id);
}
