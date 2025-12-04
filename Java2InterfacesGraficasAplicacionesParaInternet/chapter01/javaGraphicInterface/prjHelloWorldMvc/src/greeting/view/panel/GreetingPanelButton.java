package greeting.view.panel;

import greeting.view.panel.GreetingPanelLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GreetingPanelButton extends JPanel implements ActionListener{

    private JButton jBtnExcute=new JButton("Haga click aquí");
   //private GreetingPanelLabel panelLabel=new GreetingPanelLabel(); 
    
    public GreetingPanelButton(){
        add(jBtnExcute);
        jBtnExcute.addActionListener(this);
    }

    /*public GreetingPanelButton(JLabel jLbl){
        //jLblGreeting=jLbl;
        add(jBtnExcute);
        jBtnExcute.addActionListener(this);
    }*/

    public void actionPerformed(ActionEvent evt){
        System.out.println("Hola mundo");
        //this.panelLabel.jLblLabel.setText("Hola Mundo");
    }

}