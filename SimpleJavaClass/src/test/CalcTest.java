package test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.Calculator;

public class CalcTest {

	 	private final Calculator calculator = new Calculator();

	    @Test
	    public void testAdd() {
	        assertEquals(5, calculator.add(2, 3));
	        assertEquals(-1, calculator.add(-2, 1));
	        assertEquals(0, calculator.add(2, -2));
	    }

	    @Test
	    public void testSubtract() {
	        assertEquals(1, calculator.subtract(3, 2));
	        assertEquals(-3, calculator.subtract(-2, 1));
	        assertEquals(4, calculator.subtract(2, -2));
	    }

	    @Test
	    public void testMultiply() {
	        assertEquals(6, calculator.multiply(2, 3));
	        assertEquals(-2, calculator.multiply(-2, 1));
	        assertEquals(-4, calculator.multiply(2, -2));
	    }

	    @Test
	    public void testDivide() {
	        assertEquals(2, calculator.divide(6, 3));
	        assertEquals(-2, calculator.divide(-4, 2));
	        assertEquals(-1, calculator.divide(2, -2));
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testDivideByZero() {
	        calculator.divide(1, 0);
	    }

}
