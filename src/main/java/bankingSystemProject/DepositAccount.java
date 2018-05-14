package bankingSystemProject;

public class DepositAccount extends Account{
	
	
	int depositBalance;
	int depositSafetyPIN;
	double InterestRate = 4;
	
	
	
	public DepositAccount(String name, String pesel, double initialDeposit) {
		super(name, pesel, initialDeposit);
		accountNumber = "2" + accountNumber;
		setDepositSafetyPIN();
	}
	
	private void setDepositSafetyPIN() {
		depositSafetyPIN = (int)(Math.random()*Math.pow(10, 4));
	}

	public void showInformation() {
		System.out.println("Deposit account: ");
		super.showInformation();
		System.out.println("PIN: "+ depositSafetyPIN);
		System.out.println("Interest rate equals: "+ InterestRate);
	}
	
	


	
	
	
	
	
}
