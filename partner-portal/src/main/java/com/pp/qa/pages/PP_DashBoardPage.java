package com.pp.qa.pages;

import com.pp.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PP_DashBoardPage extends TestBase {

    public PP_DashBoardPage() {
        PageFactory.initElements(driver, this);
    }

    //application tour
  
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
    @FindBy(id = "mui-component-select-colleges")
    WebElement institute_searchbox;
    @FindBy(xpath = "//label[text()='Select Institutions ']")
    WebElement select_institute_name;
    @FindBy(xpath = "//div[@class='MuiStack-root css-1jpo6rf']//button[@type='button']")
    WebElement institutesearchiconbox;
    @FindBy(xpath = "//button[@data-testid='collapse-button']")
    WebElement leftsidecollapseicon;
    @FindBy(xpath = "//button[text()='Loan Applications']")
    WebElement loanapplication;
    @FindBy(xpath = "//button[text()='Analytics']")
    WebElement Analytics;
    @FindBy(xpath = "//input[@placeholder='Applicant Name, Phone, Loan ID, UTR #']")
    WebElement loanid_searchbox;
    @FindBy(xpath = "//button[text()='Export']")
    WebElement export;
    @FindBy(xpath = "//span[@aria-label='edit']")
    WebElement user_mangment;
    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-qfko9']")
    WebElement user_name;
    @FindBy(xpath = "//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-17adfph']")
    WebElement user_name_photo;


    //calander
    @FindBy(id = "start")
    WebElement calander_start_day;
    @FindBy(id = "end")
    WebElement calander_end_day;
    @FindBy(xpath = "//div[@aria-label='Move backward to switch to the previous month.']")
    WebElement calander_pervious_mounth;
    @FindBy(xpath = "(//button[text()='Apply'])[1]")
    WebElement calander_apply;

    @FindBy(xpath = "//button[text()='My Details']")
    WebElement my_details_button;
    @FindBy(xpath = "//button[text()='User List']")
    WebElement user_list_button;
    @FindBy(xpath = "//button[text()='Edit Details']")
    WebElement edit_details_button;
    @FindBy(xpath = "//button[@aria-label='Add User']//button[@type='button']")
    WebElement add_user;
    @FindBy(xpath = "//button[text()='Cancel']")
    WebElement add_user_cancel;
    @FindBy(xpath = "//button[text()='Save']")
    WebElement add_user_save;

                                                                 //contact support
    @FindBy(xpath = "//button[@aria-label='add']")
    WebElement contact_support_icon;
    @FindBy(xpath = "//h2[text()='Contact Support']")
    WebElement contact_support_name;
    @FindBy(xpath = "//p[text()='Please elaborate the issue and also upload a screenshot of the same']")
    WebElement contact_support_heading;
    @FindBy(id = "demo-simple-select")
    WebElement select_issue_box;
    @FindBy(xpath = "//li[text()='Issue with Partner Portal']")
    WebElement Issue_with_Partner_Portal;
    @FindBy(xpath = "//li[text()='Issue with Loan ID']")
    WebElement Issue_with_Loan_ID;
    @FindBy(id = "name")
    WebElement description_box;
    @FindBy(id = "demo-simple-select")
    WebElement select_priority_box;



                                                             //filter section all element path
    @FindBy(xpath = "//button[@aria-label='Open Filter Menu']")
    WebElement openFilterMenu;

    @FindBy(xpath = "(//button[text()='Apply'])[2]")
    WebElement filterApply;
    @FindBy(xpath = "//button[text()='Reset']")
    WebElement filterRest;
    @FindBy(xpath = "//p[text()='LOAN STATUS']")
    WebElement filter_loan_status_type;
    @FindBy(xpath = "//button[text()='APPLICATION TYPE']")
    WebElement filter_application_type;
    @FindBy(xpath = "//span[text()='all']")
    WebElement filter_all;

    @FindBy(xpath = "//input[@value='Rejected']")
    WebElement filter_rejected;
    @FindBy(xpath = "//input[@value='Application Submitted']")
    WebElement filter_Application_Submitted;
    @FindBy(xpath = "//input[@value='Application Under Review']")
    WebElement filter_Application_Under_Review;
    @FindBy(xpath = "//input[@value='Loan Sanctioned']")
    WebElement filter_loan_sanctioned;
    @FindBy(xpath = "//input[@value='Customer acceptance']")
    WebElement filter_customer_acceptance;
    @FindBy(xpath = "//input[@value='Loan Disbursed']")
    WebElement filter_loan_disbursed;
    @FindBy(xpath = "//input[@value='Disbursement in Progress']")
    WebElement filter_disbursement_in_progress;
    @FindBy(xpath = "//input[@value='Ops Review']")
    WebElement filter_ops_review;
    @FindBy(xpath = "//span[text()='Self Funded']")
    WebElement filter_self_funded;
    @FindBy(xpath = "//span[text()='Non Self Funded']")
    WebElement filter_non_self_funded;


    //filter institute-----------------------------------------
    @FindBy(id = "mui-component-select-colleges")
    WebElement select_institute;
    @FindBy(xpath = "//span[text()='All']")
    WebElement select_institute_all;
    @FindBy(xpath = "//span[text()='Varthana Personal Loan']")
    WebElement select_institute_Varthana_Personal_Loan;
    @FindBy(xpath = "//span[text()='Varthana Pvt Ltd']")
    WebElement select_institute_Varthana_Pvt_Ltd;
    @FindBy(xpath = "//span[text()='Test No Cost Advance Emi 1']")
    WebElement select_institute_Test_No_Cost_Advance_Emi_1;
    @FindBy(xpath = "//span[text()='Geetham University']")
    WebElement select_institute_Geetham_University;
    @FindBy(xpath = "//span[text()='Jntu']")
    WebElement select_institute_jntu;
    @FindBy(xpath = "//span[text()='Kgf Institute']")
    WebElement select_institute_Kgf_Institute;
    @FindBy(xpath = "//span[text()='Sheshdripuram College']")
    WebElement select_institute_Sheshdripuram_College;
    @FindBy(xpath = "//span[text()='Vijayanagar College Of Nursing']")
    WebElement select_institute_Vijayanagar_College_Of_Nursing;
    @FindBy(xpath = "//span[text()='Tin Factory College']")
    WebElement select_institute_Tin_Factory_College;
    @FindBy(xpath = "//input[@placeholder='Applicant Name, Phone, Loan ID, UTR #']")
    WebElement loanid;
    @FindBy(xpath = "//span[text()='N/A']")
    WebElement loanid_click;


    JavascriptExecutor script = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(16));


    public String validateApplicationDashboardTitleTest() {
        dashboard.click();
        String title = driver.getTitle();
        System.out.println("===================================================Dashboard page======================================================");
        System.out.println("Title is displayed in Dashboardpage= " + title);
        return title;
    }
    //application tour










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

    public boolean selectInstituteBox() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("mui-component-select-colleges")));
        boolean flag = institute_searchbox.isDisplayed();
        System.out.println("institute search box is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean selectInstituteName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//label[text()='Select Institutions ']")));
        boolean flag = select_institute_name.isDisplayed();
        System.out.println("Select institutions  name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean selectInstituteSearchIcon() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='MuiStack-root css-1jpo6rf']//button[@type='button']")));
        boolean flag = institutesearchiconbox.isDisplayed();
        System.out.println("Select institutions Search icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean leftsidecollapseicon() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[@data-testid='collapse-button']")));
        boolean flag = leftsidecollapseicon.isDisplayed();
        System.out.println("Left side collapse icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public void leftsidecollapseiconfuncitionality() throws InterruptedException {
        leftsidecollapseicon.click();
        Thread.sleep(1000);
        leftsidecollapseicon.click();
    }


    public boolean loanApplication() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[text()='Loan Applications']")));
        boolean flag = loanapplication.isDisplayed();
        System.out.println("Loan applications name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean analytics() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[text()='Analytics']")));
        boolean flag = Analytics.isDisplayed();
        System.out.println("Analytics name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean loanidsearchbox() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Applicant Name, Phone, Loan ID, UTR #']")));
        boolean flag = loanid_searchbox.isDisplayed();
        System.out.println("Loan id search box  is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean export() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[text()='Export']")));
        boolean flag = export.isDisplayed();
        System.out.println("export button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean filter() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[@aria-label='Open Filter Menu']")));
        boolean flag = openFilterMenu.isDisplayed();
        System.out.println("Filter icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean usermangment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[@aria-label='edit']")));
        boolean flag = user_mangment.isDisplayed();
        System.out.println("User mangment  icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean calanderstartdate() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("start")));
        boolean flag = calander_start_day.isDisplayed();
        System.out.println("Calander start date is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean calanderendtdate() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("end")));
        boolean flag = calander_end_day.isDisplayed();
        System.out.println("Calander end date is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean calanderapplybutton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//button[text()='Apply'])[1]")));
        boolean flag = calander_apply.isDisplayed();
        System.out.println("Calander apply button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
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
        boolean flag = user_name_photo.isDisplayed();
        System.out.println("user name photo icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
                                                          //user managment
    public void clickusermanagement() {
        user_mangment.click();
        System.out.println("user management button click successfully");
    }

    public boolean mydetailsbutton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[text()='My Details']")));
        boolean flag = my_details_button.isDisplayed();
        System.out.println("My details button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean userlistbutton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[text()='User List']")));
        boolean flag = user_list_button.isDisplayed();
        System.out.println("User list button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean editlistbutton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[text()='Edit Details']")));
        boolean flag = edit_details_button.isDisplayed();
        System.out.println("Edit details button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public void clickuserlist() throws InterruptedException {
        Thread.sleep(2000);
        user_list_button.click();
        System.out.println("User list button click successfully");
    }

    public boolean adduserbutton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[@aria-label='Add User']//button[@type='button']")));
        boolean flag = add_user.isDisplayed();
        System.out.println("Add User button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public void clickadduser() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)");
        add_user.click();
    }

    public boolean editlistbAdduserbuttencancel() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[text()='Cancel']")));
        boolean flag = add_user_cancel.isDisplayed();
        System.out.println("cancel button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean editlistadduserbuttensave() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[text()='Save']")));
        boolean flag = add_user_save.isDisplayed();
        System.out.println("save button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public void clickcancelbutton() {
        add_user_cancel.click();
    }
                                                                //contact support

    public boolean contactsupporticon() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[@aria-label='add']")));
        boolean flag = contact_support_icon.isDisplayed();
        System.out.println("contact support icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public void clickcontactsupporticonbutton() {
        contact_support_icon.click();
    }
    public boolean contactsupportname() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h2[text()='Contact Support']")));
        boolean flag = contact_support_name.isDisplayed();
        System.out.println("contact support name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean contactsupportsideheading() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//p[text()='Please elaborate the issue and also upload a screenshot of the same']")));
        boolean flag = contact_support_heading.isDisplayed();
        System.out.println("contact support  heading is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public void clickselectissuebutton() {
        select_issue_box.click();
    }
    public boolean IssuewithPartnerPortal() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[text()='Issue with Partner Portal']")));
        boolean flag = Issue_with_Partner_Portal.isDisplayed();
        System.out.println("Issue with Partner Portalis displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean IssuewithLoanID () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[text()='Issue with Loan ID']")));
        boolean flag = Issue_with_Loan_ID.isDisplayed();
        System.out.println("Issue with Loan ID is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public void IssuewithLoanIDclick() {
        Issue_with_Loan_ID.click();
    }
    public boolean descriptionbox () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("name")));
        boolean flag = description_box.isDisplayed();
        System.out.println("description box is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        description_box.sendKeys("hii");
        System.out.println("In description box enter the text successfully");
        return flag;
    }
    public boolean prioritybox () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("demo-simple-select")));
        boolean flag = select_priority_box.isDisplayed();
        System.out.println("priority box is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public void clickprioritybox()
    {
        select_priority_box.click();
    }





    public void enterloanid() {
        dashboard.click();
        loanid_searchbox.sendKeys(prop.getProperty("loanid"));

    }
}
