package TestNGPrograms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Param {
  @Test
  @Parameters({"val1","val2"})
  public void Sum(int v1, int v2) {
	  int finalsum = v1 + v2;
	  System.out.println("Final Sum is "+finalsum);
  }
  @Test
  @Parameters({"val1","val2"})
  public void Diff(int v1, int v2) {
	  int finaldiff = v1 - v2;
	  System.out.println("Final Diff is "+finaldiff);
  }
}
