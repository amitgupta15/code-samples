package recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursionTests {

	@Test(expected=IllegalArgumentException.class)
	public void factorialExceptionTest() {
		Recursion recursion = new Recursion();
		recursion.factorial(-1);
	}
	
	@Test
	public void factorialTest() {
		Recursion recursion = new Recursion();
		assertEquals(1, recursion.factorial(0)); //Factorial of 0 is 1
		assertEquals(24, recursion.factorial(4));
	}

}
