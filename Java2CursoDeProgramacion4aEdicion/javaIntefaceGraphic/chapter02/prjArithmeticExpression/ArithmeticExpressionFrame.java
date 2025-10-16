/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 02: Expresiones aritmeticas.    
*/
import javax.swing.JFrame;

public class ArithmeticExpressionFrame extends JFrame{

    ArithmeticExpressionPanel arPanel=new ArithmeticExpressionPanel();

    public ArithmeticExpressionFrame(){
        setTitle("Expresiones Aritmeticas");
        setBounds(300, 300, 300, 300);
        setVisible(true);

        add(arPanel);
    }
}