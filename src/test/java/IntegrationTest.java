
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegrationTest {
    double delta=0.001;
    BankAccount bankAccount = new BankAccount();

@Test
    public void bankAccountIntegrationTest(){
    bankAccount.depositCash(100000);
    bankAccount.withdrawCash(50000);
    assertEquals(bankAccount.getBalance(), 50000, delta);
    System.out.println("Integration test pass!");
}


}
