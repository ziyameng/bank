package org.lbg.c4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BankAccountTest {
    @Test
    public void onConstruction_verify_object_initialised_correctly(){
        //arrange
        double expectedResult = 34.75;
        BankAccount cut = new BankAccount(expectedResult);

        //act
        double actualResult = cut.getBalance();

        //assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void putting_money(){
        //arrange
        double openingBalance = 34.75;
        BankAccount cut = new BankAccount(openingBalance);
        double expectedResult =39.75;

        //act
        cut.credit((5));
        double actualResult = cut.getBalance();

        //assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void withdraw_money_beyond_balance(){
        //arrange
        double openingBalance = 30;
        BankAccount cut = new BankAccount(openingBalance);
        double expectedResult = 30;

        //act
        cut.debit((40));
        double actualResult = cut.getBalance();

        //assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void withdraw_money_within_balance(){
        //arrange
        double openingBalance = 30;
        BankAccount cut = new BankAccount(openingBalance);
        double expectedResult = 25;

        //act
        cut.debit((5));
        double actualResult = cut.getBalance();

        //assert
        assertEquals(expectedResult, actualResult);
    }

}
