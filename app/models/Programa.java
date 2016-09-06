package models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import play.db.jpa.Model;

@Entity
public class Programa extends Model {
	
	public String nome;
	
	@Temporal(TemporalType.DATE)
	public Date dataInicio;
	
	@Temporal(TemporalType.DATE)
	public Date dataFim;
		
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL, mappedBy="programa")
	public List<Serie> series;
	
	@ManyToOne
	public Aluno aluno;

}