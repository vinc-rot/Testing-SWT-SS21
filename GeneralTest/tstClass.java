package GeneralTest;

import org.junit.Test;

public class tstClass {
	@Test
    public int test(int n){
		int o =0;
        if (n %2 ==0) {
        	o = 1;
        }
        else {
        	o = 0;
        }
		return o;
    }
}
