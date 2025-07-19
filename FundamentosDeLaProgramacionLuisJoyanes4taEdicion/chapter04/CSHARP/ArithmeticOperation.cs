/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 32.-Escribir un programa que seleccione la operación aritmética a ejecutar entre dos números dependiendo del valor de una variable 
        denominada seleccionOp.

    Pagina 156
*/

using System;
class ArithmeticOperation{    
    public static void Main(string[] args){
        int selectionOpc=0, num1=0, num2=0;

        System.Console.Write("Programa que ejecuta una operación aritmética entre dos números dependiendo de la opcion elegida\n");
        System.Console.Write("\n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Division\n\nElija Opcion: ");
        selectionOpc=int.Parse(System.Console.ReadLine());

        System.Console.Write("\nIngrese el primer numero: ");
        num1=int.Parse(System.Console.ReadLine());
        System.Console.Write("Ingrese el segundo numero: ");
        num2=int.Parse(System.Console.ReadLine());

        System.Console.Write("\n");
        switch(selectionOpc){
            case 1:
                    System.Console.Write("Suma:\n "+num1+" + "+num2+" = "+(num1+num2));
                break;
            case 2:
                System.Console.Write("Resta:\n "+num1+" - "+num2+" = "+(num1-num2));
                break;
            case 3:
                System.Console.Write("Multiplicacion:\n "+num1+" * "+num2+" = "+(num1*num2));
                break;    
            case 4:
                System.Console.Write("Division:\n "+num1+" + "+num2+" = "+(num1/num2));
                break;
            default:
                System.Console.Write("La operacion no existe");
                break;        
        }//end switch

        System.Console.Write("\n");
    }
}    