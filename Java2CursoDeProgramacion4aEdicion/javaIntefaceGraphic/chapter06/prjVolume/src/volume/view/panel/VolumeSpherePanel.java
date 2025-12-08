package volume.view.panel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JPanel;

public class VolumeSpherePanel extends JPanel implements ActionListener{
    private JLabel jLblradio=new JLabel("Radio");
    private JLabel jLblResult= new JLabel();
    private JButton jBtnExcute=new JButton("Ejecutar");
    private JTextField jTxtRadio=new JTextField(20);
    

    public VolumeSpherePanel(){
        add(jLblradio);
        add(jTxtRadio);
        add(jBtnExcute);
        add(jLblResult);

        jBtnExcute.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        float radio=0.0F, volume=0.0F;

        radio=Float.parseFloat(jTxtRadio.getText());

        volume=(float) ((4*Math.PI*Math.pow(radio, 3))/3);
        jLblResult.setText("El volumen de la esfera es igual a: "+volume);
    }
}