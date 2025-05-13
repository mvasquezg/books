/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 04.-Flujo de control I: Estructuras Selectivas
    Problema 20.-Si la temperatura es superior a 100 grados, visualizar el mensaje “por encima del punto de ebullición del agua”
     sino visualizar el mensaje “por debajo del punto de ebullición del agua”

    Ejercicios
    4.1 (b) Pagina 155
*/
import java.util.Scanner; 
public class Temperature{    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float temperature=0f;

        System.out.print("Programa que muestra en pantalla el siguiente mensaje\n--por encima del punto de ebullición del agua--");
        System.out.print(" si la temperatura es mayor a 100 grados, en caso contrario imprime --por debajo del punto de ebullición del agua--.");
        System.out.print("\n\nIngrese La temperatura: ");
        temperature=in.nextFloat();

        System.out.print("\n");
        if(temperature>100){
            System.out.print("La temperatura esta por encima del punto de ebullición del agua");
        }else{
            System.out.print("La temperatura esta por debajo del punto de ebullición del agua");
        }
        System.out.print("\n");
    }
}