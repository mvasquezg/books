package greeting.view.panel;

import greeting.view.panel.GreetingPanelButton;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GreetingPanelLabel extends JPanel{
    
    JLabel jLblLabel=new JLabel("Etiqueta");
    private GreetingPanelButton panelButton=new GreetingPanelButton();

    public GreetingPanelLabel(){
        
        add(jLblLabel);
    }
}