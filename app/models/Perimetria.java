package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Perimetria extends Model {
	
	public Float peso;
	public Float altura;
	public Float pescoco;
	public Float ombro;
	public Float torax;
	public Float cintura;
	public Float abdomem;
	public Float quadril;
	public Float bicepsDir;
	public Float bicepsEsq;
	public Float anteBracoDir;
	public Float anteBracoEsq;
	public Float coxaDir;
	public Float coxaEsq;
	public Float panturrilhaDir;
	public Float panturrilhaEsq;

}
