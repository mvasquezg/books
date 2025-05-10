/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 19.-Si un ángulo es igual a 90 grados, imprimir el mensaje "El ángulo es un ángulo recto" sino imprimir el mensaje 
    "El ángulo no es un ángulo recto.

    Ejercicios
    4.1 (a) Pagina 155
*/
import java.util.Scanner;

public class RightAngle{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       float angle=0f;

       System.out.print("Programa que determina si un angulo es Recto o no.\nIngrese el valor del angulo: ");
       angle=in.nextFloat();

       System.out.print("\n");
       if(angle!=90){
           System.out.print("El angulo "+angle+" no es recto");
       }else{
           System.out.print("El angulo "+angle+" es recto");
       }
       System.out.print("\n");
    }
}