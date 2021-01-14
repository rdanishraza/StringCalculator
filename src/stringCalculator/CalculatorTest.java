package stringCalculator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator calculator;
	@Before
	public void before(){
		calculator = new Calculator();
	}
	@Test
	public void TestCalculator(){
		assertEquals(3,calculator.add("1,2"));
		assertEquals(0,calculator.add(""));
		assertEquals(1,calculator.add("1"));

		//Handling Large no of Integers
		assertEquals(3579,calculator.add("2345,1234"));  //if the numbers are 4 digits
		assertEquals(69146070,calculator.add("21474836,47671234")); // if numbers are very huge but in the limit of int value.
		assertEquals(147, calculator.add("12,23,45,67"));// if the numbers are more than 2
		assertNull(null); //if there is not any string
		
		// Handle new lines between numbers (instead of commas)
		assertEquals(6, calculator.add("1\n2,3"));
		assertFalse(1 == calculator.add("1,\n"));
		assertEquals(6, calculator.add("\n1,2,3\n"));
		assertTrue(3 == calculator.add("1,,2"));
	}
}

