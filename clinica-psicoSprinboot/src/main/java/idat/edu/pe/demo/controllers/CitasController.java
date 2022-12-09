package idat.edu.pe.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idat.edu.pe.demo.models.entity.Citas;
import idat.edu.pe.demo.models.service.ICitasService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/citas")
public class CitasController {

    @Autowired
    private ICitasService servicio;

    @GetMapping("/buscarcitas/{idpsico}/{fecha}")
	public List<Citas> buscarcitas(@PathVariable(name = "idpsico") Long idpsico, @PathVariable(name = "fecha") String fecha){
        return servicio.buscarCitas(idpsico, fecha);
    }
    
}
