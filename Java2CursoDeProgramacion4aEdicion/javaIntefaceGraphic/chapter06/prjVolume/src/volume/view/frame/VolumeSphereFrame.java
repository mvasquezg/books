package volume.view.frame;

import volume.view.panel.VolumeSpherePanel;

import javax.swing.JFrame;

public class VolumeSphereFrame extends JFrame { 
    private VolumeSpherePanel vlPanel=new VolumeSpherePanel();

    public VolumeSphereFrame(){
        setTitle("Volumen de una esfera");
        setBounds(300, 400, 350, 350);    
        setVisible(true);

        add(vlPanel);
    }       
}