package bankingSystemProject;

public class CheckingAccount extends Account{
	
	 private int debitCardNumber;
	 private int debitCardPIN;
	double interestRate = 2.5;

	public CheckingAccount(String name, String pesel, double initialDeposit) {
		super(name, pesel, initialDeposit);
		accountNumber = "1" + accountNumber;
		setDebitCardFeatures();
		
	}
	public  void balanceWithInterest () {
		double interestToAdd = balance * interestRate / 100;
		System.out.println("Accrued interest equals " + interestToAdd);
		balance = balance + interestToAdd;
		printBalance();
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
	System.out.println("Interest rate equals: "+ interestRate);
}

	
}
