
public class SavingsAccount extends BankAccount {
	
	double max;
	

	public SavingsAccount(String name, double balance,double max) {
		super(name, balance,2000);
		
		this.max=max;
		
	}

	
	public void withdraw(double amt) {
		if(amt<=balance&&amt<=max)
			balance -= amt;
	}
	
	
	
	
}
