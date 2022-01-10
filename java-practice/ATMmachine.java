
import java.util.Scanner;

public class ATMmachine {
    public static void main(String[]args) {

        int balance = 20000,withdraw,deposite,num;
        Scanner sc = new Scanner (System.in);
        while (true)
        {
            System.out.println("Welcome To The ATM");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposite");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            num = sc.nextInt();
            switch(num)
            {
            case 1:
                System.out.println("Enter Amout To Withdraw :");
                withdraw = sc.nextInt();
                if(balance>=withdraw)
                {
                    balance = balance-withdraw;
                    System.out.println("Balance Amount is " +balance);
                    System.out.println("Plese collect money");

                }
                else
                {
                    System.out.println("You dont have enough money for withdraw :");
                }
                System.out.println(" ");
                break;

                case 2:
                System.out.println("Enter Amount to deposite :");
                deposite = sc.nextInt();
                balance = balance+deposite;
                System.out.println("Balance amount is " +balance);
                System.out.println("Money deposited succesfully");
                System.out.println("");
                break;

                case 3:
                System.out.println("Balance of the Account is "+balance);
                System.out.println("");
                break;

                case 4:
                System.exit(0);
                System.out.println("  ");


            }



        }

        
    }
}
