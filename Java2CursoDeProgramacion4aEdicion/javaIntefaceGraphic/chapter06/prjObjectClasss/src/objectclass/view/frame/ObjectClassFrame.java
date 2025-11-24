/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 01: Determinar la clase que pertence a un objeto
*/
package objectclass.view.frame;

import objectclass.view.panel.ObjectClassPanel;

import javax.swing.JFrame;

public class ObjectClassFrame extends JFrame{
    private ObjectClassPanel objPanel=new ObjectClassPanel();

    public ObjectClassFrame(){
        setTitle("Nombre de las clases");
        setBounds(350, 350, 450, 350);
        setVisible(true);

        add(objPanel);
    }

}