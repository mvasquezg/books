/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 06: Bucle anidado While. 
*/
package nestedloop.view.panel;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class NestedLoopPanel extends JPanel implements ActionListener{

    private JButton jBtnExecute=new JButton("Ejecutar");

    private JLabel jLblResult=new JLabel("");


    public NestedLoopPanel(){
        setLayout(new GridLayout(1, 2));

        add(jBtnExecute);
        add(jLblResult);

        jBtnExecute.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        int i=1, j=1;
        String result="<HTML>";

        while(i<=3){
            result+="Para i = "+i+": ";
            while(j<=4){
                result+="j = "+j+", ";
                j++;
            }//end j while
            result+="<br>";
            i++;
            j=1;
        }//end i while

        result+="<HTML>";
        jLblResult.setText(result);
    }

}