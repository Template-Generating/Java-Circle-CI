import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author kamontat
 * @version 1.0
 * @since Fri 31/Mar/2017 - 10:44 PM
 */
public class MyTest {
	@Test
	public void test1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals(10, 5 + 5);
	}
}
