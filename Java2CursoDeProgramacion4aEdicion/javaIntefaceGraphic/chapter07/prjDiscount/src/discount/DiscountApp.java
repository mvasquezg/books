/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 02: Efectuar compra en algun almacen 
*/

package discount;

import discount.view.frame.DiscountFrame;

import javax.swing.JFrame;

public class DiscountApp{
    public static void main(String[] args){
        DiscountFrame disFrame=new DiscountFrame();

        disFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}