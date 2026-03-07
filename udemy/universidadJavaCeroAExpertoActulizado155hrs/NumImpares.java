public class NumImpares{
    public static void main(String[] args){
        var i=1;

        do{
            System.out.print((!(i%2==0))?i:" ");
            i++;
        }while(i<=20);

        System.out.println();

    }
}