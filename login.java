package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class login {
	RemoteWebDriver driver;
	@Parameters({"email","password","browser"})
	@Test

	public  void cross(String email,String password,String browser) {
		switch(browser)
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		}
		//System.setProperty("webdriver.chrome.driver", "C://Users//ELCOT//eclipse-workspace//testing//drivers//chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("email");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0')]")).click();

	}

}
