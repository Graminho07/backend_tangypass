package com.example.tangypass.repository;
import com.example.tangypass.model.PedidosSaidaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PedidosSaidaRepository extends JpaRepository<PedidosSaidaModel, Long> {
}