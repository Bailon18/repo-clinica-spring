package idat.edu.pe.demo.models.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.demo.models.entity.Historia;
import idat.edu.pe.demo.models.repository.IHistoriaRepo;
import idat.edu.pe.demo.models.service.IHistoriaService;

@Service
public class HistoriaServiceJpa implements IHistoriaService {

    @Autowired
    private IHistoriaRepo historiarepo;


    @Override
    public Historia buscarhistoriaId(Long id) {
        return historiarepo.findById(id).get();
    }
    
}
