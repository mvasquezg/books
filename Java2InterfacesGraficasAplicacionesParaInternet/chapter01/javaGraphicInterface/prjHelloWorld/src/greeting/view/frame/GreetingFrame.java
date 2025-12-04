package greeting.view.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class GreetingFrame extends JFrame implements ActionListener{
    
    private JLabel jLblGreeting=new JLabel();
    private JButton jBtnGreeting=new JButton("Haga click aquí");

    public GreetingFrame(){
        setLayout(null);
        setSize(450, 250);
        setTitle("Hola Mundo Con Interfaz Grafica");
        setVisible(true);

        jLblGreeting.setText("Etiqueta");
        jLblGreeting.setHorizontalAlignment(SwingConstants.CENTER);
        jLblGreeting.setFont(new Font("Dialog", 1, 18));
        
        jBtnGreeting.setToolTipText("Botón de Pulsación");
        jBtnGreeting.setMnemonic('c');
        jBtnGreeting.addActionListener(this);

        add(jLblGreeting);
        jLblGreeting.setBounds(42, 36, 204, 30);
        
        add(jBtnGreeting);
        jBtnGreeting.setBounds(42, 90, 204,30);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e){
        float red=(float) Math.random();
        float green=(float) Math.random();
        float blue=(float) Math.random();

        jLblGreeting.setForeground(new Color(red, green, blue));
        jLblGreeting.setText("Hola Mundo");
    }
}