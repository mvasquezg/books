<%@page import="bank.BankAccount, bank.SavingAccount"%>
<html>
    <title>
       Cuenta de Banco     
    </title>
    <body>
        <%!
            BankAccount account=new BankAccount();
            BankAccount account01=new BankAccount("Un nombre", "Una Cuneta", 6000.0, 3.5); 
            SavingAccount account02=new SavingAccount();
            
        %>
       



        <h1>Cuenta de Banco Hola</h1>
        <%  
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
            
            out.println("<br>Cuenta 1: "+account.getNameCustomer()+" "+account.getBankAccount()+" "+account.getBalance()+" "+account.getRateInterest());
            out.println("<br>Cuenta 2: "+account01.getNameCustomer()+" "+account01.getBankAccount()+" "+account01.getBalance()+" "+account01.getRateInterest());
            out.println("<br>Cuenta 3: "+account02.getNameCustomer()+" "+account02.getBankAccount()+" "+account02.getBalance()+" "+account02.getRateInterest());
        %>
    </body>
</html>