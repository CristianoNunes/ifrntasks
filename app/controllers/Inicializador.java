package controllers;

import models.Academia;
import models.Exercicio;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Inicializador extends Job {

	public void doJob() {
        if(Exercicio.count() == 0) {
            Exercicio supino = new Exercicio();
            supino.nomeExercicio = "Supino Reto";
            supino.save();
            
            Exercicio supinoInclinado = new Exercicio();
            supinoInclinado.nomeExercicio = "Supino Inclinado";
            supinoInclinado.save();
            
            Academia academia = new Academia();
            academia.nomeAcademia = "Academia IFRN";
            academia.cnpj = "123456";
            academia.senhaAcademia = "123456";
            academia.save();
        }
    }
}
