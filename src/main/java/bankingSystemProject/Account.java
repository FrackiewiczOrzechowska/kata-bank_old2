package bankingSystemProject;

public class Account {
    private String firstName;
    private String lastName;
    private double balance;
    
    public Account (String firstName, String lastName, double balance) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.balance = balance;
    }
    
    public double getBalance() {
    	return balance;
    }
}
