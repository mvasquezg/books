/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 09: Bucle FOR aplicada al ajedres. 
*/
package chess.view.panel;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;


import javax.swing.JFrame;

public class ChessPanel extends JPanel implements ActionListener{
    private JButton jBtnExecute=new JButton("Ejecutar");
    
    private JLabel jLblRow=new JLabel("Fila: ");
    private JLabel jLblCol=new JLabel("Columna: ");
    private JLabel jLblResult=new JLabel("");

    private JTextField jTxtRow=new JTextField();
    private JTextField jTxtCol=new JTextField();

    public ChessPanel(){
        setLayout(new GridLayout(3,2));

        add(jLblRow);
        add(jTxtRow);

        add(jLblCol);
        add(jTxtCol);

        add(jBtnExecute);
        add(jLblResult);

        jBtnExecute.addActionListener(this);
    
    }

    public void actionPerformed(ActionEvent e){
        int falfil=0, calfil=0;
        int fila=0, columna=0;
        String result="<HTML>";

        falfil=Integer.parseInt(jTxtRow.getText());
        calfil=Integer.parseInt(jTxtCol.getText());

        //pintar el tablero
        for(int i=1; fila<=8; fila++){

            for(columna=1; columna<=8; columna++){
                if((fila+columna == falfil+calfil) || (fila-columna == falfil-calfil)){
                    result+="*&nbsp;";
                }else if((fila+columna)%2==0){
                    result+="B&nbsp;";
                }else{
                    result+="N&nbsp;";
                }
                
            }
            result+="<br><HTML>";


        }//end fila 


        jLblResult.setText(result);
    }
}