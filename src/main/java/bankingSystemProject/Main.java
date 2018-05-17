package bankingSystemProject;


import java.util.List;

public class Main {
	
	public static void main(String[] args) {

		String file = "C:\\Users\\Aleksandra\\Desktop\\bankSystemData.csv";

		/*
	CheckingAccount checking1  = new CheckingAccount("Ewa Kowalska", "11112222333", 3000);
	DepositAccount deposit1 = new DepositAccount ("Adam Nowak", "11114444777", 5000);

	deposit1.showInformation();
	deposit1.balanceWithInterest();





	*/

		List<String[]> newAccountOwners = bankingSystemProject.CSV.read(file);
		for(String[] accountOwner : newAccountOwners){
            

            String name = accountOwner[0];
            String pesel = accountOwner[1];
            String accountType = accountOwner[2];
            double initialDeposit = Double.parseDouble(accountOwner[3]);
            System.out.println(name + " " + pesel + " " + accountType + " " + initialDeposit);
        }

	}
	
}
