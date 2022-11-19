package idat.edu.pe.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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

    @GetMapping(value = "/buscar")
	void buscarUsuarioId(Long id){
        return ususervice.buscarPorId(id);
    }
	
    @PostMapping(/guardar)
    void agregarUsuario(Usuario usuario){
        return ususervice.guardarUsuario(usuario);
    }
}
