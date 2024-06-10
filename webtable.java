package pro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\homi\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		WebElement table1=driver.findElement(By.xpath("//table[@id='table01']"));
		//System.out.println(table1.getText());
		WebElement body=table1.findElement(By.tagName("tbody"));
		//System.out.println(body.getText());
		List<WebElement> rows=body.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			WebElement row=rows.get(i);
			//System.out.println(row.getText());
			List<WebElement> column=row.findElements(By.tagName("td"));
			for(int j=0;j<column.size();j++)
			{
				WebElement data=column.get(j);
				String act=data.getText();
				String exp="QTP";
			//System.out.println(act);
			if(act.equals(exp))
			{
				System.out.println(rows.get(i).getText());
			}
		/*	if(act.equals(exp))
			{
				column.get(0).click();
			}*/
			}
		}
	}

}
