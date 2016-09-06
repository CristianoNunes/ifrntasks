package controllers;

import java.util.List;

import Skinfold.SkinfoldMaleSpecficGuedes1985;
import models.Aluno;
import models.Dobra;
import models.Perimetria;
import play.mvc.Controller;

public class Dobras extends Controller{
public static Long idAluno;
	
	public static void lista() {
		List<Dobra> dobras = Dobra.findAll();
		render(dobras);
	}
	
	/*public static void lista(Long id) {
		List<Dobra> dobras = Dobra.findAll()
		idAluno = id;
		render(dobras, idAluno);
	}*/
	
	public static void form(Long idAluno, Long id) {
		if (id == null) {
			render(idAluno);
		} else {
			Dobra dobra = Dobra.findById(id);
			render(dobra, idAluno);
		}
	}
	
	public static void salvar(Dobra dobra) {
		
		SkinfoldMaleSpecficGuedes1985 GuedesHomem = new SkinfoldMaleSpecficGuedes1985();
		GuedesHomem.setTR(dobra.tricipital);
		GuedesHomem.setSI(dobra.supraIliaca);
		GuedesHomem.setSB(dobra.subescapular);
		GuedesHomem.setAB(dobra.abdominal);
		
		GuedesHomem.UniversityStudents_17A27years();
		
		/*int gender;
		
		if(dobra.aluno.sexo.equals("Masculino")){
			gender = 1;
		}else{
			gender = 2;
		}*/
		
		dobra.resultado = GuedesHomem.CalculateFatPercentage(26, 1);
		
		
		dobra.save();
		flash.success("As dobras foram cadastradas com sucesso!");
		Dobras.lista();
	}
	
	public static void deletar(Long id){
		Dobra dobra = Dobra.findById(id);
		dobra.delete();
		lista();
	}
 
    public static void show(Long id) {
    	
    	
    	Dobra dobra = Dobra.findById(id);
        render(dobra);
    }
 
    public static void delete(Long id) {
    	Dobra dobra = Perimetria.findById(id);
    	dobra.delete();
    }
 
}
