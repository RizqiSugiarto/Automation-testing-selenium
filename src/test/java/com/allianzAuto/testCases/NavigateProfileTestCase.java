package com.allianzAuto.testCases;

import org.testng.annotations.Test;

import com.allianzAuto.pages.BaseTest;
import com.allianzAuto.pages.LoginPage;
import com.allianzAuto.pages.ProfilePage;
import com.allianzAuto.utility.ReadExcelFile;

public class NavigateProfileTestCase extends BaseTest{
	String fileName=System.getProperty("user.dir")+"\\TestData\\testInfo.xlsx";
	
	@Test
	void navigate() {
		LoginPage lp = new LoginPage(driver);
		String email = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginPortal(email, password);
		
		ProfilePage sp = new ProfilePage(driver);
		sp.NavigateProvile();
		
	}
}
