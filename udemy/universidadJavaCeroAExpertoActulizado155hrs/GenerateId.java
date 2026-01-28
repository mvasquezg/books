import java.util.Scanner;
import java.util.Random;

public class GenerateId{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        var random=new Random();

        var numRandom=random.nextInt(9998)+1;

        System.out.print("Ingresa tu nombre: ");
        var name=in.nextLine();
        System.out.print("Ingresa tu apellido: ");
        var lastName=in.nextLine();
        System.out.print("Ingresa tu año de nacimiento: ");
        var year=in.nextLine();

        var id=name.substring(0, 2)+lastName.substring(0, 2)+year.substring(2);

        var message="""
            Hola %s,%n
            \tTu número de identificación (ID) generado por el sistemas es:
            \t%s%4d%n
            \tFelicidades!
        
        """.formatted(name, id.toUpperCase(), numRandom);
        //System.out.printf("ID: %s%4d\n",id.toUpperCase(),numRandom);
        System.out.println(message);
    }
}