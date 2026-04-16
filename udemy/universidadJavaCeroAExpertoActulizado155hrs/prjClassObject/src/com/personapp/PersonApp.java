package prjClassObject.src.com.personapp;

import prjClassObject.src.com.person.Person;
public class PersonApp {
    public static void main(String[] args) {
        System.out.println("*** Hereando de la clase Object ***");
        var object1=new Person("Layda", "Acosta");

        //System.out.println(object1.toString());
        System.out.println(object1);
    }   
}
