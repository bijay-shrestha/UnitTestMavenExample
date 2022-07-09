package calculatorapp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author bijayshrestha on 7/9/22
 * @project UnitTestMavenExample
 */
@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {CalculatorAppTest.class, CalculatorAppTest2.class})
public class CalculatorAppTestSuite {
}
