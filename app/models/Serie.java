package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Serie extends Model {
	
	@ManyToOne
	public Exercicio exercicio;
	
	public Integer quantidade;
	
	public Integer repeticao;

}
