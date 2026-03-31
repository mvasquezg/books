/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 11.-Se trata de realizar el cálculo del área de un círculo y la longitud de la circunferencia en función del valor del radio
                 leído desde el teclado.
    
    Ejemplo 11
    Pagina 223-224
*/
import java.util.Scanner;

public class FuncCircle{
    static double calArea(float radio){
        return Math.PI*radio*radio;
    }

    static double calcCircun(float radio){
        return Math.PI*2*radio;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float radio=0.0F;

        System.out.print("Programa que calcula el area de un circulo y la longitud de la circunferencia\nIngrese el radio del circulo: ");
        radio=in.nextFloat();

        System.out.print("\nArea: "+calArea(radio)+"\nCircunferencia: "+calcCircun(radio)+"\n\n");
    }    
}
