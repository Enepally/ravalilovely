package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ng {
	@Test
	public void m1() {
		Reporter.log("hello",true);
	
	}

@Test
public void m2() {
	Reporter.log("hi");
	Reporter.log("hello2",true);
}
}
