package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import code.Calculator;

class CalculatorTests {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
    	int result = calculator.add(2,3);
    	assert(5==result);
    }
    
    @Test
    void testMultiplicatio() {
    	int result = calculator.multiply(-2, 17);
    	assert(-34==result);
    }

    @Test
    void testAbs() {
    	int input = -5;
    	int result = calculator.absolute(input);
    	assert(result>=0);
    }
    
    @Test
    void testMax() {
    	
    	Random random = new Random();
    	int input1 = random.nextInt();;
        int input2 = random.nextInt();;
        int result = calculator.max(input1, input2);
        if(input1>input2)
        	assert(input1 == result);
        else
        	assert(input2 == result);
    }
    
    @Test
    void testDivision() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0), "Cannot divide by zero");
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

}
