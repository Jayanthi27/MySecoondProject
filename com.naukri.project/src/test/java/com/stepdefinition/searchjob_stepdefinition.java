package com.stepdefinition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.naukri.pages.Logoutpage_naukri;
import com.naukri.pages.searchjob_naukri;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Browserfactory;
import utility.PageToRemovePopups;

public class searchjob_stepdefinition extends Browserfactory {
	searchjob_naukri searchn = null;
	Logger logger = LogManager.getLogger(Logoutpage_naukri.class);
	PageToRemovePopups popup;
	    @Given("^Open the browser and start url$")
	    public void open_the_browser_and_start_url() throws Throwable {
	    	  driver = Browsersetup("Chrome");
	    	  popup = new PageToRemovePopups();
	    	  popup.page();
	    	  logger.info("Chrome Browser launches");
	    }

	    @When("^user selects the required search field$")
	    public void user_selects_the_required_search_field() throws Throwable {
	    	searchn = new searchjob_naukri(driver);
	    	searchn.job();
	    	logger.info("search option is selected");
	    }

	    @Then("^enter the  job and location fields$")
	    public void enter_the_job_and_location_fields() throws Throwable {
	    	searchn = new searchjob_naukri(driver);
	    	searchn.place();
	    }


	    @Then("^select search field$")
	    public void select_search_field() throws Throwable {
	    	searchn = new searchjob_naukri(driver);
	    	searchn.find();
	    	logger.info("job search is done");
	    	searchn.closed();
	    }


	   

}
