import java.util.Scanner;

public class FuncionPar {

    static boolean isPar(int num){
        /*if(num%2==0){
            return true;
        }else{
            return false;
        }*/

        return (num%2==0)?true:false;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=0;

        System.out.print("Ingresa un numero: ");
        num=in.nextInt();

        System.out.println("El numero "+num+" es par?: "+ (isPar(num)?"Si":"No"));
    }
}
