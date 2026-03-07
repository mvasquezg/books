public class SumWithFor{
    public static void main(String[] args){
        var sum=0;

        System.out.println("****** Programa que calcula la suma del 1 al 5 ******");
        
        for(var i=1;i<=5; i++){
            sum+=i;
        }

        System.out.println("La suma del 1 al 5 es igual a: "+sum);
    }
}