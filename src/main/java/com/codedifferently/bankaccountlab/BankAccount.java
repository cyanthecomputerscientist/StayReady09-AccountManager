package com.codedifferently.bankaccountlab;

public abstract class BankAccount {

    private Integer accountNumber; 
    private Double fees; 
    private String name;
    private Integer pin;
    private Double balance; 

    BankAccount()
    {
        this.accountNumber = 1;
        this.fees = 0.00;
        this.name = "Name";
        this.pin = 0000;
        this.balance = 0.00;
        
    }
    BankAccount(Integer accountNum, String name, Integer pin)
    {
        this.accountNumber = accountNum; 
        this.name = name;
        this.pin = pin;
    }

    public Integer getAccountNumber()
    {
        return this.accountNumber;
    }
    public Double getFees()
    {
        return this.fees;
    }
    public String getName()
    {
        return this.name;
    }
    public Integer getPin()
    {
        return this.pin;
    }
    public Double getBalance()
    {
        return this.balance; 
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public void setPin(int p)
    {
        this.pin = p;
    }
    public void setBalance(Double b)
    {
       this.balance = b; 
    }
    public void setFees(Double f)
    {
        this.fees = f;
    }

}
