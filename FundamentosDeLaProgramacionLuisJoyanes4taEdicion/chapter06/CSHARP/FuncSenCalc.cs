/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 07.-Supuesto que nuestro compilador tiene la funcion. Podriamos calcular el seno de x mediante la siguiente serie:

    sen(x)= x - (x^3/3!) + (x^5/5!) + (x^7/7!) + ...(hasta 17 terminos)   
    
    Ejemplo 8
    Pagina 208-209
*/
using System;

class FunSenCalc{

    static double showFactorial(double x){
        if(x<=1){
            return 1;
        }else{
            return x*showFactorial(x-1);
        }   
    }

    static double power(double x, int expo){
        double result=1;
        for(int i=1; i<=expo; i++){
            result*=x;
        }

        return result;
    }

    static double sen(double x){
        double X, s;
        int n=0;

        X=x*3.141592/180;
        s=X;

        for(int i=2; i<=17; i++){
            n=2*i-1;

            if(i%2!=0){
                s=s-(power(X, n)/showFactorial(n));
            }else{
                s=s+(power(X, n)/showFactorial(n));
            }
        }
        return s;
    }

    public static void Main(string[] args){
        double x=0;
        System.Console.Write("Ingrese el valor de grados: ");
        x=double.Parse(System.Console.ReadLine());
        System.Console.Write("\nsen(x) = "+sen(x)+"\n\n");
    }
}