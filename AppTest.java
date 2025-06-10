package test;
import org.testng.Assert;
import org.testng.annotations.*;
import main.App;

public class AppTest {
	@Test
	public void Test1() {
		App myapp=new App();
		Assert.assertEquals(0,myapp.UserLogin("abc", "456"));
	}
	@Test
	public void Test2() {
		App myapp2=new App();
		Assert.assertEquals(1,myapp2.UserLogin("abc", "123"));
	}
}
