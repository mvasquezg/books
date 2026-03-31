/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 12.-La función triángulo calcula el área de un triángulo en C++
    
    Ejemplo 6.15
    Pagina 232-233
*/
import java.util.Scanner;

public class FuncTriangle {
    
    static float calcArea(float baseT, float heigth){
        return (baseT*heigth)/2;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float baseT=0.0F, heigth=0.0F;

        System.out.print("**** Programa que calcula el area de un triangulo ***");
        System.out.print("\n\nIngresa el valor de la base: ");
        baseT=in.nextFloat();
        System.out.print("Ingresa el valor de la altura: ");
        heigth=in.nextFloat();

        in.close();
        System.out.print("\nArea: "+calcArea(baseT, heigth)+"\n\n");
    }
}
