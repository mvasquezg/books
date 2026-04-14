package prjPerson.src.com.person;

public class Person{
    private String namePerson;
    private String lastNamePerson;

    public Person(){}

    public Person(String namePerson, String lastNamePerson){
        this.namePerson=namePerson;
        this.lastNamePerson=lastNamePerson;
    }

    public void setNamePerson(String namePerson){
        this.namePerson=namePerson;
    }

    public String getNamePerson(){
        return this.namePerson;
    }

    public void setLastNamePerson(String lastNamePerson){
        this.lastNamePerson=lastNamePerson;
    }

    public String getLastNamePerson(){
        return this.lastNamePerson;
    }


}