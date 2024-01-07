package com.allianzAuto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BootcampPage {
	WebDriver driver;
	
	public BootcampPage(WebDriver lDriver) {
		this.driver = lDriver;
		
		PageFactory.initElements(lDriver, this);
	}
	@FindBy(xpath = "/html/body/div/div/div[1]/div/div/header/div/div/div[2]/a[3]") WebElement BootCampButton;
	@FindBy(css = "input[placeholder='Apa yang ingin kamu pelajari?']") WebElement searchForm;
	
	public void SearchBootcamp(String bootCampName) {
		BootCampButton.click();
		searchForm.sendKeys(bootCampName);
	}
}
