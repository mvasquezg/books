/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 04: Introducción a la Programacion Orientada a Objetos
*Programa 02: Area de un triangulo*/

package areatriangle.view.panel;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class AreaTrianglePanel extends JPanel{

    private JLabel jLblData;

    public AreaTrianglePanel(){
        double base=11.5, altura=3.0, area=0.0;

        area=base*altura/2;
        jLblData=new JLabel(""+area);

        add(jLblData);
    }

}