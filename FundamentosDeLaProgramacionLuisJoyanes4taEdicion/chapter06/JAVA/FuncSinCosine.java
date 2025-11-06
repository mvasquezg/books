/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 06.-Algoritmo que contiene y utiliza unas funciones (seno y coseno) a las que les podemos pasar el ángulo en grados.
    
    Ejemplo 6
    Pagina 208
*/

import java.util.Scanner;

public class FuncSinCosine{    
    static double calculateSin(double degree){
        return Math.sin(degree*2*3.1416/360);
    }

    static double calculateCosine(double degree){
        return Math.cos(degree*2*3.1416/360);
    }


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double degree;

        System.out.print("Programa que calcula el seno y el coseno de un angulo en grados:\n");
        System.out.print("Ingresa el angulo en grado: ");
        degree=in.nextDouble();

        System.out.print("\nEl seno de "+degree +" es igual a: "+calculateSin(degree)+"\n");
        System.out.print("\nEl coseno de "+degree +" es igual a: "+calculateCosine(degree)+"\n");
    }
}