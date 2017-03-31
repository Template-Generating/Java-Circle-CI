package test;

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
		System.setOut(print);
		Main.main(null);
		
		Assertions.assertEquals("Hello World!", stream.toString().trim());
	}
}