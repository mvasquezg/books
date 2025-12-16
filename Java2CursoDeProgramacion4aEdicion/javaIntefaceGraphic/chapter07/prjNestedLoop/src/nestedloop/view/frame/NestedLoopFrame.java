/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 06: Bucle anidado While. 
*/
package nestedloop.view.frame;

import nestedloop.view.panel.NestedLoopPanel;

import javax.swing.JFrame;

public class NestedLoopFrame extends JFrame{
    private NestedLoopPanel nlPanel=new NestedLoopPanel();
    
    public NestedLoopFrame(){
        setTitle("Bucle Anidado While");
        setBounds(350, 450, 450, 350);
        setVisible(true);

        add(nlPanel);
    }

}