/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 04: Método Propio
*/
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OwnMethodPanel extends JPanel{

    private JLabel jLblResult;

    public double sum(double x, double y){
        double result=0;
        result=x+y;
        return result;
    }


    public OwnMethodPanel(){
        double num1=10, num2=20, r=0;
        r=sum(num1, num2);

        jLblResult=new JLabel("Suma: "+r);

        add(jLblResult);
    }

}