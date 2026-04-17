package prjJavaBeans.src.com.javaBeans;

import java.io.Serializable;

public class Person implements Serializable{
    //1ra característica de un JavaBean: debe tener un constructor sin argumentos.
    public Person() {}
    
    //2da característica de un JavaBean: debe tener propiedades privadas.
    private String namePerson;
    private String lastNamePerson;

    public String getNamePerson() {
        return this.namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getLastNamePerson() {
        return this.lastNamePerson;
    }

    public void setLastNamePerson(String lastNamePerson) {
        this.lastNamePerson = lastNamePerson;
    }

    public String toString() {
        return "Persona{ nombre='" +this.namePerson + "', apellido='" + this.lastNamePerson + "'}";
    }
}
