package com.codedifferently.bankaccountlab;

public class SavingsAccount extends CheckingAccount
{

    private Double rate;
    
    SavingsAccount()
    {
        super();
        rate = 0.0; 
    }
    SavingsAccount(Integer accountNum, String name, Integer pin)
    {
        super(accountNum, name, pin);
        this.rate = 0.01;
    }
    public void setRate(Double rate)
    {
        this.rate= rate;
    }
    public Double getRate()
    {
        return this.rate;
    }
}