/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 07: Formula Cuadratica usando metodo
*/
import javax.swing.JFrame;

public class QuadraticFormulaFrame extends JFrame{
    QuadraticFormulaPanel qPanel=new QuadraticFormulaPanel();

    public QuadraticFormulaFrame(){
        setTitle("Formula Cuadratica");
        setBounds(250, 250, 250, 250);
        setVisible(true);

        add(qPanel);
    }
}