/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 05: Imprime Mensaje en pantalla
*/
import javax.swing.JFrame;
public class PrintMessageFrame extends JFrame{
    private PrintMessagePanel printPanel=new PrintMessagePanel();

    public PrintMessageFrame(){
        setTitle("Mensaje en pantalla");
        setBounds(250, 250, 250, 250);
        setVisible(true);

        add(printPanel);
    }
}