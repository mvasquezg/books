package prjAritmethic.src.com.aritmetic;

public class Aritmethic {
    private int num1;
    private int num2;

    public Aritmethic(){}

    public Aritmethic(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    
    public void setNum1(int num1){
        this.num1=num1;
    }

    public int getNum1(){
        return this.num1;
    }

    public void setNum2(int num2){
        this.num2=num2;
    }

    public int getNum2(){
        return this.num2;
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
