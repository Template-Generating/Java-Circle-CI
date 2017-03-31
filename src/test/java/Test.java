import org.junit.jupiter.api.Assertions;

/**
 * @author kamontat
 * @version 1.0
 * @since Fri 31/Mar/2017 - 10:44 PM
 */
public class Test {
	@org.junit.jupiter.api.Test
	void test1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assertions.assertEquals(10, 5 + 5);
	}
}
