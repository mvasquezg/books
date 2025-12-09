/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 11: Programa que calcula el siguiiente polinomio 
                ax^5 - bx^3 + cx - d
*/
package polynomial.view.panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JPanel;

public class PolynomialPanel extends JPanel implements ActionListener{
    private JButton jBtnExecute=new JButton("Ejecutar");
    private JLabel jLblX=new JLabel("Ingresa el valor de X: ");
    private JLabel jLblA=new JLabel("Ingresa el valor de A: ");
    private JLabel jLblB=new JLabel("Ingresa el valor de B: ");
    private JLabel jLblC=new JLabel("Ingresa el valor de C: ");
    private JLabel jLblD=new JLabel("Ingresa el valor de D: ");

    private JLabel jLblResult=new JLabel("");
    private JTextField jTxtX=new JTextField(20);
    private JTextField jTxtA=new JTextField(20);
    private JTextField jTxtB=new JTextField(20);
    private JTextField jTxtC=new JTextField(20);
    private JTextField jTxtD=new JTextField(20);


    public PolynomialPanel(){
        setLayout(new GridLayout(6, 1));
        add(jLblA);
        add(jTxtA);

        add(jLblB);
        add(jTxtB);

        add(jLblC);
        add(jTxtC);

        add(jLblD);
        add(jTxtD);

        add(jLblX);
        add(jTxtX);

        add(jBtnExecute);
        add(jLblResult);

        jBtnExecute.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        
        
        float x=0F, a=0F, b=0F, c=0F, d=0F;
        float result=0F;

        x=Float.parseFloat(jTxtX.getText());
        a=Float.parseFloat(jTxtA.getText());
        b=Float.parseFloat(jTxtB.getText());
        c=Float.parseFloat(jTxtC.getText());
        d=Float.parseFloat(jTxtD.getText());


        result=(float)((a*(Math.pow(x, 5))) - (b*Math.pow(x, 3)) + (c*x) - d);

        jLblResult.setText("Resultado: "+result);
    }
}