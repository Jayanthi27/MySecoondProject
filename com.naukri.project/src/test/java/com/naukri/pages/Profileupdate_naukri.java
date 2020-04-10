package com.naukri.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Browserfactory;


public class Profileupdate_naukri extends Browserfactory {
	
	@FindBy(xpath="//*[@id=\"login_Layer\"]/div")
	WebElement login;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/input")
	WebElement username;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/form/div[3]/input")
	WebElement password;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/form/div[5]/button")
	WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/span/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div")
    WebElement profile;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/span/div/div/div/div/div/div[1]/div[1]/div/div[2]/div/div[3]/div/a")
	WebElement view;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/span/div/div/div/div/div[2]/div/div[1]/div[1]/div[1]/div/div[3]/div/span")
	WebElement verify;
	
	public Profileupdate_naukri(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void viewprofile()
	{
		this.profile.click();
	}
	public void views()
	{
		this.view.click();
	}
	public void verification()
	{
		this.verify.click();
	}
	public void closed()
	{
		driver.quit();
	}
}
