package TestNGPrograms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiply {
	@Test
	  @Parameters({"val1","val2"})
	  public void Mul(int v1, int v2) {
		  int finalmul = v1 * v2;
		  System.out.println("Final Multiplication is "+finalmul);
	  }
	@Test
	  @Parameters({"val1","val2"})
	  public void Div(int v1, int v2) {
		  int finaldiv = v1 / v2;
		  System.out.println("Final Division is "+finaldiv);
	  }
}
