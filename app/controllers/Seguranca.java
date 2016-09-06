package controllers;

import play.mvc.Before;
import play.mvc.Controller;
/*import Control.ControlSkinfoldGeneralPetroski1995Female18A61years;*/
public class Seguranca extends Controller {
	
	@Before
	static void verificar() {
		/*ControlSkinfoldGeneralPetroski1995Female18A61years teste = new ControlSkinfoldGeneralPetroski1995Female18A61years();
		teste.ReturnSituation_Petroski_1995_Female_18A61years(AM, SI, CX, PR, gender, age)*/
		if (!session.contains("usuario")) {
			
			Logins.form();
		}
	}
}


