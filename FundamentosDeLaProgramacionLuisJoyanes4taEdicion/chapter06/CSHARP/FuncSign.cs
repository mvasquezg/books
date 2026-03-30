/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 06.-Subprogramas (subalgoritmos): Funciones
    Problema 10.-La función (signo) realiza la siguiente tarea: dado un número real x, si x es 0, entonces se devuelve un 0; si x es
                positivo, se devuelve 1, y si x es negativo, se devuelve un valor –1. 
    
    Ejemplo 10
    Pagina 216-217
*/
using System;

class FuncSign{
    
    static int signNum(int num){
        int result=0;
        
        if(num>0){
            result=1; 
        }else if(num<0){
            result=-1;
        }else{
            result=0;
        }
        return result;
    }

public static void Main(string[] args){
    int num=0;
    System.Console.Write("Uso de la funcion sign, devuelve:\n 1 si el numero ingresado es positivo\n-1 si el numero ingresado es negativo\n0 si el numero ingresado es cero");
    System.Console.Write("Ingresa un numero: ");
    num=int.Parse(System.Console.ReadLine());

    System.Console.WriteLine("\n"+signNum(num));

    }    
}