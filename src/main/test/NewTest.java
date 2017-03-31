package main.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author kamontat
 * @version 1.0
 * @since Fri 31/Mar/2017 - 11:07 PM
 */
public class NewTest {
	@Test
	public void main() {
		assertEquals("asdf", "fdsa"); // fail test
		assertEquals(123, 123);
	}
}