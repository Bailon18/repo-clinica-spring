package idat.edu.pe.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import idat.edu.pe.demo.models.entity.Usuario;
import idat.edu.pe.demo.models.service.IUsuariosService;

//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
//@RestController
@Controller
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	private IUsuariosService ususervice;
	


   @GetMapping(value = "/listarApi")
    public List<Usuario> listarUsuariosApi(Model model) {
        return  ususervice.listarUsuario();
    }

	
	
}
