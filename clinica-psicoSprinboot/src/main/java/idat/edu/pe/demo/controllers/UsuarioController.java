package idat.edu.pe.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import idat.edu.pe.demo.models.entity.Usuario;
import idat.edu.pe.demo.models.service.IUsuariosService;

//TOKEN: AGREGADO POR BAILON
//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
@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private IUsuariosService ususervice;
	
   @GetMapping("/listar")
    public List<Usuario> listarUsuarios() {
		//System.out.println("LLEGOOOOOO1");
        return  ususervice.listarUsuario();
    }
	
    @PostMapping("/guardar")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario agregarUsuario(@RequestBody Usuario usuario){
		//System.out.println("LLEGOOOOOO2");
        return ususervice.guardarUsuario(usuario);
    }

    @GetMapping("/buscar/{id}")
	public Usuario buscarUsuarioId(@PathVariable Long id) {
		return ususervice.buscarPorId(id);
	}

    @PostMapping("/actualizar")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario actualizar(@RequestBody Usuario Usuario) {

		// sin el id para que haga un merch
		Usuario usuarioActual = ususervice.buscarPorId(Usuario.getId());

		if(usuarioActual != null){

			usuarioActual.setNombres(Usuario.getNombres());
			usuarioActual.setApellidos(Usuario.getApellidos());
			usuarioActual.setCorreo(Usuario.getCorreo());
			usuarioActual.setContrasena(Usuario.getContrasena());
			usuarioActual.setCorreo(Usuario.getCorreo());
			usuarioActual.setSexo(Usuario.getSexo());
			usuarioActual.setEstado(Usuario.getEstado());
			usuarioActual.setRoles(Usuario.getRoles());
	
			return ususervice.actualizarUsuario(usuarioActual);
		}
		return null;
	}

	@GetMapping("/bloquearUsuario/{id}")
	public Usuario bloquearUsuario(@PathVariable(value = "id") Long id) {
		return ususervice.bloquearUsuario(id);
	}
}
