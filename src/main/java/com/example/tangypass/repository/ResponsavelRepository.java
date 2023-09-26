package com.example.tangypass.repository;
import com.example.tangypass.model.ResponsavelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ResponsavelRepository extends JpaRepository<ResponsavelModel, Long> {
}