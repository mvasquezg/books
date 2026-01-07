/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 18: Calcular los multiplo de 5 entre dos valores A, B, no permitoira negativos. 
*/
package tarot.view.frame;

import tarot.view.panel.TarotPanel;

import javax.swing.JFrame;


public class TarotFrame extends JFrame{
    private TarotPanel trPanel=new TarotPanel();

    public TarotFrame(){
        setTitle("NUmero del Tarot");
        setBounds(350, 350, 350, 450);
        setVisible(true);

        add(trPanel);

    }
}
