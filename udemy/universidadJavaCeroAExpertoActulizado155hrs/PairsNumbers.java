public class PairsNumbers{
    public static void main(String[] args){
        var number=1;
        
        System.out.println("*** Numeros pares entre 1 y 20 ***\n");
        while(number<=20){
            
            if(number%2==0){
                System.out.print(number+" ");
            }
            
            number++;
        }

        System.out.println("\n");

    }
}