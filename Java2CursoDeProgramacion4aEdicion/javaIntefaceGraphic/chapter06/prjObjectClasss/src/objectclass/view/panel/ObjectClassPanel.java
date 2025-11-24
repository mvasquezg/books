/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 06: Clases de uso común
*Programa 01: Determinar la clase que pertence a un objeto
*/

package objectclass.view.panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ObjectClassPanel extends JPanel implements ActionListener{
    private JButton jBtnEjecute=new JButton("Ejecutar");
    private JLabel jLblField=new JLabel("Dato: ");
    private JLabel jLblData;
    private JTextField jTextF=new JTextField(20);
    private String message="<HTML>";
    private int n=0;

    private Class objectClass;

    public ObjectClassPanel(){
        
        add(jLblField);
        add(jTextF);
        add(jBtnEjecute);

        jBtnEjecute.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        n=jTextF.getText().charAt(0);
        message+=(char)n+"<br>";

        objectClass=System.in.getClass();
        message+="Clase de in: "+objectClass.getName();
        
        objectClass=System.out.getClass();
        message+="<br>Clase de out: "+objectClass.getName();

        objectClass=System.err.getClass();
        message+="<br>Clase de err: "+objectClass.getName()+"<HTML>";

        jLblData=new JLabel(message);

        this.add(jLblData);    
    }
}