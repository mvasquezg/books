package prjExepcionesArtimethic.src.com.aritmethic;

public class Aritmethic {
    public static int dividir(int num1, int num2){
        if (num2 == 0) {
            throw new RuntimeException("No se puede dividir por cero.");
        }
        return num1 / num2;
    }
}
