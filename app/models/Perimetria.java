package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Perimetria extends Model {
	
	public Float peso;
	public Float altura;
	public Float ombro;
	public Float torax;
	public Float cintura;
	public Float abdomem;
	public Float quadril;
	public Float bicepsDir;
	public Float bicepsEsq;
	public Float coxaDir;
	public Float coxaEsq;
	public Float panturrilhaDir;
	public Float panturrilhaEsq;
	
	@ManyToOne
	public Aluno aluno;
}
