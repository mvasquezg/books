/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 05: Estrructura de un programa
*Programa 01: Grados Centigrados
*/
package degrees.view.panel;

import degrees.model.DegreesModel;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class DegreesPanel extends JPanel{
    private JLabel jLblData;
    private String message="<HTML>";
    private DegreesModel degrees=new DegreesModel();

    public DegreesPanel(){
   
        int degreesCelsius=0;
        double degreesFahrenheit=0;

        message+="Grados C\t  -  -  -  \tGrados F";

        while(degreesCelsius<=degrees.LIM_SUPERIOR){
            degrees.setDegreesC(degreesCelsius);
            degreesFahrenheit=degrees.getDegreesF();

            message+="<br>"+degreesCelsius+" C&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; - &nbsp;&nbsp;&nbsp; - &nbsp;&nbsp;&nbsp; - &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\t"+degreesFahrenheit+" F<br>";
            degreesCelsius+=degrees.getIncrement();
        }
        message+="<HTML>";
        jLblData=new JLabel(message);    
        add(jLblData);
    }
    
    
}