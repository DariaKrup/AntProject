package com.genaral.pascaltrangle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * Testing method to examine the value return by the method is correct value in
 * the Pascal Triangle.
 * 
 * @author Vijith Epa
 * 
 */
public class TestPascalTraingle {

	/**
	 * Testing method to examine the value return by the method is correct value
	 * in the Pascal Triangle.
	 */
	@Test
	public void shouldReturnValueInPascalTriangle() {

		int expectedValueAt_00 = 1;
		String expectedValueAt_01 = "Error Index";
		int expectedValueAt_10 = 1;
		int expectedValueAt_11 = 1;
		int expectedValueAt_22 = 1;
		int expectedValueAt_40 = 1;
		int expectedValueAt_63 = 20;

		assertEquals(PascalTraingle.valueInTrangle(0, 0), expectedValueAt_00);

		try {
			PascalTraingle.valueInTrangle(0, 1);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), expectedValueAt_01);
		}
		assertEquals(PascalTraingle.valueInTrangle(1, 0), expectedValueAt_10);
		assertEquals(PascalTraingle.valueInTrangle(1, 1), expectedValueAt_11);
		assertEquals(PascalTraingle.valueInTrangle(2, 2), expectedValueAt_22);
		assertEquals(PascalTraingle.valueInTrangle(4, 0), expectedValueAt_40);
		assertEquals(PascalTraingle.valueInTrangle(6, 3), expectedValueAt_63);
		assertNotEquals(PascalTraingle.valueInTrangle(2, 2), expectedValueAt_63);
	}
}
