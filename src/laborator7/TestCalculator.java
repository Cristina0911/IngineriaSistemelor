package laborator7;
import laborator6.DoubleCalculator;
import org.junit.jupiter.api.*;
import laborator6.NewIntCalculator;


public class TestCalculator {
    private NewIntCalculator intCalc;
    private DoubleCalculator doubleCalc;
    @BeforeEach
    public void setUp() {
        intCalc=new NewIntCalculator(0);
        doubleCalc=new DoubleCalculator(0.0);
    }

    //tests for NewIntCalculator
    @Test
    public void testAddPositive(){
        intCalc.add(8).add(9);
        Assertions.assertEquals(17,intCalc.result());
    }

    @Test
    public void testAddNegativesInt() {
        intCalc = new NewIntCalculator(-4);
        intCalc.add(-6);
        Assertions.assertEquals(-10, intCalc.result());
    }
    @Test
    public void testSubtractPositives() {
        intCalc = new NewIntCalculator(10);
        intCalc.subtract(4);
        Assertions.assertEquals(6, intCalc.result());
    }
    @Test
    public void testSubtractNegatives() {
        intCalc = new NewIntCalculator(-5);
        intCalc.subtract(-3);
        Assertions.assertEquals(-2, intCalc.result());

    }
    @Test
    public void testMultiplyPositives() {
        intCalc = new NewIntCalculator(19);
        intCalc.multiply(10);
        Assertions.assertEquals(190, intCalc.result());
    }
    @Test
    public void testMultiplyNegatives() {
        intCalc= new NewIntCalculator(-5);
        intCalc.multiply(-3);
        Assertions.assertEquals(15, intCalc.result());
    }
    @Test
    public void testMultiplyBy0() {
        NewIntCalculator calc = new NewIntCalculator(6453);
        calc.multiply(0);
        Assertions.assertEquals(0, calc.result());
    }
    @Test
    public void testDividePositives() {
        intCalc = new NewIntCalculator(10);
        intCalc.state=(Integer) intCalc.state/2;

    }

    @Test
    public void testDivideNegatives() {
        NewIntCalculator calc = new NewIntCalculator(-12);
        calc.state = (Integer) calc.state / -3;
        Assertions.assertEquals(4, calc.result());
    }

    @Test
    public void testDivideBy0() {
        NewIntCalculator calc = new NewIntCalculator(10);
       Assertions.assertThrows(ArithmeticException.class, () -> {
            calc.state = (Integer) calc.state / 0;
        });
    }

    //tests for DoubleCalculator
    @Test
    public void testAddPositiveDouble() {
        doubleCalc = new DoubleCalculator(2);
        doubleCalc.add(1.5);
        Assertions.assertEquals(3.5, (Double) doubleCalc.result(), 0.0001);
    }

    @Test
    public void testAddNegativesDouble() {
        doubleCalc = new DoubleCalculator(-1.0);
        doubleCalc.add(-3.5);
        Assertions.assertEquals(-4.5, (Double) doubleCalc.result(), 0.0001);
    }

    @Test
    public void testSubtractPositivesDouble() {
        doubleCalc = new DoubleCalculator(10.0);
        doubleCalc.subtract(2.5);
        Assertions.assertEquals(7.5, (Double) doubleCalc.result(), 0.0001);
    }

    @Test
    public void testSubtractNegativesDouble() {
        doubleCalc = new DoubleCalculator(-4.0);
        doubleCalc.subtract(-1.5);
        Assertions.assertEquals(-2.5, (Double) doubleCalc.result(), 0.0001);
    }

    @Test
    public void testMultiplyPositivesDouble() {
        doubleCalc = new DoubleCalculator(2.0);
        doubleCalc.multiply(3.5);
        Assertions.assertEquals(7.0, (Double) doubleCalc.result(), 0.0001);
    }

    @Test
    public void testMultiplyNegativesDouble() {
        doubleCalc = new DoubleCalculator(-2.0);
        doubleCalc.multiply(-3.0);
        Assertions.assertEquals(6.0, (Double) doubleCalc.result(), 0.0001);
    }

    @Test
    public void testMultiplyBy0Double() {
        doubleCalc = new DoubleCalculator(4.0);
        doubleCalc.multiply(0.0);
        Assertions.assertEquals(0.0, (Double) doubleCalc.result(), 0.0001);
    }

    @Test
    public void testDividePositivesDouble() {
        doubleCalc = new DoubleCalculator(9.0);
        doubleCalc.state = (Double) doubleCalc.state / 3.0;
        Assertions.assertEquals(3.0, (Double) doubleCalc.result(), 0.0001);
    }

    @Test
    public void testDivideNegativesDouble() {
        doubleCalc = new DoubleCalculator(-10.0);
        doubleCalc.state = (Double) doubleCalc.state / -2.0;
        Assertions.assertEquals(5.0, (Double) doubleCalc.result(), 0.0001);
    }

    @Test
    public void testDivideBy0Double() {
        doubleCalc = new DoubleCalculator(5.0);
        doubleCalc.state = (Double) doubleCalc.state / 0.0;
        Assertions.assertTrue(((Double) doubleCalc.result()).isInfinite());
    }

    //teste unitare
    @Test
    public void testDivideByZeroThrowsException_IntCalculator() {
        intCalc = new NewIntCalculator(10);
        Assertions.assertThrows(ArithmeticException.class, () -> {
            intCalc.divide(0);
        });
    }
    @Test
    public void testDivideByZeroThrowsException_DoubleCalculator() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            doubleCalc.divide(0.0);
        });
    }
    @Test
    public void testMultiplyByZero_IntCalculator() {
        intCalc = new NewIntCalculator(7);
        intCalc.multiply(0);
        Assertions.assertEquals(0, intCalc.result());
    }

    @Test
    public void testMultiplyByZero_DoubleCalculator() {
        doubleCalc = new DoubleCalculator(3.14);
        doubleCalc.multiply(0.0);
        Assertions.assertEquals(0.0, (Double) doubleCalc.result(), 0.0001);
    }

    @AfterEach
    public void tearDown() {
        intCalc = null;
        doubleCalc = null;
    }

}
