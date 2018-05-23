package bankingSystemProject;

import org.junit.Test;

public class OpeningDeposit {

    @Test
    public void main() {

        //Given
        CheckingAccount checking1  = new CheckingAccount("Ewa Kowalska", "11112222333", 100);
        //When
        DepositAccount deposit1 = new DepositAccount ("Ewa Kowalska", "11112222333", 90);
        //Then
        checking1.printBalance();
    }
}