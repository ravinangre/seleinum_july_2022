package TestNGPrograms;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
	@Test
	  public void first() {
		  System.out.println("First");
		  Reporter.log("First Test");
	  }
	  @Test(enabled = false)
	  public void second() {
		  System.out.println("Second");
		  Assert.assertTrue(true);
	  }
	  @Test
	  public void third() {
		  System.out.println("Third");
	  }
}
