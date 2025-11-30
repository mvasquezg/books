/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 03: Imprimir datos de cada tipo
*/

public class DataType{

    public static void main(String[] args){
        String sString="Lenguaje Java";
        char[] cArrayChar={'a', 'b', 'c'};
        int dataInt=4;
        long dataLong=Long.MIN_VALUE;
        float dataFloat=Float.MAX_VALUE;
        double dataDouble=Math.PI;
        boolean dataBoolean=true;

        System.out.println(sString);
        System.out.println(cArrayChar);
        System.out.println(dataInt);
        System.out.println(dataLong);
        System.out.println(dataDouble);
        System.out.println(dataFloat);
        System.out.println(dataBoolean);
       
    }

}