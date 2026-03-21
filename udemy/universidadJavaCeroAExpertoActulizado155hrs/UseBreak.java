public class UseBreak {
    public static void main(String[] args){
        //Imṕrimiendo numeros pares usando la setencia break
        System.out.println("*** Uso de la sentencia break ***");
        for(int i=1; i<=10; i++){
            if(i%2==0){
                System.out.println(i+" ");
                break;
            }
        }
    }   
}
