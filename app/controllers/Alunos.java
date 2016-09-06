package controllers;
 
import java.util.List;

import models.Aluno;
import play.mvc.Controller;
import play.mvc.With;
 
/*@With(Seguranca.class)*/
public class Alunos extends Controller {
	
	public static void lista() {
		List<Aluno> alunos = Aluno.findAll();
		render(alunos);
	}
	
	public static void form(Long id) {
		if (id == null) {
			render();
		} else {
			Aluno aluno = Aluno.findById(id);
			render(aluno);
		}
	}
	
	public static void salvar(Aluno aluno) {
		aluno.save();
		flash.success("O aluno foi cadastrado com sucesso!");
		lista();
	}
	
	public static void deletar(Long id){
		Aluno aluno = Aluno.findById(id);
		aluno.delete();
		lista();
	}
 
	public static void show(Long id) {
        Aluno aluno = Aluno.findById(id);
        render(aluno);
    }
	
	public static void showJSON(Long id) {
        Aluno aluno = Aluno.findById(id);
        renderJSON(aluno);
    }
 
    public static void delete(Long id) {
        Aluno aluno = Aluno.findById(id);
        aluno.delete();
    }
 
}