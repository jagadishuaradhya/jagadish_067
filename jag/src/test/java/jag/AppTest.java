package jag;
import org.testng.Assert;
public class AppTest {
    public void testlogin1()
    {
        App myapp=new App();
        Assert.assertEquals(0,myapp.userlogin("abc","abc123"));
        }
    public void testlogin2()
    {
        App myapp=new App();
        Assert.assertEquals(1,myapp.userlogin("abc","abc@123"));
    }
}