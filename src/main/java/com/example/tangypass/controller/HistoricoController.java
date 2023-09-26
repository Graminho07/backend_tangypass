package com.example.tangypass.controller;
import com.example.tangypass.model.HistoricoModel;
import com.example.tangypass.repository.HistoricoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
@CrossOrigin(origins = "https://localhost:3000")
@RestController

@RequestMapping("/historicos")
public class HistoricoController {
	@Autowired
	private HistoricoRepository historicoRepository;
	@GetMapping
	public List<HistoricoModel> listarHistoricos() {
		return historicoRepository.findAll();
	}
	@PostMapping
	public HistoricoModel criarHistorico (@RequestBody HistoricoModel historico) {
		return historicoRepository.save(historico);
	}
}