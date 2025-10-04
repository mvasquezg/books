/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 01.-Calcular la superficie (área) de un rectángulo, usando funciones.
    
    Ejemplo1
    Pagina 202
*/
import java.util.Scanner;

public class FuncAreaRectangulo{
    static float calculateArea(float base, float altura){
        return base*altura;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float base=0f, altura=0f;

       System.out.print("Programa que calcula el area de un rectangulo, usando una funcion:\n\nIngresa la base del rectangulo: ");
       base=in.nextFloat();;
       System.out.print("Ingresa la altura del rectangulo: ");
       altura=in.nextFloat();;

       System.out.print("El area del rectanglo es igual a: "+calculateArea(base, altura)+"\n\n");    
    }
}