/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 18: Calcular los multiplo de 5 entre dos valores A, B, no permitoira negativos. 
*/
package tarot.view.panel;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;


public class TarotPanel extends JPanel implements ActionListener {
    private JButton jBtnExecute=new JButton("Ejecutar");

    private JLabel jLblResult=new JLabel("");

    private JLabel jLblDay=new JLabel("Dia: ");
    private JLabel jLblMonth=new JLabel("Mes: ");
    private JLabel jLblYear=new JLabel("Año: ");
    
    private JTextField jTxtDay=new JTextField();
    private JTextField jTxtMonth=new JTextField();
    private JTextField jTxtYear=new JTextField();

    public TarotPanel(){
        setLayout(new GridLayout(4, 2));

        add(jLblDay);
        add(jTxtDay);

        add(jLblMonth);
        add(jTxtMonth);

        add(jLblYear);
        add(jTxtYear);

        add(jBtnExecute);
        add(jLblResult);

        jBtnExecute.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String result="<HTML>";

        int day=0, month=0, year=0, num=0; 
        
        year=Integer.parseInt(jTxtYear.getText());
        
        month=Integer.parseInt(jTxtMonth.getText());

        day=Integer.parseInt(jTxtDay.getText());   

             
        num=showTarotNumber(day+month+year);

        result+="<br>Tu numero de tarot es: "+num+"<br><HTML>";

        jLblResult.setText(result);
    }

      
    public int showTarotNumber(int sum){
        int d=0, m=0, y=0;   

        if(sum>=10){
            y=sum/1000;
            sum=sum%1000;

            m=sum/100;
            sum=sum%100;
            
            d=sum/10;
            sum=sum%10;

            sum=showTarotNumber(sum+y+d+m);
        }

        return sum;
    }
}