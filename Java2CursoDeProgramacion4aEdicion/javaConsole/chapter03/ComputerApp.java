/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 03: Introducción a la Programacion Orientada a Objetos
*Programa 02: Clase Computadora 
*/

public class ComputerApp{
    public static void main(String[] args){
        Computer comp1=new Computer();

        comp1.setTrademark("Thosiba");
        comp1.onComputer();
        comp1.statusComputer();
        System.out.println("\n");
        comp1.offComputer();
        System.out.println("\n");
    }
}