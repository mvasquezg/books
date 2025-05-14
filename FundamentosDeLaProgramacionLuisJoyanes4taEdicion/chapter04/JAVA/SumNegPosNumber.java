
/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 21.-Si el número es positivo, sumar el número a total de positivos, sino sumar al total de negativos.

    Ejercicios
    4.1 (c) Pagina 155
*/
import java.util.Scanner;

public class SumNegPosNumber{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=0, sumPosit=0, sumNegat=0;
        char resp=' ';

        System.out.print("Programa que de un listado de numero evalua Si el número es positivo, sumar el número a total de positivos, sino sumar al total de negativos.\n\n");    

        do{
            System.out.print("Ingresa un numero: ");
            num=in.nextInt();

            if(num<0){
                sumNegat+=num;
            }else{
                sumPosit+=num;
            }

            System.out.print("\nDesea agregar otro numero: ");
            resp=in.next().charAt(0);

        }while(resp!='n');

        System.out.print("\nSuma de numeros positivos: "+sumPosit+"\nSuma de numeros negativos: "+sumNegat+"\n\n");
    }
}    