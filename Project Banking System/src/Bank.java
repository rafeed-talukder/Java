import java.io.Serializable;
import java.util.ArrayList;

public class Bank implements Serializable{
	private BankAccount[] accounts = new BankAccount[10];
	
	
	
	
	public void addAccount(String name, double balance, String tradeLic) {
		CurrentAccount ba = new CurrentAccount(name,balance,tradeLic);
		addAccount(ba);
	}
	
	public void addAccount(String name, double balance, double max) {
		SavingsAccount ba = new SavingsAccount(name, balance, max);
		addAccount(ba);
	}
	
	

	private void addAccount(BankAccount ba) {
		int index = getLastIndex();
		if(index>=0)
			accounts[index] = ba;
		
		
	}
	
	public int getLastIndex() {
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null)
				return i;
		}
		
		return -1;
	}
	
	public void deposit(String id, double amt) {
		BankAccount ba = findAccount(id);
		if(ba != null)
			ba.deposit(amt);
	}
	
	public void withdraw(String id, double amt) {
		BankAccount ba = findAccount(id);
		if(ba != null)
			ba.withdraw(amt);
	}
	
	public BankAccount findAccount(String id) {
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null)
				return null;
			if(accounts[i].id.equals(id))
				return accounts[i];
		}
		
		return null;
	}


	public ArrayList<String> display() {
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null)
				break;
			
			list.add("\n"+accounts[i].toString());
		}
		return list;
	}
}
