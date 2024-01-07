package com.allianzAuto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SearchPage {
	WebDriver driver;
	
	public SearchPage(WebDriver lDriver) {
		this.driver = lDriver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[3]/div/div/div[1]/div/div[2]/div/div/div/a") WebElement ElearningButton;
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div[4]/div/div[1]/div[2]/div/input") WebElement searchForm;
	
	public void SearchCourse(String courseName) {
		ElearningButton.click();
		searchForm.sendKeys(courseName);
	}
}
