/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 11: Uso de la sentencia Continue. 
*/

public class ContinueSentence{
    public static void main(String[] args){
        for(int i=1; i<100; i++){
            
            if(i%5!=0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
    }
}