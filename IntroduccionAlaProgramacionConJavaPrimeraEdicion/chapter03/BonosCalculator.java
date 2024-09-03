/** 
 *Libro: Introducción a la programación con Java primera edición
 *Capitulo 3: Fundamentos de Java 
 *Programa 3: Crear una caluladora de bonos usando variables. 
*/

public class BonosCalculator{
    public static void main(String[] args){
        int salary;
        String bonoMessage;

        salary=50000;
        bonoMessage="Bono = $ "+(.02*salary);

        System.out.println(bonoMessage);
    }
}