import java.util.Scanner;

public class SumDiagonalMatriz{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        final int ROW=3;
        final int COLUMN=3;

        int[][] matriz=new int[ROW][COLUMN];
        int sum=0;

        System.out.println("*** Programa que imprime la suma de la diagonal de una matriz de "+ROW+" x "+COLUMN);

        //Leyendo valores
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("Ingresa el valor para la posicion ["+i+"]["+j+"]: ");
                matriz[i][j]=in.nextInt();
                
                if(i==j){
                    sum+=matriz[i][j];
                }
            }
        }

        System.out.println();
        //Impriemndo la matriz
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        //Impriuendo la suma:
        System.out.println("\nLa suma de la diagonal es igual a: "+sum);
    }
}