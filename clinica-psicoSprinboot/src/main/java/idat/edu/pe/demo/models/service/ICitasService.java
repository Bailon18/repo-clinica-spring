package idat.edu.pe.demo.models.service;

import java.util.List;

import idat.edu.pe.demo.models.entity.Citas;
import idat.edu.pe.demo.models.entity.Usuario;

public interface ICitasService {
    
    List<Citas> buscarCitas(Long idPsicologa, String fecha);

}
