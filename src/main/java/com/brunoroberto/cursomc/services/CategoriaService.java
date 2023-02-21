package com.brunoroberto.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunoroberto.cursomc.domain.Categoria;
import com.brunoroberto.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository repo;

	public Categoria buscar(Integer id) {

		Optional<Categoria> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

//	public void dollar() {
//
//		String url = "https://api.apilayer.com/exchangerates_data/convert?to=BRL&from=USD&amount=1";
//
//		RestTemplate res = new RestTemplate();
//		HttpHeaders header = new HttpHeaders();
//		header.set("apikey", "XNK5GI5qVrrseDjpjcEmgzQjAJEJwXE8");
//
//		HttpEntity<Void> responseEntity = new HttpEntity<>(header);
//
//		ResponseEntity<Object> response = res.exchange(url, HttpMethod.GET, responseEntity, Object.class);
//		System.out.println(response.getBody());
//
//	}

//	public void ApiBrasil(){
//		
//		RestTemplate res = new RestTemplate();
//		
//		ResponseEntity<String> response = res.getForEntity("https://brasilapi.com.br/api/feriados/v1/2023", String.class);
//		System.out.println(response.getBody());
//		
//	}

}
