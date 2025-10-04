/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 02.-Calcular la siguiente funcion
		
				f(x)=x/1+(x*x)
    Ejemplo2
    Pagina 205
*/
import java.util.Scanner;

public class FuncX{
    static float functionX(float x){
        return x/(1+(x*x));
    } 

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float x=0f;

        System.out.print("Programa que calcula la f(x)=x/(1+x^2)\nIngresa el valor x: ");
        x=in.nextFloat();

        System.out.print("f(x)=x/(1+x^2):\n\nf("+x+")="+x+"/1+"+x+"^2 = "+functionX(x)+"\n\n");
    }
}
