/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 03: Introducción a la Programacion Orientada a Objetos
*Programa 01: Clase Cuenta
*/

public class BankAccountApp{
    
    public static void main(String[] args){
        BankAccount account=new BankAccount();
        BankAccount account01=new BankAccount("Un nombre", "Una Cuneta", 6000.0, 3.5);
        SavingAccount account02=new SavingAccount();

        account.setNameCustomer("Un Nombre");
        account.setBankAccount("Una Cuenta");
        account.setRateInterest(2.5);

        account.setBalance(12000);
        account.withdrawal(3000);

        account02.setNameCustomer("Un Nombre");
        account02.setBankAccount("Una Cuenta");
        account02.setRateInterest(2.5);
        account02.setBalance(12000);
        account02.withdrawal(3000);
        
        System.out.println("Cuenta 1: ");
        System.out.println(account.getNameCustomer());
        System.out.println(account.getBankAccount());
        System.out.println(account.getBalance());
        System.out.println(account.getRateInterest());
        System.out.println("\nCuenta 2: ");
        System.out.println(account01.getNameCustomer());
        System.out.println(account01.getBankAccount());
        System.out.println(account01.getBalance());
        System.out.println(account01.getRateInterest());
        System.out.println("\nCuenta 3 Ahorro: ");
        System.out.println(account02.getNameCustomer());
        System.out.println(account02.getBankAccount());
        System.out.println(account02.getBalance());
        System.out.println(account02.getRateInterest());
    }
    

}