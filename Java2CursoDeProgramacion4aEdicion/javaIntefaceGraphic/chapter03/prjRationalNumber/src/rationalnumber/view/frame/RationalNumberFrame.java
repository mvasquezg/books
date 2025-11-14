/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 03: Introducción a la Programacion Orientada a Objetos
*Programa 03: Clase Numero racional
*/
package rationalnumber.view.frame;

import rationalnumber.view.panel.RationalNumberPanel;

import javax.swing.JFrame;

public class RationalNumberFrame extends JFrame{

    RationalNumberPanel ratNumberPanel=new RationalNumberPanel();

    public RationalNumberFrame(){
        setTitle("Numero Racional");
        setBounds(350, 350, 450, 350);
        setVisible(true);

        add(ratNumberPanel);
    }

}