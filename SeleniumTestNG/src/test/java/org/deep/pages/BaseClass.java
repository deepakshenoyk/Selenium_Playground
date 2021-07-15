package org.deep.pages;

import org.deep.utilities.BrowserFactory;
import org.deep.utilities.ConfigDataProvider;
import org.deep.utilities.ExcelDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
    public WebDriver driver;
    public ExcelDataProvider excelData;
    public ConfigDataProvider config;

    @BeforeSuite
    public void setupSuite() {

        excelData = new ExcelDataProvider();
        config = new ConfigDataProvider();
    }


    @BeforeClass
    public void setup() {

        driver = BrowserFactory.startApplication(driver, config.getProperty("Browser"), config.getProperty("URL"));

    }

    @AfterClass
    public void teardown() {
        BrowserFactory.quitDriver(driver);
    }
}
