package code;

public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two integers
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Method to find the maximum of two integers
    public int max(int a, int b) {
        return Math.max(a, b);
    }

    // Method to find the minimum of two integers
    public int min(int a, int b) {
        return Math.min(a, b);
    }
    
    public int absolute(int a) {
    	return Math.abs(a);
    }
}