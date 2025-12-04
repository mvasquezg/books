package greeting;

import greeting.view.frame.GreetingFrame;

import javax.swing.JFrame;

public class GreetingApp{
    public static void main(String[] args){
        GreetingFrame grFrame=new GreetingFrame();

        grFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}