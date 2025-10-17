/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 05: Imprime Mensaje en pantalla
*/
import javax.swing.JLabel;
import javax.swing.JPanel;
public class PrintMessagePanel extends JPanel{
    private JLabel jLblMessage=new JLabel("Bienvenido al mundo\nde Java, \nPodras dar soluciones a muchos problemas.");

    public PrintMessagePanel(){
        add(jLblMessage);
    }

}