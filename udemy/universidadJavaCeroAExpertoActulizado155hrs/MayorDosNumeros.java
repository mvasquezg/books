import java.util.Scanner;

public class MayorDosNumeros{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("*** Programa que determina el amyor de dos numeros *** ");
        
        System.out.print("\nIngresa el primer numero: ");
        var num1=in.nextInt();

        System.out.print("\nIngresa el segundo numero: ");
        var num2=in.nextInt();
        
        System.out.println();
        System.out.println((num1>num2)?(num1+" es mayor"):(num1==num2)?(num1+" y "+num2+" son iguales"):(num2+" es mayor"));
    }
}