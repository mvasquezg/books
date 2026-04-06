public class UseConstructor {
    int num1;
    int num2;

    //Constructor vacio
    public UseConstructor(){
        System.out.println("This: "+this);
    }

    //Constructor con parametors
    public UseConstructor(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
        System.out.println("This: "+this);
    }

    void sum(){
        var result=num1+num2;
        System.out.println("Suma: \n"+this.num1+" + "+this.num2+" = "+result);
    }

    void rest(){
        var result=num1-num2;
        System.out.println("Resta: \n"+num1+" - "+num2+" = "+result);
    }

    public static void main(String[] args) {
        var aritmetic1=new UseConstructor(5, 7);
        
        aritmetic1.sum();
        aritmetic1.rest();
        System.out.println("Direccion de memoria: "+aritmetic1);

        System.out.println();
        var aritmetic2=new UseConstructor(48, 12);
        aritmetic2.sum();
        aritmetic2.rest();
        System.out.println("Direccion de memoria: "+aritmetic2);
    }
}
