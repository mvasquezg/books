/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 15.-Ejecutar y visualizar el programa siguiente que imprime una tabla de m filas por n columnas y un carácter
prefijado.
    Pagina 185
*/

import java.util.Scanner;
public class PrintCharacterRowCol{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int row=0, column=0;
        char ch=' ';

        System.out.print("Ingrese la cantidad de filas: ");
        row=in.nextInt();

        System.out.print("Ingrese la cantidad de columnas: ");
        column=in.nextInt();

        System.out.print("Ingrese character: ");
        ch=in.next().charAt(0);

        System.out.print("\n");
        for(int i=1; i<=row; i++){
            for(int j=1; j<=column; j++)    {
                System.out.print(ch);
            }
            System.out.print("\n");
        }

    }
}    