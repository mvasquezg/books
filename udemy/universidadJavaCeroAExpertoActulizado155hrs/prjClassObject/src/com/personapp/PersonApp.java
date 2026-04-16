package prjClassObject.src.com.personapp;
        
import  prjClassObject.src.com.person.Person;

public class PersonApp {
    public static void main(String[] args) {
        System.out.println("*** Contexto estatico ***");

        System.out.println("Variable estatica: "+Person.countPerson);
        var object1=new Person("Layda", "Acosta");
        System.out.println(object1);    
        System.out.println(Person.countPerson);
        System.out.println();
        //System.out.println(object1.toString());
        var object2=new Person("Miguel", "Vasquez");
        System.out.println(object2);
        System.out.println(Person.countPerson);
    }   
}
