package controllers;

import java.util.List;

import models.Academia;
import play.mvc.Controller;

public class Academias extends Controller  {
	
	public static void lista() {
		List<Academia> academias = Academia.findAll();
		render(academias);
	}
	
	public static void form(Long id) {
		if (id == null) {
			render();
		} else {
			Academia academia = Academia.findById(id);
			render(academia);
		}
	}
	
	public static void salvar(Academia academia) {
		academia.save();
		flash.success("A academia foi cadastrada com sucesso!");
		lista();
	}
	
	public static void deletar(Long id){
		Academia academia = Academia.findById(id);
		academia.delete();
		lista();
	}
 
    public static void show(Long id) {
        Academia academia = Academia.findById(id);
        render(academia);
    }
 
    public static void delete(Long id) {
        Academia academia = Academia.findById(id);
        academia.delete();
    }
 
}
