/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 04: Método Propio
*/
public class OwnMethod{

    static double sum(double x, double y){
        double result=0;
        result=x+y;
        return result;
    }
    
    public static void main(String[] args){
       double num1=10, num2=20, r=0;

       r=sum(num1, num2);

       System.out.println("Suma: "+r);     
    }

}