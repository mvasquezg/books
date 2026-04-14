package prjHerencia.src.com.animal;


public class Perro extends Animal {
    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }

    public void dormir(){
        System.out.println("Duermo 15 horas al dia");
        System.out.println("Clase Padre: ");
        super.dormir();
    }
}
