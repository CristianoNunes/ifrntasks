package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Academia extends Model{
	
	public String nomeAcademia;
	public String cnpj;
	public String proprietario;

}
