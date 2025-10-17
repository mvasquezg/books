/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 03: Numero Par
*/
public class EvenNumber{

    public static void main(String[] args){
       int num=23;

       if(num%2==0){
            System.out.println("Numero Par");
        }else{
            System.out.println("Numero impar");
        }

       System.out.println("Valor: "+num);     
    }

}