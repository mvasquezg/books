package com.inversion.of.control.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inversion.of.control.BossEmployee;
import com.inversion.of.control.DirectorEmployee;
import com.inversion.of.control.SecretaryEmployee;
import com.inversion.of.control.interfac.EmpleadoIntrf;

public class BossEmployeeApp {

	public static void main(String[] args) {
		
		//Creacion de objetos de tipo empleadod
		//BossEmployee employee1=new BossEmployee();	
		
		//EmpleadoIntrf employee1=new BossEmployee();
		
		//EmpleadoIntrf employee1=new SecretaryEmployee();
		
		///mpleadoIntrf employee1=new DirectorEmployee();
		
	//4 pasos para utilizar el contenidor Spring
	
		//1.-Crear el contexto (cargar archivo xml)
		ClassPathXmlApplicationContext contextTest=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//2.-Perdir al conetxto el bean
		EmpleadoIntrf miguel=contextTest.getBean("myEmployee", EmpleadoIntrf.class);
		
		
		//3.-Uso del empleado
		System.out.println(miguel.getTask());
		
		//4.-cerrar el context
		contextTest.close();
		
		
		

	}

}
