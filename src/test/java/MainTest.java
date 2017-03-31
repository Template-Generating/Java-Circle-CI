import code.Main;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * @author kamontat
 * @version 1.0
 * @since Fri 31/Mar/2017 - 10:23 PM
 */
public class MainTest {
	private static final ByteArrayOutputStream stream = new ByteArrayOutputStream();
	private static final PrintStream print = new PrintStream(stream);
	
	@Test
	public void main() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.setOut(print);
		Main.main(null);
		
		assertEquals("Hello World!", stream.toString().trim());
	}
	
	@Test
	public void test1() {
		assertEquals(50, 25 * 2);
	}
	
	@Test
	public void failTest() {
		assertEquals(10, 21 + 21);
	}
}