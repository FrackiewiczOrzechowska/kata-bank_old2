package bankingSystemProject;

public class DepositAccount extends Account{
	
	public DepositAccount(String name, String pesel, double initialDeposit) {
		super(name);
		System.out.println("Deposit account: ");
	}

}
