package com.brunoroberto.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brunoroberto.cursomc.domain.Categoria;
import com.brunoroberto.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categoria obj = service.buscar(id);
		
//		Categoria cat1 = new Categoria(1, "Informatica");
//		Categoria cat2 = new Categoria(2, "Escritorio");
//		
//		List<Categoria> lista = new ArrayList<>();
//		lista.add(cat1);
//		lista.add(cat2);
		
		return ResponseEntity.ok().body(obj);
	}
	
//	@GetMapping(value = "/teste")
//	public ResponseEntity<?>dollar (){
//		service.dollar();
//		return ResponseEntity.ok().body(null);
//	}
}
