/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 03: Leer fecha entera mes y año y mostrar los dias del mes. 
*/
package monthyear;

import monthyear.view.frame.MonthYearFrame;

import javax.swing.JFrame;

public class MonthYear{
    public static void main(String[] args){
        MonthYearFrame myFrame=new MonthYearFrame();

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
