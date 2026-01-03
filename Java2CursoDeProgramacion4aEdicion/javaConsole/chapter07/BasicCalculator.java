/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 15: Calculadora basica de dos operandos. 
*/
import java.util.Scanner;

public class BasicCalculator{
    

    public static int sum(int a, int b){
        
        return a+b;
    }

    public static int rest(int a, int b){
        
        return a-b;
    }

    public static int multp(int a, int b){
        
        return a*b;
    }

    public static int div(int a, int b){
        
        return a/b;
    }

    public static void showMenu(){
        Scanner in=new Scanner(System.in);
        int num1=0, num2=0;
        int opcion=0;
        System.out.print("1.-Sumar\n2.-Restar\n3.-Multiplicar\n4.-Dividir\n5.-Salir\n");
        
        do{
            System.out.print("opcion: ");
            opcion=in.nextInt();
        }while(opcion<1 || opcion>5);

        if(opcion>=1 && opcion<=4){
            System.out.print("\nIngrese el primer numero a operar: ");
            num1=in.nextInt();

            System.out.print("Ingrese el segundo numero a operar: ");
            num2=in.nextInt();
        }
        
        switch(opcion){
            case 1:
                System.out.println("El resultado de la suma: "+num1+" + " +num2+" = "+sum(num1, num2));
                break;
            case 2:
                 System.out.println("El resultado de la resta: "+num1+" - " +num2+" = "+rest(num1, num2));
                break;
            case 3:
                 System.out.println("El resultado de la multiplicacion: "+num1+" * " +num2+" = "+multp(num1, num2));
                break;
            case 4:
                 System.out.println("El resultado de la division: "+num1+" / " +num2+" = "+div(num1, num2));
                break;
            default:
                System.out.println("Adios Salir.\n");        
                break;
        }//end switch
    }
    
    
    public static void main(String[] args){
       // Scanner in=new Scanner(System.in);
        int option=0;
        System.out.println("Programa que calcula las siguientes opeaciones de dos numeros: ");
        
        showMenu();
    }
}