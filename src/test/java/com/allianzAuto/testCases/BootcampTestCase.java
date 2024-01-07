package com.allianzAuto.testCases;

import org.testng.annotations.Test;

import com.allianzAuto.pages.BaseTest;
import com.allianzAuto.pages.BootcampPage;
import com.allianzAuto.pages.LoginPage;
import com.allianzAuto.utility.ReadExcelFile;

public class BootcampTestCase extends BaseTest{
	String fileName=System.getProperty("user.dir")+"\\TestData\\testInfo.xlsx";
	
	@Test
	
	void searchBootcamp() {
		LoginPage lp = new LoginPage(driver);
		String email = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginPortal(email, password);
		
		BootcampPage bp = new BootcampPage(driver);
		String searchBootcamp = ReadExcelFile.getCellValue(fileName, "bootCamp", 0, 0);
		bp.SearchBootcamp(searchBootcamp);
	}
}
