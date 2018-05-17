package bankingSystemProject;

public class DepositAccount extends Account{
	
	
	private int depositBalance;
	private int depositSafetyPIN;
	double interestRate = 4;
	
	
	
	public DepositAccount(String name, String pesel, double initialDeposit) {
		super(name, pesel, initialDeposit);
		accountNumber = "2" + accountNumber;
		setDepositSafetyPIN();
	}

	public  void balanceWithInterest () {
		double interestToAdd = balance * interestRate / 100;
		System.out.println("Accrued interest equals " + interestToAdd);
		balance = balance + interestToAdd;
		printBalance();
	}
	
	private void setDepositSafetyPIN() {
		depositSafetyPIN = (int)(Math.random()*Math.pow(10, 4));
	}

	public void showInformation() {
		System.out.println("Deposit account: ");
		super.showInformation();
		System.out.println("PIN: "+ depositSafetyPIN);
		System.out.println("Interest rate equals: "+ interestRate);
	}
	
	


	
	
	
	
	
}
