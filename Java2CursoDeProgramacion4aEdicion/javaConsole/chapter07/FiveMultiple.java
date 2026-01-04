/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 16: Calcular los multiplo de 5 entre dos valores A, B, no permitoira negativos. 
*/
import java.util.Scanner;

public class FiveMultiple{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=0, b=0, sum=0;

        
        do{
            System.out.print("Ingrese el primer valor mayor o igual cinco: ");
            a=in.nextInt();
        }while(a<5);

        do{
            System.out.print("Ingrese el segundo valor mayor o igual a 5: ");
            b=in.nextInt();
        }while(b<5);

        if(a<b){
            for(int i=a; i<=b; i++){
                if(i%5==0){
                    sum+=i;
                }
            }
        }else if(a>b){
            for(int i=b; i<=a; i++){
                if(i%5==0){
                    sum+=i;
                }
            }
        }else{
            System.out.println("Los numeros son iguales, no podremos calcular la suma de los multiplos de 5.");
        }

        if(a!=b){
            System.out.println("La suma de los multiplos de 5 entre "+a+" y "+b+" es igual a: "+sum);
        }
    }
}