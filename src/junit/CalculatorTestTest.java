package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
public class CalculatorTestTest {
	private static CalculatorTest calculatorTest=new CalculatorTest();

	@Before
	public void setUp() throws Exception {
		calculatorTest.clear();
	}

	@Test
	public void testAdd() {
		calculatorTest.add(2);
		calculatorTest.add(5);
		assertEquals(7, calculatorTest.getresult());
	}

	@Test
	public void testSubstract() {
		calculatorTest.add(8);
		calculatorTest.substract(3);
		assertEquals(5, calculatorTest.getresult());
	}

	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply() {
		fail("ипн╢й╣ож");
	}

	@Test
	public void testDivide() {
		calculatorTest.add(8);
		calculatorTest.divide(2);
		assertEquals(4, calculatorTest.getresult());
	}

	@Test
	public void testSquare() {
		calculatorTest.square(3);
		assertEquals(9, calculatorTest.getresult());
	}
	

}
