package idat.edu.pe.demo.controllers;

import java.util.List;

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
	
   @GetMapping("/listarPacientes")
    public List<Paciente> listarPacientes(){
        return  pacservice.listarPacientes();
    }
	
    @PostMapping("/guardarPaciente")
    public Paciente agregarPaciente(Paciente paciente){
        return pacservice.guardarPaciente(paciente);
    }

    @GetMapping("/buscarPaciente")
	public Paciente buscarPacienteId(Long id){
        return pacservice.buscarPorId(id);
    }

    @PostMapping("/actualizarPaciente")
    public Paciente actualizarPaciente(Paciente paciente){
        
        Paciente pacienteActual = pacservice.buscarPorId(paciente.getId());

        if(pacienteActual != null){
            pacienteActual.setTipoDoc(paciente.getTipoDoc());
            pacienteActual.setNumDoc(paciente.getNumDoc());
            pacienteActual.setNombres(pacienteActual.getNombres());
            pacienteActual.setApellidos(paciente.getApellidos());
            pacienteActual.setEstado(paciente.getEstado());
            pacienteActual.setSexo(paciente.getSexo());

            return pacservice.actualizarPaciente(pacienteActual);
        }
        
        return null;
    }
    
}