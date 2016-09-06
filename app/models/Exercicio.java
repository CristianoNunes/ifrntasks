package models;

import javax.persistence.Entity;
import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Exercicio extends Model {
	
	public String nome;
	public Blob imagem;
	
	@Override
	public String toString() {
		return nome;
	}

}
