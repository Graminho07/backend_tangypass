package com.example.tangypass.repository;
import com.example.tangypass.model.AgendarSaidaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AgendarSaidaRepository extends JpaRepository<AgendarSaidaModel, Long> {
}