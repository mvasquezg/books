/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 06: Imprime Mensaje en pantalla
*/
import javax.swing.JFrame;

public class AverageFourNumbersFrame extends JFrame{

    AverageFourNumbersPanel avPanel=new AverageFourNumbersPanel();

    public AverageFourNumbersFrame(){
        setTitle("Promedio de 4 numeros");
        setBounds(250, 250, 250, 250);
        setVisible(true);

        add(avPanel);
    }

}