package com.example.tangypass.repository;
import com.example.tangypass.model.GuardasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GuardasRepository extends JpaRepository<GuardasModel, Long> {
}