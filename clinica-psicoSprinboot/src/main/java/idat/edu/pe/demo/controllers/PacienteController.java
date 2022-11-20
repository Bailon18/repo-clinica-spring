package idat.edu.pe.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import idat.edu.pe.demo.models.entity.Paciente;
import idat.edu.pe.demo.models.service.IPacientesService;

@RestController
@RequestMapping(value = "/paciente")
public class UsuarioController {

    @Autowired
    private IPacientesService pacservice;
	
   @GetMapping(value = "/listarPacientes")
    public List<Paciente> listarPacientes(){
        return  pacservice.listarPacientes();
    }
	
    @PostMapping(value = "/guardarPaciente")
    void agregarPaciente(Paciente paciente){
        return pacservice.guardarPaciente(paciente);
    }

    @GetMapping(value = "/buscarPaciente")
	void buscarPacienteId(Long id){
        return pacservice.buscarPorId(id);
    }
    
}