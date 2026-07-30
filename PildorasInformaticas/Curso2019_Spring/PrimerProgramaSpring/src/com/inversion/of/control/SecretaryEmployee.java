package com.inversion.of.control;

import com.inversion.of.control.interfac.EmpleadoIntrf;

public class SecretaryEmployee implements EmpleadoIntrf {

	@Override
	public String getTask() {
		
		return "Getionar la agende de los jefes";
	}

}
