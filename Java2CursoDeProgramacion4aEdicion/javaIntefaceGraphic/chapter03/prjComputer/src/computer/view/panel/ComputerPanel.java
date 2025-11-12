/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 03: Introducción a la Programacion Orientada a Objetos
*Programa 02: Clase Computadora
*/
package computer.view.panel;

import computer.model.ComputerModel;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComputerPanel extends JPanel{
    private JLabel jLblData;
    public ComputerPanel(){
        ComputerModel comp1=new ComputerModel();

        comp1.setTrademark("Thosiba");        
        jLblData=new JLabel("<HTML>"+comp1.getTrademark()+comp1.onComputer()+comp1.statusComputer()+comp1.offComputer()+"<HTML>");

        add(jLblData);
    }   
}