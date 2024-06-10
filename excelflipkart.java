package homi;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelflipkart {
//storing data from flipkart in excel(1)
	//displaying the data from flipkart in map(2)
	public static void main(String[] args) throws IOException {
		//File flip=new File("C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\homi\\\\xcel\\\\flipkart.xlsx");
		//XSSFWorkbook book=new XSSFWorkbook();
		//XSSFSheet sheet1=book.createSheet("phones");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\homi\\drivers\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=ebdef1fc-542d-4f7f-ab8b-1cf6ebb8c58b");
		List<WebElement> wname=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		LinkedList<String> name=new LinkedList<String>();
		for(WebElement e:wname)
		{
			String n=e.getText();
			name.add(n);
		}
		//System.out.println(name);
		List<WebElement> wprice=driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		LinkedList<String> price=new LinkedList<String>();
		for(WebElement e:wprice)
		{
			String n=e.getText();
			price.add(n);
		}
	//	System.out.println(price);
		//int x=0,y=0;
		/*for(int i=0;i<name.size();i++)
		{
			XSSFRow r=sheet1.createRow(i);
			for(int j=0;j<2;j++)
			{
				XSSFCell c=r.createCell(j);
				if(j==0)
				{
					c.setCellValue(name.get(x));
					x++;
				}
				if(j==1)
				{
					c.setCellValue(price.get(y));
					y++;
				}
				
				
			}
			
		}
		FileOutputStream f2=new FileOutputStream(flip);
		book.write(f2);
		f2.close();
		*/
		Map<String,String> flip=new LinkedHashMap<String,String>();
		for(int i=0;i<name.size();i++)
		{
			flip.put(name.get(i),price.get(i));
		}
	for(Map.Entry<String, String> str:flip.entrySet())
	{
		System.out.println(str);
	}
		

	}

}
