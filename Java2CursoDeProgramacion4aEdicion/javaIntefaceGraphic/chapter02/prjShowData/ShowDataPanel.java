/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 01: Mostrar datos por pantalla.    
*/
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShowDataPanel extends JPanel{
    private double a=3.14, b=2.71;
    private int c=2;
    private String s="Datos";

    private JLabel jLbDataS=new JLabel(s);
    private JLabel jLbDataA=new JLabel("a = "+a);
    private JLabel jLbDataB=new JLabel("b = "+b);
    private JLabel jLbDataC=new JLabel("c = "+a);

    public ShowDataPanel(){
        setLayout(new GridLayout(4,1));
        add(jLbDataS);
        add(jLbDataA);
        add(jLbDataB);
        add(jLbDataC);
    }

}