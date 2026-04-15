package prjPolimorfismo.src.com.animalapp;

import prjPolimorfismo.src.com.animal.Animal;
import prjPolimorfismo.src.com.animal.Perro;
import prjPolimorfismo.src.com.animal.Gato;

public class AnimalApp {
    static void printSound(Animal animal){
        animal.hacerSonido();        
    }
    
    public static void main(String[] args) {
        
        //Objeto padre Animal
        var animal=new Animal();

        printSound(animal);

        System.out.println();

        //Objeto Hija perro
        var animal2=new Perro();

        printSound(animal2);

        System.out.println();

        //Objeto Hija gato
        var animal3=new Gato();

        printSound(animal3);

        System.out.println();
        

    }
}
