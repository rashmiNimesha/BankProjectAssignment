import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    private  double balance;                  // bank user details
    private  String bank_account_type;
    private  int account_number;
    private  String account_name;

    public BankAccount(double balance, String bank_account_type, int account_number, String account_name) {
        this.balance = balance;
        this.bank_account_type = bank_account_type;
        this.account_number = account_number;
        this.account_name = account_name;

    }
    public BankAccount(){

}
    public double getBalance() {
        return balance;
    }
    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }
    public String getBank_account_type() {
        return bank_account_type;
    }

    public void setBank_account_type(String bank_account_type) {
        this.bank_account_type = bank_account_type;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

double newBal =0;
    public void openAccount() {                 //First open the bank account
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t==================================  XYZ BANK  =================================");
        System.out.println("\t\t\t\t\t\t========================= OPEN NEW BANK ACCOUNT ===============================");
        System.out.println("\t\t\t\t\t\t===============================================================================");
        System.out.print("\nEnter your full name      : ");        // Enter bank user details
        account_name = sc.nextLine();

        System.out.print("Enter account type        : ");
        bank_account_type = sc.nextLine();
        try {
            System.out.print("Enter initial balance     : ");
            balance = sc.nextDouble();
            newBal += getBalance() ;
            balance = newBal;
        } catch (InputMismatchException mismatch) {
            System.out.println("Input amount!");
        }
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        account_number = number;
        System.out.print("Account Number            : " + getAccount_number());

    }


    public void displayAccountDetails() {               // display bank user details
        System.out.println("\n\n\t\t\t\t\t\t==================================  XYZ BANK  =================================");
        System.out.println("\t\t\t\t\t\t========================= DISPLAY ACCOUNT DETAILS ============================");
        System.out.println("\t\t\t\t\t\t===============================================================================");

        System.out.println("Account Number      : " + getAccount_number() );
        System.out.println("Account Type        : " + getBank_account_type());
        System.out.println("Account Holder Name : " + getAccount_name());
        System.out.printf("Account Balance      : %.2f  ", getBalance());

    }

    public double depositCash(double amount) {          // Deposit amount
        double newBal = balance +amount;
        System.out.println("Amount : "+ amount +" deposited successfully! ");
        return setBalance(newBal);
    }

    public double monthlyDepositInterestCal(){         // At the end of the month interest calculate for the deposits
        final double deposit_interest_perAnnum = 0.03;
        double interestMonthly = balance* deposit_interest_perAnnum* 0.083;

        double balance = getBalance() + interestMonthly;
        System.out.println("Monthly total amount : " + balance);
        return setBalance(balance);
    }

    public  void withdrawCash(double amount) {          // Withdraw cash
        try {
                double newBal = getBalance() - amount;
                if(newBal<0){
                    System.out.println("Withdraw not permitted");
                    setBalance(newBal);

                }else{
                    System.out.println("Amount : "+ amount+ " \nwithdrawn successfully!");
                    setBalance(newBal);
                }

        } catch (InputMismatchException ignore) {
            System.out.println("Enter Valid Amount!");
        }


    }


}
