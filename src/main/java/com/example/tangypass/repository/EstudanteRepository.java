package com.example.tangypass.repository;
import com.example.tangypass.model.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EstudanteRepository extends JpaRepository<EstudanteModel, Long> {
}