package com.inversion.of.control;

import com.inversion.of.control.interfac.EmpleadoIntrf;

public class BossEmployee implements EmpleadoIntrf{

		public String getTask() {
			return "Gestiono las cuestiones relativas a mis empleados de sección";
		}
}
