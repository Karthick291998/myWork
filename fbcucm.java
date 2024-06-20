package stepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

import basement.base;
import basement.browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fbcucm extends base {
	String propertypath="C:\\Users\\karth\\eclipse-workspace\\cuccumber\\src\\test\\resources\\utility.property";
	
	public static base b=new base();
	@Given("Launch the browserr")
	public void launch_the_browserr()
	{
		b.setup(browser.CHROME,"https://www.facebook.com/r.php?next=https%3A%2F%2Fwww.facebook.com%2F&locale=en_GB&display=page" );
		
	}
	
	@When("Enter the firstname {string}")
	public void enter_the_firstname(String string) throws Exception {
		//firstname
		String name=b.readproperty(propertypath, "firstname");
		WebElement firstname=b.element("xpath", name);
		b.type(firstname, string);
	}

	@When("Enter the lastname {string}")
	public void enter_the_lastname(String string) {
		  //last name
		WebElement lastname=b.element("xpath", "//input[@name='lastname']");
		b.type(lastname, string);
	}

	@When("Enter the email {string}")
	public void enter_the_email(String string) {
		 //email or num
		WebElement email=b.element("xpath", "//input[@name='reg_email__']");
		b.type(email, string);
	}

	@When("Enter the new password {string}")
	public void enter_the_new_password(String string) {
		 //password
		WebElement pass=b.element("xpath", "//input[@name='reg_passwd__']");
		b.type(pass, string);
	}

	@When("Enter the dateOfBirth {string}")
	public void enter_the_dateOfBirth(String string) {
		  String date=string;
		  String[] str=date.split(" ");
		  WebElement day=b.element("xpath","//select[@id='day']");
		  b.dropdown(day,str[0]);
		  WebElement month=b.element("xpath","//select[@id='month']");
		  b.dropdown(month,str[1]);
		  WebElement year=b.element("xpath","//select[@id='year']");
		  b.dropdown(year,str[2]);
	}

	@When("Enter the gender {string}")
	public void enter_the_gender(String string) {
		String gender=string;
		  if(gender.equals("male"))
		  {
			b.click(b.element("xpath","//label[text()='Male']"));
				  }
		  else if(gender.equals("female"))
		  {
			  b.click(b.element("xpath","//label[text()='Female']"));
		  }
		  else
		  {
			  b.click(b.element("xpath","//label[text()='Custom']"));
		  }
	}
	@Then("click the signup {string}")
	public void click_the_signup(String string) throws InterruptedException, IOException {
		b.click(b.element("xpath","//button[@name='websubmit']"));
		Thread.sleep(2000);
		b.screenshot(string);
	}
	   	


}
