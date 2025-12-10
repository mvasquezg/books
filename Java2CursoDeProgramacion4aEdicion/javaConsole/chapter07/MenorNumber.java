/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 01: menor de tres numeros 
*/
import java.util.Scanner;

public class MenorNumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int num1=0, num2=0, num3=0, menor=0;

        System.out.print("Ingrese el primer valor: ");
        num1=in.nextInt();
        System.out.print("Ingrese el Segundo valor: ");
        num2=in.nextInt();
        System.out.print("Ingrese el tercer valor: ");
        num3=in.nextInt();

        if(num1==num2){
            if(num2==num3){
                System.out.println("Todos los numeros son iguales.");
            }else if(num2>num3){
                    menor=num3;
            }else{
                menor=num2;    
            }
        }else if(num1>num2){
            if(num1==num3){
                menor=num2;
            }else if(num1>num3){
                if(num2==num3){
                    menor=num3;
                }else if(num2>num3){
                    menor=num3;
                }else{
                    menor=num2;
                }
            }else{
                menor=num2;
            }
        }else{
            if(num2==num3){
                menor=num1;
            }else if(num2>num3){
                if(num1==num3){
                    menor=num3;
                }else if(num1>num3){
                    menor=num3;
                }else{
                    menor=num1;
                }
            }else{
                menor=num1;
            }
        }
        

        if(menor!=0){
            System.out.println("El numero menor: "+menor);
        }    
        

    }
}