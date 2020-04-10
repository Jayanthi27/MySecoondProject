package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.naukri.pages.loginpage_naukri;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Browserfactory;
import utility.PageToRemovePopups;
import utility.Screenshot;

public class loginpage_stepdefinition extends Browserfactory {
	Logger logger = LogManager.getLogger(loginpage_naukri.class);
	loginpage_naukri loginpage;
	PageToRemovePopups popup;
	
	@Given("^Open browser and start application naukri$")
	public void open_browser_and_start_application_naukri() throws Throwable {
		driver = Browsersetup("Chrome");
		popup = new PageToRemovePopups();
		popup.page();
		logger.info("Chrome Browser launches");
	}

	@When("^Enter the  (.+)$")
	public void enter_the(String username) throws Throwable {
		
		loginpage = new loginpage_naukri(driver);
		logger.info("website launched");

		loginpage.signin();
		loginpage.enteruid(username);

	}

	@Then("^User Enter (.+)$")
	public void user_enter(String password) throws Throwable {
		loginpage.enterpwd(password);
	}

	@Then("^select login$")
	public void select_login() throws Throwable {
		loginpage.loginbutton();
		logger.info("login successfully");
		Screenshot util = new Screenshot(driver);
		util.takeSnapshot("./Screenshots/naukri.png");
		logger.info("Screenshot is taken successfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		loginpage.closed();

	}

}
