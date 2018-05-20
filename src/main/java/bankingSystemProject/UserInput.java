package bankingSystemProject;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class UserInput {

    private static Scanner x;

    String accountType;
    //Calling the method for searching of the account, getting the data


    public static void searchAccount(String name, String accountType, String file) {

        boolean found = false;
        try {
            String customer = "";
            String ID = "";
            String type = "";
            String balanceOfTheAccount = "";


            x = new Scanner(new File(file));
            x.useDelimiter("[,\n]");

            while (x.hasNext() && !found)

            {
                customer = x.next();
                ID = x.next();
                type = x.next();
                balanceOfTheAccount = x.next();

                if (customer.equals(name) && type.equals(accountType)){
                    found = true;
                }
            }
            if (found ){
                JOptionPane.showMessageDialog(null,"Balance equals "+ balanceOfTheAccount);
            }
            else  {
                JOptionPane.showMessageDialog(null,"Account not found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
        }


    }
}
