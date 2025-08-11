/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 12.-El segmento de programa siguiente visualiza una tabla de multiplicación por cálculo y visualización de productos
                 de la forma x * y para cada x en el rango de 1 a Xultimo y desde cada y en el rango 1 a Yultimo (donde Xultimo, e Yultimo son enteros prefijados). La tabla que se desea obtener es
    Pagina 183
*/
using System;
class BucleAnidado{
    public static void Main(string[] args){
        System.Console.Write(String.Format("{0, 15}","i")+string.Format("{0, 5}","j")+"\n"); 
        
        for(int i=0; i<=4; i++){
          System.Console.Write("Externo"+string.Format("{0, 8}", i)+"\n"); 
            for(int j=0; j<i; j++){
              System.Console.Write(string.Format("{0, 8}","Interno")+string.Format("{0, 12}", j)+"\n");  
            }

        }
        System.Console.Write("\n\n");
    }
}