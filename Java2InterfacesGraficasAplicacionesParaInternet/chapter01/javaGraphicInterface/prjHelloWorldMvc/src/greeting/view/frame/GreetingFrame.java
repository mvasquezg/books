package greeting.view.frame;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import greeting.view.panel.GreetingPanelLabel;
import greeting.view.panel.GreetingPanelButton;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class GreetingFrame extends JFrame implements ActionListener{
    
    private JPanel jPanelLabel=new JPanel();
    private JPanel jPabelButton=new JPanel();

    private JLabel jLblLabel=new JLabel("Etiqueta");
    private JButton jBtnExecute=new JButton("Has clic aquí");

    public GreetingFrame(){
        setLayout(new GridLayout(2, 1));
        setTitle("Saludo Hola Mundo usando Frame y Panel");
        setBounds(350, 350, 450, 350);
        setVisible(true);
        
        jPanelLabel.add(jLblLabel);
        jPabelButton.add(jBtnExecute);

        jBtnExecute.addActionListener(this);

        add(jPanelLabel);
        add(jPabelButton);
    }

    public void actionPerformed(ActionEvent evt){
        float red=(float) Math.random();
        float green=(float) Math.random();
        float blue=(float) Math.random();

        jLblLabel.setForeground(new Color(red, green, blue));

        if(jLblLabel.getText().equalsIgnoreCase("Has clic aquí")){
            jLblLabel.setText("Hola Mundo");
        }else{
            jLblLabel.setText("Has clic aquí");
        }
        
        
    }
}