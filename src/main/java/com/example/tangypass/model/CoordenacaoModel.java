package com.example.tangypass.model;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Getter
@Setter

public class CoordenacaoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int ID;
	public String senha;
	public String usuario;
}
