package com.allianzAuto.pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ProfilePage {
	WebDriver driver;
	public ProfilePage(WebDriver lDriver) {
		this.driver = lDriver;
		
		PageFactory.initElements(lDriver, this);
	}
	
	@FindBy(xpath = "/html/body/div/div/div[1]/div/div/header/div/div/div[3]/button/div") WebElement avatar;
	@FindBy(xpath = "/html/body/div[2]/div[3]/div[2]/a") WebElement profile;
	@FindBy(xpath = "//a[@href='/profile/my-purchase']") WebElement accessBuying;
	@FindBy(xpath = "//a[@href='/profile/my-activity']") WebElement activity;
	@FindBy(xpath = "//a[@href='/profile/my-transaction']") WebElement history;
	
	public void NavigateProvile() {
		try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		avatar.click();
		profile.click();
		accessBuying.click();
		activity.click();
		history.click();
	}
}
