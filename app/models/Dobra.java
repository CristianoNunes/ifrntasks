package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;

@Entity
public class Dobra extends Model{
	
	public Float tricipital;
	public Float subescapular;
	public Float peitoral;
	public Float bicipital;
	public Float axilarMedia;
	public Float supraIliaca;
	public Float supraEspinhal;
	public Float abdominal;
	public Float coxa;
	public Float panturrilhaMedial;
	public Double resultado;
	
	@ManyToOne
	public Aluno aluno;
	
}
