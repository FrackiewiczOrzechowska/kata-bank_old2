package bankingSystemProject;



public class Main {
	
	public static void main(String[] args) {
	
	CheckingAccount checking1  = new CheckingAccount("Ewa Kowalska", "11112222333", 3000);
	DepositAccount deposit1 = new DepositAccount ("Adam Nowak", "11114444777", 5000);
	deposit1.showInformation();
	checking1.showInformation();


	}
	
}
