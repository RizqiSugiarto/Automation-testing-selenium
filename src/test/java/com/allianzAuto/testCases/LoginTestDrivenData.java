package com.allianzAuto.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.allianzAuto.pages.BaseTest;
import com.allianzAuto.pages.LoginPage;
import com.allianzAuto.utility.ReadExcelFile;


public class LoginTestDrivenData extends BaseTest{
	String fileName=System.getProperty("user.dir")+"\\TestData\\testInfo.xlsx";
	@Test(priority =1,dataProvider="LoginDataProvider")
	void verivyLogin(String userEmail, String userPassword) throws IOException {
		LoginPage lp = new LoginPage(driver);
//		String Email="riskisugiarto290@gmail.com";
//		String Password="Cuanki2003@";
		lp.loginPortal(userEmail, userPassword);
//		lp.logout();
		
		if(userEmail.equals("riskisugiarto290@gmail.com") && userPassword.equals("Cuanki2003@"))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
			lp.logout();
		}
		else
		{
			captureScreenShot(driver,"VerifyLogin");
			Assert.assertTrue(false);
		}
	}
	@DataProvider(name="LoginDataProvider")
	public String[][] LoginDataProvider()
	{
		
		
		int ttlRows= ReadExcelFile.getRowCount(fileName, "LoginData");
		int ttlColumns= ReadExcelFile.getColCount(fileName, "LoginData");
		
		String data[][]= new String[ttlRows-1][ttlColumns];
		
		for(int i=1;i<ttlRows;i++)
		{
			for(int j=0;j<ttlColumns;j++)
			{
				data[i-1][j]=ReadExcelFile.getCellValue(fileName, "LoginData", i, j);
			}
		}
		return data;
	}
}
