package com.example.tangypass.model;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Getter
@Setter

public class AcessoQRModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int ID;
	public int ultimaLeitura;
	public int idUltimoUsuario;
	public int codigoDaVez;
	public int ultimoCodigo;
}
