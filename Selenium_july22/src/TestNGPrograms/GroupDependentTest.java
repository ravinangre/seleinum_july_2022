package TestNGPrograms;

import org.testng.annotations.Test;

public class GroupDependentTest {
  @Test(groups = "login")
  public void opneBrowser() {
	  System.out.println("This will execute first");
  }
  @Test(groups = "login")
  public void signIn() {
	  System.out.println("This will execute second");
  }
  @Test(dependsOnGroups = "login")
  public void ViewAcc() {
	  System.out.println("This will execute Third");
  }
}
