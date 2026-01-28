import java.util.Scanner;

public class ReadDataType{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        //Leer distintos tipos de datos
        //Leer dato tipo int
        System.out.print("Ingresa tu edad: ");
        var age=in.nextInt();
        
        System.out.println("Edad: "+age);

        //Leer tipo double
        System.out.print("\nIngresa la altura: ");
        var height=in.nextDouble();

        System.out.println("Altura: "+age);

        //Hay que leer el caracrer
        in.nextLine();
        
        //Leer String
        System.out.print("\nIngresa tu nombre: ");
        var name=in.nextLine();

        System.out.println("Nombre: "+name);
        
        //Conversion de datos
        //Valor entero
        System.out.print("\nProporciona un valor entero: ");
        var intString=in.nextLine();

        var intNumber=Integer.parseInt(intString);

        System.out.println("Valor entero: "+intNumber);

        //Valor flotante
        System.out.print("\nProporciona un valor flotante: ");
        var floatNumber=Float.parseFloat(in.nextLine());

        System.out.println("Valor flotante: "+floatNumber);

    
    }
}