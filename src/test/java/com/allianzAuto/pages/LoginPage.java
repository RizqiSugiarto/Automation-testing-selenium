package com.allianzAuto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver driver;
	//constructor
	public LoginPage(WebDriver lDriver)
	{
		this.driver=lDriver;
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="/html/body/div/div/div[1]/div/div/header/div/div/a[2]") WebElement loginclick;
	
	
	@FindBy(name="email") WebElement Eml;
	
	@FindBy(name="password") WebElement Pass;
	
//	@FindBy(id = ":r2:") WebElement loginButton;
	
	@FindBy(xpath="/html/body/div/div/div[1]/div/div/header/div/div/div[3]/button/div") WebElement logoutimage;

	@FindBy(xpath="/html/body/div[2]/div[3]/a") WebElement logoutclick;
	
	@FindBy(css = "button[type='submit'], input[type='submit']")WebElement submit;
	
	public void loginPortal(String email, String password) {
		try {
			loginclick.click();
			Eml.sendKeys(email);
			Pass.sendKeys(password);
			submit.click();
		} catch (Exception e) {
			Eml.sendKeys(email);
			Pass.sendKeys(password);
			submit.click();
		}
	}
	
	
	public void logout() {
		logoutimage.click();
		logoutclick.click();
	}



}
