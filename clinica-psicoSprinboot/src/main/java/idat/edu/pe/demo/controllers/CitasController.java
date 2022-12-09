package idat.edu.pe.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import idat.edu.pe.demo.models.entity.Citas;
import idat.edu.pe.demo.models.service.ICitasService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/citas")
public class CitasController {

    @Autowired
    private ICitasService servicio;
    
    @GetMapping("/buscarcitas/{idpsico}/{fecha}")
	public ResponseEntity<Object> buscarCitas(@PathVariable(name = "idpsico") Long idpsico, @PathVariable(name = "fecha") String fecha){
    	List<Citas> listadoCitas = servicio.buscarCitas(idpsico, fecha);
    	if(idpsico == null && fecha == null) {
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Object>(listadoCitas, HttpStatus.OK);
	}
    
}
