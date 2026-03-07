public class SumWithWhile{
    public static void main(String[] args){
        var i=1;
        var sum=0;

        System.out.println("****** Programa que calcula la suma del 1 al 5 ******");
        
        while(i<=5){
            sum+=i;
            i++;
        }

        System.out.println("La suma del 1 al 5 es igual a: "+sum);
    }
}