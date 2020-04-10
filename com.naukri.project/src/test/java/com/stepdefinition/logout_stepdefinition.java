package com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.naukri.pages.Logoutpage_naukri;
import com.naukri.pages.loginpage_naukri;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Browserfactory;
import utility.PageToRemovePopups;
import utility.Screenshot;

public class logout_stepdefinition extends Browserfactory {
	Logger logger = LogManager.getLogger(Logoutpage_naukri.class);
	loginpage_naukri loginpage;
	Logoutpage_naukri  logout;
	PageToRemovePopups popup;
	
	@Given("^Open chrome and start naukri application$")
	public void open_chrome_and_start_naukri_application() throws Throwable {

		driver = Browsersetup("Chrome");
		loginpage = new loginpage_naukri(driver);
		logout = new Logoutpage_naukri();
		popup = new PageToRemovePopups();
		popup.page();
		logger.info("Chrome Browser launches");
	}

	@When("^User enters valid (.+) and (.+)$")
	public void user_enters_valid_username_and_password(String username, String password) throws Throwable {
		logger.info("Naukri website is opened");
		loginpage.signin();
		loginpage.enteruid("jayanthimala.p27@gmail.com");
		loginpage.enterpwd("jaya@1234");

	}

	@Then("^user must able to login$")
	public void user_must_able_to_login() throws Throwable {
		loginpage.loginbutton();
		Thread.sleep(3000);
		logger.info("login successfully");
	}

	@Then("^user selects logout$")
	public void user_selects_logout() throws Throwable {

		logout.logoutpg();
		Screenshot util = new Screenshot(driver);
		util.takeSnapshot("./Screenshots/naukri2.png");
		logger.info("logout successfully");
		logout.closed();

	}

}
