/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 03: Leer fecha entera mes y año y mostrar los dias del mes. 
*/

package monthyear.view.frame;

import monthyear.view.panel.MonthYearPanel;

import javax.swing.JFrame;

public class MonthYearFrame extends JFrame{
    private MonthYearPanel myPanel=new MonthYearPanel();

    public MonthYearFrame(){
        setTitle("Mostrar dias de los meses");
        setBounds(350, 350, 450, 450);
        setVisible(true);

        add(myPanel);
    }
}