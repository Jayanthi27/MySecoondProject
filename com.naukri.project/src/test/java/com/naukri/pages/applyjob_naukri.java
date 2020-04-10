package com.naukri.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Browserfactory;

public class applyjob_naukri extends Browserfactory {
	
	@FindBy(xpath="//*[@id=\"login_Layer\"]/div")
	WebElement login;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/input")
	WebElement username;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/form/div[3]/input")
	WebElement password;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/form/div[5]/button")
	WebElement loginbtn;
	
	@FindBy(xpath ="//*[@id=\"qsb-keyword-sugg\"]")
	WebElement jobs;
	@FindBy(xpath = "//*[@id=\"qsb-location-sugg\"]")
	WebElement location;
	@FindBy(xpath =  "//*[@id=\"root\"]/div[4]/div[1]/section/div/form/div[3]/button")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div[2]/section[2]/div[2]/article[1]/div[1]/div/a")
	WebElement viewall;
	
	@FindBy(xpath ="//*[@id=\"logToApp\"]")
	WebElement toapply;
	
	public applyjob_naukri(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void jobsearch()
	{
		this.jobs.sendKeys("software tester");
		
	}
	public void locationsearch()
	{
		this.location.sendKeys("Hyderabad");
		this.search.click();
	}
	
	public void view()
	{
	    this.viewall.click();
	}
	public void applyjb()
	{

		this.toapply.click();
	}
	public void closed()
	{
		driver.quit();
	}
}
