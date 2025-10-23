/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 03: Introducción a la Programacion Orientada a Objetos
*Programa 01: Clase Cuenta --(Modelo)
*/
package bank.model;

public class BankAccountModel{
    private String nameCustomer;
    private String bankAccount;
    private double balance;
    private double rateInterest;

    //Constructor
    public BankAccountModel(){}

    public BankAccountModel(String nameCustomer, String bankAccount, double balance, double rateInterest){
        setNameCustomer(nameCustomer);
        setBankAccount(bankAccount);
        setBalance(balance);
        setRateInterest(rateInterest);
    }

    //Methods set
    public  void setNameCustomer(String nameCustomer){
        if(nameCustomer.length()==0){
            System.out.println("Error: Cadena vacia.");
        }

        this.nameCustomer=nameCustomer;
    } 

    public void setBankAccount(String bankAccount){
        if(bankAccount.length()==0){
            System.out.println("Error: Cadena vacia.");
        }
        
        this.bankAccount=bankAccount;
    }  

    public void setBalance(double amount){
        if(amount<0){
            System.out.println("Error: Cantidad Negativa.");
            return;
        }
        
        this.balance=amount;
    }

    public void setRateInterest(double rateInterest){
        
        if(rateInterest<0){
            System.out.println("Error: tipo no valido.");
            return;
        }
       
        this.rateInterest=rateInterest;
    }

    //Methods get
    public String getNameCustomer(){
        return this.nameCustomer;
    }

    public String getBankAccount(){
        return bankAccount;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getRateInterest(){
        return this.rateInterest;
    }

    //others metods
    public void withdrawal(double amount){
        if(this.balance-amount<0){
            System.out.print("Error: No dispone de saldo.");
        }

        this.balance=this.balance-amount;
    }

}