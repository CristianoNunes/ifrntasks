package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Academia extends Model{
	
	public String email;
	public String nomeAcademia;
	public String proprietario;
	public String senhaAcademia;

}
