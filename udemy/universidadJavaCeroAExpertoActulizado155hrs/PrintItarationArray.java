public class PrintItarationArray{
    public static void main(String[] args){
        var arrayInt= new int[]{100, 200, 300, 400, 500};

        for(int i=0; i<arrayInt.length; i++){
            System.out.println("Valor ["+i+"]: "+arrayInt[i]);
        }
    }   
}