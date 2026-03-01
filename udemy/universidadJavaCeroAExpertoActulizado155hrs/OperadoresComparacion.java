public class OperadoresComparacion{
    public static void main(String[] args){
        System.out.println("*** Operadores de Comparación *****");

        int a=3, b=2;

        //igualdad ==
        var result = a==b;

        System.out.println(a+" == "+ b+ ": "+result);

        //Diferente o distinto de  !=
        result=a!=b;
        System.out.println(a+" != "+ b+ ": "+result);

        //Mayor que >
        result=a>b;
        System.out.println(a+" > "+ b+ ": "+result);

        //Mayor o igual que >=
        result=a>=b;
        System.out.println(a+" >= "+ b+ ": "+result);

        //Menor que <
        result=a<b;
        System.out.println(a+" < "+ b+ ": "+result);

        //Menor o igual que <=
        result=a<=b;
        System.out.println(a+" <= "+ b+ ": "+result);

    }
}