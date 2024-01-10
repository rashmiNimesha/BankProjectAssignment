import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import static junit.framework.TestCase.assertEquals;

public class BankAccountTest  {
    BankAccount bankAccount= new BankAccount(5000,"deposit", 400005, "Olaf" );

    @AfterEach
    public void tearDown() throws Exception {
        bankAccount=null;
    }

    @Test
    public void depositTest() {
        bankAccount.depositCash(500);
        assertEquals(bankAccount.getBalance(), 5500.0 );
        System.out.println("Deposit Test pass");
    }

    @Test
    public void withdrawTest(){
        bankAccount.withdrawCash(2000);
        assertEquals(bankAccount.getBalance(), 3000.0);
        System.out.println("withdraw test pass");
    }

    @Test
    public void withdrawBalanceGreaterThanBalance(){
        bankAccount.withdrawCash(10000);
        assertEquals(bankAccount.getBalance(), -5000.0);
        System.out.println("withdraw Balance Greater Than Balance pass");

    }

    @Test
    public void monthlyDepositInterest(){
        bankAccount.monthlyDepositInterestCal();
        assertEquals(bankAccount.getBalance(),5012.45 );

    }


}