/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control I: Estructuras Selectivas
    Problema 16.-Escribir una frase y detenerse en la primera vocal leída. (Se supone que se leen, uno a uno, caracteres desde el teclado.)
    Pagina 188
*/
import java.util.Scanner;
public class VocalEndBucle{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        char letter='0';

        System.out.print("El programa termina al leer una vocal\n\n");
        do{
            System.out.print("Ingresa un letra: ");
            letter=in.nextLine().charAt(0);

        }while(letter!='a' && letter!='e' && letter!='i' && letter!='o' && letter!='u');

        System.out.print("\n\nLa vocal que termino el ciclo es: "+letter+"\n\n");
    }
}