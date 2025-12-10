/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 01: menor de tres numeros 
*/
package menornumber.view.panel;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JPanel;

public class MenorNumberPanel extends JPanel implements ActionListener{
    private JButton jBtnExcute=new JButton("Ejecutar");

    private JLabel jLblNum1=new JLabel("Numero 1: ");
    private JLabel jLblNum2=new JLabel("Numero 2: ");
    private JLabel jLblNum3=new JLabel("Numero 3: ");
    private JLabel jLblResult=new JLabel("");

    private JTextField jTxtNum1=new JTextField(20);
    private JTextField jTxtNum2=new JTextField(20);
    private JTextField jTxtNum3=new JTextField(20);

    public MenorNumberPanel(){
        setLayout(new GridLayout(4, 1));

        add(jLblNum1);
        add(jTxtNum1);

        add(jLblNum2);
        add(jTxtNum2);

        add(jLblNum3);
        add(jTxtNum3);

        add(jBtnExcute);
        add(jLblResult);

        jBtnExcute.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        int num1=0, num2=0, num3=0, menor=0;
        
        num1=Integer.parseInt(jTxtNum1.getText());
        num2=Integer.parseInt(jTxtNum2.getText());
        num3=Integer.parseInt(jTxtNum3.getText());

        if(num1==num2){
            if(num2==num3){
                jLblResult.setText("Todos los numeros son iguales.");
            }else if(num2>num3){
                    menor=num3;
            }else{
                menor=num2;    
            }
        }else if(num1>num2){
            if(num1==num3){
                menor=num2;
            }else if(num1>num3){
                if(num2==num3){
                    menor=num3;
                }else if(num2>num3){
                    menor=num3;
                }else{
                    menor=num2;
                }
            }else{
                menor=num2;
            }
        }else{
            if(num2==num3){
                menor=num1;
            }else if(num2>num3){
                if(num1==num3){
                    menor=num3;
                }else if(num1>num3){
                    menor=num3;
                }else{
                    menor=num1;
                }
            }else{
                menor=num1;
            }
        }
        

        if(menor!=0){
            jLblResult.setText("El numero menor: "+menor);
        }  
    }
}