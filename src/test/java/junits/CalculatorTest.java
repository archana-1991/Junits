package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;

import code.Calculator;

public class CalculatorTest {
	@Disabled
	@DisplayName("add two positive num")
	@Test
	public void test1() {
		int result=Calculator.add(2,5);
		
		Assertions.assertEquals(7,result);
		
	}
	@Tag("Sanity")
	@DisplayName("add one +ve and one -ve num")
	@Test
	public void test2() {
		int result=Calculator.add(-2,5);
		
		Assertions.assertEquals(3,result);
		
	}
	@RepeatedTest(3)
	@DisplayName("add two +ve num not equaln result")
	public void test3() {
		int result=Calculator.add(2,5);
		
		Assertions.assertNotEquals(8,result);
		
	}
	@CustomAnnotation
	public void test4() {
		int result=Calculator.add(4, 5);
		Assertions.assertNotEquals(8,result);
	}
}
