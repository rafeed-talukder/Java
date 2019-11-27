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
public class BankAccount_Class {
    
    String name;
    int id;
    double balance;
    
    BankAccount_Class(String fullname,int registration, double ammount)
    {
        name=fullname;
        id=registration;
        balance=ammount;
    }
    
    void deposit (double ammount)
    {
        if(ammount>0)
        {
            balance=balance+ammount;
            System.out.println("Successfully inserted "+ammount+ " TK");
            
        }
        else
        {
           System.out.println("Faild to inserted "+ammount+ " TK"); 
        }
    }
    
    void withdraw(double ammount)
    {
        if(balance-ammount>=0) {
			
                balance=balance-ammount;
		System.out.println("Successfully withdrawn "+ammount+" TK ");	
		}
		else
                     {
                         System.out.println("Withdraw failed :( :( :( ");
                     }

    }
    
    public double getBalance()      
    {
//        double ammount;
	return balance;
    }
    
    void display()
    {
	System.out.println("Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Balance:"+balance);
    }
}
