public class LoopWhitMatriz {
    public static void main(String[] args){
        //Definir Matriz
        final var ROWS=2;
        final var COLUMNS=3;

        var arrayMatriz=new int[ROWS][COLUMNS];

        //Recorrer la matriz
         //modifcar valore en matriz
        arrayMatriz[0][0]=100;
        arrayMatriz[0][1]=200;
        arrayMatriz[0][2]=300;

        arrayMatriz[1][0]=400;
        arrayMatriz[1][1]=500;
        arrayMatriz[1][2]=600;


        //Ciclor externo
        for(int r=0; r<ROWS; r++){
            //Ciclo interno
            for(int c=0; c<COLUMNS; c++){
                System.out.println("Valor ["+r+"]["+c+"] = "+arrayMatriz[r][c]);
            }
            System.out.println();
        }


    }
}
