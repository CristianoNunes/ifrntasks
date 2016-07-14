package controllers;

import java.util.List;
import models.Aluno;
import models.Exercicio;
import play.mvc.Controller;

public class Exercicios extends Controller{
	
	public static void lista() {
		List<Exercicio> exercicios = Exercicio.findAll();
		render(exercicios);
	}
	
	public static void form(Long id) {
		if (id == null) {
			render();
		} else {
			Exercicio exercicio = Exercicio.findById(id);
			render(exercicio);
		}
	}
	
	public static void salvar(Exercicio exercicio) {
		exercicio.save();
		flash.success("O exercício foi cadastrado com sucesso!");
		lista();
	}
	
	public static void deletar(Long id){
		Exercicio exercicio = Exercicio.findById(id);
		exercicio.delete();
		lista();
	}
 
    public static void show(Long id) {
        Exercicio exercicio = Exercicio.findById(id);
        render(exercicio);
    }
    
    public static void showJSON(Long id) {
        Exercicio exercicio = Exercicio.findById(id);
        renderJSON(exercicio);
    }
 
    public static void delete(Long id) {
        Exercicio exercicio = Exercicio.findById(id);
        exercicio.delete();
    }
 
}
