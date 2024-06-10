package amazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
	public static RemoteWebDriver driver;
	
	@Test
	public void method1()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		opt.addArguments("disable-popups");
		opt.addArguments("start-maximized");
		driver=new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void method2() throws IOException, Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement all=driver.findElement(By.xpath("//div[@id='nav-search-dropdown-card']"));
		WebElement sel=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		boolean say=all.isDisplayed();
		if(say==true)
		{
		all.click();
		Thread.sleep(2000);
		File src=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\ELCOT\\eclipse-workspace\\pro\\screenshots\\src.png");
		FileHandler.copy(src, des);
		System.out.println(say);
			Select sc=new Select(sel);
			List<WebElement> options=sc.getOptions();
			for(WebElement ele:options)
			{
				String exp="Electronics";
				String act=ele.getText();
				if(act.equals(exp))
				{
					ele.click();
				}
			}
		}
	}
	@Test
	public void method3() throws IOException, AWTException
	{
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(search).click().sendKeys("mobile").build().perform();
		//js.executeScript("arguments[0].setAttribute('value','mobile ')", search);
		//search.sendKeys(Keys.SPACE);
	 Robot rb=new Robot();
	 for(int i=0;i<5;i++)
	 {
	 rb.keyPress(KeyEvent.VK_DOWN);
	 rb.keyRelease(KeyEvent.VK_DOWN);	
	 }
		File src1=driver.getScreenshotAs(OutputType.FILE);
		File des1=new File("C:\\Users\\ELCOT\\eclipse-workspace\\pro\\screenshots\\sug.png");
		FileHandler.copy(src1, des1);
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
	}
	@Test
	public void method4() throws IOException
	{
		File src2=driver.getScreenshotAs(OutputType.FILE);
		File des2=new File("C:\\Users\\ELCOT\\eclipse-workspace\\pro\\screenshots\\products.png");
		FileHandler.copy(src2, des2);
		WebElement last=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[last()]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", last);
		last.click();
	}
	@Test
	public void method5() throws IOException
	
	{
		File src3=driver.getScreenshotAs(OutputType.FILE);
		File des3=new File("C:\\Users\\ELCOT\\eclipse-workspace\\pro\\screenshots\\prod.png");
		FileHandler.copy(src3, des3);
		Set<String> win=driver.getWindowHandles();
		LinkedList<String> wind=new LinkedList<String>(win);
		driver.switchTo().window(wind.get(1));
		File src5=driver.getScreenshotAs(OutputType.FILE);
		File des5=new File("C:\\Users\\ELCOT\\eclipse-workspace\\pro\\screenshots\\screen.png");
		FileHandler.copy(src5, des5);
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		File src4=driver.getScreenshotAs(OutputType.FILE);
		File des4=new File("C:\\Users\\ELCOT\\eclipse-workspace\\pro\\screenshots\\last.png");
		FileHandler.copy(src4, des4);
		
		
	}
	@Test
	public void method6()
	{
		
	}
			

}
