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
        Scanner t = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        Scanner z = new Scanner(System.in);
        Scanner n = new Scanner(System.in);

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
                        "\nIf you would like to close checking account press 7"+
                        "\nIf you would like to transfer money from one account to another press 8"
        );

        if (accountStatus == false)System.out.println("Choose the operation you would like to perform"+
                "\nIf you would like to open a deposit account press 4"+
                "\nIf you would like to open checking account press 5"

        );



        int chosenActionNumber;
        chosenActionNumber = y.nextInt();
        int accountID = -1;
        if(chosenActionNumber == 1 || chosenActionNumber == 2|| chosenActionNumber == 3 || chosenActionNumber == 6 || chosenActionNumber == 7 || chosenActionNumber == 8){
            System.out.println(" Type in your account ID");
            accountID = y.nextInt();
        }



        switch(chosenActionNumber){
            case 1:
                accounts.get(accountID).printBalance();
                break;
            case  2:
                System.out.println(" Type in the amount you would like to withdraw");
                int amountToWithdraw;
                amountToWithdraw = y.nextInt();
                accounts.get(accountID).withdraw(amountToWithdraw);
                break;

            case 3:
                System.out.println(" Type in the amount you would like to deposit");
                int amountToDeposit;
                amountToDeposit = y.nextInt();
                accounts.get(accountID).deposit(amountToDeposit);
                break;
            case 4:
                System.out.println(" Type in your name");
                String nameNewCustomer1= y.nextLine();
                y.nextLine();
                System.out.println(" Type in your PESEL");
                String peselNewCustomer1 = t.nextLine();
                System.out.println(" Type in the amount you would like to deposit");
                double initialDepositNewCustomer1= n.nextDouble();
                accounts.add(new DepositAccount(nameNewCustomer1, peselNewCustomer1, initialDepositNewCustomer1));
                System.out.println(" Do you have a checking account? If yes, type in the ID");
                int accountID1;
                accountID1 = y.nextInt();
                accounts.get(accountID1).withdraw(initialDepositNewCustomer1);
                break;

            case 5:
                System.out.print(" Type in your name");
                String nameNewCustomer2 = y.nextLine();
                y.nextLine();
                System.out.print(" Type in your PESEL");
                String peselNewCustomer2 = m.nextLine();
                System.out.print(" Type in the amount you would like to deposit");
                double initialDepositNewCustomer2 = z.nextDouble();
                accounts.add(new CheckingAccount(nameNewCustomer2, peselNewCustomer2, initialDepositNewCustomer2));
                break;
            case 6:
                System.out.println("Type in where the savings should be transferred");
                String destinationAfterDeletion1;
                destinationAfterDeletion1 = y.nextLine();
                accounts.get(accountID).transfer(destinationAfterDeletion1,accounts.get(accountID).getBalance());
                ((LinkedList<Account>) accounts).remove(accountID);
                System.out.println(" Deposit account has been terminated");


            case 7:
                System.out.println("Type in where the savings should be transferred");
                String destinationAfterDeletion2;
                destinationAfterDeletion2 = y.nextLine();
                accounts.get(accountID).transfer(destinationAfterDeletion2,accounts.get(accountID).getBalance());
                ((LinkedList<Account>) accounts).remove(accountID);
                System.out.println(" Checking account has been terminated");

            case 8:
                System.out.println("type in the amount");
                double amountToTransfer;
                amountToTransfer = y.nextDouble();
                accounts.get(accountID).withdraw(amountToTransfer);
                System.out.println(" Type in your ID of the account where the money should be transferred");
                int accountID2;
                accountID2 = y.nextInt();
                accounts.get(accountID2).deposit(amountToTransfer);
                System.out.println("Amount has been transferred");


        }



      //userInput1.searchAccount();

    }




}
