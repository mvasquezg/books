/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 13.-Determinar el mayor de tres numeros.
*/
import java.util.Scanner;
public class GreaterThanThreeNumbers{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1=0, num2=0, num3=0;

        System.out.print("Ingresa el primer numero: ");
        num1=in.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        num2=in.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        num3=in.nextInt();

        if(num1==num2){

            if(num2==num3){
                System.out.print("Los tres numeros son iguales.");
            }else if(num2>num3){
                System.out.print(num1+" y "+num2+" son iguales y mayores");
            }else{
                System.out.print(num3+" es mayor");
            }
        }else if(num1>num2){
            if(num2==num3){
                System.out.print(num1+" es mayor");
            }else if(num2>num3){
                System.out.print(num1+" es mayor");
            }else{
                if(num1==num3){
                    System.out.print(num1+" y "+num3+" son iguales y mayores");
                }else if(num1>num3){
                    System.out.print(num1+"%d es mayor");
                }else{
                    System.out.print(num3+" es mayor");
                }
            }
        }else{
            if(num2==num3){
                System.out.print(num2+" y "+num3+" son iguales y mayores");
            }else if(num2>num3){
                System.out.print(num2+" es mayor");
            }else{
                System.out.print(num3+" es mayor");
            }
        }
        System.out.print("\n\n");
    }
}