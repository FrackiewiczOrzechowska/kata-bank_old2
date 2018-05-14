package bankingSystemProject;

public class CheckingAccount extends Account{
	
	int debitCardNumber;
	int debitCardPIN;
	double InterestRate = 2.5;

	public CheckingAccount(String name, String pesel, double initialDeposit) {
		super(name, pesel, initialDeposit);
		accountNumber = "1" + accountNumber;
		setDebitCardFeatures();
		
	}
	private void setDebitCardFeatures() {
		debitCardNumber = (int) (Math.random()*Math.pow(10, 12));
		debitCardPIN = (int) (Math.random()*Math.pow(10, 4));
	}
	
	
public void showInformation() {
	System.out.println("Checking account: ");
	super.showInformation();
	System.out.println("Debit Card number: "+ debitCardNumber);
	System.out.println("Debit Card PIN: "+ debitCardPIN);
	System.out.println("Interest rate equals: "+ InterestRate);
}

	
}
