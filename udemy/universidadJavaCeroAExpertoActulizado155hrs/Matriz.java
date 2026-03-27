public class Matriz{
    public static void main(String[] args) {
        //Definir matriz
        //int[][] matrizInt=new int[2][3];
        var matrizInt=new int[2][3];

        //modifcar valore en matriz
        matrizInt[0][0]=100;
        matrizInt[0][1]=200;
        matrizInt[0][2]=300;

        matrizInt[1][0]=400;
        matrizInt[1][1]=500;
        matrizInt[1][2]=600;

        //Aceder a algunos valores
        System.out.println("Valor 1 [0][0] ="+matrizInt[0][0]);
        System.out.println("Valor 5 [1][1] ="+matrizInt[1][1]);
        System.out.println("Valor 5 [1][2] ="+matrizInt[1][2]);
    }
}