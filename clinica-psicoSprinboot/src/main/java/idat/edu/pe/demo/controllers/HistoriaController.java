package idat.edu.pe.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import idat.edu.pe.demo.models.entity.Historia;
import idat.edu.pe.demo.models.service.IHistoriaService;

//@CrossOrigin
@RestController
@RequestMapping(value = "/historia")
public class HistoriaController {

	@Autowired
	private IHistoriaService historiaSer;

	@GetMapping("/buscarHistoria/{id}")
	public ResponseEntity<Object> buscarPorId(@PathVariable("id") Long id) {
		Historia historia = historiaSer.buscarhistoriaId(id);
		if (historia == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Object>(historia, HttpStatus.OK);
	}

}
