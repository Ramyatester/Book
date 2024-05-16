package systemTests;


import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.BaseClass;
/* Authour of Test :Ananth*/
public class UserSession extends BaseClass {
  @Test (priority=5)
  public void testusersession() {
	  
	  String cururl = null;
		String actualurl = "https://automationteststore.com";
		driver.get("https://automationteststore.com");
		driver.findElement(By.xpath("//a[normalize-space()='Login or register']")).click();
		driver.findElement(By.xpath("//input[@id='loginFrm_loginname']")).sendKeys("Testerauto");

		driver.findElement(By.xpath("//input[@id='loginFrm_password']")).sendKeys("Google@123");

		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().back();
		driver.navigate().forward();
		cururl=driver.getCurrentUrl();
			 
		assertEquals(cururl,actualurl ); 
  }
 
  @Test (priority = 6)
	public void dummy() {
		
		System.out.println("none");
	}
}