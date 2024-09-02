/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 12.-resume una serie de aplicaciones de expresiones lógicas.
					
	Expresión lógica                    Resultado                   Observaciones
    (1 > 0) y (3 = 3)                   verdadero
    no PRUEBA                           verdadero                   ∙PRUEBA es un valor lógico falso.
    (0 < 5) o (0 > 5)                   verdadero
    (5 <= 7) y (2 > 4)                  falso
    no (5 <> 5)                         verdadero
    (numero = 1) o (7 >= 4)             verdadero                   ∙numero es una variable entera de valor 5.
*/

using System;
public class LogicalExpressions{
    public static void Main(string[] args){
        bool PRUEBA=false;
        int number=5;

        System.Console.Write("   Expresion logica\t\tResultado\t\tObservaciones");

        if((1 > 0) && (3 == 3)){
            System.Console.Write("\n\n   (1 > 0) && (3 == 3)\t\tVerdadero\n");
        }/*else{
            System.Console.Write("\n   (1 > 0) && (3 == 3)\t\tFalso\n");
        }*/

        if((!PRUEBA)){
            System.Console.Write("\n   no PRUEBA\t\t\tVerdadero\t\tPRUEBA es un valor logico falso\n");
        }else{
            System.Console.Write("\n   no PRUEBA\t\tFalso\n");
        }

        if((0 < 5) || (0 > 5)){
            System.Console.Write("\n   (0 < 5) o (0 > 5)\t\tVerdadero\n");
        }/*else{
            System.Console.Write("\n   (0 < 5) o (0 > 5)\t\tFalso\n");
        }*/

        if((5 <= 7) && (2 > 4)){
            //System.Console.Write("\n   (5 <= 7) && (2 > 4)\t\tVerdadero\n");
        }else{
            System.Console.Write("\n   (5 <= 7) && (2 > 4)\t\tFalso\n");
        }

        if(!(5!=5)){
            //System.Console.Write("\n   !(5<>5)\t\t\tVerdadero\n");
        /*}else{*/
            System.Console.Write("\n   !(5<>5)\t\t\tFalso\n");
        }

        if((number==5) || (7>=4)){
            System.Console.Write("\n   (numero==5) || (7>=4)\tVerdadero\t\tnumero es una variable entera de valor 5");
        }else{
            System.Console.Write("\n   (numero==5) || (7>=4)\t\tFalso");
        }
    
        System.Console.Write("\n\n");
    }   
}