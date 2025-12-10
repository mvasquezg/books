/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 01: menor de tres numeros 
*/
package menornumber;

import menornumber.view.frame.MenorNumberFrame;

import javax.swing.JFrame;

public class MenorNumberApp{
    public static void main(String[] args){
        MenorNumberFrame numberFrame=new MenorNumberFrame();

        numberFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}