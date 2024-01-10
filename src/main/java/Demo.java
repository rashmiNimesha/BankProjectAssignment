import javax.xml.datatype.DatatypeConfigurationException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Demo {
    public static void main(String[] args) throws DataFormatException, DatatypeConfigurationException {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t==================================  XYZ BANK  =================================");
        System.out.println("\t\t\t\t\t\t===============================================================================");
        System.out.println("\t\t\t\t\t\t Option 1 : OPEN A NEW BANK ACCOUNT ");
        System.out.println("\t\t\t\t\t\t Option 2 : DEPOSIT CASH ");
        System.out.println("\t\t\t\t\t\t Option 3 : MONTHLY INTEREST FOR DEPOSIT");
        System.out.println("\t\t\t\t\t\t Option 4 : WITHDRAW CASH ");
        System.out.println("\t\t\t\t\t\t Option 5 : ACCOUNT DETAILS ");
        System.out.println("\t\t\t\t\t\t Option 6 : LOAN DETAILS ");
        System.out.println("\t\t\t\t\t\t Option 7 : LOAN CALCULATIONS ");
        System.out.println("\t\t\t\t\t\t Option 8 : EXIST\n");

        double bal = 0, loanCapital=0, monthly_amount = 0, monthly_interest = 0;
        String bank_account_type = null;
        int account_number = 0;
        String account_name = null, interestYear=null;

        BankAccount bankAccount = new BankAccount();
        LoanSection ll = new LoanSection(interestYear, loanCapital, monthly_amount, monthly_interest );

        while (true){
            System.out.print("\n\nEnter Option : ");
            int inputOption = sc.nextInt();

            switch (inputOption) {
                case 1:
                    bankAccount.openAccount();
                    break;
                case 2:
                    System.out.print("Enter Deposit Amount : " );
                    bankAccount.depositCash(sc.nextDouble());
                    break;
                case 3:
                    bankAccount.monthlyDepositInterestCal();
                    break;
                case 4:
                    System.out.print("Enter Withdraw Amount : " );
                    bankAccount.withdrawCash( sc.nextDouble());
                    break;
                case 5:
                    bankAccount.displayAccountDetails();
                    break;
                case 6:
                    ll.loanDetails();
                    break;
                case 7:
                    System.out.print("Enter capital loan amount : and Enter interest option  :" );
                    ll.loanCalculate(sc.nextDouble(), sc.nextLine());
                    break;
                case 8:
                    System.exit(0);


            }

        }
        



    }
    
}
