package com.naukri.pages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Browserfactory;

public class loginpage_naukri extends Browserfactory {
	
	@FindBy(xpath="//*[@id=\"login_Layer\"]/div")
	WebElement login;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/input")
	WebElement username;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/form/div[3]/input")
	WebElement password;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/form/div[5]/button")
	WebElement loginbtn;
public loginpage_naukri(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	public void signin()
	{
		this.login.click();
	}
	public void enteruid(String username)
	{
		this.username.sendKeys(username);
	}
	public void enterpwd(String password)
	{
		this.password.sendKeys(password);
		
	}
	public void loginbutton()
	{
		this.loginbtn.click();
		
	}
	public void closed()
	{
		driver.quit();
	}
	
	
}
