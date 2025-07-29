/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 04.-Cuenta hasta 10
    Pagina 167
*/
public class CountToTen{    
    public static void main(String[] args){
        int num=1;

        System.out.print("Programa que cuenta del 1-10 usando ciclo do-while: \n");
        do{
            System.out.print(num+", ");
            num++;
        }while(num<=10);
        System.out.print("\n");
    }
}