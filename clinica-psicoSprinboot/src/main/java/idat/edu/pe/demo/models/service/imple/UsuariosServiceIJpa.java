package idat.edu.pe.demo.models.service.imple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.demo.models.entity.Usuario;
import idat.edu.pe.demo.models.repository.IUsuarioRepo;
import idat.edu.pe.demo.models.service.IUsuariosService;

@Service
public class UsuariosServiceIJpa implements IUsuariosService {

	@Autowired
	private IUsuarioRepo usuariorepo;
	
	@Override
	public List<Usuario> listarUsuario() {
		return usuariorepo.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return usuariorepo.save(usuario);
	}

	@Override
	public Optional<Usuario> buscarPorId(Long id) {
		return usuariorepo.findById(id);
	}
}
