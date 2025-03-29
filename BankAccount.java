/*
   class: BankAccount
   
   account_name : String
   account_no   : String 
      2023-105 (random 3 digit)
   balance      : double
   
   1 default constructor
      account_name = "";
      account_no
      balance = 0
         
   1 non-default constructor
      account_name
      balance
      
      
   deposit
   withdraw
   inquire  
      
*/

import java.util.*;

public class BankAccount 
{
   private String account_name;
   private String account_no;
   private double balance;
   
   public BankAccount()
   {
      account_name = "";
      account_no = generateAccountNo();
      balance = 0;
   } 
   
   
   public BankAccount(String ac_name, double deposit)
   {
      account_name = ac_name;
      account_no = generateAccountNo();
      if(deposit >= 2000)
      {
         balance = deposit;            
      }
      else 
      {
         System.out.println("Invalid deposit amount. Must not be lesser than 2,000.00.");
         balance = 0;
      }
      
   }
   
   public void setAccountName(String ac_name)
   {
      account_name = ac_name;
   }
   
   public String getAccountName(){  return account_name; }
   public String getAccountNo(){    return account_no;   }
   public double getBalance(){      return balance;      }
   
   
   public void deposit(double amount)
   {
      if(amount <= 0)
      {
         System.out.println("Invalid deposit amount. Must be greater than 1.00. Please try again.");
      }
      else if(amount > 10000)
      {
         System.out.println("Invalid deposit amount. Must not be greater than 10,000.00 per transaction. Please try again.");      
      }
      else 
      {
         balance = balance + amount;
      }      
   }
   
   public void withdraw(double amount)
   {
      if(amount <= 0)
      {
         System.out.println("Invalid amount to be withdrawn. Must be greater than 1.00. Please try again.");      
      }
      else if(amount > balance)
      {
         System.out.println("Invalid amount to be withdrawn. Must not be greater than " + balance + ". Please try again.");      
      }
      else 
      {
         balance = balance - amount;      
      }   
   }
   
   public void inquire()
   {
      System.out.println("Account No.: " + account_no);
      System.out.println("Account Name: " + account_name);
      System.out.printf("Balance: %.2f\n", balance);
   }
 
 
 
   //helper methods/functions
   public String generateAccountNo()
   {
      //2023-875
      String year = Calendar.getInstance().get(Calendar.YEAR) + "";
      int number = new Random().nextInt(1000);
      if(number < 100)
         number = number + 100;
      return year + "-" + number;
   }
 
}

