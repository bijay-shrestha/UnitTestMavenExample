package calculatorapp;

/**
 * @author bijayshrestha on 7/9/22
 * @project UnitTestMavenExample
 */

public class CalculatorApp {

    private double value;

    public CalculatorApp() {
        this.value = 0.0;
    }

    public void add(double number){
        value = value+number;
    }

    public double getValue(){
        return value;
    }
}
