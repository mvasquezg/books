package quadratic.view.panel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JPanel;

public class QuadraticPanel extends JPanel implements ActionListener{
    private JLabel jLblA=new JLabel("Ingrese el valor de a: ");
    private JLabel jLblB=new JLabel("Ingrese el valor de b: ");
    private JLabel jLblC=new JLabel("Ingrese el valor de c: ");
    private JLabel jLblResult=new JLabel("");

    private JTextField jTxtA=new JTextField(10);
    private JTextField jTxtB=new JTextField(10);
    private JTextField jTxtC=new JTextField(10);

    private JButton jBtnExecute=new JButton("Ejecutar");

    private JPanel jPanelA=new JPanel();
    private JPanel jPanelB=new JPanel();
    private JPanel jPanelC=new JPanel();
    private JPanel jPanelButton=new JPanel();


    public QuadraticPanel(){
        setLayout(new GridLayout(4, 1));
        
        //Panel S
        jPanelA.setLayout(new GridLayout(1, 2));
        jPanelA.add(jLblA);
        jPanelA.add(jTxtA);
        
        jPanelB.setLayout(new GridLayout(1, 2));
        jPanelB.add(jLblB);
        jPanelB.add(jTxtB);

        jPanelC.setLayout(new GridLayout(1, 2));
        jPanelC.add(jLblC);
        jPanelC.add(jTxtC);
        
        jBtnExecute.addActionListener(this);

        add(jPanelA);
        add(jPanelB);
        add(jPanelC);
        add(jBtnExecute);
        add(jLblResult);
    }

    public void actionPerformed(ActionEvent e){
        jLblResult.setText("<HTML>");
        double a=0, b=0, c=0; //Coeficientes de la ecuacion
        double d=0;       //discriminante
        double re=0, im=0;  //parte real e imaginaria de la raiz
        String result=jLblResult.getText();

        a=Double.parseDouble(jTxtA.getText());
        b=Double.parseDouble(jTxtB.getText());
        c=Double.parseDouble(jTxtC.getText());
        
        if(a==0 && b==0){
            result+="La ecuacion es degenerada.";
        }else if(a==0){
            result+="La única raíz es: "+(-c/b);
        }else{    
            //Evaluar la fórmula. Calculo de d. re e im
            re = -b/(2*a);
            d=b*b-4*a*c;
            im=Math.sqrt(Math.abs(d))/(2*a);
        
            if(d>=0){
                result+="Raíces reales<br>";
                result+=(re+im)+", "+(re-im);
            }else{
                result+="Raíces complejas<br>";
                result+=re+" + "+Math.abs(im)+" j<br>";
                result+=re+" - "+Math.abs(im)+" j";
            }
        }
        result+="<HTML>";

        jLblResult.setText(result);
        
    }

}