public class Aritmethic {
    int num1;
    int num2;

    void sum(){
        var result=num1+num2;
        System.out.println("Suma: \n"+num1+" + "+num2+" = "+result);
    }

    void rest(){
        var result=num1-num2;
        System.out.println("\nResta: \n"+num1+" - "+num2+" = "+result);
    }
    
    public static void main(String[] args) {
        var aritmetic1=new Aritmethic();
        var aritmetic2=new Aritmethic();

        aritmetic1.num1=5;
        aritmetic1.num2=7;

        aritmetic1.sum();
        aritmetic1.rest();
        System.out.println();
        aritmetic2.num1=12;
        aritmetic2.num2=16;

        aritmetic2.sum();
        aritmetic2.rest();
    }
}
