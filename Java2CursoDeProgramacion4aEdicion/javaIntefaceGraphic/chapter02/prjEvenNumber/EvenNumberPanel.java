/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 02: Introducción a Java
*Programa 03: Numero Par
*/
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EvenNumberPanel extends JPanel{

    private int num=24;
    private JLabel jLblResult;
    public EvenNumberPanel(){
        
        if(num%2==0){
            jLblResult=new JLabel("Numero par: "+num);
        }else{
            jLblResult=new JLabel("Numero impar: "+num);
        }

        add(jLblResult);
    }
}