package idat.edu.pe.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idat.edu.pe.demo.models.entity.Historia;
import idat.edu.pe.demo.models.service.IHistoriaService;

//@CrossOrigin
@RestController
@RequestMapping(value = "/historia")
public class HistoriaController {
    
    @Autowired
    private IHistoriaService historiaSer;

    @GetMapping("/buscarHistoria/{id}")
	public Historia buscarhistoriaId(@PathVariable(name = "id") Long id){
        return historiaSer.buscarhistoriaId(id);
    }

}
