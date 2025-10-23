/*
*Libro: Java 2 Curso de programación 4a edición
*Capitulo 03: Introducción a la Programacion Orientada a Objetos
*Programa 01: Clase Cuenta
*/
package bank.view.panel;

import java.awt.GridLayout;

import bank.model.BankAccountModel;
import bank.model.SavingAccountModel;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class BankMainPanel extends JPanel{

    private BankAccountModel account=new BankAccountModel();
    private BankAccountModel account01=new BankAccountModel("Nombre 02", "Una Cuenta", 6000.0, 3.5);
    private SavingAccountModel account02=new SavingAccountModel();

    private JLabel jLblData;
        
    public BankMainPanel(){
        setLayout(new GridLayout(4, 1));
        account.setNameCustomer("Nombre 01");
        account.setBankAccount("Una Cuenta");
        account.setRateInterest(2.5);

        account.setBalance(12000);
        account.withdrawal(3000);

        account02.setNameCustomer("Nombre 03");
        account02.setBankAccount("Una Cuenta");
        account02.setRateInterest(2.5);
        account02.setBalance(12000);
        account02.withdrawal(3000);
        
        jLblData=new JLabel(""+account.getNameCustomer()+", "+account.getBankAccount()+", "+account.getBalance()+", "+account.getRateInterest());
        
        add(jLblData);
        
        jLblData=new JLabel(""+account01.getNameCustomer()+", "+account01.getBankAccount()+", "+account01.getBalance()+", "+account01.getRateInterest());
   
        add(jLblData);
       
        jLblData=new JLabel(""+account02.getNameCustomer()+", "+account02.getBankAccount()+", "+account02.getBalance()+", "+account02.getRateInterest());
   
        add(jLblData);  
    }
}