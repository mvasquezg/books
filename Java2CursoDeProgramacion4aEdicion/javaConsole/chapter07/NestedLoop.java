/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 06: Bucle anidado While. 
*/
public class NestedLoop{

    public static void main(String[] args){
        int i=1, j=1;
        
        while(i<=3){
            System.out.print("Para i = "+i+": ");
            while(j<=4){
                System.out.print("j = "+j+", ");
                j++;
            }//end j while
            System.out.println();
            i++;
            j=1;
        }//end i while

    }

}