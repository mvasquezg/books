/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 01: Determinar la clase que pertence a un objeto
*/
package objectclass;

import objectclass.view.frame.ObjectClassFrame;
import javax.swing.JFrame;

public class ObjectClassApp{
    public static void main(String[] args){
        ObjectClassFrame objFrame=new ObjectClassFrame();

        objFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}