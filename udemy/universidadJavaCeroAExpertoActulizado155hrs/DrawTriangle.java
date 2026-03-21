import java.util.Scanner;

public class DrawTriangle{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.println("*** Dibuja un triangulo ***");
        
        System.out.print("Ingresa el numero de filas: ");
        var row=in.nextInt();

        for(int i=1; i<=row; i++){

            var spaciosBlando=" ".repeat(row-i);

            var asterico="*".repeat(2*i -1);


            System.out.println(spaciosBlando + asterico);
        }
    }
}