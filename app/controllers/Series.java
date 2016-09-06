package controllers;

import java.util.List;

import models.Exercicio;
import models.Serie;
import play.mvc.Controller;

public class Series extends Controller{
	public static void lista() {
		List<Serie> series = Serie.findAll();
		render(series);
	}
	
	public static void form(Long id) {
		List<Exercicio> exercicios = Exercicio.findAll();
		
		if (id == null) {
			render(exercicios);
		} else {
			Serie serie = Serie.findById(id);
			render(serie, exercicios);
		}
	}
	
	public static void salvar(Serie serie) {
		serie.save();
		flash.success("A serie foi cadastrada com sucesso!");
		Programas.show(serie.programa.getId());
	}
	
	public static void deletar(Long id){
		Serie serie = Serie.findById(id);
		serie.delete();
		lista();
	}
 
    public static void show(Long id) {
    	Serie serie = Serie.findById(id);
        render(serie);
    }
    
    public static void showJSON(Long id) {
    	Serie serie = Serie.findById(id);
        renderJSON(serie);
    }
 
    public static void delete(Long id) {
    	Serie serie = Serie.findById(id);
    	serie.delete();
    }
}
