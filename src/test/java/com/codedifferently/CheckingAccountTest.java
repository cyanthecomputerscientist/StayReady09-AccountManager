package com.codedifferently;

import com.codedifferently.bankaccountlab.CheckingAccount;

import org.junit.Assert;
import org.junit.Test;

public class CheckingAccountTest {
    
    @Test
    public void getFeesTest()
    {
        //Given
        CheckingAccount checkingAccount = new CheckingAccount();
        //When 
        Double expected = 0.01;
        Double actual = checkingAccount.getFees();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setFeesTest()
    {
        //Given 
        CheckingAccount checkingAccount = new CheckingAccount();
        //When
        checkingAccount.setFees(0.03);
        Double expected = 0.03;
        Double actual = checkingAccount.getFees();
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void depositTest()
    {
        //Given
        CheckingAccount checkingAccount = new CheckingAccount();
        Double deposit = 500.00;
        //When 
        checkingAccount.deposit(deposit);
        Double expected = deposit;
        Double actual = checkingAccount.getBalance();
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getWithdrawlTest()
    {
        //Given
        CheckingAccount checkingAccount = new CheckingAccount();
        Double balance = 5000.00;
        Double withdraw = 350.00;
        checkingAccount.setBalance(balance);
        //Then 
        checkingAccount.withdraw(withdraw);
        Double expected = 4650.00;
        Double actual = checkingAccount.getBalance();
        //When 
        Assert.assertEquals(expected, actual);
    }
    
}