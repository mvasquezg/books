/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 03: Leer fecha entera mes y año y mostrar los dias del mes. 
*/
package monthyear.view.panel;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JPanel;

public class MonthYearPanel extends JPanel implements ActionListener{
    private JButton jBtnExecute=new JButton("Ejecutar");
    
    private JLabel jLblMonth=new JLabel("Mes: ");
    private JLabel jLblYear=new JLabel("Año: ");
    private JLabel jLbResult=new JLabel("");

    private JTextField jTxtMonth=new JTextField(20);
    private JTextField jTxtYear=new JTextField(20);

    public MonthYearPanel(){
        setLayout(new GridLayout(4,2));

        add(jLblMonth);
        add(jTxtMonth);

        add(jLblYear);
        add(jTxtYear);

        add(jBtnExecute);
        add(jLbResult);

        jBtnExecute.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String result=jLbResult.getText();
        int day=0, month=0, year=0;

        month=Integer.parseInt(jTxtMonth.getText());
        year=Integer.parseInt(jTxtYear.getText());
        
        result="<HTML>";
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day=31;
                break;
            case 4: case 6: case 9: case 11:
                day=30;
                break;
            case 2:
                //El año es boisiesto
                if( (year%4==0) && (year % 100 != 0 ) || (year % 400==0))
                    day=29;
                else
                    day=28;
                break;    
            default:
                result+=("El mes no es valido<br>");
                break;                        
        }//end switch

        if(month>=1 && month<=12){
            result+=("<br>El Mes "+month+" del año "+year+" tiene "+day+" dias.<br>");
        }

        result+="<HTML>";

        jLbResult.setText(result);
    }
}