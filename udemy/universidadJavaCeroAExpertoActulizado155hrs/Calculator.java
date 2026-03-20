import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        var num1=0.0;
        var num2=0.0;
        var result=0.0;
        var option=0;
        var icon="";
        var salir=false;
        var message="";

        System.out.printf("*** Calculadora en Java ***\n");

        while(!salir){
            System.out.print("""
              
              Opciones
              1.-Suma
              2.-Resta
              3.-Multiplicación
              4.-División
              5.-Salir 
              Elige una opción: """);
            option=in.nextInt();

            if(option>=1 && option<5){
                System.out.print("\nIngresa el primer numero: ");
                num1=in.nextDouble();
                
                System.out.print("Ingresa el segundo numero: ");
                num2=in.nextDouble();
            }

            switch(option){
                case 1->{
                    result=num1+num2;
                    icon="+";
                    message+="*** Suma ***\n";

                }
                case 2->{    
                    result=num1-num2;
                    icon="-";
                    message+="*** Resta ***\n";
                }
                case 3->{
                    result=num1*num2;
                    icon="*";
                    message+="*** Multiplicación ***\n";
                }
                case 4->{
                    message+="*** División ***\n";
                    icon="/";
                    if(num2==0){
                        message+="\nError: División por cero.";
                        result=0;
                    }else{
                        result=num1/num2;
                    }                    
                }
                case 5->{
                    message="";
                    salir=true;
                    message="Saliendo del programa.";
                }
                default->message="Opción Invalida. Elija una opción valida.";
            };//end switch
            
            if(message.equalsIgnoreCase("Opción Invalida. Elija una opción valida.") || message.equalsIgnoreCase("Saliendo del programa.")){
                System.out.printf("%n%s %n%n", message);
            }else{
                System.out.printf("%n%n%s%n %.2f %s %.2f = %.2f%n%n", message, num1, icon, num2, result);
            }
            
            message="";
        }//end while        
    }//end main
}