package fb.ObjectRespository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basement.base;

public class fbAccountCreation extends base {
	public fbAccountCreation()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='u_4_b_Iz']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement password;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement day;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement year;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement male;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement female;
	
	@FindBy(xpath="//label[text()='Custom']")
	private WebElement custom;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement signup;
	
	public WebElement getsignup()
	{
		return signup;
	}
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getCustom() {
		return custom;
	}

	
	
	
	
	

}
