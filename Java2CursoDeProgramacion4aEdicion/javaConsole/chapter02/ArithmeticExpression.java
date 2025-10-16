/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 02: Expresiones aritmeticas.    
*/
public class ArithmeticExpression{

    public static void main(String[] args){
        double a=10;
        float b=20;
        int c=2, r=0;

        r=(int) (7.5 *Math.sqrt(a) -b /c);

        System.out.println(r);
    }

}