/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 01.-Definición de la función: y = x^n (potencia n de x)
    
    Ejemplo1
    Pagina 206
*/
using System;

class FunctionY{
    //Funcion calculateY
    static void calculateY(int x, int n){
        int result=1;

        for(int i=1; i<=n; i++){
            result*=x;
        }

        System.Console.Write("El resultado de la funcion Y=x^n es igual a:\nx="+x+"\nn="+n+"\n\nY="+result+"\n");
    }


    public static void Main(string[] args){
        int x=0, n=0;
        System.Console.Write("Program que calcula la funcion de Y=x^n.\nIngresa el valor x: ");
        x=int.Parse(System.Console.ReadLine());

        System.Console.Write("Ingresa el valor de n: ");
        n=int.Parse(System.Console.ReadLine());

        System.Console.Write("\n\n************");
        System.Console.Write("\nLLamando a la funcion calculateY()\n");
        calculateY(x, n);

    }
}