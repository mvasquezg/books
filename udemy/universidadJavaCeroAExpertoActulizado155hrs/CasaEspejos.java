import java.util.Scanner;

public class CasaEspejos{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in); 
        int age=0;
        boolean dark=false;

        System.out.println("*** Determina el programa si puedes ingresar a la casa de los Espejos ***");
        
        System.out.print("Ingresa tu edad: ");
        age=in.nextInt();

        System.out.print("¿Le tienes miedo a la obscuridad (true/false): ");
        dark=in.nextBoolean();

        if((age>10 && !dark)){
            System.out.println("Puedes ingresar a la casa de los espejos");
        }else{
            System.out.println("No puedes ingresar a la casa de los espejos");
        }

    }
}