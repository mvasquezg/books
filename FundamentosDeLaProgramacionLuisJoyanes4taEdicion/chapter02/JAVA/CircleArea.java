/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 02.-Metodología de la programación y desarrollo de software.
    Problema 07.Encontrar el area y el perimetro de un círculo.

    A=PI*r*r
    P = 2*PI*r
*/

import java.util.Scanner;

class CircleArea{

    public static void main(String[] args){ 
        Scanner in=new Scanner(System.in);

        float r=0F;          //Variable radio      
        float PI=3.1416F;    //Variable PI
        float A=0F;          //Variable Area
        float P=0F;          //Variable Perimetro

        System.out.print("Ingrese el radio de la circunferencia: ");
        r=in.nextFloat();

        A=PI*r*r;
        P=2*PI*r;
        
        System.out.print("\nRadio: "+r+"\nArea: "+A+"\nPerimetro: "+P+"\n\n");
    }
}