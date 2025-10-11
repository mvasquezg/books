/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 01: Fases en el desarrollo de un programa
*Programa 03: Operaciones Aritmeticas con tres digitos.    
*/
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class ArithmeticPanel extends JPanel{
    private int data1=20;
    private int data2=10;
    private int data3=5;

    private JLabel jLblSum=new JLabel("Suma: "+(data1+data2+data3));
    private JLabel jLblRest=new JLabel("Resta: "+(data1-data2-data3));
    private JLabel jLblMult=new JLabel("Multiplicacion: "+(data1*data2*data3));
    private JLabel jLblDiv=new JLabel("Division: "+(data1/data2/data3));

    public ArithmeticPanel(){
        setLayout(new GridLayout(4, 1));
        add(jLblSum);
        add(jLblRest);
        add(jLblMult);
        add(jLblDiv);

    }

}