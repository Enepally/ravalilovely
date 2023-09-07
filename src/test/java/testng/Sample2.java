package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void p1() {
		Reporter.log("ravali is good girl",true);
	}
	
	@Test
		public void p2() {
			Reporter.log("ravali is smart girl",true);
		}
	@Test
		
public void p3() {
	Reporter.log("ravali is nice girl",true);
	}

}
