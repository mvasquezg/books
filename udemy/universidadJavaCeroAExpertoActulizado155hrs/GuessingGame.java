import java.util.Random;
import java.util.Scanner;

public class GuessingGame{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        Random random=new Random();

        //generar el numero aleatoria entre 1-50
        var correctNumber=random.nextInt(50)+1;
         
        var number=0;
        var intentos=0;

        System.out.println("*** Juego para adivinar el numero oculto tienes 5 intentos ***");

        do{
            System.out.print("Ingresa un numero: ");
            number=in.nextInt();

            if(number==correctNumber){
                System.out.println("Has adivinado el numero: "+number+".\n");
            }else if(number<correctNumber){
                System.out.println("El numero ingresado es menor que el numero oculto.\n");
            }else{
                System.out.println("El numero ingresado es mayor que el numero oculto.\n");
            }

            intentos++;
        }while(number!=correctNumber && intentos<5);

        if(intentos==5){
            System.out.println("Haz alcanzado el maximo de intentos. El numero oculto es: "+correctNumber);
        }else{
            System.out.print("Felicidades lo has logrado en "+intentos+" intentos.\n");
        }
    }

}