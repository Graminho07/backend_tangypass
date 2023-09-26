package com.example.tangypass.controller;
import com.example.tangypass.model.AcessoQRModel;
import com.example.tangypass.repository.AcessoQRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
@CrossOrigin(origins = "https://localhost:3000")
@RestController

@RequestMapping("/acessosQR")
public class AcessoQRController {
	@Autowired
	private AcessoQRRepository acessoqrRepository;
	@GetMapping
	public List<AcessoQRModel> listarAcessos() {
		return acessoqrRepository.findAll();
	}
	@PostMapping
	public AcessoQRModel criarAcessoQR (@RequestBody AcessoQRModel acessoqr) {
		return acessoqrRepository.save(acessoqr);
	}
}