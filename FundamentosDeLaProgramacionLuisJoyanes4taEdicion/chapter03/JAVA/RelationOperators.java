/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 07.-Programa que aplica operadores relacionales.

    < Menor que.
    > mayor que.
    == Igual que.
    <= menor o igual que
    >= mayor o igual que 
    != distinto que
*/

public class RelationOperators{
    public static void main(String[] args){
        int a=4, b=3;
        System.out.print("Programa que muestra los operadores relacionales con los numeros A="+a+", B="+b+"\n\n");
        if(a<b){
            System.out.print(a+" < "+b+" = Verdadero\n");
        }else{
            System.out.print(a+" < "+b+" = Falso\n");
        }

        if(a>b){
            System.out.print(a+" > "+b+" = Verdadero\n");
        }else{
            System.out.print(a+" > "+b+" = Falso\n");
        }
    
        if(a==b){
            System.out.print(a+" == "+b+" = Verdadero\n");
        }else{
            System.out.print(a+" == "+b+" = Falso\n");
        }
    
        if(a<=b){
            System.out.print(a+" <= "+b+" = Verdadero\n");
        }else{
            System.out.print(a+" <= "+b+" = Falso\n");
        }
    
        if(a>=b){
            System.out.print(a+" >= "+b+" = Verdadero\n");
        }else{
            System.out.print(a+" >= "+b+" = Falso\n");
        }
    
        if(a!=b){
            System.out.print(a+" != "+b+" = Verdadero\n");
        }else{
            System.out.print(a+" != "+b+" = Falso\n");
        }

        System.out.print("\n\n");
    }
}