/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 10: Uso de la sentencia break. 
*/

public class BreakSentence{
    public static void main(String[] args){
        for(int i=1; i<100; i++){
            
            if(i%5!=0){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();
    }
}