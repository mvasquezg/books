/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 05.-Realizar el diseño de la función y = x3 (cálculo del cubo de un número)..
    
    Ejemplo5
    Pagina 207
*/
import java.util.Scanner;

public class FuncCubeNumber{
    static int calculateCube(int x){
        return x*x*x;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=0;
        System.out.print("programa que calcula el cubo de un numero\nIngresa un numero: ");
        num=in.nextInt();

        System.out.print("El cubo de "+num+" es igual a: "+calculateCube(num)+"\n\n");
    }
}