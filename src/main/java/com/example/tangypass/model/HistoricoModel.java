package com.example.tangypass.model;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Getter
@Setter

public class HistoricoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int ID;
	public int idResponsavel;
	public int idEstudante;
	public boolean entradaOUsaida;
}
