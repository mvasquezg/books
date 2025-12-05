/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 06: Intereses producidos 
*/
package interest;

import interest.view.frame.InterestFrame;

import javax.swing.JFrame;

public class InterestApp{

    public static void main(String[] args){
        InterestFrame intFrame=new InterestFrame();
        intFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}