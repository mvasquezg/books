public class FuncionRecursiva {
    
    static void funcionRecursiva(int num){
        //Caso base
        if(num==1){
            System.out.print(num+" ");
        }else{
            funcionRecursiva(num-1);
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args){
        funcionRecursiva(5);
        System.out.println();
    }
}
