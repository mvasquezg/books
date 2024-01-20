/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 27.Escribir un algoritmo que calcule la superficie de un triángulo en función de la base y la altura 
    (S = 1/2Base × Altura)
*/

import java.util.Scanner;
class TriangleArea{
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float b=0; //base
        float h=0; //altura
        float area=0; //area del triagulo

        System.out.print("Ingrese la base del triangulo: ");
        b=in.nextFloat();

        System.out.print("Ingrese la altura del triangulo: ");
        h=in.nextFloat(); 

        area=(b*h)/2;

        System.out.print("El area del tiangulo es igual a: "+area+"\n");   
    }
}