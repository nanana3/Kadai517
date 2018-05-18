package inttoeng;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void test() {
		 
		IntToEng ite = new IntToEng();
		String expected = "ninety nine";
		String actual = ite.translateEng(99);
		assertThat(actual,is(expected));
	}

}
