/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 08: Bucles DO-WHILE aplicada al calculo de la raiz cuadrada por el metodo de Newton. 
*/
import java.util.Scanner;

public class NewtonSqrt{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double n=0;         //numero
        double aprox=0;     //aproximacion de la raiz cuadrada
        double antaprox=0;  //anterior proximacion
        double epsilon=0;   //coeficiente de error
        
        //Do-While que se ejecuta mientras se ingrese un numero menor a cero
        do{
            System.out.print("Ingresa un numero: ");
            n=in.nextDouble();
        }while(n<0);

        do{
            System.out.print("Ingresa la raiz cuadrada aproximada: ");
            aprox=in.nextDouble();
        }while(aprox<=0);

        do{
            System.out.print("Ingresa un coeficiente de error: ");
            epsilon=in.nextDouble();
        }while(epsilon<=0);

        do{
            antaprox=aprox;
            aprox=(n/antaprox + antaprox)/2;
        }while(Math.abs(aprox - antaprox)>=epsilon);

        System.out.printf("La raiz cuadrada de %.2f es %.2f\n\n", n, aprox);    

    }
}