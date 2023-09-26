package com.example.tangypass.controller;
import com.example.tangypass.model.ResponsavelModel;
import com.example.tangypass.repository.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
@CrossOrigin(origins = "https://localhost:3000")
@RestController

@RequestMapping("/responsaveis")
public class ResponsavelController {
	@Autowired
	private ResponsavelRepository responsavelRepository;
	@GetMapping
	public List<ResponsavelModel> listarResponsavel() {
		return responsavelRepository.findAll();
	}
	@PostMapping
	public ResponsavelModel criarResponsavel (@RequestBody ResponsavelModel responsavel) {
		return responsavelRepository.save(responsavel);
	}
}