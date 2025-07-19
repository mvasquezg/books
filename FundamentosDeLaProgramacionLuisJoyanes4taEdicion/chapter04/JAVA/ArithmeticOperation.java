/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 32.-Escribir un programa que seleccione la operación aritmética a ejecutar entre dos números dependiendo del valor de una variable 
        denominada seleccionOp.

    Pagina 156
*/

import java.util.Scanner;
public class ArithmeticOperation{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in); 
        int selectionOpc=0, num1=0, num2=0;

        System.out.print("Programa que ejecuta una operación aritmética entre dos números dependiendo de la opcion elegida\n");
        System.out.print("\n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Division\n\nElija Opcion: ");
        selectionOpc=in.nextInt();

        System.out.print("\nIngrese el primer numero: ");
        num1=in.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2=in.nextInt();

        System.out.print("\n");
        switch(selectionOpc){
            case 1:
                    System.out.print("Suma:\n "+num1+" + "+num2+" = "+(num1+num2));
                break;
            case 2:
                System.out.print("Resta:\n "+num1+" - "+num2+" = "+(num1-num2));
                break;
            case 3:
                System.out.print("Multiplicacion:\n "+num1+" * "+num2+" = "+(num1*num2));
                break;    
            case 4:
                System.out.print("Division:\n "+num1+" / "+num2+" = "+(num1/num2));
                break;
            default:
                System.out.print("La operacion no existe");
                break;        
        }//end switch

        System.out.print("\n");
    }
}    