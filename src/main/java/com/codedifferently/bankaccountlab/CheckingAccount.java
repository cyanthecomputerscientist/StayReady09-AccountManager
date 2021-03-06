package com.codedifferently.bankaccountlab;

public class CheckingAccount extends BankAccount {
   private Double checkingAccFees;
   private Double deposit;
   private Double withdraw;

    public CheckingAccount()
    {
        super();

        this.checkingAccFees = 0.01; 
    }
     public CheckingAccount(Integer accountNum,String name, Integer pin)
    {
        super(accountNum, name, pin);

        this.checkingAccFees = 0.03;
    }
    public Double getFees()
    {
        return checkingAccFees;
    }
    public void setFees(Double fees)
    {
        this.checkingAccFees = fees;
    }
    public void deposit(Double dep)
    {
        this.setBalance(this.getBalance() + dep);
    }
    public void withdraw(Double with)
    {
        this.setBalance(this.getBalance() - with);
    }
    public Double getdeposit()
    {
        return this.deposit;
    }
    public Double getWithdraw()
    {
        return this.withdraw;
    }
}