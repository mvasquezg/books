public class NumbPairsFor{
    public static void main(String[] args){
        System.out.println("*** Numeros pares con ciclo for del 1-20");

        for(var i=1; i<=20; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
            
        }

        System.out.println();
    }
}