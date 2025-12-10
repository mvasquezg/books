/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 02: Efectuar compra en algun almacen 
*/


package discount.view.frame;

import discount.view.panel.DiscountPanel;

import javax.swing.JFrame;

public class DiscountFrame extends JFrame{
    private DiscountPanel dsPanel=new DiscountPanel();

    public DiscountFrame(){
        setTitle("Descuento en compra");
        setBounds(350, 350, 450, 350);
        setVisible(true);

        add(dsPanel);
    }
}