package idat.edu.pe.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.CrossOrigin;

import idat.edu.pe.demo.models.entity.EstadoCivil;
import idat.edu.pe.demo.models.entity.Ocupacion;
import idat.edu.pe.demo.models.entity.Paciente;
import idat.edu.pe.demo.models.service.IPacientesService;


//@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {

    @Autowired
    private IPacientesService pacservice;
	
    @GetMapping("/listarPacientes")
    public List<Paciente> listarPacientes(){
        return  pacservice.listarPacientes();
    }

    @GetMapping("/listarOcupaciones")
    public List<Ocupacion> listarOcupaciones(){
        return  pacservice.listarOcupacion();
    }
	
    @GetMapping("/listarEstadoCi")
    public List<EstadoCivil> listarEstadoCivil(){
        return  pacservice.listarEstadoCivil();
    }

    @PostMapping("/guardarPaciente")
    public Paciente agregarPaciente(@RequestBody  Paciente paciente){
        return pacservice.guardarPaciente(paciente);
    }

    @GetMapping("/buscarPaciente/{id}")
	public Paciente buscarPacienteId(@PathVariable(name = "id") Long id){
        return pacservice.buscarPorId(id);
    }

    @PutMapping("/actualizarPaciente")
    public Paciente actualizarPaciente(@RequestBody Paciente paciente){
        
        Paciente pacienteActual = pacservice.buscarPorId(paciente.getId());

        if(pacienteActual != null){

            pacienteActual.setNombre(paciente.getNombre());
            pacienteActual.setApellidos(paciente.getApellidos());
            pacienteActual.setFechanacimiento(paciente.getFechanacimiento());
            pacienteActual.setSexo(paciente.getSexo());
            pacienteActual.setDocumento(paciente.getDocumento());
            pacienteActual.setDistrito(paciente.getDistrito());
            pacienteActual.setDireccion(paciente.getDireccion());
            pacienteActual.setEstadocivil(paciente.getEstadocivil());
            pacienteActual.setOcupacion(paciente.getOcupacion());
            pacienteActual.setCorreo(paciente.getCorreo());
            pacienteActual.setTelefono(paciente.getTelefono());

            return pacservice.actualizarPaciente(pacienteActual);
        }
        
        return null;
    }
    
}