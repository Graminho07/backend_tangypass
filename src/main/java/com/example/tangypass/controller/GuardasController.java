package com.example.tangypass.controller;
import com.example.tangypass.model.GuardasModel;
import com.example.tangypass.repository.GuardasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
@CrossOrigin(origins = "https://localhost:3000")
@RestController

@RequestMapping("/guardas")
public class GuardasController {
	@Autowired
	private GuardasRepository guardasRepository;
	@GetMapping
	public List<GuardasModel> listarGuardas() {
		return guardasRepository.findAll();
	}
	@PostMapping
	public GuardasModel criarGuardas (@RequestBody GuardasModel guardas) {
		return guardasRepository.save(guardas);
	}
}