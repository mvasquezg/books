/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 01.-Mostra funcionamiento operadores de incremento.
*/  

public class CheckIncrease{
    public static void main(String[] args){
        int n=5;
    
        System.out.print("Valor inicial de n: "+n);
        System.out.print("\nEscribir el valor de la n cuando se ejecuta: n++: "+(n++));
        System.out.print("\nImprimir el valor de n cuando ya se ejecuto n++: "+(n));

        n=5;
        System.out.print("\n\nAsignando valor inicial de n, nuevamente: "+(n));
        System.out.print("\nEscribir el valor de la n cuando se ejecuta: ++n: "+(++n));
        System.out.print("\nImprimir el valor de n cuando ya se ejecuto ++n: "+n+"\n\n");
    }
}
