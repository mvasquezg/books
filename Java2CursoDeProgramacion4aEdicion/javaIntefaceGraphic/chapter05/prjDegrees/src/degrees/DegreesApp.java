/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 05: Estrructura de un programa
*Programa 01: Grados Centigrados
*/
package degrees;

import degrees.view.frame.DegreesFrame;

import javax.swing.JFrame;

public class DegreesApp{
    
    public static void main(String[] args){
        DegreesFrame dFrame=new DegreesFrame();

        dFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}