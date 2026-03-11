import java.util.Scanner;

public class ATM{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        var option=4;
        var balance=1000.00;
        var amount=0.00;

        System.out.println("*** Cajero Automatico ***\n\nOperaciones que puedes Realizar: ");

        do{

            System.out.print("\n1.-Consultar Saldo.\n2.-Retirar.\n3.-Depositar\n4.-Salir\nElige cualquier opcion del 1-4: ");
            option=in.nextInt();

            switch(option){
                case 1:
                    System.out.println("\nTu saldo Actual es: "+balance+"\n");
                    break;
                case 2:
                    System.out.print("\nIngresa una cantidad a retirar: ");
                    amount=in.nextDouble();

                    if(balance<amount){
                        System.out.println("Saldo insuficiente.\nSaldo actual: "+balance);
                    }else{
                        balance-=amount;
                        System.out.println("\nRetiró: "+amount+"\nSaldo actual: "+balance);
                    }
                    break;
                case 3:
                    System.out.print("\nIngresa la cantidad a depositar: ");
                    amount=in.nextDouble();

                    balance+=amount;
                    System.out.println("\nDepositó: "+amount+"\nSaldo actual: "+balance);
                    break;
                case 4:
                    System.out.println("\nSaliendo del cajero automático. Hasta Pronto!");
                    break;
                default:
                    System.out.println("Ópcion invalida. Selecciona otra opción.");
                    break;            
            }
        }while(option!=4);


    }
}