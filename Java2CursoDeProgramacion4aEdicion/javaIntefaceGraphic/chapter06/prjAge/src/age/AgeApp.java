/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 09: Programa que calcula la edad de una persona en el año 2030 dado el nombre y la fecha de nacimiento
*/

package age;

import age.view.frame.AgeFrame;

import javax.swing.JFrame;

public class AgeApp{
    public static void main(String[] arg){
        AgeFrame ageFrame=new AgeFrame();

        ageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}