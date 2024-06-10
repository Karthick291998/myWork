package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//ELCOT//eclipse-workspace//testing//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.xpath("(//label[text()='DatePicker Enabled']/following::input)[1]")).click();
		String date="29";
		String month="september";
		String year="2023";
		while(true)
		{
			String data=driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-header ui-widget-header')]//div[1]")).getText();
			String ar[]=data.split(" ");
			String amonth=ar[0];
			String ayear=ar[1];
			if((amonth.equalsIgnoreCase(month))&&(ayear.equals(year)))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
		}
		WebElement table=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//table[1]"));
		List <WebElement> rows=table.findElements(By.tagName("td"));
		System.out.println(rows.size());
		for(WebElement e:rows)
		{
			String adate=e.getText(); 
			if(date.equalsIgnoreCase(adate))
			{
				e.click();
				break;
			}
		}
	}

}
