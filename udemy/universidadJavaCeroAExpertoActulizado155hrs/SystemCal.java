import java.util.Scanner;

public class SystemCal{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        var calLetter="";
        System.out.println("*** Sistema de Calificaciones ***");

        System.out.print("Ingresa tu calificacion: ");
        var cal=in.nextDouble();

        if(cal>=9.00 && cal<= 10.00){
            calLetter="A";
        }else if(cal>=8.00 && cal<9.00){
            calLetter="B";
        }else if(cal>=7.00 && cal<8.00){
            calLetter="C";    
        }else if(cal>=6.00 && cal<7.00){
            calLetter="D";
        }else if(cal>=0.00 && cal<6.99){
            calLetter="F";
        }else{ 
            calLetter="Valor desconocido";
        }

        System.out.println("Su calificacion "+cal+" es "+calLetter);

    }
}