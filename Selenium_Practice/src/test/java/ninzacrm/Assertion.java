package ninzacrm;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
@Test
public void assertion()
{
	SoftAssert softobject=new SoftAssert();
	Reporter.log("Step-1");
	Reporter.log("Step-2");
    Assert.assertEquals("Home", "Home");
    Reporter.log("Step=3");
    softobject.assertNotNull("soft");
    Reporter.log("Step4");
    softobject.assertAll();
}
@Test
public void assertion1()


{
	SoftAssert softobject=new SoftAssert();
	System.out.println("Step-1");
	Reporter.log("Step-2");
Assert.assertEquals("Home", "Home");
	System.out.println("Step=3");
    softobject.assertNotNull("soft");
    System.out.println("Step4");
    softobject.assertAll();
}
}
