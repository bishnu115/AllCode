package com.sparsh.qa.base;

import com.se.qa.util.TestUtil;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public TestBase() {
        try {
            prop = new Properties();
            String path = "src/main/java/com/sparsh/qa/config/config.properties";
            FileInputStream input = new FileInputStream(path);
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() {
        String browserName = prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver");
            ChromeOptions option=new ChromeOptions();
            option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            option.addArguments("--enable-features=NetworkService,NetworkServiceInProcess");
            option.addArguments("--incognito");
            option.addArguments("--dns-prefetch-disable");
            option.addArguments("--disable-extensions");
            option.addArguments("--disable-infobars");
            option.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(option);
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
        driver.get(prop.getProperty("url"));
    }

    public void failed(String testMethodName) {
        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile, new File("screenShots/failed_shots_"+testMethodName+".jpg"));
        } catch (IOException E) {
            E.printStackTrace();
        }
    }

}
