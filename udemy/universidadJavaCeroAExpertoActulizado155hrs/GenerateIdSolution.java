import java.util.Scanner;
import java.util.Random;

public class GenerateIdSolution{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        var random=new Random();

        //Solicitar el nombre de usuario
        System.out.print("Ingresa tu nombre: ");
        var name=in.nextLine();

        //Solicitar el apellido
        System.out.print("Ingresa tu apellido: ");
        var lastName=in.nextLine();

        //Solicitar fecha de nacieminto
        System.out.print("Ingresa tu año de nacimiento (yyyy): ");
        var year=in.nextLine();

        //Se normalizando los datos
        var name2=name.trim().toUpperCase().substring(0,2);
        var lastName2=lastName.trim().toUpperCase().substring(0,2);
        var year2=year.trim().substring(2);

        //Genera el valor aleatorio
         var numRandom=random.nextInt(9999)+1;    

        //dar formato de 4 digitos al numRandom
        var numRandom2=String.format("%04d", numRandom);

        //generar ael id unico
        var id=name2+lastName2+year2+numRandom2;    

        System.out.printf("""
            %nHola %s,
            \tTu número de identificación (ID) generado por el sistemas es:
            \t%s
            \tFelicidades!
        
        """,name, id);
        
    }
}