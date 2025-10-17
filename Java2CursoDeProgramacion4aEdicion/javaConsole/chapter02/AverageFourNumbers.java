/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 06: Imprime Mensaje en pantalla
*/
public class AverageFourNumbers{
    
    public static void main(String[] args){
       int num1=10, num2=20, num3=30, num4=40, sum=0, average=0;
       
       sum=num1+num2+num3+num4;
       average=sum/4;

       System.out.println("Suma: "+sum);
       System.out.println("Promedio: "+average);

    }

}