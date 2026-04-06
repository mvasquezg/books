public class Person {
    String namePerson;
    String lastNamePerson;

    void showPerson(){
        System.out.println("\nNombre: "+namePerson+"\nApellido: "+lastNamePerson);
    }

    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objetos de tipo persona");

        var object01=new Person();

        object01.namePerson="Layla";
        object01.lastNamePerson="Acosta";

        object01.showPerson();

        var object02=new Person();

        object02.namePerson="Ian";
        object02.lastNamePerson="Gomez";

        object02.showPerson();
    
    }
}
