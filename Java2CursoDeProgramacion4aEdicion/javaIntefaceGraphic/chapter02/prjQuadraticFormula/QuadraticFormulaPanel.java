/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 07: Formula Cuadratica usando metodo
*/
import javax.swing.JLabel;
import javax.swing.JPanel;

public class QuadraticFormulaPanel extends JPanel{
    private JLabel jLblResult; 

    double calculate(double a, double b, double c){
        return ((Math.pow(b, 2)) - (4*a*c))/(2*a);
    }

    public QuadraticFormulaPanel(){
        double a=1, b=5, c=2;
       
        jLblResult=new JLabel("Resultado: "+calculate(a, b, c));
        add(jLblResult);
    }

}