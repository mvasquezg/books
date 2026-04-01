public class FuncionSuma{

    //funcion sumar
    static int sum(int a, int b){
        var result=a+b;

        return result;
    }

    public static void main(String[] args) {
        int num1=3, num2=8;
        
        var function_result=sum(num1, num2);

        System.out.println("La suma de: "+num1+" + "+num2+" = "+function_result);
        
    }   
}