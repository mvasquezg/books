/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 01: menor de tres numeros 
*/

package menornumber.view.frame;

import menornumber.view.panel.MenorNumberPanel;

import javax.swing.JFrame;

public class MenorNumberFrame extends JFrame{
    private MenorNumberPanel numberPanel=new MenorNumberPanel();
    
    public MenorNumberFrame(){
        setTitle("Menor de Tres Numeros");
        setBounds(350, 350, 350, 450);
        setVisible(true);

        add(numberPanel);
    }
}