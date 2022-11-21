package idat.edu.pe.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


import idat.edu.pe.demo.models.entity.Paciente;
import idat.edu.pe.demo.models.service.IPacientesService;


@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {

    @Autowired
    private IPacientesService pacservice;
	
   @GetMapping(value = "/listarPacientes")
    public List<Paciente> listarPacientes(){
        return  pacservice.listarPacientes();
    }
	
    @PostMapping(value = "/guardarPaciente")
    public Paciente agregarPaciente(Paciente paciente){
        return pacservice.guardarPaciente(paciente);
    }

    @GetMapping(value = "/buscarPaciente")
	Optional<Paciente> buscarPacienteId(Long id){
        return pacservice.buscarPorId(id);
    }
    
}