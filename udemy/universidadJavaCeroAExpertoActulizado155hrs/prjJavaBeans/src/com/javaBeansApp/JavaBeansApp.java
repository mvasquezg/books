package prjJavaBeans.src.com.javaBeansApp;

import prjJavaBeans.src.com.javaBeans.Person;

public class JavaBeansApp {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.setNamePerson("Juan");
        person1.setLastNamePerson("Perez");

        System.out.println("*** Uso de JavaBeans  ***");
        System.out.println("Imprimiendo con el metodo toString() de la clase Person:");
        System.out.println(person1);

        System.out.println();
        System.out.println("Imprimiendo con los metodos getNamePerson() y getLastNamePerson() de la clase Person:");
        System.out.println("Nombre: " + person1.getNamePerson());
        System.out.println("Apellido: " + person1.getLastNamePerson());
    }
}
