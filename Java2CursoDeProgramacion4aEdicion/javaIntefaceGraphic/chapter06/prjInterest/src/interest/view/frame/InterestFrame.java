/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 06: Intereses producidos 
*/


package interest.view.frame;

import interest.view.panel.InterestPanel;

import javax.swing.JFrame;

public class InterestFrame extends JFrame{

    InterestPanel interPanel=new InterestPanel();

    public InterestFrame(){
        setTitle("Calculo de interes de inversion");
        setBounds(300, 300, 300, 250);
        setVisible(true);

        add(interPanel);
    }
}