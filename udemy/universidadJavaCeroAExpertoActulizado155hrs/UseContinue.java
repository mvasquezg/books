public class UseContinue{
    public static void main(String[] args){

        //Imṕrimiendo numeros pares usando la setencia continue
        System.out.println("*** Uso de la sentencia continue ***");
        for(int i=1; i<=10; i++){
            if(i%2==1){
                continue;
            }
            System.out.print(i+" ");

        }
        System.out.println();
    }
}