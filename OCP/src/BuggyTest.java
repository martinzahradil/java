import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class BuggyTest {

	@Test
	public void test() {
		
		Object actual;
		assertThat(3, is(5));
	
	}

}
