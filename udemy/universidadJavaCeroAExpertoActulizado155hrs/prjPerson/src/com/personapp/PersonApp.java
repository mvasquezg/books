/*
    COMPILAR DESDE VSC

    Ejecutar comando desde la raiz del proyecto ejemplo en este caso: universidadJavaCeroAExpertoActulizado155hrs
    javac -d prjPerson/bin/ prjPerson/src/com/personapp/PersonApp.java 
    -----------------------------------------------------------------
    EJECUTAR PROGRAMA 
    Ejecutar el comando desde el recurso ejemplo en este caso: prjPerson
    java -cp bin/ prjPerson.src.com.personapp.PersonApp
*/

package prjPerson.src.com.personapp;

import prjPerson.src.com.person.Person;

public class PersonApp{
    public static void main(String[] args) {
        Person p1=new Person("Carolina", "Garcia");

        Person p2=new Person();

        System.out.println("Impriendo valores que se asignaron desde el constructor: ");
        System.out.println("Nombre: "+p1.getNamePerson()+"\nApellido: "+p1.getLastNamePerson());

        System.out.println();
        p2.setNamePerson("Paola");
        p2.setLastNamePerson("Vasquez");
        System.out.println("Impriendo valores que se asignaron desde el metodo set: ");
        System.out.println("Nombre: "+p2.getNamePerson()+"\nApellido: "+p2.getLastNamePerson());


    }
}