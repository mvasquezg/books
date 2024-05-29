/** 
 *Libro: Introducción al lenguaje de programación Java. Una guía básica.
 *Capitulo 5: Clases en Java
 *Programa 1: Bloque de codigo static 
 */

public class BlockStatic{

    static double senoTable[] = new double [360];

    static{
        for(int i=0; i<360; i++){
            senoTable[i] = Math.sin(Math.PI*i/180);
        }
    }

    public static void main(String[] args){
        for(int i=0; i<360; i++){
            System.out.println("Angulo: " +i+" Seno = "+senoTable[i] );
        }
    }
}