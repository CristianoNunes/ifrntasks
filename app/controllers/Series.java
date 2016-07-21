package controllers;

import java.util.List;

import models.Serie;
import play.mvc.Controller;

public class Series extends Controller{
	public static void lista() {
		List<Serie> series = Serie.findAll();
		render(series);
	}
	
	public static void form(Long id) {
		if (id == null) {
			render();
		} else {
			Serie serie = Serie.findById(id);
			render(serie);
		}
	}
	
	public static void salvar(Serie serie) {
		serie.save();
		flash.success("A serie foi cadastrada com sucesso!");
		lista();
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
