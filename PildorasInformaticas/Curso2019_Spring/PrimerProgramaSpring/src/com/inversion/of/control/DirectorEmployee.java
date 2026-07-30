package com.inversion.of.control;

import com.inversion.of.control.interfac.EmpleadoIntrf;

public class DirectorEmployee implements EmpleadoIntrf {

	@Override
	public String getTask() {
		
		return "Gestionar la plantilla de la empresa";
	}

}
