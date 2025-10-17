/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 07: Formula Cuadratica usando metodo
*/
public class QuadraticFormula{
    
    static double calculate(double a, double b, double c){
        return ((Math.pow(b, 2)) - (4*a*c))/(2*a);
    }


    public static void main(String[] args){
       double a=1, b=5, c=2;
       
        System.out.println("Resultado: "+calculate(a, b, c));

    }

}