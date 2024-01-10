import java.util.Scanner;

public class LoanSection {
    private String interestYear;            // Loan details
    private double loanCapital;
    private double monthly_amount;
    private double monthly_interest;

    public LoanSection(String interestYear, double loanCapital, double monthly_amount, double monthly_interest) {
        this.interestYear = interestYear;
        this.loanCapital = loanCapital;
        this.monthly_amount = monthly_amount;
        this.monthly_interest = monthly_interest;
    }

    public String getInterestYear() {
        return interestYear;
    }

    public void setInterestYear(String interestYear) {
        this.interestYear = interestYear;
    }

    public double getLoanCapital() {
        return loanCapital;
    }

    public void setLoanCapital(double loanCapital) {
        this.loanCapital = loanCapital;
    }

    public double getMonthly_amount() {
        return monthly_amount;
    }

    public Object setMonthly_amount(double monthly_amount) {
        this.monthly_amount = monthly_amount;
        return null;
    }

    public double getMonthly_interest() {
        return monthly_interest;
    }

    public void setMonthly_interest(double monthly_interest) {
        this.monthly_interest = monthly_interest;
    }

    public void loanDetails(){              // display loan details
        System.out.println("\n\t\t\t\t\t\t==================================  XYZ BANK  =================================");
        System.out.println("\t\t\t\t\t\t========================= LOAN DETAILS ===============================");
        System.out.println("\t\t\t\t\t\t===============================================================================");
        System.out.println("Interest rate per annum");
        System.out.println("------------------------");
        System.out.println("Option A : 3 years     : 5%");
        System.out.println("Option B : 5 years     : 7.5%");
        System.out.println("Option C : 7 years     : 10%");
        System.out.println("Option D : more than 7 : 11.5%");
    }

    public void loanCalculate(double cap, String interestYear)  {        // calculate loan interest & etc.

        System.out.println("\n\n\t\t\t\t\t\t=========================  XYZ BANK  =================================");
        System.out.println("\t\t\t\t\t\t========================= LOAN CALCULATE ===============================");
        System.out.println("\t\t\t\t===============================================================================");
        Scanner sc = new Scanner(System.in);

        if(cap >=0){
            loanCapital = cap;
        }
        else{
            System.out.println("Invalid amount! enter again");
        }

        char year = interestYear.toLowerCase().charAt(0);
        switch (year) {
            case 'a' -> {
                monthly_interest = getLoanCapital() * 0.05 * 0.083;
                monthly_amount = (getLoanCapital() / 36) + monthly_interest;
                System.out.printf("\nMonthly Total Installment  : %.2f  ", monthly_amount);
                break;
            }
            case 'b' -> {
                monthly_interest = getLoanCapital() * 0.075 * 0.083;
                monthly_amount = (getLoanCapital() / 60) + monthly_interest;
                System.out.printf("\nMonthly Total Installment  : %.2f  ", monthly_amount);
                break;
            }
            case 'c' -> {
                monthly_interest = getLoanCapital() * 0.1 * 0.083;
                monthly_amount = (getLoanCapital() / 84) + monthly_interest;
                System.out.printf("\nMonthly Total Installment  : %.2f  ", monthly_amount);
                break;
            }
            case 'd' -> {               // More than 7 years loan calculated for 12 years. and it gets as a center point
                monthly_interest = getLoanCapital() * 0.115 * 0.083;
                monthly_amount = (getLoanCapital() / (12 * 12) + monthly_interest);
                System.out.printf("\nMonthly Total Installment  : %.2f  ", monthly_amount);
                break;
            }
        }
    }
}
