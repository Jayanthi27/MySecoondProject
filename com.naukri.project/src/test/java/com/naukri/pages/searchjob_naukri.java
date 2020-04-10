package com.naukri.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Browserfactory;

public class searchjob_naukri extends Browserfactory {

	@FindBy(id ="qsb-keyword-sugg")
	WebElement job;
	@FindBy(id = "qsb-location-sugg")
	WebElement location;
	@FindBy(xpath =  "//*[@id=\"root\"]/div[4]/div[1]/section/div/form/div[3]/button")
	WebElement search;
	public searchjob_naukri(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void job()
	{
		this.job.sendKeys("software tester");
	}

	public void place() {
		this.location.sendKeys("hyderabad");
	}
	public void find()
	{
		this.search.click();
	}
	public void closed()
	{
		driver.quit();
	}
}
