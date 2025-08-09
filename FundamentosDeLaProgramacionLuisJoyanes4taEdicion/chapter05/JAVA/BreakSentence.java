/*Libro:Fundamentos de Programación, Algoritmos, estructura de datos y objetos 4ta edición. 
    Capitulo 05.-Flujo de control II: Estructuras repetitivas
    Problema 09.-Validar un numero de identificacion. 
    Pagina 176
*/

public class BreakSentence{    
    public static void main(String[] args){

           System.out.print("Cuenta del 1 - 25:\n\n");
            for(int i=1; i<=25; i++){
               System.out.print(i+" ");

                if(i==5){
                   System.out.print("\n\nNumero: "+i+" es hora de salir.\n");
                    break;
                }
            }
    }
}