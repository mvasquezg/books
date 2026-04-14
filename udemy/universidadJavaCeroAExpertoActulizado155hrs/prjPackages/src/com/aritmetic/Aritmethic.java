
package prjPackages.src.com.aritmetic;

public class Aritmethic {
    public int num1;
    public int num2;

    public Aritmethic(){}

    public Aritmethic(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    
    public void sum(){
        var result=num1+num2;
        System.out.println("Suma: \n"+num1+" + "+num2+" = "+result);
    }

    public void rest(){
        var result=num1-num2;
        System.out.println("\nResta: \n"+num1+" - "+num2+" = "+result);
    }
}
