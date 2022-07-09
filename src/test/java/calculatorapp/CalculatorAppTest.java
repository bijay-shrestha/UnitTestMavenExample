package calculatorapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author bijayshrestha on 7/9/22
 * @project UnitTestMavenExample
 */
public class CalculatorAppTest {

    private CalculatorApp calculatorApp;

    @Before
    public void setUp() throws Exception {
        this.calculatorApp = new CalculatorApp();
    }

    @After
    public void tearDown() throws Exception {
        this.calculatorApp = null;
    }

    @Test
    public void testAddZero() {
        calculatorApp.add(0.0);
        assertEquals("Adding Zero is not working correctly", 0.0,
                calculatorApp.getValue(), 0.000001);
    }

    @Test
    public void testAddPositive(){
        calculatorApp.add(23.255);
        assertEquals("Adding Positive number is not working correctly",
                23.255, calculatorApp.getValue(), 0.0000001);
    }
}