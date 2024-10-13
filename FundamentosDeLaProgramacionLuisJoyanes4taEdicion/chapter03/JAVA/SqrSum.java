/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 03.-Estructura general de un programa.
    Problema 20.-Calcular la suma de los cuadrados de los cien primeros numeros naturales.
*/

public class SqrSum{

    public static void main(String[] arg){
        int sum=0;
        for(int i=1; i<=100; i++){
          System.out.print(i+" * "+i+" = "+Math.pow(i, 2)+"\n");
            sum+=Math.pow(i, 2);
        }
        System.out.print("Suma Total: "+sum+"\n");
    }
}