package prjPackages.src.com.main;

import prjPackages.src.com.aritmetic.Aritmethic;

public class AritmethicApp {
    
    public static void main(String[] args) {
        Aritmethic aritmetic1=new Aritmethic(5, 7);
        Aritmethic aritmetic2=new Aritmethic();

        
        aritmetic1.sum();
        aritmetic1.rest();
        
        
        System.out.println();
        aritmetic2.num1=12;
        aritmetic2.num2=16;

        aritmetic2.sum();
        aritmetic2.rest();
    }
}
