public class SumWithDoWhile{
    public static void main(String[] args){
        var i=1;
        var sum=0;

        System.out.println("****** Programa que calcula la suma del 1 al 5 ******");
        
        do{
            sum+=i;
            i++;
        }while(i<=5);

        System.out.println("La suma del 1 al 5 es igual a: "+sum);
    }
}