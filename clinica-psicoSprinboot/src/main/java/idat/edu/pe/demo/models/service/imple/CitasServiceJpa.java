package idat.edu.pe.demo.models.service.imple;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.demo.models.entity.Citas;
import idat.edu.pe.demo.models.repository.ICitasRepor;
import idat.edu.pe.demo.models.service.ICitasService;

@Service
public class CitasServiceJpa implements ICitasService{

    @Autowired
    private ICitasRepor repositorio;

    @Override
    public List<Citas> buscarCitas(Long idPsicologa, Date fecha) {
        return repositorio.buscarCitas(idPsicologa, fecha);
    }

    @Override
    public List<Integer> listardiascitas(Integer dia) {
        return repositorio.listardiascitas(dia);
    }
    
}
