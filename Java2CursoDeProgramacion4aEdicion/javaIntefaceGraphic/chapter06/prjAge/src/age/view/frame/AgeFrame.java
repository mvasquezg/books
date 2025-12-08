/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 09: Programa que calcula la edad de una persona en el año 2030 dado el nombre y la fecha de nacimiento
*/
    
package age.view.frame;

import age.view.panel.AgePanel;

import javax.swing.JFrame;

public class AgeFrame extends JFrame{
    private AgePanel agPanel=new AgePanel();

    public AgeFrame(){
        setTitle("Calcular la edad");
        setBounds(300, 250, 450, 350);
        setVisible(true);

        add(agPanel);
    }
}