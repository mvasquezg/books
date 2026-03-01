import java.util.Scanner;
public class ValorDentroRango{
    public static void main(String[] args){
        System.out.println("***  Valor dentro Rango ***");

        //Dedfinimos limites
        final var MIN=0;
        final var MAX=5;

        //Solicitar valor entre cero y cinco
        System.out.print("Proporciona un dato entre 0 y 5: ");
        var dato= Integer.parseInt(new Scanner(System.in).nextLine());

        //verificar si el dato esta denttro del rango
        var estaEnRango= dato>=MIN && dato<=MAX;

        System.out.println("¿Esta dentro de Rango?: "+estaEnRango);

    }
}
