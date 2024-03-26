/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 11.-Programa que muestre el resultado de las siguientes expresiones mezclando los operadores logicos y relacionales: 
					
				(1 < 5) Y ( 5 < 10) 
				(5 > 10) O (‘A’ < ‘B’)
*/
using System;
class RelationAndLogicalOperators{

    public static void Main(string[] args){

        if((1<5) && (5<10)){
            System.Console.Write("(1<5) Y (5<10) = Verdadero\n\n");
        }/*else{
           System.Console.Write("(1<5) Y (5<10) = Falso\n\n");
            Se comento la linea de codigo, porque marcaba el error
            
            warning c0162: Unreachable code detected
            La pagina oficial de Microsof
            https://learn.microsoft.com/en-us/dotnet/csharp/misc/cs0162

            Indica 
            Unreachable code detected
            The compiler detected code that will never be executed. es decir que el compilador detecto codigo que nunca sera ejcutado.
        }*/

        if((5 > 10) || ('A' < 'B')){
            System.Console.Write("(5 > 10) O (A < B) = Verdadero\n\n");
        }/*else{
            Se comento el codigo por lo ya descrito anteriormente
            System.Console.Write("(5 > 10) O (A < B) = Falso\n\n");
        }*/
    }
}