/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 04: Método Propio
*/

import javax.swing.JFrame;

public class OwnMethodFrame extends JFrame{
    private OwnMethodPanel oPanel=new OwnMethodPanel();

    public OwnMethodFrame(){
        setTitle("Metodo Propio");
        setBounds(300, 300, 300, 300);
        setVisible(true);

        add(oPanel);
    }
}