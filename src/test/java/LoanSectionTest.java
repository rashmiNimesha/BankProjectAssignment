import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LoanSectionTest{
   LoanSection loanSection = new LoanSection("a", 100000.0, 0.0, 0.0);
    double delta=0.001;
    @Test
    public void loanCalculatorTestFor3Years()  {
        loanSection.loanCalculate(100000, "a");
        assertEquals(loanSection.getMonthly_amount(), 3192.777777777778, delta);
    }

    @Test
    public void loanCalculatorTestFor5Years()  {
        loanSection.loanCalculate(100000, "b");
        assertEquals(loanSection.getMonthly_amount(), 2289.166666666667, delta);
    }

    @Test
    public void loanCalculatorTestFor7Years()  {
        loanSection.loanCalculate(100000, "c");
        assertEquals(loanSection.getMonthly_amount(), 2020.4761904761904, delta);
    }

    @Test
    public void loanCalculatorTestForMoreThan7Years()  {
        loanSection.loanCalculate(100000, "d");
        assertEquals(loanSection.getMonthly_amount(), 1648.9444444444443, delta);
    }
}