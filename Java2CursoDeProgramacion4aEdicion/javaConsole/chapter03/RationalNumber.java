/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 03: Introducción a la Programacion Orientada a Objetos
*Programa 03: Clase Numero racional
*/
public class RationalNumber{
    private int numerator;
    private int denominator;

    public void setData(int numerator, int denominator){
        this.numerator=numerator;

        if(denominator==0){
            this.denominator=1;
        }else{
            this.denominator=denominator;
        }
    }

    public void showData(){
        System.out.println(this.numerator+" / "+this.denominator);    
    }
}