/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 03: Introducción a la Programacion Orientada a Objetos
*Programa 02: Clase Computadora
*/
package computer.view.frame;

import computer.view.panel.ComputerPanel;
import javax.swing.JFrame;

public class ComputerFrame extends JFrame{
    ComputerPanel compPanel=new ComputerPanel();

    public ComputerFrame(){
        setTitle("Simulador Encendido Computadora");
        setBounds(350, 350, 450, 350);
        setVisible(true);

        add(compPanel);


    }

}

