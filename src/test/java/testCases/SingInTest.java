package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testcaseFunction.SingInFunction;
import utils.BaseTest;
@Listeners({Listener.class})
public class SingInTest extends BaseTest {

   @Test
    public void signInTestCase() throws InterruptedException {
       SingInFunction sing = new SingInFunction(driver);
       sing.signInForm();
   }



}
