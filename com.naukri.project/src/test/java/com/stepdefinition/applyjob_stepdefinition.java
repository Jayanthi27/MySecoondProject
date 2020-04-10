package com.stepdefinition;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.naukri.pages.applyjob_naukri;
import com.naukri.pages.loginpage_naukri;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Browserfactory;
import utility.PageToRemovePopups;
import utility.Screenshot;

public class applyjob_stepdefinition extends Browserfactory {
	Logger logger = LogManager.getLogger(loginpage_naukri.class);
	loginpage_naukri loginpage;
	applyjob_naukri applyjob;
	 PageToRemovePopups popup;
	@Given("^lauch browser and start app$")
	public void lauch_browser_and_start_app() throws Throwable 
	{
        driver = Browsersetup("Chrome");
		loginpage = new loginpage_naukri(driver);
		popup = new PageToRemovePopups();
		 popup.page();
		logger.info("Chrome Browser launches");
	}

	@When("^enter the valid credentials username and password$")
	public void enter_the_valid_credentials_username_and_password() throws Throwable 
	{
		applyjob = new applyjob_naukri(driver);
		applyjob.jobsearch();
	}

	@Then("^view the required job$")
	public void view_the_required_job() throws Throwable
	{
		applyjob = new applyjob_naukri(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		applyjob.locationsearch();
		applyjob.view();
		logger.info("search completed");

	}

	@Then("^apply for it$")
	public void apply_for_it() throws Throwable
	{
        String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		applyjob.applyjb();
		Screenshot util = new Screenshot(driver);
		util.takeSnapshot("./Screenshots/naukri5.png");
		Thread.sleep(3000);
		logger.info("applied for job");
		applyjob.closed();
		

	}
}
