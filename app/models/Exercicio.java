package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Exercicio extends Model {
	
	public String nomeExercicio;
	public String imagem;

}
