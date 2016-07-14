package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import play.db.jpa.Model;

@Entity
public class Avaliacao extends Model {

	@OneToOne
	public Perimetria perimetria;
	
	public Double percentualGordura;
	
	@Temporal(TemporalType.DATE)
	public Date data;
	
}
