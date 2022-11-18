package idat.edu.pe.demo.models.service;

import java.util.List;
import java.util.Optional;

import idat.edu.pe.demo.models.entity.Usuario;



public interface IUsuariosService {

	// listar usuarios
	List<Usuario> listarUsuario();
	

	// metodo para guardar un nuevo usuario
	Usuario guardarUsuario(Usuario usuario);
	

	// busqueda usuario unico atravez del id
	Optional<Usuario> findById(Long id);


}
