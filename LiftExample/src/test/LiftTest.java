package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import liftcode.Lift;

public class LiftTest {

	private Lift lift;
	
	@Before
    public void setUp() {
        lift = new Lift(5); // Create a lift with 5 floors
    }

    @Test
    public void testConstructorWithOneParameter() {
        assertEquals(5, lift.getTopFloor());
        assertEquals(10, lift.getCapacity());
        assertEquals(0, lift.getCurrentFloor());
        assertEquals(0, lift.getNumRiders());
    }

    @Test
    public void testConstructorWithTwoParameters() {
        lift = new Lift(5, 15);
        assertEquals(5, lift.getTopFloor());
        assertEquals(15, lift.getCapacity());
        assertEquals(0, lift.getCurrentFloor());
        assertEquals(0, lift.getNumRiders());
    }

    @Test
    public void testAddRiders() {
        lift.addRiders(5);
        assertEquals(5, lift.getNumRiders());
        lift.addRiders(10);
        assertEquals(10, lift.getNumRiders()); // Should not exceed capacity
    }

    @Test
    public void testIsFull() {
        lift.addRiders(10);
        assertTrue(lift.isFull());
        lift.addRiders(1);
        assertTrue(lift.isFull());
    }

    @Test
    public void testGoUp() {
        lift.goUp();
        assertEquals(1, lift.getCurrentFloor());
        lift.goUp();
        lift.goUp();
        lift.goUp();
        lift.goUp();
        lift.goUp(); // Should not go above top floor
        assertEquals(5, lift.getCurrentFloor());
    }

    @Test
    public void testGoDown() {
        lift.goUp();
        lift.goUp();
        lift.goDown();
        assertEquals(1, lift.getCurrentFloor());
        lift.goDown();
        lift.goDown(); // Should not go below ground floor
        assertEquals(0, lift.getCurrentFloor());
    }

    @Test
    public void testCall() {
        lift.call(3);
        assertEquals(3, lift.getCurrentFloor());
        lift.call(1);
        assertEquals(1, lift.getCurrentFloor());
        lift.call(0);
        assertEquals(0, lift.getCurrentFloor());
        lift.call(5);
        assertEquals(5, lift.getCurrentFloor());
    }

    @Test
    public void testCallInvalidFloor() {
        lift.call(6); // Floor does not exist
        assertEquals(0, lift.getCurrentFloor()); // Should not move
        lift.call(-1); // Negative floor does not exist
        assertEquals(0, lift.getCurrentFloor()); // Should not move
    }

}
