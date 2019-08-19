package com.tcs.training.myextra.components;

import co.com.bancolombia.certificacion.screenplay.myextra.targets.Coordinate;
import co.com.bancolombia.certificacion.screenplay.myextra.targets.Target;

public class LoginComponent {

	public static final Target USER= 
			Target.the("Campo usuario").
			locatedByCoordinate(Coordinate.withRow(6).
					withInitialColumn(53)
					.withFinalColumn(62)
					.andLenght(10));
	
	public static final Target PASS = Target.the("campo clave")
			.locatedByTag("Password");
	
	public static final Target MENSAJE = Target.the("Mensaje logueo")
			.locatedByCoordinate(Coordinate.withRow(1)
					.withInitialColumn(36)
					.withFinalColumn(42)
					.andLenght(7)
					);

}
