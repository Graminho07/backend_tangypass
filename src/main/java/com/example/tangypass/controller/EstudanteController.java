package com.example.tangypass.controller;
import com.example.tangypass.model.EstudanteModel;
import com.example.tangypass.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
@CrossOrigin(origins = "https://localhost:3000")
@RestController

@RequestMapping("/estudantes")
public class EstudanteController {
	@Autowired
	private EstudanteRepository estudanteRepository;
	@GetMapping
	public List<EstudanteModel> listarEstudantes() {
		return estudanteRepository.findAll();
	}
	@PostMapping
	public EstudanteModel criarEstudante (@RequestBody EstudanteModel estudante) {
		return estudanteRepository.save(estudante);
	}
}