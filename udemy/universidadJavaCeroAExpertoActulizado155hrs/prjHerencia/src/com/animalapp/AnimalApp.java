package prjHerencia.src.com.animalapp;

import prjHerencia.src.com.animal.Animal;
import prjHerencia.src.com.animal.Perro;
public class AnimalApp {
    public static void main(String[] args) {
        System.out.println(" *** Ejemplo de Herencia ***");
        System.out.println("\nClase Padre, Soy un Animal");
        var animal1=new Animal();
        animal1.comer();    
        animal1.dormir();

        System.out.println("\n\nClase Hija, Soy un Perro");
        var animal2=new Perro();
        animal2.comer();
        animal2.dormir();
        animal2.hacerSonido();

    }
}
