package com.allianzAuto.testCases;



import org.testng.annotations.Test;

import com.allianzAuto.pages.BaseTest;
import com.allianzAuto.pages.LoginPage;
import com.allianzAuto.pages.SearchPage;
import com.allianzAuto.utility.ReadExcelFile;

public class SearchTestCase extends BaseTest{
	
	String fileName=System.getProperty("user.dir")+"\\TestData\\testInfo.xlsx";
	
	@Test(priority = 1)
	void searchCourseTest() {
		LoginPage lp = new LoginPage(driver);
		String email = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginPortal(email, password);
		
		SearchPage sp = new SearchPage(driver);
		String searchCourse = ReadExcelFile.getCellValue(fileName, "searchCourse", 0, 0);
		sp.SearchCourse(searchCourse);
	}
	
}