import java.util.Scanner;

public class AreaRectangulo{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int area=0, base=0, altura=0, perimetro=0;

        System.out.println("*** Programa que calcula el area y el perimetro de un rectangulo ***");

        System.out.print("Ingrese la base: ");
        base=in.nextInt();

        System.out.print("Ingrese la altura: ");
        altura=in.nextInt();

        area=base*altura;
        perimetro=2*(base+altura);

        System.out.println("El area del rectangulo es: "+area+"\nEl perimetro del rectangulo es: "+perimetro);




    }
}
