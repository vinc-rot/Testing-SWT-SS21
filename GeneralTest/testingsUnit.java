package GeneralTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testingsUnit {

	@Test
	public void test() {
		tstClass obj1 = new tstClass();
		int output= obj1.test(3);
		assertEquals(0,output);
		int output1= obj1.test(2);
		assertEquals(1,output1);
		}
}
