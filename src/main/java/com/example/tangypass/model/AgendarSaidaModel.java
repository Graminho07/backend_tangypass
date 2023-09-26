package com.example.tangypass.model;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Getter
@Setter

public class AgendarSaidaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int ID;
	public int horario;
	public int idEstudante;
	public int idResponsavel;
	public boolean diariamente;
}
