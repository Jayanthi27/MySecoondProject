package com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.naukri.pages.Profileupdate_naukri;
import com.naukri.pages.loginpage_naukri;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Browserfactory;
import utility.PageToRemovePopups;
import utility.Screenshot;

public class Profileupdate_stepdefinition extends Browserfactory {
	Logger logger = LogManager.getLogger(Profileupdate_naukri.class);
	loginpage_naukri loginpage;
	Profileupdate_naukri profileup;
	PageToRemovePopups popup;
    @Given("^launch the chrome browser and the url$")
    public void launch_the_chrome_browser_and_the_url() throws Throwable {
    	driver = Browsersetup("Chrome");
    	 loginpage = new loginpage_naukri(driver);
    	 popup = new PageToRemovePopups();
    	 popup.page();
    	 Thread.sleep(2000);
    	 logger.info("Chrome Browser launches");
      
    }

@When("^enter valid details such as username and password$")
public void enter_valid_details_such_as_username_and_password() throws Throwable {
    	 loginpage = new loginpage_naukri(driver);
    	 loginpage.signin();
        loginpage.enteruid("jayanthimala.p27@gmail.com");
        loginpage.enterpwd("jaya@1234");
        loginpage.loginbutton();
        logger.info("login successfully");
    }

    @Then("^user selects the profile update option$")
    public void user_selects_the_profile_update_option() throws Throwable {
    	 profileup = new Profileupdate_naukri(driver);
    	 Thread.sleep(2000);
    	 profileup.viewprofile();
    	 logger.info("profile is opened");
    
    }

    @And("^verify the email$")
    public void verify_the_email() throws Throwable {
    	 profileup = new Profileupdate_naukri(driver);
    	 Thread.sleep(2000);
    	 profileup.views();
    	 profileup.verification();
    		Screenshot util = new Screenshot(driver);
    		util.takeSnapshot("./Screenshots/naukri4.png");
    	 logger.info("mail verfication is done");
    	 profileup.closed();
    
    }

}
