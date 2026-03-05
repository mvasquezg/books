import java.util.Scanner;

public class AplicacionSalud{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        final var META_PASOS_DIARIOS=10000;
        final var CALORIAS_POR_PASOS=0.04;

        System.out.println("*** Aplicacion Salud y Fitness ***");

        System.out.print("Ingresa el nombre del usuario: ");
        var name=in.nextLine();

        System.out.print("Ingresa los pasos caminados: ");
        var pasos=in.nextInt();

        var caloriasQuemadas=pasos*CALORIAS_POR_PASOS;

        var metaAlcanzada=pasos>=META_PASOS_DIARIOS;

        System.out.println("\n\nHola "+name+" has caminado "+pasos+" pasos "+"\nCalorias quemadas: "+caloriasQuemadas+" calorias "+"\n¿Has alcanzado la meta?: "+metaAlcanzada);

    }
}