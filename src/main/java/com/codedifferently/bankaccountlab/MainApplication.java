package com.codedifferently.bankaccountlab;
import java.lang.System;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    //static ArrayList<BankAccount> accounts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<BankAccount>accounts = new ArrayList<>();
    

    public static Boolean inputCheck(String input)
    {
      char[] ch = input.toCharArray();
      for(int i = 0; i<ch.length-1; i++)
      {
          Character character = ch[i];
          if(!(Character.isDigit(character)))
          {
              return false;
          }
      }
      return true;
    }

    public static BankAccount find (int accNum, int pin)
    {
      System.out.println(accounts.size());
      for(int i= 0; i<accounts.size(); i++)
      {
        if(accounts.get(i).getAccountNumber() == accNum  && accounts.get(i).getPin() == pin)
        {
          return accounts.get(i);
        }
      }
      return null;
    }
  
  public static void main(String[] args) 
  {
    CheckingAccount  account1 = new CheckingAccount(012345, "Janine", 0567);
    CheckingAccount account2 = new CheckingAccount( 12345, "Charles", 0234);
    SavingsAccount sAccount1 = new SavingsAccount(67891, "Channel", 0002);
    BusinessAccount bAccount = new BusinessAccount(57834, "Shalissa", 7634, 18888, "Chivon inc.");
    accounts.add(account1);
    accounts.add(account2);
    accounts.add(sAccount1);
    accounts.add(bAccount);
    boolean isValid;
    String accNum;
    String pin;
    do {
       System.out.println("welcome to the Code Differently ATM");
      System.out.println("Please enter your account number");
       accNum = sc.nextLine();
       isValid= inputCheck(accNum);
     } 
    while (isValid == false);

    do {
      System.out.println("please enter your pin");
       pin = sc.nextLine();
      isValid = inputCheck(pin);
    } while (isValid == false);

    Integer accountNumber = Integer.parseInt(accNum);
    Integer pinNumber = Integer.parseInt(pin);
    BankAccount validAccount = find(accountNumber, pinNumber);

     if(validAccount == null)
     {
       System.out.println("incorrect pin or account number");
     }
     else
     {
       System.out.println("select 1 for deposit \n select 2 for withdraw\n select 3 to remove account");
       int menu = sc.nextInt();
       switch(menu)
       {
         case 1:
         System.out.println("select amount to deposit");
         int dep = sc.nextInt();
         validAccount.setBalance(validAccount.getBalance() + dep);
         case 2:
         System.out.println("select amount to withdraw");
         int with = sc.nextInt();
         validAccount.setBalance(validAccount.getBalance() - with);
        case 3: 
        System.out.println("your account will be deleted and this cannot be changed");
        accounts.remove(validAccount);


       }
     }
    //Check if input is all numbers 
    // then check if input is associated with real account
    //Menu 
    //exit

  }
}