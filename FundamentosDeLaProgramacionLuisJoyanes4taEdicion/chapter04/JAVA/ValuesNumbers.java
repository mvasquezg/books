
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 22.-Si x es mayor que y, y z es menor que 20, leer un valor para p

    Ejercicios
    4.1 (d) Pagina 155
*/
import java.util.Scanner;

public class ValuesNumbers{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x=0, y=0, z=0, p=0;

        System.out.print("Programa que lee el valor de P si X es mayor que Y, y Z es menor que 20.\n");
        System.out.print("\nIngresa el valor x: ");
        x=in.nextInt();
        System.out.print("Ingresa el valor y: ");
        y=in.nextInt();
        System.out.print("Ingresa el valor z: ");
        z=in.nextInt();    


        if( (x>y) && (z<20)){
            System.out.print("Ingresa el valor p: ");
            p=in.nextInt();
        }else{
            System.out.print("\nNo se cumple la condicion X>Y && z<20");
        }
        System.out.print("\n\nLos valores son: X="+x+", Y="+y+", Z="+z+", P="+p+"\n\n");
    }
}    