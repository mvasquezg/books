/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 06: Imprime Mensaje en pantalla
*/
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AverageFourNumbersPanel extends JPanel{
    private JLabel jLblResult;
    private int num1=10, num2=20, num3=30, num4=40, sum=0, average=0;


    public AverageFourNumbersPanel(){
        sum=num1+num2+num3+num4;
        average=sum/4;

        jLblResult=new JLabel("Promedio de 4 numeros: "+average);

        add(jLblResult);
    }

}