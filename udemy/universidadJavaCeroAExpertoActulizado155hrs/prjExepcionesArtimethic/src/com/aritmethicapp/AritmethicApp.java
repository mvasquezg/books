package prjExepcionesArtimethic.src.com.aritmethicapp;

import prjExepcionesArtimethic.src.com.aritmethic.Aritmethic;

public class AritmethicApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            var resultado = Aritmethic.dividir(num1, num2);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("Este bloque se ejecuta siempre, haya o no una excepción. Se reviso la división entre cero ");
        }    
    }
}
