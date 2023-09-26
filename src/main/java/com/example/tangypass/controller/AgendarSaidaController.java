package com.example.tangypass.controller;
import com.example.tangypass.model.AgendarSaidaModel;
import com.example.tangypass.repository.AgendarSaidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
@CrossOrigin(origins = "https://localhost:3000")
@RestController

@RequestMapping("/agendarSaida")
public class AgendarSaidaController {
	@Autowired
	private AgendarSaidaRepository agendarsaidaRepository;
	@GetMapping
	public List<AgendarSaidaModel> listarAgendarSaida() {
		return agendarsaidaRepository.findAll();
	}
	@PostMapping
	public AgendarSaidaModel criarAgendarSaida (@RequestBody AgendarSaidaModel agendarsaida) {
		return agendarsaidaRepository.save(agendarsaida);
	}
}