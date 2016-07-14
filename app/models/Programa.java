package models;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import play.db.jpa.Model;

@Entity
public class Programa extends Model {
	
	@Temporal(TemporalType.DATE)
	public Date dataInicio;
	
	@Temporal(TemporalType.DATE)
	public Date dataFim;
	
	@OneToMany
	public List<Serie> series;

}
