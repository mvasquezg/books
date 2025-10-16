/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 01: Mostrar datos por pantalla.    
*/

import javax.swing.JFrame;
public class ShowDataFrame extends JFrame{

    ShowDataPanel showPanel=new ShowDataPanel();

    public ShowDataFrame(){
        setTitle("Muestra datos");
        setBounds(300, 400, 350, 250);
        setVisible(true);
        add(showPanel);
    }
}