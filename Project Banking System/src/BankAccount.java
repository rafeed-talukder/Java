import java.io.Serializable;
import java.util.Random;

public class BankAccount implements Serializable{
	String name,id;
	double balance;
	Random rand=new Random();
	double min;
	public BankAccount(String name, double balance,double min) {
		super();
		this.name = name;
		this.id =rand.nextInt(89999)+"";
		this.balance = balance;
		this.min=min;
	}
	
	
	public void deposit(double amt) {
		balance += amt;
	}
	
	public void withdraw(double amt) {
		if(amt<=balance)
			balance -= amt;
	}


	@Override
	public String toString() {
		return "BankAccount - [name=" + name + ", id=" + id + ", balance=" + balance + ", " + this.getClass()+" ] ";
	}

	

}
