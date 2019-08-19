package com.tcs.training.myextra.task;

import com.tcs.training.myextra.components.LoginComponent;

import co.com.bancolombia.certificacion.screenplay.myextra.interactions.Enter;
import co.com.bancolombia.certificacion.screenplay.myextra.interactions.Hit;
import co.com.bancolombia.certificacion.screenplay.myextra.utils.Keys;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Loguearse implements Task {

	
	private String usuario;
	private String clave;
	
	public Loguearse(String usuario, String clave) {
		// TODO Auto-generated constructor stub
	
		this.usuario = usuario;
		this.clave = clave;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue(usuario).into(LoginComponent.USER),
				Enter.theValue(clave).into(LoginComponent.PASS),
				Hit.the(Keys.ENTER));

	}
	// presionar hit
	// asi puedo colocar el de key de eso Hit.the("<Enter>")

	
	public static Loguearse con(String usuario,String clave) {
		return new Loguearse(usuario, clave);
	}

}
