package org.deep.testcases;


import org.deep.pages.BaseClass;
import org.deep.pages.LandingPage;
import org.deep.utilities.ExcelDataProvider;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;


public class LoginTestDemoWebShop extends BaseClass {

    @Test
    public void login() {

        LandingPage landingpage = PageFactory.initElements(driver, LandingPage.class);

        landingpage.loginDemo(excelData.getStringData("Sheet1",0,0), excelData.getStringData("Sheet1",0,1));

    }
}
