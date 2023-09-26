package com.example.tangypass.repository;
import com.example.tangypass.model.CoordenacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CoordenacaoRepository extends JpaRepository<CoordenacaoModel, Integer> {
}