package com.tcs.training.myextra.question;

import com.tcs.training.myextra.components.LoginComponent;

import co.com.bancolombia.certificacion.screenplay.myextra.questions.Text;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Elmensaje  implements Question<String>{

		
	@Override
	public String answeredBy(Actor actor) {
		
		
		// esto que devuelve si no esta
		return Text.of(LoginComponent.MENSAJE);
	}

	public static Elmensaje deInicio() {
		return new Elmensaje();
	}
	
}
