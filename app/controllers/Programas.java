package controllers;

import java.util.List;

import models.Exercicio;
import models.Programa;
import models.Serie;
import play.mvc.Controller;

public class Programas extends Controller{
	
	public static void lista() {
		List<Programa> programas = Programa.findAll();
		render(programas);
	}
	
	public static void form(Long id) {
		if (id == null) {
			render();
		} else {
			Programa programa = Programa.findById(id);
			render(programa);
		}
	}
	
	public static void salvar(Programa programa) {
		programa.save();
		flash.success("O programa foi cadastrado com sucesso!");
		show(programa.id);
	}
	
	public static void deletar(Long id){
		Programa programa = Programa.findById(id);
		programa.delete();
		lista();
	}
 
    public static void show(Long id) {
    	Programa programa = Programa.findById(id);

    	List<Exercicio> exercicios = Exercicio.findAll();
        render(programa, exercicios);
    }
    
    public static void showJSON(Long id) {
    	Programa programa = Programa.findById(id);
        renderJSON(programa);
    }
 
    public static void delete(Long id) {
    	Programa programa = Programa.findById(id);
    	programa.delete();
    }
 
}
