
import java.util.Scanner;

public class PositiveNumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number;

        System.out.print("Ingresa un numero: ");
        number=in.nextInt();

        if (number>0) {
            System.out.println("El numero es positivo");
        }else if (number<0) {
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es 0");
        }
    }
}