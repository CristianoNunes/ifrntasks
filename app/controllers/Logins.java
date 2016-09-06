package controllers;

import models.Academia;
import play.mvc.Controller;

public class Logins extends Controller {
	
	public static void form() {
		render();
	}
	
	public static void logar(String email, String senhaAcademia) {
		System.out.println(email + senhaAcademia);
		//if usuario e senha conferem
	    Academia academia = Academia.find("email = ? and senhaAcademia = ?", email, senhaAcademia).first();
	    if(academia == null){
	    	System.out.println("retornando nulo");
	    	Logins.form();
	    }else{
	    	session.put("usuario", "Nome do Menino");
	    	Alunos.lista();	    	
	    }
	}
	
	public static void sair() {
		session.clear();
		Logins.form();
	}

}
