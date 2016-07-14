package controllers;

import java.util.List;
import models.Perimetria;
import play.mvc.Controller;

public class Perimetrias extends Controller{
	
	public static void lista() {
		List<Perimetria> perimetrias = Perimetria.findAll();
		render(perimetrias);
	}
	
	public static void form(Long id) {
		if (id == null) {
			render();
		} else {
			Perimetria perimetria = Perimetria.findById(id);
			render(perimetria);
		}
	}
	
	public static void salvar(Perimetria perimetria) {
		perimetria.save();
		flash.success("A perimetria foi cadastrada com sucesso!");
		lista();
	}
	
	public static void deletar(Long id){
		Perimetria perimetria = Perimetria.findById(id);
		perimetria.delete();
		lista();
	}
 
    public static void show(Long id) {
    	Perimetria perimetria = Perimetria.findById(id);
        render(perimetria);
    }
 
    public static void delete(Long id) {
    	Perimetria perimetria = Perimetria.findById(id);
    	perimetria.delete();
    }
 
}
