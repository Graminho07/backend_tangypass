package com.example.tangypass.repository;
import com.example.tangypass.model.AcessoQRModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AcessoQRRepository extends JpaRepository<AcessoQRModel, Long> {
}