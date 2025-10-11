/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 01: Fases en el desarrollo de un programa
*Programa 02: Operaciones Aritmeticas.    
*/
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ArithmeticPanel extends JPanel{
    int data1=20;
    int data2=10;

    JLabel jLbSum=new JLabel("Suma: "+(data1+data2));
    JLabel jLbRest=new JLabel("Resta: "+(data1-data2));
    JLabel jLbMult=new JLabel("Multiplicacion: "+(data1*data2));
    JLabel jLbDiv=new JLabel("Division: "+(data1/data2));
    
    public ArithmeticPanel(){
        setLayout(new GridLayout(4,1));
       
        add(jLbSum);
        add(jLbRest);
        add(jLbMult);
        add(jLbDiv);
    }
}