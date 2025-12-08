package age.view.panel;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AgePanel extends JPanel implements ActionListener{

    private JLabel jLblAge=new JLabel("Fecha de nacimiento: ");
    private JLabel jLblName=new JLabel("Nombre: ");
    private JLabel jLblResult=new JLabel();
    private JTextField jTxtAge=new JTextField(20);
    private JTextField jTxtName=new JTextField(20);
    private JButton jBtnExecute=new JButton("Ejecutar");

    public AgePanel(){
        setLayout(new GridLayout(4, 1));

        add(jLblName);
        add(jTxtName);

        add(jLblAge);
        add(jTxtAge);

        add(jBtnExecute);

        add(jLblResult);

        jBtnExecute.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String result;
        String name=jTxtName.getText();
        int age=Integer.parseInt(jTxtAge.getText());


        result=("Hola "+name+" tu edad en el año 2030 es de "+(2030-age)+" años\n");

        jLblResult.setText(result);
    }
}