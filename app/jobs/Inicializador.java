package jobs;

import models.Academia;
import models.Aluno;
import models.Exercicio;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Inicializador extends Job {

	public void doJob() {
        if(Exercicio.count() == 0) {
            
        	Exercicio supino = new Exercicio();
            supino.nome = "Supino Reto";
            supino.save();
            
            Exercicio supinoInclinado = new Exercicio();
            supinoInclinado.nome = "Supino Inclinado";
            supinoInclinado.save();
            
            Academia academia = new Academia();
            academia.email = "academia@gmail.com";
            academia.nomeAcademia = "Academia IFRN";
            academia.senhaAcademia = "123456";
            academia.save();
            
            Aluno aluno = new Aluno();
            aluno.nome = "Cristiano";
            aluno.idade = 26;
            aluno.sexo = "Masculino";
            aluno.email = "cris@gmail.com";
            aluno.senha = "123";
            aluno.save();
            		
        }
    }
}
