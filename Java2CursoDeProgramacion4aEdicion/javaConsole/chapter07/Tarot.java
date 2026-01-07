/**Libro: Java 2 Curso de programación 4a edición
*Capitulo 07: Sentencias de control
*Programa 18: Calcular los multiplo de 5 entre dos valores A, B, no permitoira negativos. 
*/
import java.util.Scanner;

public class Tarot{
    
    public static int showTarotNumber(int sum){
        int d=0, m=0, y=0;   

        if(sum>=10){
            y=sum/1000;
            sum=sum%1000;

            m=sum/100;
            sum=sum%100;
            
            d=sum/10;
            sum=sum%10;

            sum=showTarotNumber(sum+y+d+m);
        }

        return sum;
    }


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int day=0, month=0, year=0, num=0; 
        
        do{
            System.out.print("Ingresa el año de nacimiento entre 1920-2026: ");
            year=in.nextInt();
        }while(year<1920 || year>2026);
        
        do{
            System.out.print("Ingresa el mes de nacimiento: ");
            month=in.nextInt();
        }while(month<1 || month>12);

        if(month==2){

            if( ((year%4==0) || (year%100==4 && year%400==0))){
                do{
                    System.out.print("Ingresa un dia entre 1-29: ");
                    day=in.nextInt();
                }while((day<1 || day>29));


            }else{
                do{
                    System.out.print("Ingresa un dia entre 1-28: ");
                    day=in.nextInt();
                }while((day<1 || day>28));
            }
        }else if(month==1 || month==3 || month == 5 || month==7 || month == 8 || month==10 || month==12){
            do{
                System.out.print("Ingresa un dia entre 1-31: ");
                day=in.nextInt();;
            }while((day<1 || day>31));
        }else if(month==4 || month==6 || month == 9 || month==11){
            do{
                System.out.print("Ingresa un dia entre 1-30: ");
                day=in.nextInt();;
            }while((day<1 || day>30));
        }
        num=showTarotNumber(day+month+year);

        System.out.println("\n"+num);
        

        
            



    }
}