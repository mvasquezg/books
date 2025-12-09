/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 10: Programa que calcula el siguiiente polinomio 
                3x^5 - 5x^3 +2x -7
*/
package polynomial.view.panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JPanel;

public class PolynomialPanel extends JPanel implements ActionListener{
    private JButton jBtnExecute=new JButton("Ejecutar");
    private JLabel jLblX=new JLabel("Ingresa el valor de X: ");
    private JLabel jLblResult=new JLabel("");
    private JTextField jTxtX=new JTextField(20);

    public PolynomialPanel(){
        add(jLblX);
        add(jTxtX);
        add(jBtnExecute);
        add(jLblResult);

        jBtnExecute.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        float x=0F;
        float result=0F;

        x=Float.parseFloat(jTxtX.getText());

        result=(float)((3*(Math.pow(x, 5))) - (5*Math.pow(x, 3)) + (2*x) -7);

        jLblResult.setText("Resultado: "+result);
    }
}