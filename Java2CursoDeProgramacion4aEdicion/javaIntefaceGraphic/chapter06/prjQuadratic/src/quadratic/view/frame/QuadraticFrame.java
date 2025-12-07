package quadratic.view.frame;

import quadratic.view.panel.QuadraticPanel;

import javax.swing.JFrame;

public class QuadraticFrame extends JFrame{
    private QuadraticPanel qrPanel=new QuadraticPanel();

    public QuadraticFrame(){
        setTitle("Raices de Ecuacion ax^2 + bx + c = ");
        setBounds(300, 400, 550, 350);
        setVisible(true);

        add(qrPanel);
    }
}