package models;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Aluno extends Model {

	public String nome;
	public String sexo;
	public int idade;
	public String email;
	public String senha;
	
	/*@ElementCollection
	@CollectionTable(name = "aluno_linguagens")
	public List<String> linguagens;*/
	
}
