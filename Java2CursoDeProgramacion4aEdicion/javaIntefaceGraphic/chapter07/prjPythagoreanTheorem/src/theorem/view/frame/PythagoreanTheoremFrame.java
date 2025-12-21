/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 07: Bucle anidado While, teorema de pitagoras. 
*/
package theorem.view.frame;

import theorem.view.panel.PythagoreanTheoremPanel;

import javax.swing.JFrame;

public class PythagoreanTheoremFrame extends JFrame{
    PythagoreanTheoremPanel thPanel=new PythagoreanTheoremPanel();

    public PythagoreanTheoremFrame(){
        setTitle("Teorema de Pitagoras");
        setBounds(350, 250, 350, 550);
        setVisible(true);

        add(thPanel);
    }

}