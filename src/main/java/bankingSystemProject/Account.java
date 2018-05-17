package bankingSystemProject;

public abstract class Account {
	
	
	private String name;
	private String pesel;
	protected double balance;
	protected String accountNumber;
	double interestRate;
	double amount;
	

		
		
	
	
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

	public abstract void balanceWithInterest ();

	public void deposit(double amount){

		balance = balance + amount;
		System.out.println("Depositing " + amount + " zloty");
		printBalance();
	}

	public void withdraw(double amount)  {
		balance = balance - amount;
		System.out.println("Withdrawing " + amount + " zloty");
        printBalance();
	}

	public void transfer(String transferDestination, double amount){
        balance = balance - amount;
        System.out.println("Transferring " + amount + "zloty to " + transferDestination);
        printBalance();
	}

	public void printBalance() {
		System.out.println("Your balance equals " + amount + " zloty");
	}
	public void showInformation() {
	System.out.println(
			"Customer: " + name +
			"\nAccount number: " + accountNumber +
			"\nBalance: " + balance  
			
			);
	
}
}