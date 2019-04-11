package com.methanduck.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class calculatorTest {
	private calculator Calculator = new calculator();

	@Test
	public void testSum() {
		assertEquals(5, Calculator.sum(2, 3));
	}
}

