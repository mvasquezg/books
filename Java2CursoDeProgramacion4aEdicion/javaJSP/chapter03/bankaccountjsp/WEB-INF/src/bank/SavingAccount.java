/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 03: Introducción a la Programacion Orientada a Objetos
*Programa 01: Clase Cuenta
*/
package bank;
public class SavingAccount extends BankAccount{
    //atributos
    private double maintenanceAccount;

    //Constructors
    public SavingAccount(){}

    public SavingAccount(String nameCustomer, String bankAccount, double balance, double rateInterest, double maintenanceAccount){
        super(nameCustomer, bankAccount, balance, rateInterest);
        setMaintenanceAccount(maintenanceAccount);
    }

    //Method Get
    public double getMaintenanceAccount(){
        return this.maintenanceAccount;
    }

    //Method set
    public void setMaintenanceAccount(double maintenanceAccount){
        if(maintenanceAccount<0){
            System.out.println("Error: Cantidad Negativa.");
            return;
        }

        this.maintenanceAccount=maintenanceAccount;
    }

    //Others methods
      public void withdrawal(double amount){
        double balance=getBalance();
        double rateInterest=getRateInterest();

        if(rateInterest>=3.5){
           
           if(balance-amount<1500){
            System.out.print("Error: No dispone de saldo.");
            return;
           }           
        }
        super.withdrawal(amount);
    }
}