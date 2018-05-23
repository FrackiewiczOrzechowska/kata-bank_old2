package bankingSystemProject;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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

        List<String[]> newAccountOwners = CSV.read(file);
        for (String[] accountOwner : newAccountOwners) {


            String name = accountOwner[0];
            String pesel = accountOwner[1];
            String accountType = accountOwner[2];
            double initialDeposit = Double.parseDouble(accountOwner[3]);

            if (accountType.equals("Checking")) {

                accounts.add(new CheckingAccount(name, pesel, initialDeposit));

            } else if (accountType.equals("Deposit")) {

                accounts.add(new DepositAccount(name, pesel, initialDeposit));
            } else {
                System.out.println("Error reading account type");
            }
        }


        /*
        for(Account acc : accounts){
		    System.out.println("\n************************");
		    acc.showInformation();
        }

       // */
        //accounts.get(1).showInformation();

Scanner y = new Scanner(System.in);

        String name1, accountType1, operationType;
      UserInput userInput1 = new UserInput();
        System.out.println("Insert name and account type");
        name1 = y.nextLine();
        accountType1 = y.nextLine();
        boolean accountStatus;

        accountStatus = UserInput.searchAccount(name1, accountType1, file);

        if (accountStatus == true)System.out.println("Choose the operation you would like to perform"+
                        "\nIf you would like to check balance, press 1"+
                        "\nIf you would like to withdraw money, press 2"+
                        "\nIf you would like to deposit money, press 3"+
                        "\nIf you would like to open a deposit account press 4"+
                        "\nIf you would like to open checking account press 5"+
                        "\nIf you would like to close deposit account press 6"+
                        "\nIf you would like to close checking account press 7"
        );

        if (accountStatus == false)System.out.println("Choose the operation you would like to perform"+
                "\nIf you would like to open a deposit account press 4"+
                "\nIf you would like to open checking account press 5"

        );



        int chosenActionNumber;
        chosenActionNumber = y.nextInt();
        switch(chosenActionNumber){
            case 1:
        }

      //userInput1.searchAccount();

    }







}
