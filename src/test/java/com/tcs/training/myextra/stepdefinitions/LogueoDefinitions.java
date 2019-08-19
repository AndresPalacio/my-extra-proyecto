package com.tcs.training.myextra.stepdefinitions;

import static org.hamcrest.CoreMatchers.equalTo;

import com.tcs.training.myextra.question.Elmensaje;
import com.tcs.training.myextra.task.Loguearse;

import co.com.bancolombia.certificacion.screenplay.myextra.interactions.OpenMyExtra;
import co.com.bancolombia.certificacion.screenplay.myextra.utils.CloseMyExtra;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class LogueoDefinitions {
	/*before para preparar escenario - esto se hace para cada paquete*/

	@Before
	public void setUp(Scenario scenario){
		
		OnStage.setTheStage(Cast.ofStandardActors());
		System.out.println(scenario.getName());

	}
	
	@Given("^(.*) se encuentra en myExtra$")
	public void jeissonSeEncuentraEnMyExtra(String actor) {
	
		OnStage.theActorCalled(actor).wasAbleTo(OpenMyExtra.session("as400-demostracion.edp"));
	}

	@When("^el ingresa sus credenciales$")
	public void elIngresaSusCredenciales() {
		OnStage.theActorInTheSpotlight().attemptsTo(Loguearse.con("asdasd", "asdasdas"));

	}

	@Then("^el debera visualizar el mensaje de (.*)$")
	public void elDeberaVisualizarElMensajeDeSingOn(String mensaje) {
		// recibe el mensaje que pregunta si esta y retorna el texto, luego compara el mensaje
			OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Elmensaje.deInicio(), equalTo(mensaje)));
	}

	@After
	public void closeMyExtra() {
		CloseMyExtra.session();
	}
}

