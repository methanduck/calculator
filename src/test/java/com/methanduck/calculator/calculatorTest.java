package com.methanduck.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
* helllo
*/
public class calculatorTest {
	private calculator Calculator = new calculator();

	@Test
	public void testSum() {
		assertEquals(5, Calculator.sum(2, 3));
	}
	
	@Test
	public void testSub() {
		assertEquals(3, Calculator.sub(5,2));
	}
	
	@Test
	public void testMul() {
		assertEquals(10, Calculator.multi(5,2));
	}

	@Test
	public void testDiv() {
		assertEquals(5, Calculator.div(10,2));
	}
}
