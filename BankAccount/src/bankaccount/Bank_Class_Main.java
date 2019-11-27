/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author HP
 */
public class Bank_Class_Main {


    public static void main (String[] arg)
    {
    

        BankAccount_Class object = new BankAccount_Class("Rafeed",50, 30000);
        
        object.display();
        
        object.deposit(3000);
		
        System.out.println("Balance is "+object.getBalance());
        
        object.withdraw(1234665);
		
	System.out.println("Balance is "+object.getBalance());
        
    }




}
