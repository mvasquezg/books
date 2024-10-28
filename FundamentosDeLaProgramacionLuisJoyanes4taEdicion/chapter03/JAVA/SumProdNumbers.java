    /*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 17.-Calcular y visualizar la suma y el producto de los numeros pares comprendidos entre 20 y 400, ambos incluidos.
*/
public class SumProdNumbers{
    public static void main(String[] args){
        int sum=0;
        long prod=1;

        System.out.print("Programa que calcula y visualiza la suma y el producto de los numeros pares comprendidos entre 20 y 70, ambos incluidos.");

        for(int i=20; i<=70; i+=2){
            sum+=i;
            prod*=i;    
        }   
        System.out.print("\n\nSuma: "+sum+"\n\nProducto: "+prod+"\n\n");
    }
}