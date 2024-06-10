package makemytrip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import pages.browser;
import pages.login;

public class makemytrip {


	public static void main(String[] args) throws InterruptedException, IOException{
	login l1=new login();
	l1.setup(browser.CHROME, "https://www.makemytrip.com/bus-tickets/");
	l1.implicitwait();
	WebElement close=l1.element("xpath", "//span[@class='commonModal__close']");
	l1.click(close);
	l1.click(l1.element("xpath", "//li[contains(@class,'menu_Buses')]"));
	l1.click(l1.element("xpath", "//input[@id='fromCity']"));
	//WebElement from=l1.element("xpath", "//input[@placeholder='From']");
	l1.type(l1.element("xpath", "//input[@placeholder='From']"),"chennai");
	//l1.javascript(from);
	l1.click(l1.element("xpath","//span[text()='Chennai, Tamil Nadu']"));
	l1.type(l1.element("xpath", "//input[@placeholder='To']"), "Thoothukudi");
	l1.click(l1.element("xpath", "//span[text()='Thoothukudi, Tamil Nadu']"));
	l1.click(l1.element("xpath","//div[@aria-label='Thu Jun 06 2024']"));
	l1.click(l1.element("xpath","//button[@id='search_button']"));
	List<WebElement> busname=l1.elements("xpath","//p[contains(@class,'appendB')]");
	List<WebElement> deptime=l1.elements("xpath","//span[contains(@class,'font18 latoBl')]");
	List<WebElement> arrtime=l1.elements("xpath","//span[contains(@class,'font18 blackText')]");
	List<WebElement> rate=l1.elements("xpath","//span[@id='price']");
	File f1=new File("C:\\Users\\ELCOT\\eclipse-workspace\\pro\\excel\\7.xlsx");
	XSSFWorkbook wbook= new XSSFWorkbook(); 
		int a=0,b=0,c=0,d=0;
		XSSFSheet sheet=wbook.createSheet("karti");
		for(int i=0;i<rate.size();i++)
		{
			Row r=sheet.createRow(i);
			for(int j=0;j<4;j++)
			{
			Cell cell=r.createCell(j);
			if(j==0)
			{
				String data=busname.get(a).getText();
				cell.setCellValue(data);
				a++;
			}
			if(j==1)
			{
				String data=deptime.get(b).getText();
				cell.setCellValue(data);
				b++;
			}
			if(j==2)
			{
				String data=arrtime.get(c).getText();
				cell.setCellValue(data);
				c++;
			}
			if(j==3)
			{
				String data=rate.get(d).getText();
				cell.setCellValue(data);
				d++;
			}
			}
		}
		FileOutputStream f2=new FileOutputStream(f1);
		wbook.write(f2);
		f2.close();
	
	WebElement seat=l1.element("xpath","//div[contains(@data-test-id,'select-seats')][1]");
	l1.click(seat);
	l1.click(l1.element("xpath","//span[@data-testid='seat_horizontal_sleeper_available'][1]"));
	l1.click(l1.element("xpath", "//div[contains(@class,'cta-book')]"));
	l1.click(l1.element("xpath", "//input[@id='dt_state_gst_info']"));
	WebElement pincode=l1.element("xpath","//li[text()='Tamil Nadu']");
	l1.click(pincode);
	WebElement pinsel=l1.element("xpath","//p[text()='Confirm and save billing details to your profile']");
	l1.click(pinsel);
	l1.type(l1.element("xpath","//input[@id='fname']"),"Karthick");
	l1.click(l1.element("xpath", "//span[@class='listingSprite maleTabIcon appendRight7'] "));
	l1.type(l1.element("xpath", "//input[@id='age']"), "20");
	l1.type(l1.element("xpath", "//input[@id='mobileNumber']"), "8072159082");
	l1.type(l1.element("xpath", "//input[@id='contactEmail']"), "karthicksubramanian2904@gmail.com");
	l1.click(l1.element("xpath", "//div[@class='paymentBtn whiteText latoBold font16 capText']"));

	}
}



