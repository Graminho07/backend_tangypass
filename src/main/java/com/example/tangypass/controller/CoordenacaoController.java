package com.example.tangypass.controller;

import com.example.tangypass.model.CoordenacaoModel;
import com.example.tangypass.repository.CoordenacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/coordenacao")
public class CoordenacaoController {
    @Autowired
    private CoordenacaoRepository coordenacaoRepository;

    @GetMapping
    public List<CoordenacaoModel> listarCoordenacoes() {
        return coordenacaoRepository.findAll();
    }

    @PostMapping
    public CoordenacaoModel criarCoordenacao(@RequestBody CoordenacaoModel coordenacao) {
        return coordenacaoRepository.save(coordenacao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarCoordenacao(@PathVariable int id) {
        try {
            coordenacaoRepository.deleteById(id);
            return ResponseEntity.ok("ID excluído");
        } catch (EmptyResultDataAccessException L) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<CoordenacaoModel> atualizarCoordenacao(@PathVariable int id, @RequestBody CoordenacaoModel coordenacaoAtualizada) {
        if (coordenacaoRepository.existsById(id)) {
            CoordenacaoModel coordenacao = coordenacaoRepository.findById(id).get();
            coordenacaoRepository.save(coordenacao);
            return ResponseEntity.ok(coordenacao);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
