/** 
 *Libro: Introducción al lenguaje de programación Java. Una guía básica.
 *Capitulo 4: Estructuras de control en Java
 *Programa 2: bucle for y uso de la setencia continue
 */
public class Continue{
    public static void main(String[] args){
        for(int i=0; i<=10; i++){
            for(int j=0; j<=10; j++){
                if(j<i){
                    continue;
                }
                System.out.print(j+", ");                
            }
            System.out.println();
        }
    }
}