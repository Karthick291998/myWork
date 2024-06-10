package com.olx;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class buyingCar {
	base a1=new base();
	@BeforeClass()
	public void launch()
	{
		a1.setup(browser.CHROME,"https://www.olx.in/en-in");
	}
	@Test(priority=2)
	public void selectProduct() throws AWTException
	{
		a1.screenshot("start");
		WebElement search=a1.element("xpath","//div[@class='P9UDC _1HxMQ']//span[text()='Cars']");
		a1.click(search);
		}
	@Test(priority=3)
	public void locationFilter()
	{
		a1.implicitwait(10);
		WebElement loc=a1.element("xpath","//a[text()='Tamil Nadu']");
		a1.click(loc);
	}
	@Test(dependsOnMethods="budget")
	public void brandSearch()
	{
		WebElement brand=a1.element("xpath","//input[@placeholder='Search brand or model']");
		a1.type(brand,"bmw");
		a1.click(a1.element("xpath","//input[@id='c-make-bmw']"));
		a1.screenshot("afterbrand");
	}
	@Test(priority=4,enabled=true)
	public void budget()
	{
		a1.click(a1.element("xpath","//span[@class='_3Eukc' and text()='1 Lac - 2 Lac']"));
		a1.screenshot("afterbudget");
	}
	@Test(priority=5,invocationCount=2)
	public void resultProduct()
	{
		a1.click(a1.element("xpath","//div[text()='BMW 3 Series' and @title='BMW 3 Series 2005-2011 330Cd Convertible, 2007, Diesel']"));
		a1.screenshot("resultproduct");
		a1.click(a1.element("xpath","//button[@data-aut-id='make-offer']"));	
	}
	@AfterClass
	public void close()
	{
		a1.screenshot("end");
		a1.finish();
	}
	

}
