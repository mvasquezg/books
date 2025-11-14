/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 03: Introducción a la Programacion Orientada a Objetos
*Programa 03: Clase Numero racional
*/
package rationalnumber.model;

public class RationalNumberModel{
    private int numerator;
    private int denominator;

    public void setNumerator(int numerator){
        this.numerator=numerator;
    }

    public void setDenominator(int denominator){
        
        if(denominator==0){
            this.denominator=1;
        }else{
            this.denominator=denominator;
        }
    }

    public int getNumerator(){
        return this.numerator;
    }   

    public int getDenominator(){
        return this.denominator;
    }

}