package bankingSystemProject;


import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {

	    List<Account> accounts = new LinkedList<Account>();

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

            if (accountType.equals("Checking")){

                accounts.add(new CheckingAccount(name, pesel, initialDeposit));

            }
            else if (accountType.equals("Deposit")){

                accounts.add(new DepositAccount(name, pesel, initialDeposit));
            }

            else {
                System.out.println("Error reading account type");
            }
        }


        for(Account acc : accounts){
		    System.out.println("\n************************");
		    acc.showInformation();
        }
        //accounts.get(1).showInformation();

	}
	
}
