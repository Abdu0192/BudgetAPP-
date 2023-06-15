import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class test {

    @Test
    public void conditioncoverage() {
       assertEquals(true, Budget.Budgetrapportgemaaktals(true,false,true));
        assertEquals(false, Budget.Budgetrapportgemaaktals(false,true,false));

    }
    @Test
    public void decisioncoverage(){
        assertEquals(true, Budget.Budgetrapportgemaaktals(true,false,true));
        assertEquals(false, Budget.Budgetrapportgemaaktals(false,true,false));
    }
    @Test
    public void coverage_decision_coverage(){
        assertEquals(true, Budget.Budgetrapportgemaaktals(true,false,true));
        assertEquals(false, Budget.Budgetrapportgemaaktals(false,true,false));
    }

    @Test
    public void modiefiedmultipledecisioncoverage(){
        assertEquals(true, Budget.Budgetrapportgemaaktals(true,false,true));
        assertEquals(false, Budget.Budgetrapportgemaaktals(false,false,true));
        assertEquals(true, Budget.Budgetrapportgemaaktals(false,true,true));
        assertEquals(false, Budget.Budgetrapportgemaaktals(false,true,false));
    }

    @Test
    public void multipledecisioncoverage(){
        assertEquals(false, Budget.Budgetrapportgemaaktals(false,false,false));
        assertEquals(false, Budget.Budgetrapportgemaaktals(false,false,true));
        assertEquals(false, Budget.Budgetrapportgemaaktals(false,true,false));
        assertEquals(true, Budget.Budgetrapportgemaaktals(false,true,true));


        assertEquals(true, Budget.Budgetrapportgemaaktals(true,false,false));
        assertEquals(true, Budget.Budgetrapportgemaaktals(true,false,true));
        assertEquals(true, Budget.Budgetrapportgemaaktals(true,true,false));
        assertEquals(true, Budget.Budgetrapportgemaaktals(true,true,true));

    }


    @Test
    public void equivalentieAndRANDwaarden() {

        assertEquals(100/100*10,Budget.budgettest(100));
        assertEquals(500/100*10,Budget.budgettest(500));
        assertEquals(999/100*10,Budget.budgettest(999));

        assertEquals(1000/100*20,Budget.budgettest(1000));
        assertEquals(5000/100*20,Budget.budgettest(5000));
        assertEquals(9999/100*20,Budget.budgettest(9999));

        assertEquals(10000/100*30,Budget.budgettest(10000));
        assertEquals(2147483646/100*30,Budget.budgettest(2147483646));
        assertEquals(500000/100*30,Budget.budgettest(500000));
        assertEquals(0,Budget.budgettest(2147483647));

    }



    @Test
    public void pairwisetesting() {
       assertEquals(5 ,Budget.appcoste(8,false,0,true));
       assertEquals(10 ,Budget.appcoste(8,true,1,false));
       ///
        assertEquals(5 ,Budget.appcoste(15,false,0,true));
        assertEquals(10 ,Budget.appcoste(15,true,1,false));
        ///
        assertEquals(5 ,Budget.appcoste(21,false,0,true));
        assertEquals(10 ,Budget.appcoste(21,true,1,false));
    }
}