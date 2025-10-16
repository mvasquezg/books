/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 02: Expresiones aritmeticas.    
*/
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ArithmeticExpressionPanel extends JPanel{

    private double a=10;
    private float b=20;
    private int c=2, r=0;

    JLabel jLblResult;

    public ArithmeticExpressionPanel(){
        r=(int) (7.5 *Math.sqrt(a) -b /c);
        jLblResult=new JLabel("Resultado "+r);
        add(jLblResult);
    }
} 