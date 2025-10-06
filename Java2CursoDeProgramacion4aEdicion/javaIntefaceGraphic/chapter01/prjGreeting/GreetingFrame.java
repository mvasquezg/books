/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 01: Fases en el desarrollo de un programa
*Programa 01: Mostrar un mensaje de saludo en pantalla.    
*/

import javax.swing.JFrame;

public class GreetingFrame extends JFrame{
    private GreetingPanel panelGreeting=new GreetingPanel();

    public GreetingFrame(){
        setTitle("Ventana con saludo");
        setVisible(true);
        setBounds(300, 250, 300, 250);
        add(panelGreeting);
    }
}