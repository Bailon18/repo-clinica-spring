package idat.edu.pe.demo.models.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.demo.models.entity.Afiliacion;
import idat.edu.pe.demo.models.repository.IAfiliacionRepo;
import idat.edu.pe.demo.models.service.IAfiliacionService;

@Service
public class AfiliacionServiceJpa implements IAfiliacionService{

    @Autowired
    private IAfiliacionRepo afirepo;


    @Override
    public Afiliacion guardarafiliacion(Afiliacion afi) {
        return afirepo.save(afi);
    }


    @Override
    public Afiliacion validarafiliacion(Long id) {
        return afirepo.validarafiliacion(id);
    }
    
}
