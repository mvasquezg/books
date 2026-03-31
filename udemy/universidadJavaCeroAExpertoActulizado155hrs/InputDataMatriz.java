import java.util.Scanner;

public class InputDataMatriz {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        //Definir una matriz
        int row, columns;

        System.err.print("Ingresa las filas de la matriz: ");
        row=in.nextInt();

        System.err.print("Ingresa las columnas de la matriz: ");
        columns=in.nextInt();

        //Se declara la materiz
        int[][] arrayNew=new int[row][columns];
        System.out.println();
        //Solicitar los valores
        for(int i=0; i<arrayNew.length; i++){

            for(int j=0; j<arrayNew[i].length; j++){
                System.out.print("Ingresa el valor de la posicion ["+i+"]["+j+"]: ");
                arrayNew[i][j]=in.nextInt();

            }
            System.out.println();
        }

        //Mostrandor valore
        //Solicitar los valores
        System.out.println("Los valores de la la matriz son: ");
        for(int i=0; i<arrayNew.length; i++){

            for(int j=0; j<arrayNew[i].length; j++){
                System.out.println("["+i+"]["+j+"]: "+arrayNew[i][j]);
            }
            System.out.println();
        }


    }
}
