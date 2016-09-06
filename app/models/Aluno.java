package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import play.db.jpa.Model;

@Entity
public class Aluno extends Model {

	public String nome;
	public String sexo;
	public int idade;
	public String email;
	public String senha;
	
	@OneToMany(mappedBy="aluno", cascade=CascadeType.ALL)
	public List<Programa> programas;
	
	@OneToMany(mappedBy="aluno", cascade=CascadeType.ALL)
	public List<Perimetria> perimetrias;
	
	@OneToMany(mappedBy="aluno", cascade=CascadeType.ALL)
	public List<Dobra> dobras;
	
}
