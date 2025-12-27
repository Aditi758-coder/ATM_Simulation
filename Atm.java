
import java.util.Scanner;
public class Atm{
    static double balance=1000;// initial balance
    static Scanner sc= new Scanner (System.in);

     //Method to check balance
     static void checkbalance(){
        System.out.println("your current balance is :" +balance);
     }
     //method to check deposit amount
     static void deposit(){
        System.out.println("Enter amount to deposit:");
        double amount = sc.nextDouble();
        if (amount>0){
            balance+=amount;
            System.out.println("rupee"+balance+"deposited successfully");
        
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }
        //Method to Withdraw money 
        static void withdraw(){
            System.out.println("enter amount to withdraw");
            double amount = sc.nextDouble();

            if (amount<=0){
                System.out.println("Invalid withdraw:rupee");
                    
                }else if(amount>balance){
                        System.out.println("Insufficient balance");
                
          }else{
         balance-= amount;
          System.out.println("rupee"+amount+"Withdrawal Successfully");
          }     
            }
            public static void main(String[]args){
                while(true){                   
                    System.out.println("\n---ATM menu---");
                    System.out.println("1. check balance");
                    System.out.println("2 Deposit");
                    System.out.println("3. Withdrawal");
                    System.out.println("4.Exit");
                    System.out.println("Choose an option (1-4): ");
                     
                    int choice= sc.nextInt ();
                    if(choice==1){
                        checkbalance();
                    }else if (choice==2){
                        deposit();
                    }else if (choice==3){
                        withdraw();
                    }else if (choice==4){
                       System.out.println("Thank you for using my ATM");
                       break;
                    }else{
                        System.out.println("Invalid choice. try again");
                    }
            
        }

    }
}