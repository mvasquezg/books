/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 01: Fases en el desarrollo de un programa
*Programa 01: Mostrar un mensaje de saludo en pantalla.    
*/
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GreetingPanel extends JPanel{
    JLabel jLblMessage=new JLabel("Hola Mundo");

    public GreetingPanel(){
        add(jLblMessage);
    }

}