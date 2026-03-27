import java.util.Scanner;

public class InputInArray{
    public static void main(String[] args) {
        //introducir valores en arreglo
        Scanner in=new Scanner(System.in);

        //Declarar el arreglo
        System.out.print("Proporciona el largo del arreglo: ");
        var lengthArray=Integer.parseInt(in.nextLine());

        //Creando de manera dinamica el arreglo
        var arrayInt=new int[lengthArray];

        //Llenado del arreglo
        System.out.println("\n*** LLenado del Arreglo ***");
        for(int i=0; i<lengthArray; i++){
            System.out.print("Ingresa el valor ["+i+"]: ");
            arrayInt[i]=in.nextInt();
        }

        System.out.println("\n*** Imprimiendo valores del Arreglo ***");
        for(int i=0; i<lengthArray; i++){
            System.out.println("valor ["+i+"]: "+arrayInt[i]);
        }

    }
}