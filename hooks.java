package fb.hooks;

import org.openqa.selenium.OutputType;

import basement.base;
import basement.browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {
	public static base b=new base();
	@Before
	public void launchbrowser(Scenario scenario)
	{
		b.setup(browser.CHROME);
		final byte[] src=base.driver.getScreenshotAs(OutputType.BYTES);
		scenario.embed(src, "pic/png");
	}
	@After
	public void closebrowser(Scenario scenario)
	{
		final byte[] src=base.driver.getScreenshotAs(OutputType.BYTES);
		scenario.embed(src, "pic/png");
		b.finish();
	}

}
