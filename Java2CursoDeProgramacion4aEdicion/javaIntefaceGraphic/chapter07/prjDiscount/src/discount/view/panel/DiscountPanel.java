/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 02: Efectuar compra en algun almacen 
*/
package discount.view.panel;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class DiscountPanel extends JPanel implements ActionListener{
    private JButton jBtnExecute=new JButton("Ejecutar");

    private JLabel jLblCodeItem=new JLabel("Codigo del Articulo: ");
    private JLabel jLblNumberOfPieces =new JLabel("Cantidad de piezas: ");
    private JLabel jLblUnitPrice =new JLabel("Precio Unitario: ");
    private JLabel jLblResult=new JLabel("<HTML>"); 

    private JTextField jTxtCodeItem =new JTextField(20);
    private JTextField jTxtNumberOfPieces =new JTextField(20);
    private JTextField jTxtUnitPrice =new JTextField(20);

    public DiscountPanel(){
        setLayout(new GridLayout(4, 1));

        add(jLblCodeItem);
        add(jTxtCodeItem);

        add(jLblNumberOfPieces);
        add(jTxtNumberOfPieces);

        add(jLblUnitPrice);
        add(jTxtUnitPrice);

        add(jBtnExecute);
        add(jLblResult);

        jBtnExecute.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String result=jLblResult.getText();
        int codeItem=0, numberOfPieces=0;
        float unitPrice=0F;
        float discount=0F;

         
        codeItem=Integer.parseInt(jTxtCodeItem.getText());
        numberOfPieces=Integer.parseInt(jTxtNumberOfPieces.getText());
        unitPrice=Float.parseFloat(jTxtUnitPrice.getText());

        if(numberOfPieces>100){
            discount=40F;
        }else if(numberOfPieces>=25){
            discount=20F;
        }else if(numberOfPieces>=10){
            discount=10F;
        }else{
            discount=0F;
        }
        result+="Decuento . . . . . . . . . . "+discount+"%<br>Total . . . . . . . . . . "+(numberOfPieces*unitPrice*(1 - discount/100))+"%<br><HTML>";

        jLblResult.setText(result);
        
    }

}