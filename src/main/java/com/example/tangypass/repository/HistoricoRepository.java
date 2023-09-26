package com.example.tangypass.repository;
import com.example.tangypass.model.HistoricoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface HistoricoRepository extends JpaRepository<HistoricoModel, Long> {
}