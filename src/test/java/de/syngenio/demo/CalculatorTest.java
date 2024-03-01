package de.syngenio.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

   
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(4, 3));
    }
}
