package TestNGPrograms;

import org.testng.annotations.DataProvider;

public class DPTest2 {
	@DataProvider
	  public Object[][] FBLogin() {
	    return new Object[][] {
	      new Object[] { "ravi.nangare@outlook.com", "a213312$@!" },
	      new Object[] { "ravinangre1983@gmail.com", "QWERTY!@#$%^" },
	      new Object[] { "ravinangre@gmail.com", "QWERTY!@#$%^" },
	      new Object[] { "ravi.nangare@gmail.com", "QWERTY!@#$%^" },
	      new Object[] { "ravi.nangre@allianz.com", "QWERTY!@#$%^" },
	      new Object[] { "ravi.nangare@allianz.com", "QWERTY!@#$%^" },
	      new Object[] { "ravinangre@rediff.com", "QWERTY!@#$%^" },
	    };
}
}
