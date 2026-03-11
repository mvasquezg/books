import java.util.Scanner;

public class ATMMejorado{
    public static void main(String[] args){
    
     Scanner in=new Scanner(System.in);
        var option=4;
        var balance=1000.00;
        var salir=false;
        var amount=0.0;

        System.out.println("*** Cajero Automatico ***\n");

        while(!salir){

            System.out.print("""
            Operaciones que puedes Realizar: 
            1.-Consultar Saldo.
            2.-Retirar.
            3.-Depositar
            4.-Salir
            Elige cualquier opcion del 1-4: """);
            option=in.nextInt();

            //Procesando cada paso
            switch(option){
                case 1-> System.out.printf("%nTu Saldo Actual es: %.2f%n%n", balance);
                case 2->{
                    System.out.print("\nIngresa una cantidad a retirar: ");
                    amount=in.nextDouble();

                    if(balance<amount){
                        System.out.printf("Saldo insuficiente.%nSaldo actual: %.2f%n%n", balance);
                    }else{
                        balance-=amount;
                        System.out.printf("%nRetiró: %.2f%nSaldo actual: %.2f%n%n", amount, balance);
                    }
                }
                case 3->{
                        System.out.print("\nIngresa la cantidad a depositar: ");
                        amount=in.nextDouble();

                        balance+=amount;
                        System.out.printf("%nDepositó: %.2f%nSaldo actual: %.2f%n%n", amount, balance);
                    }
                case 4->{
                    System.out.println("\nSaliendo del cajero automático. Hasta Pronto!");
                    salir=true;
                }
                default->System.out.println("Ópcion invalida. Selecciona otra opción.");           
            }
        }
    }
}