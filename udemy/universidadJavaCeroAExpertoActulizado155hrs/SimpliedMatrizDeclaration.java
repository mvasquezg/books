public class SimpliedMatrizDeclaration {
    public static void main(String[] args) {

        var arrayMatriz=new int[][]{
            {100, 200, 300},
            {400, 500, 600}
        };

        //Ciclor externo
        for(int r=0; r<arrayMatriz.length; r++){
            //Ciclo interno
            for(int c=0; c<arrayMatriz[r].length; c++){
                System.out.println("Valor ["+r+"]["+c+"] = "+arrayMatriz[r][c]);
            }
            System.out.println();
        }

    }
}
