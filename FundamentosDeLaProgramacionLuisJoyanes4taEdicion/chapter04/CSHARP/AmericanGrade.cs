/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 31.-El sistema de calificación americano (de Estados Unidos) se suele calcular de acuerdo al siguiente cuadro:

                 Grado numérico                                                        Grado en letra
                 Grado mayor o igual a 90                                                A
                 Menor de 90 pero mayor o igual a 80                                         B   
                 Menor de 80 pero mayor o igual a 70                                         C
                 Menor de 70 pero mayor o igual a 69                                         D
                 Menor de 69                                                                 F

                Utilizando esta información, escribir un algoritmo que acepte una calificación numérica del estudiante (0-100),
                convierta esta calificación a su equivalente en letra y visualice la calificación correspondiente en letra.

    Pagina 155-156
*/
using System;
class AmericanGrade{    
    public static void Main(string[] args){
        int cal=0;
        System.Console.Write("Programa que acepte una calificación numérica del estudiante (0-100), convierta esta calificación a su equivalente en letra y visualice la calificación correspondiente en letra.");
        System.Console.Write("\nDe acuerdo a la siguiente tabla: ");
        System.Console.Write("\n\nGrado numérico\t\t\t\tGrado en letra");
        System.Console.Write("\nGrado mayor o igual a 90\t\t\tA");
        System.Console.Write("\nMenor de 90 pero mayor o igual a 80\t\tB");   
        System.Console.Write("\nMenor de 80 pero mayor o igual a 70\t\tC");
        System.Console.Write("\nMenor de 70 pero mayor o igual a 69\t\tD");
        System.Console.Write("\nMenor de 69\t\t\t\t\tF");
    
        System.Console.Write("\n\nIngresa la calificacion numerica: ");
        cal=int.Parse(System.Console.ReadLine());
    
        if(cal>=90){
            System.Console.Write("La calificacion "+cal+" es igual a: A");
        }else if(cal>=80 && cal<90){
            System.Console.Write("La calificacion "+cal+" es igual a: B");
        }else if(cal>=70 && cal<80){
            System.Console.Write("La calificacion "+cal+" es igual a: C");
        }else if(cal==69){
            System.Console.Write("La calificacion "+cal+" es igual a: D");
        }else{
            System.Console.Write("La calificacion "+cal+" es igual a: F");
        }
        System.Console.Write("\n");
    }
}    