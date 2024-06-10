package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static  void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//ELCOT//eclipse-workspace//test//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	/*	WebElement source=driver.findElement(By.id("form:drag_content"));
		WebElement target=driver.findElement(By.id("form:drop"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();*/
		driver.manage().window().maximize();
		WebElement dp1=driver.findElement(By.xpath("//select[@id='second']"));
		Select sc1=new Select(dp1);
		boolean state=sc1.isMultiple();
		System.out.println(state);
		sc1.selectByIndex(3);
		sc1.selectByValue("pizza");
		sc1.selectByVisibleText("Donut");
		List<WebElement> dp=sc1.getAllSelectedOptions();
		for(WebElement e:dp)
		{
			System.out.println(e.getText());
		}
		//WebElement ele=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		//Actions act=new Actions(driver);
	//	act.moveToElement(ele).perform();
	//	act.click();
	//	WebElement sell=driver.findElement(By.xpath("//a[text()='Sell']"));
	//	act.doubleClick(sell).perform();
	
		

}
}
