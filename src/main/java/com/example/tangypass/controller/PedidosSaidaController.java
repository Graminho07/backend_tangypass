package com.example.tangypass.controller;
import com.example.tangypass.model.PedidosSaidaModel;
import com.example.tangypass.repository.PedidosSaidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
@CrossOrigin(origins = "https://localhost:3000")
@RestController

@RequestMapping("/pedidosDeSaida")
public class PedidosSaidaController {
	@Autowired
	private PedidosSaidaRepository pedidossaidaRepository;
	@GetMapping
	public List<PedidosSaidaModel> listarPedidosSaida() {
		return pedidossaidaRepository.findAll();
	}
	@PostMapping
	public PedidosSaidaModel criarPedidosSaida (@RequestBody PedidosSaidaModel pedidossaida) {
		return pedidossaidaRepository.save(pedidossaida);
	}
}