package idat.edu.pe.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idat.edu.pe.demo.models.entity.Historia;
import idat.edu.pe.demo.models.service.IHistoriaService;

@CrossOrigin
@RestController
@RequestMapping(value = "/historia")
public class HistoriaController {
	@Autowired
    private IHistoriaService hisservice;
	
    @GetMapping("/listarHistorias")
    public List<Historia> listarHistorias(){
        return  hisservice.listarHistorias();
    }
	
    @PostMapping("/guardarHistoria")
    public Historia agregarHistoria(@RequestBody  Historia historia){
        return hisservice.agregarHistoria(historia);
    }

    @GetMapping("/buscarHistoria")
	public Historia buscarPacienteId(Long id){
        return hisservice.buscarHistoriaPorId(id);
    }

    @PostMapping("/actualizarHistoria")
    public Historia actualizarHistoria(@RequestBody Historia historia){
        Historia historiaActual = hisservice.buscarHistoriaPorId(historia.getId());
        if(historiaActual != null){
            return hisservice.agregarHistoria(historiaActual);
        }
        return null;
    }
}
