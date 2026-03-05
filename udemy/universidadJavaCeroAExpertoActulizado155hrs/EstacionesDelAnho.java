import java.util.Scanner;

public class EstacionesDelAnho{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        byte month=0;
        var message="La estacion del año es ";
        var estacion="";
        System.out.println("*** Estaciones del año ***");
        
        System.out.print("Ingresa un mes con numero del 1-12: ");
        month=in.nextByte();

        if(month==1 || month==2 || month==12){
            estacion="Invierno.";
        }else if(month==3 || month==4 || month==5){
            estacion="Primavera.";
        }else if(month==6 || month==7 || month==8){
            estacion="Verano.";
        }else if(month==9 || month==10 || month==11){
            estacion="Otoño.";
        }else{
            message="Estacion desconocida.";
        }

        message+=estacion;

        System.out.println(message);


    }
}