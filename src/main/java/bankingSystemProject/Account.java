package bankingSystemProject;

public abstract class Account {
	
	
	String name;
	String pesel;
	double balance;
	double interestRate;
	String accountNumber;
	
	public Account (String name) {
		System.out.println("Customer " + name);
		System.out.println("New account " );
	}
	

}
