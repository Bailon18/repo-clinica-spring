package idat.edu.pe.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idat.edu.pe.demo.models.entity.Usuario;
import idat.edu.pe.demo.models.service.IUsuariosService;

//TOKEN: AGREGADO POR BAILON
//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
@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private IUsuariosService ususervice;
	
   @GetMapping(value = "/listar")
    public List<Usuario> listarUsuarios() {
        return  ususervice.listarUsuario();
    }
	
    @PostMapping(value = "/guardar")
    public Usuario agregarUsuario(Usuario usuario){
        return ususervice.guardarUsuario(usuario);
    }

    @GetMapping(value = "/buscar")
	Optional<Usuario> buscarUsuarioId(Long id){
        return ususervice.buscarPorId(id);
    }
}
