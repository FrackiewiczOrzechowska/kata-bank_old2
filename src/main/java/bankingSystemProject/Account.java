package bankingSystemProject;

public abstract class Account {
	
	
	String name;
	String pesel;
	double balance;
	double interestRate;
	String accountNumber;
	
	
	public Account (String name, String pesel, double initialDeposit) {
		this.name = name;
		this.pesel = pesel;
		balance = initialDeposit;
		
		//Setting account numer
		this.accountNumber = setAccountNumber();
	}
	private String setAccountNumber() {
		
		int randomNumberForAccount = (int)(Math.random() * Math.pow(10, 6));
		return "5000" + randomNumberForAccount ;
	}

	public void showInformation() {
	System.out.println(
			"Customer: " + name +
			"\nAccount number: " + accountNumber +
			"\nBalance: " + balance
			);
	
}
}