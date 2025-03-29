import java.util.*;

public class TestBankAccount 
{
   public static void main(String[] args)
   {
      Scanner con = new Scanner(System.in);
      /*
      System.out.println("Enter account name:");
      String account_name = con.nextLine();
      
      System.out.println("Enter initial deposit amount:");
      double deposit = con.nextDouble();
      
      BankAccount savings = new BankAccount(account_name, deposit);
      savings.inquire();
      
      savings.deposit(5000);
      savings.inquire();
      savings.withdraw(4000);
      savings.inquire();
      */
      
      System.out.println("Enter account name:");
      String account_name = con.nextLine();
      
      System.out.println("Enter initial deposit amount:");
      double deposit = con.nextDouble();
      
      BankAccount savings = new BankAccount(account_name, deposit);
      int choice;
      
      do 
      {
         System.out.println("- MENU -");
         System.out.println("Account No.: " + savings.getAccountNo());
         System.out.println("Account Name: " + savings.getAccountName());         
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");         
         System.out.println("3. Inquire");         
         System.out.println("0. Exit\n");         
         
         System.out.println("Enter choice:");
         choice = con.nextInt();
         
         switch(choice)
         {
            case 1:
                  System.out.println();
                  System.out.println("Enter amount to be deposited:");
                  savings.deposit(con.nextDouble());
                  System.out.printf("Balance: %.2f\n", savings.getBalance());
                  System.out.println();
                  break;
                  
            case 2:
                  System.out.println();
                  System.out.printf("Balance: %.2f\n", savings.getBalance());                  
                  System.out.println("Enter amount to be withdrawn:");
                  savings.withdraw(con.nextDouble());
                  System.out.println();
                  break;
                  
            case 3:
                  System.out.println();
                  savings.inquire();
                  System.out.println();
                  break;
                  
                  
            case 0:
                  break;
                  
            default:
                  System.out.println();
                  System.out.println("Invalid choice selected. Please try again.");                  
         }
         
         
         
      }while(choice != 0);
      System.out.println("Program terminated...");
      
      
   }

}