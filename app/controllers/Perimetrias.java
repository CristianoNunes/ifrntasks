package controllers;

import java.util.List;

import Skinfold.SkinfoldFemaleGeneral;
import Skinfold.SkinfoldFemaleGeneralPetroski1995;
import models.Aluno;
import models.Dobra;
import models.Perimetria;
import play.mvc.Controller;

public class Perimetrias extends Controller{
	
	public static Long idAluno;
	
	public static void lista() {
		List<Perimetria> perimetrias = Perimetria.findAll();
		render(perimetrias);
	}
	
	public static void lista(Long id) {
		List<Perimetria> perimetrias = Perimetria.findAll();
		render(perimetrias);
	}
	
	public static void form(Long idAluno, Long id) {
		if (id == null) {
			render(idAluno);
		} else {
			Perimetria perimetria = Perimetria.findById(id);
			render(perimetria, idAluno);
		}
	}
	
	public static void salvar(Perimetria perimetria) {
		
		perimetria.save();
		
		Perimetrias.lista();
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
