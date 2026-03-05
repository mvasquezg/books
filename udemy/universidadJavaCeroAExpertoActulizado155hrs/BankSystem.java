import java.util.Scanner;

public class BankSystem{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        var continueEnter=false;

        System.out.print("*** Systema Bancario ***\n\nDesea continuar dentro del sistema (true/false): ");        
        continueEnter=in.nextBoolean();

        if(!continueEnter){
            System.out.println("Continuamos dentro del Sistema");
        }else{
            System.out.println("Saliendo del Sistema");
        }
    }
}