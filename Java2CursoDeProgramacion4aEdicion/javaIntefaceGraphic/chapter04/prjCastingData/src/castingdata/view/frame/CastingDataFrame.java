/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 04: Introducción a la Programacion Orientada a Objetos
*Programa 01: Casteo de tipos de datos
*/
package castingdata.view.frame;

import castingdata.view.panel.CastingDataPanel;
import javax.swing.JFrame;

public class CastingDataFrame extends JFrame{

    private CastingDataPanel castingPanel=new CastingDataPanel();

    public CastingDataFrame(){
        setTitle("Conversion tipos de datos implicitos");
        setBounds(350, 350, 450, 350);
        setVisible(true);

        add(castingPanel);
    }

}