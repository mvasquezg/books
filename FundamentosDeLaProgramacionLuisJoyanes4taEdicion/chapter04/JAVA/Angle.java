/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 31.-Un ángulo se considera agudo si es menor de 90 grados, obtuso si es mayor de 90 grados y 
    recto si es igual a 90 grados. Utilizando esta información, escribir un algoritmo que acepte un ángulo en grados 
    y visualice el tipo de ángulo correspondiente a los grados introducidos.

    Pagina 155
*/
import java.util.Scanner;
class Angle{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float angle=0f;

        System.out.print("Programa que determina si el tipo de ángulo.\n\nMenor de 90 grados: Agudo.\nIgual a 90 grados: Recto.\nMayor de 90 grados: Obtuso\n");

        System.out.print("\nIngresa un angulo: ");
        angle=in.nextFloat();

        if(angle>90){
            System.out.print("El angulo "+angle+" es Obtuso.");
        }else if(angle==90){
            System.out.print("El angulo "+angle+" es Recto.");
        }else{
            System.out.print("El angulo "+angle+" es Agudo.");
        }
        System.out.print("\n");
    }
}
