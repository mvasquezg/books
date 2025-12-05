/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 06: Intereses producidos 
*/

/***
 * Variables
 * I = Total de Intereses producidos
 * c = Capital
 * r = Tasa de Interes nominal en tanto por ciento
 * t = Periodo de calculo en dias   
 */

package interest.view.panel;

import java.awt.GridLayout;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class InterestPanel extends JPanel implements ActionListener{
    private double c=0, interest=0, capital=0, t=0;
    private float r=0.0F; 
    private String message="<HTML>";

    private JButton jBtbExecute=new JButton("Ejecutar");
    
    private JLabel jLblCapital=new JLabel("Capital Invertido: ");
    private JLabel jLblPercent=new JLabel("A un % anual de: ");
    private JLabel jLblDays=new JLabel("Durante cuantos dias: ");
    private JLabel jLblResult=new JLabel("Resultado: ");

    private JTextField jTxtCapital=new JTextField(10);
    private JTextField jTxtPercent=new JTextField(10);
    private JTextField jTxtDays=new JTextField(10);

    public InterestPanel(){
        setLayout(new BorderLayout());
        
        //Creo un buevo panel para ingresar los datos
        JPanel jPanelInputs=new JPanel();   

        //Determino el layout de 3 filas y 3 columnas
        jPanelInputs.setLayout(new GridLayout(3, 3));

        //Agregoa el layout de inpus a la zona norte del panel principal
        add(jPanelInputs, BorderLayout.NORTH);

        jPanelInputs.add(jLblCapital);
        jPanelInputs.add(jTxtCapital);

        jPanelInputs.add(jLblPercent);
        jPanelInputs.add(jTxtPercent);

        jPanelInputs.add(jLblDays);
        jPanelInputs.add(jTxtDays);

        add(jBtbExecute, BorderLayout.SOUTH);

        jBtbExecute.addActionListener(this);

        add(jLblResult, BorderLayout.CENTER);    

    }

    public void actionPerformed(ActionEvent e){
        c=Double.parseDouble(jTxtCapital.getText());
        
        r=Float.parseFloat(jTxtPercent.getText());

        t=Double.parseDouble(jTxtDays.getText());

        interest=c*r*t/(360*100);
        capital=c+interest;
        
        message+="Intereses producidos... "+interest+"<br><br>Capital acumulado..."+capital+"<HTML>";



        jLblResult.setText(message);

            
    }
}
