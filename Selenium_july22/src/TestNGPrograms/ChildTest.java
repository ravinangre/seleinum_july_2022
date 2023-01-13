package TestNGPrograms;

import org.testng.annotations.Test;

public class ChildTest extends BaseTest {
  @Test(dependsOnMethods = "openBrowser")
  public void Login() {
	  System.out.println("This will execute second (LogIn)");
  }
}
