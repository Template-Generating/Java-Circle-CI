import code.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author kamontat
 * @version 1.0
 * @since Fri 31/Mar/2017 - 10:23 PM
 */
class MainTest {
	private static final ByteArrayOutputStream stream = new ByteArrayOutputStream();
	private static final PrintStream print = new PrintStream(stream);
	
	@Test
	void main() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.setOut(print);
		Main.main(null);
		
		Assertions.assertEquals("Hello World!", stream.toString().trim());
	}
	
	@Test
	void test1() {
		Assertions.assertEquals(50, 25 * 2);
		Assertions.assertEquals(10, 21 + 21);
	}
}