package com.codedifferently.bankaccountlab;

public class BusinessAccount extends SavingsAccount{

    private Integer taxId;
    private String company; 
    //Fuckers in school telling me, always in the barber shop
    BusinessAccount()
    {
        super();
        taxId = 1;
        company = "random company";
    }
    BusinessAccount(Integer accountNum, String name, Integer pin, Integer taxId, String companyName)
    {
        super(accountNum, name, pin);
        this.setRate(1.00);
        this.taxId = taxId;
        this.company = companyName;
        
    }
    public Integer getTaxId()
    {
        return this.taxId;
    }
    public void setTaxId(Integer tI)
    {
        this.taxId = tI;
    }
    public String getCompany()
    {
        return this.company;
    }
    public void setCompany(String cn)
    {
        this.company = cn; 
    }
}