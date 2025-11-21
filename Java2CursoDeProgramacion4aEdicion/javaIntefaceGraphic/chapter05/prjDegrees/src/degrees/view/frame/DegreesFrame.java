/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 05: Estrructura de un programa
*Programa 01: Grados Centigrados
*/
package degrees.view.frame;

import degrees.view.panel.DegreesPanel;

import javax.swing.JFrame;


public class DegreesFrame extends JFrame{
    private DegreesPanel dPanel=new DegreesPanel();

    public DegreesFrame(){
        setTitle("Conversion de grados centigrados a grados fahrenheit");
        setBounds(350, 350, 350, 550);
        setVisible(true);

        add(dPanel);
    }

}