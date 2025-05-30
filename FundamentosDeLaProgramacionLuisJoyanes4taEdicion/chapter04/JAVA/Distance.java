
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 23.-Si distancia es mayor que 20 y menos que 35, leer un valor para tiempo.

    Ejercicios
    4.1 (e) Pagina 155
*/
import java.util.Scanner;

public class Distance{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int distance=0, time=0;
    
        System.out.print("programa Si distancia es mayor que 20 y menos que 35, leer un valor para tiempo: ");
    
        System.out.print("\n\nIngresa la distancia: ");
        distance=in.nextInt();
    
        if(distance>20 && distance<35){
            System.out.print("ingresa el tiempo: ");
            time=in.nextInt();
        }
    
        System.out.print("\nLos valores son:\nDistancia = "+distance+"\nTiempo = "+time+"\n\n");
    
    }
}