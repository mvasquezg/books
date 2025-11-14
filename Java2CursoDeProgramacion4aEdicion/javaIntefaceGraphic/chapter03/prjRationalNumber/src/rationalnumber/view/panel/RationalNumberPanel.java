/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 03: Introducción a la Programacion Orientada a Objetos
*Programa 03: Clase Numero racional
*/
package rationalnumber.view.panel;

import rationalnumber.model.RationalNumberModel;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class RationalNumberPanel extends JPanel{
    private JLabel jLbLData;    
    
    private RationalNumberModel number=new RationalNumberModel();

    public RationalNumberPanel(){
        number.setNumerator(4);
        number.setDenominator(3);

        jLbLData=new JLabel("<html>"+number.getNumerator()+"/"+number.getDenominator()+ "<html>");

        add(jLbLData);
    }

}