package bankingSystemProject;

public class CheckingAccount extends Account{
	
	int debitCardNumber;
	int debitCardPIN;

	public CheckingAccount(String name, String pesel, double initialDeposit) {
		super(name);
		System.out.println("Checking account: ");
	}
	
	
	
}
