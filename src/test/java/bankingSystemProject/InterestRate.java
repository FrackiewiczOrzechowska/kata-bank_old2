package bankingSystemProject;

import org.junit.Test;

import static org.junit.Assert.*;

public class InterestRate {

    @Test
    public void main() {

        //Given
        DepositAccount deposit1 = new DepositAccount ("Ewa Kowalska", "11112222333", 100);
        deposit1.balanceWithInterest();
        //When

        //Then

    }
}