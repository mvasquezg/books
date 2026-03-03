import java.util.Scanner;

public class RangoVariable{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.print("Ingresa un valor entero: ");
        var num=in.nextInt();

        //Revisa si esta dentro de rango (1 y 10)
        var estaDentroRango=num>=1 && num<=10;
        System.out.println("variable dentro de rango (1 y 10): "+estaDentroRango);

        //Revisa la logica inversa, si el dato esta fuera de rango (1 y 10)
        var estaFueraRango=!(num>=1 && num<=10);
        System.out.println("variable fuera de rango (1 y 10): "+estaFueraRango);

    }
}