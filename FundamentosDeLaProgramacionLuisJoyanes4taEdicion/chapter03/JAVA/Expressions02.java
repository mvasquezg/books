/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 03.-Obtener los resultados de las expresiones:
                    –4 * 7 + 2 ^ 3 / 4 – 5
*/  

public class Expressions02{
    
    public static void main(String[] args){
        System.out.print("–4 * 7 + 2 ^ 3 / 4 – 5 = "+(-4*7+Math.pow(2, 3)/4-5)+"\n\n");
    }

}