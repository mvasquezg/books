import java.util.Scanner;

public class AverageCal{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        var sum=0;
        var prom=0;

        System.out.println("*** Promedio de Calificaciones ***");
        
        System.out.print("Cuantas calificaciones desea agregar?: ");
        var lengtArray=Integer.parseInt(in.nextLine());

        var arrayCal=new int[lengtArray];

        //Ingrsando las calificaciones
        System.out.println("\n*** Ingresando las calificaciones *** ");
        for(int i=0; i<lengtArray; i++){
            System.out.print("Ingrese la calificacion ["+i+"]: ");
            arrayCal[i]=in.nextInt();

            sum+=arrayCal[i];
        }

        //Imprimiendo las calificaciones
        System.out.println("\n*** Calificaciones ingresadas*** ");
        for(int i=0; i<lengtArray; i++){
            System.out.println("Calificacion ["+i+"]: "+arrayCal[i]);
        }

        //imprimiendo el promedio
        prom=sum/lengtArray;

        System.out.println("El promedio de las califiones es: "+prom);
    }
}