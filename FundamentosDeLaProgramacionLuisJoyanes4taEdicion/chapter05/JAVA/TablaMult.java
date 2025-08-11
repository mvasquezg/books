/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 12.-El segmento de programa siguiente visualiza una tabla de multiplicación por cálculo y visualización de productos
                 de la forma x * y para cada x en el rango de 1 a Xultimo y desde cada y en el rango 1 a Yultimo (donde Xultimo, e Yultimo son enteros prefijados). La tabla que se desea obtener es
    Pagina 183
*/

public class TablaMult{    
    public static void main(String[] args){
        int x=3, y=10, producto=0;

        for(int i=1; i<=x; i++){
            for(int j=1; j<=y; j++){
               producto=i*j;

                System.out.print(String.format("%3d%3c%3d%3c%3d\n",i, 'x', j, '=', producto));  
            }
            System.out.print("\n");
        }
    }
}