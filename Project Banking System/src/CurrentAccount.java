
public class CurrentAccount extends BankAccount {

	
	private static final long serialVersionUID = 1L;
	String tradeLicenseNumber;


	public CurrentAccount(String name, double balance, String tradeLicenseNumber) {
		
		super(name, balance,5000);
		this.tradeLicenseNumber= tradeLicenseNumber;
		
	}
	
	
}
