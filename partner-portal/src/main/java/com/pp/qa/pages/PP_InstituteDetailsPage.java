package com.pp.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.pp.qa.base.TestBase.driver;

public class PP_InstituteDetailsPage {
    public PP_InstituteDetailsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement dashboard;
    @FindBy(xpath = "//img[@alt='varthanaLogo']")
    WebElement varthana_logo;
    @FindBy(xpath = "//img[@aria-label='Click Me']")
    WebElement gtr_logo;
    @FindBy(xpath = "//div[text()='Partner Portal']")
    WebElement partner_portal_name;
    @FindBy(xpath = "//span[text()='v1.0.18']")
    WebElement partner_portal_version;
    @FindBy(xpath = "//h6[text()='Institute Details']")
    WebElement institute_details;
    @FindBy(xpath = "//h6[text()='Sparsh']")
    WebElement sparsh;
    @FindBy(xpath = "//button[@data-testid='collapse-button']")
    WebElement leftsidecollapseicon;
    @FindBy(xpath = "//span[@aria-label='edit']")
    WebElement user_mangment;
    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-qfko9']")
    WebElement user_name;
    @FindBy(xpath = "//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-17adfph']")
    WebElement user_photo;
    @FindBy(xpath = "//button[text()='Institute Details']")
    WebElement institute_details_button;
    @FindBy(xpath = "//button[text()='Course Details']")
    WebElement course_details_button;
    @FindBy(xpath = "//button[text()='MOU Details']")
    WebElement mou_details_button;


                                                                                          //Application tour

@FindBy(id="driver-popover-title")
WebElement institute_details_popover_title;
    @FindBy(id="driver-popover-description")
    WebElement institute_details_popover_description;
    @FindBy(xpath = "//span[text()='1 of 5']")
    WebElement institute_details_popover_count1;
    @FindBy(xpath = "//button[text()='Next →']")
    WebElement next;
    @FindBy(xpath = "//button[text()='← Previous']")
    WebElement previous;
    @FindBy(xpath = "//button[@aria-label='Close']")
    WebElement close;
    @FindBy(id="driver-popover-title")
    WebElement sparsh_details_popover_title;
    @FindBy(id="driver-popover-description")
    WebElement sparsh_details_popover_description;
    @FindBy(xpath = "//span[text()='2 of 5']")
    WebElement sparsh_details_popover_count2;
    @FindBy(id="driver-popover-title")
    WebElement Analytics_popover_title;
    @FindBy(id="driver-popover-description")
    WebElement Analytics_popover_description;
    @FindBy(xpath = "//span[text()='3 of 5']")
    WebElement sparsh_details_popover_count3;
    @FindBy(id="driver-popover-title")
    WebElement loan_popover_title;
    @FindBy(id="driver-popover-description")
    WebElement loan_popover_description;
    @FindBy(xpath = "//span[text()='4 of 5']")
    WebElement loan_details_popover_count4;
    @FindBy(id="driver-popover-title")
    WebElement user_managment_popover_title;
    @FindBy(id="driver-popover-description")
    WebElement user_managmentpopover_description;
    @FindBy(xpath = "//span[text()='5 of 5']")
    WebElement user_managment_details_popover_count5;
    @FindBy(xpath = "//button[text()=''Done]")
    WebElement Done;




    JavascriptExecutor script = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));


    public String validateApplicationDashboardTitleTest() {
        institute_details.click();
        String title = driver.getTitle();
        System.out.println("==============================================================Institute Details page==================================================================");
        System.out.println("Title is displayed in Dashboardpage= " + title);
        return title;
    }
    public boolean varthanaLogo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//img[@alt='varthanaLogo']")));
        boolean flag = varthana_logo.isDisplayed();
        System.out.println("Varthana logo is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean gtrLogo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//img[@aria-label='Click Me']")));
        boolean flag = gtr_logo.isDisplayed();
        System.out.println("Gtr logo is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean partnerPortlName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[text()='Partner Portal']")));
        boolean flag = partner_portal_name.isDisplayed();
        System.out.println("Partner portal name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean partnerPortlVersion() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[text()='v1.0.18']")));
        boolean flag = partner_portal_version.isDisplayed();
        System.out.println("Partner portal version is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean dashboardname() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h6[text()='Dashboard']")));
        boolean flag = dashboard.isDisplayed();
        System.out.println("Dashboard name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean institutedetailaname() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h6[text()='Institute Details']")));
        boolean flag = institute_details.isDisplayed();
        System.out.println("Institute details name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean sparshname() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h6[text()='Sparsh']")));
        boolean flag = sparsh.isDisplayed();
        System.out.println("Sparsh name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean leftsidecollapseicon() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[@data-testid='collapse-button']")));
        boolean flag = leftsidecollapseicon.isDisplayed();
        System.out.println("Left side collapse icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean usermangment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[@aria-label='edit']")));
        boolean flag = user_mangment.isDisplayed();
        System.out.println("User mangment  icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean username() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-qfko9']")));
        boolean flag = user_name.isDisplayed();
        System.out.println("user name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean usernamephoto() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-17adfph']")));
        boolean flag = user_photo.isDisplayed();
        System.out.println("user name photo icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean institutedetailsbutton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[text()='Institute Details']")));
        boolean flag = institute_details_button.isDisplayed();
        System.out.println("Institute details button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean coursedetailsbutton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[text()='Course Details']")));
        boolean flag = course_details_button.isDisplayed();
        System.out.println("course details button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean moudetailsbutton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[text()='MOU Details']")));
        boolean flag = mou_details_button.isDisplayed();
        System.out.println("MOU details button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }






}
