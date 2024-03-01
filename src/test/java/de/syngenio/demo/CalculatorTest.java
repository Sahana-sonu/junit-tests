package de.syngenio.demo;

public class CalculatorTest {

    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        if (result == 5) {
            System.out.println("Addition Test Passed");
        } else {
            System.out.println("Addition Test Failed");
        }
    }

    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(4, 3);
        if (result == 1) {
            System.out.println("Subtraction Test Passed");
        } else {
            System.out.println("Subtraction Test Failed");
        }
    }
}
