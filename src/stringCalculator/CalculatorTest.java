package stringCalculator;

import static org.junit.Assert.assertEquals;
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
	}
}

