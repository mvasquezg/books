/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 03.-Definición de la función: y = x^n (potencia n de x)
    
    Ejemplo3
    Pagina 206
*/
import java.util.Scanner;

public class FunctionY{
    //Funcion calculateY
    static void calculateY(int x, int n){
        int result=1;

        for(int i=1; i<=n; i++){
            result*=x;
        }

        System.out.print("El resultado de la funcion Y=x^n es igual a:\nx="+x+"\nn="+n+"\n\nY="+result+"\n");
    }


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x=0, n=0;
        System.out.print("Program que calcula la funcion de Y=x^n.\nIngresa el valor x: ");
        x=in.nextInt();

        System.out.print("Ingresa el valor de n: ");
        n=in.nextInt();

        System.out.print("\n\n************");
        System.out.print("\nLLamando a la funcion calculateY()\n");
        calculateY(x, n);

    }
}