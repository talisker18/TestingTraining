import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AgeValidatorTest {
	private AgeValidator a;
	
	@Before
	public void init() {
		a = new AgeValidator();
		System.out.println("object created");
	}
	
	@After
	public void cleanup() {
		a = null;
		System.out.println("object destroyed");
	}

	@Test
	public void test45() {
		a = new AgeValidator();
		assertEquals("valid age", a.ageValid(45));
	}
	
	@Test
	public void test16() {
		a = new AgeValidator();
		assertEquals("invalid age", a.ageValid(16));
	}

}
