package prjAritmethic.src.com.main;

import prjAritmethic.src.com.aritmetic.Aritmethic;

public class AritmethicApp {
    
    public static void main(String[] args) {
        Aritmethic aritmetic1=new Aritmethic(5, 7);
        Aritmethic aritmetic2=new Aritmethic();

        
        aritmetic1.sum();
        aritmetic1.rest();
        
        
        System.out.println();
        aritmetic2.setNum1(8);
        aritmetic2.setNum2(3);
        
        aritmetic2.sum();
        aritmetic2.rest();
    }
}
