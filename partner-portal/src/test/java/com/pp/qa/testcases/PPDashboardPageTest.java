package com.pp.qa.testcases;

import com.pp.qa.base.TestBase;
import com.pp.qa.pages.PP_DashBoardPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PPDashboardPageTest  extends TestBase {
    public PPDashboardPageTest(){
        super();
    }
    PP_DashBoardPage dashboard;
    @BeforeClass
    public void setup(){
   //   initialization();
        dashboard= new PP_DashBoardPage();
    }


        @Test(priority = 1)
        public void validateApplicationTitleTest()
        {
            String actualTitle=dashboard.validateApplicationDashboardTitleTest();
            String expectedTitle ="Partner Portal - Varthana";
            Assert.assertEquals(actualTitle, expectedTitle,
                    "Application title \"Partner Portal - Varthana\" is not displayed");
        }

//Application tour










    @Test(priority = 2)
    public void validateVarthanaLogoTest() {
        boolean flag = dashboard.varthanaLogo();
        Assert.assertTrue(flag, "Varthana logo  is not displaying in dashboard Page");
    }
    @Test(priority = 3)
    public void validateGtrLogoTest() {
        boolean flag = dashboard.gtrLogo();
        Assert.assertTrue(flag, "gtr logo  is not displaying in dashboard Page");
    }
    @Test(priority = 4)
    public void validatePartnerPortalNameTest() {
        boolean flag = dashboard.partnerPortlName();
        Assert.assertTrue(flag, "Partner Portal name is not displaying in dashboard Page");
    }
    @Test(priority = 5)
    public void validatePartnerPortalVersionTest() {
        boolean flag = dashboard.partnerPortlVersion();
        Assert.assertTrue(flag, "Partner Portal version name is not displaying in dashboard Page");
    }
    @Test(priority = 6)
    public void validateDashboardNameTest() {
        boolean flag = dashboard.dashboardname();
        Assert.assertTrue(flag, "dashboard name is not displaying in dashboard Page");
    }
    @Test(priority = 7)
    public void validateInstituteDetailsNameTest() {
        boolean flag = dashboard.institutedetailaname();
        Assert.assertTrue(flag, "Institute details name is not displaying in dashboard Page");
    }
    @Test(priority = 8)
    public void validatSparshNameTest() {
        boolean flag = dashboard.sparshname();
        Assert.assertTrue(flag, "Sparsh name is not displaying in dashboard Page");
    }
    @Test(priority = 9)
    public void validateSelectInstituteSearchBoxTest() {
        boolean flag = dashboard.selectInstituteBox();
        Assert.assertTrue(flag, "Institute search box is not displaying in dashboard Page");
    }
    @Test(priority = 10)
    public void validateSelectInstituteNameTest() {
        boolean flag = dashboard.selectInstituteName();
        Assert.assertTrue(flag, "Select institutions name is not displaying on top of select institute search box of dashboard Page");
    }


    @Test(priority = 11)
    public void validateSelectInstituteSearchIconTest() {
        boolean flag = dashboard.selectInstituteSearchIcon();
        Assert.assertTrue(flag, "Select institution search icon is not displaying in dashboard Page");
    }
    @Test(priority = 12)
    public void validateLeftsideCollapseIconTest() {
        boolean flag = dashboard.leftsidecollapseicon();
        Assert.assertTrue(flag, "Left side collapse icon is not displaying in dashboard Page");
    }
    @Test(priority = 12)
    public void validateLeftsideCollapseIconFunctionalityTest() throws InterruptedException {
        dashboard.leftsidecollapseiconfuncitionality();
        System.out.println("Left side collapse button functionality working fine");
    }
    @Test(priority = 13)
    public void validateLoanApplicationNameTest() {
        boolean flag = dashboard.loanApplication();
        Assert.assertTrue(flag, "Loan applications name is not displaying in dashboard Page");
    }
    @Test(priority = 14)
    public void validateAnalyticsNameTest() {
        boolean flag = dashboard.analytics();
        Assert.assertTrue(flag, "Analytics name is not displaying in dashboard Page");
    }
    @Test(priority = 14)
    public void validateLoanIdSearchBoxTest() {
        boolean flag = dashboard.loanidsearchbox();
        Assert.assertTrue(flag, "Loan id search box is not displaying in dashboard Page");
    }
    @Test(priority = 15)
    public void validateExportButtonTest() {
        boolean flag = dashboard.export();
        Assert.assertTrue(flag, "export button  is not displaying in dashboard Page");
    }
    @Test(priority = 16)
    public void validateFilterButtonTest() {
        boolean flag = dashboard.filter();
        Assert.assertTrue(flag, "Filter button  is not displaying in dashboard Page");
    }
    @Test(priority = 17)
    public void validateUserMangmentIconTest() {
        boolean flag = dashboard.usermangment();
        Assert.assertTrue(flag, " User mangment icon is not displaying in dashboard Page");
    }
    @Test(priority = 18)
    public void validateCalanderStartDateTest() {
        boolean flag = dashboard.calanderstartdate();
        Assert.assertTrue(flag, "Calander start date is not displaying in dashboard Page");
    }
    @Test(priority = 18)
    public void validateCalanderEndDateTest() {
        boolean flag = dashboard.calanderendtdate();
        Assert.assertTrue(flag, "Calander end date is not displaying in dashboard Page");
    }
    @Test(priority = 19)
    public void validateCalanderAppluButtonTest() {
        boolean flag = dashboard.calanderapplybutton();
        Assert.assertTrue(flag, "Calander Apply button is not displaying in dashboard Page");
    }
    @Test(priority = 20)
    public void validateUsernameTest() {
        boolean flag = dashboard.username();
        Assert.assertTrue(flag, "User name is not displaying in dashboard Page");
    }
    @Test(priority = 21)
    public void validateUsernamephotoTest() {
        boolean flag = dashboard.usernamephoto();
        Assert.assertTrue(flag, "User name photo is not displaying in dashboard Page");
    }
    @Test(priority = 22)
    public void validateUserMangmentClickButtonTest() {
        dashboard.clickusermanagement();
    }
    @Test(priority = 23)
    public void validateMyDetailsButtonTest() {
        boolean flag = dashboard.mydetailsbutton();
        Assert.assertTrue(flag, "My details button is not displaying in dashboard Page");
    }
    @Test(priority = 24)
    public void validateUserListButtonTest() {
        boolean flag = dashboard.userlistbutton();
        Assert.assertTrue(flag, "User list button is not displaying in dashboard Page");
    }
    @Test(priority = 25)
    public void validateEditdetailsButtonTest() {
        boolean flag = dashboard.editlistbutton();
        Assert.assertTrue(flag, "Edit details button is not displaying in dashboard Page");
    }
    @Test(priority = 26)
    public void validateUserListClickButtonTest() throws InterruptedException {
        Thread.sleep(1000);
        dashboard.clickuserlist();
    }
    @Ignore
    @Test(priority = 27)
    public void validateAddUserButtonTest() throws InterruptedException {
        boolean flag = dashboard.adduserbutton();
        Assert.assertTrue(flag, "Add user  button is not displaying in dashboard Page");
    }
    @Ignore
    @Test(priority = 28)
    public void validateClickAddUserButtonTest() {
        dashboard.clickadduser();
    }
    @Ignore
    @Test(priority = 29)
    public void validateCancelButtonTest() throws InterruptedException {
        boolean flag = dashboard.editlistbAdduserbuttencancel();
        Assert.assertTrue(flag, "Cancel button is not displaying in dashboard Page");
    }
    @Ignore
    @Test(priority = 29)
    public void validateSaveButtonTest() throws InterruptedException {
        boolean flag = dashboard.editlistadduserbuttensave();
        Assert.assertTrue(flag, "Save button is not displaying in dashboard Page");
    }
    @Ignore
    @Test(priority = 30)
    public void validateClickCancelButtonTest() throws InterruptedException {
        dashboard.clickcancelbutton();
    }
    //=======contact support===========
    @Test(priority = 30)
    public void validateContactSupportIconButtonTest() throws InterruptedException {
        boolean flag = dashboard.contactsupporticon();
        Assert.assertTrue(flag, "Contact support icon is not displaying in dashboard Page");
    }
    @Test(priority = 31)
    public void validateClickContactSupportIconButtonTest() {
        dashboard.clickcontactsupporticonbutton();
    }
    @Test(priority = 32)
    public void validateContactSupportHeadlineNameTest() throws InterruptedException {
        boolean flag = dashboard.contactsupportname();
        Assert.assertTrue(flag, "Contact support name displaying in dashboard Page");
    }
    @Test(priority = 33)
    public void validateContactSupportSideHeadlineNameTest() throws InterruptedException {
        boolean flag = dashboard.contactsupportsideheading();
        Assert.assertTrue(flag, "Contact support side heading is not displaying in dashboard Page");
    }
    @Test(priority = 34)
    public void validateSelectIssueButtonTest() {
        dashboard.clickselectissuebutton();
    }
    @Test(priority = 35)
    public void validateIssueWithPartnerPortalNameTest() throws InterruptedException {
        boolean flag = dashboard.IssuewithPartnerPortal();
        Assert.assertTrue(flag, "Issue with Partner Portal is not displaying in dashboard Page");
    }
    @Test(priority = 36)
    public void validateIssueWithLoanIDNameTest() throws InterruptedException {
        boolean flag = dashboard.IssuewithLoanID();
        Assert.assertTrue(flag, "Issue with Loan ID is not displaying in dashboard Page");
    }
    @Test(priority = 37)
    public void validateIssuewithLoanIDClickTest() {
        dashboard.IssuewithLoanIDclick();
    }
    @Test(priority = 38)
    public void validateDescriptionBoxTest() throws InterruptedException {
        boolean flag = dashboard.descriptionbox();
        Assert.assertTrue(flag, "Description box is not displaying in dashboard Page");
    }
    @Test(priority = 39)
    public void validateClickPriorityBoxTest() {
        dashboard.clickprioritybox();
    }




@Ignore
@Test(priority = 31)
    public void enterLoanId() throws InterruptedException {
    dashboard.enterloanid();
}

















}

