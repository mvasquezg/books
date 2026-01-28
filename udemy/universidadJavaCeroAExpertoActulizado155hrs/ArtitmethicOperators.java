public class ArtitmethicOperators{

    public static void main(String[] args){
        System.out.println("*** Operadores Atitmeticos ***");
        int a=5, b=3, result=0;

        //Suma +
        result=a+b;

        System.out.println("\nSuma (+): "+a+" + "+b+" = "+result);

        //Resta -
        result=a-b;

        System.out.println("\nResta (-): "+a+" - "+b+" = "+result);       

        //Multiplicacion *
        result=a*b;

        System.out.println("\nMultiplicacion (*): "+a+" * "+b+" = "+result);

        //Divison entera /
        result=a/b;

        System.out.println("\nDivision entera (/): "+a+" / "+b+" = "+result);

        //Divison fraccion /
        double a2=5, b2=3;
        double result2=a/b;

        System.out.println("\nDivision con fracccion (/): "+a2+" / "+b2+" = "+result2);
        
        //Residuo % 
        result=a%b;

        System.out.println("\nResiduo (%): "+a+" % "+b+" = "+result);
    }
}