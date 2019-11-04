import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator ;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(7.00, calculator.addNumbers(2.00, 5.00),0.00);
    }

    @Test
    public void canSubstract(){
        assertEquals(20.00, calculator.substractNumbers(30, 10),0.00);
    }

    @Test
    public void canMultiply(){
        assertEquals(100.00, calculator.multiplyNumbers(10, 10),0.00);
    }

    @Test
    public void canDivide(){
        assertEquals(4, calculator.divideNumbers(20.00, 5), 0.00);
    }
}
