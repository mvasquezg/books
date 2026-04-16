package prjClassObject.src.com.person;
              
public class Person{
    public static int countPerson = 0;
    public static int id=0;

    private String namePerson;
    private String lastNamePerson;

    public Person(){}

    public Person(String namePerson, String lastNamePerson){
        
        this.namePerson=namePerson;
        this.lastNamePerson=lastNamePerson;
        //incremenetar el atributo estatico
        //Person.countPerson++;
        
        this.id=++Person.countPerson;
    }

    public void setNamePerson(String namePerson){
        this.namePerson=namePerson;
    }

    public String getNamePerson(){
        return this.namePerson;
    }

    public String getLastNamePerson(){
        return this.lastNamePerson;
    }

    public Integer getId(){
        return this.id;
    }

    @Override
    public String toString(){
        return "IdPersona: "+this.id+", Nombre: "+this.namePerson+", Apellido: "+lastNamePerson;
    }
}
