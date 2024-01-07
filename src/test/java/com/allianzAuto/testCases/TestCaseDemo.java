package com.allianzAuto.testCases;

//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.allianzAuto.pages.BaseTest;
import com.allianzAuto.pages.LoginPage;
//import com.allianzAuto.utility.ReadExcelFile;

public class TestCaseDemo extends BaseTest {
	@Test
	void verivyLogin() {
		LoginPage lp = new LoginPage(driver);
		String Email="riskisugiarto290@gmail.com";
		String Password="Cuanki2003@";
		lp.loginPortal(Email, Password);
	}
}
