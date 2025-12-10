/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 02: Efectuar compra en algun almacen 
*/
import java.util.Scanner;

public class Discount{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int codeItem=0, numberOfPieces=0;
        float unitPrice=0F;
        float discount=0F;

        System.out.print("Codigo del articulo: ");
        codeItem=in.nextInt();

        System.out.print("Numero de piezas: ");
        numberOfPieces=in.nextInt();

        System.out.print("Precio Unitario: ");
        unitPrice=in.nextFloat();

        if(numberOfPieces>100){
            discount=40F;
        }else if(numberOfPieces>=25){
            discount=20F;
        }else if(numberOfPieces>=10){
            discount=10F;
        }else{
            discount=0F;
        }

        System.out.println("Decuento . . . . . . . . . . "+discount+"%");
        System.out.println("Total . . . . . . . . . . "+(numberOfPieces*unitPrice*(1 - discount/100))+"%");


    }
}