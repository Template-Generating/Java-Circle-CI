import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author kamontat
 * @version 1.0
 * @since Fri 31/Mar/2017 - 11:38 PM
 */
public class U5Test {
	@Test
	public void unit5() {
		Assertions.assertEquals(1234, 1234);
	}
	
	@Test
	void fail() {
		Assertions.fail("just Fail!");
	}
}
