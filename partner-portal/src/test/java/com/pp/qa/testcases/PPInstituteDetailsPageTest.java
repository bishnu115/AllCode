package com.pp.qa.testcases;

import com.pp.qa.base.TestBase;
import com.pp.qa.pages.PP_DashBoardPage;
import com.pp.qa.pages.PP_InstituteDetailsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PPInstituteDetailsPageTest extends TestBase
{
    public PPInstituteDetailsPageTest(){
        super();
    }
    PP_InstituteDetailsPage institute;
    PP_DashBoardPage dashboard1;
    @BeforeClass
    public void setup(){
     //   initialization();
        institute= new PP_InstituteDetailsPage();
        dashboard1= new PP_DashBoardPage();
    }

    @Test(priority = 1)
    public void validateApplicationTitleTest()
    {
        String actualTitle=institute.validateApplicationDashboardTitleTest();
        String expectedTitle ="Partner Portal - Varthana";
        Assert.assertEquals(actualTitle, expectedTitle,
                "Application title \"Partner Portal - Varthana\" is not displayed");
    }
    @Test(priority = 2)
    public void validateVarthanaLogoTest() {
        boolean flag = institute.varthanaLogo();
        Assert.assertTrue(flag, "Varthana logo  is not displaying in institute Page");
    }
    @Test(priority = 3)
    public void validateGtrLogoTest() {
        boolean flag = institute.gtrLogo();
        Assert.assertTrue(flag, "gtr logo  is not displaying in institute Page");
    }
    @Test(priority = 4)
    public void validatePartnerPortalNameTest() {
        boolean flag = institute.partnerPortlName();
        Assert.assertTrue(flag, "Partner Portal name is not displaying in institute Page");
    }
    @Test(priority = 5)
    public void validatePartnerPortalVersionTest() {
        boolean flag = institute.partnerPortlVersion();
        Assert.assertTrue(flag, "Partner Portal version name is not displaying in institute Page");
    }
    @Test(priority = 6)
    public void validateDashboardNameTest() {
        boolean flag = institute.dashboardname();
        Assert.assertTrue(flag, "dashboard name is not displaying in institute Page");
    }
    @Test(priority = 7)
    public void validateInstituteDetailsNameTest() {
        boolean flag = institute.institutedetailaname();
        Assert.assertTrue(flag, "Institute details name is not displaying in institute Page");
    }
    @Test(priority = 8)
    public void validatSparshNameTest() {
        boolean flag = institute.sparshname();
        Assert.assertTrue(flag, "Sparsh name is not displaying in institute Page");
    }
    @Test(priority = 9)
    public void validateLeftsideCollapseIconTest() {
        boolean flag = institute.leftsidecollapseicon();
        Assert.assertTrue(flag, "Left side collapse icon is not displaying in institute Page");
    }
    @Test(priority = 10)
    public void validateUserMangmentIconTest() {
        boolean flag = institute.usermangment();
        Assert.assertTrue(flag, " User mangment icon is not displaying in institute Page");
    }
    @Test(priority = 11)
    public void validateUsernameTest() {
        boolean flag = institute.username();
        Assert.assertTrue(flag, "User name is not displaying in institute Page");
    }
    @Test(priority = 12)
    public void validateUsernamephotoTest() {
        boolean flag = institute.usernamephoto();
        Assert.assertTrue(flag, "User name photo is not displaying in institute Page");
    }
    @Test(priority = 13)
    public void validateInstituteDetailsButtonTest() {
        boolean flag = institute.institutedetailsbutton();
        Assert.assertTrue(flag, "institute details button is not displaying in institute Page");
    }
    @Test(priority = 14)
    public void validateCourseDetailsButtonTest() {
        boolean flag = institute.coursedetailsbutton();
        Assert.assertTrue(flag, "course details button is not displaying in institute Page");
    }
    @Test(priority = 15)
    public void validateMouDetailsButtonTest() {
        boolean flag = institute.moudetailsbutton();
        Assert.assertTrue(flag, "MOU details button is not displaying in institute Page");
    }
                                                                                          //=======contact support===========
    @Test(priority = 16)
    public void validateContactSupportIconButtonTest() throws InterruptedException {
        boolean flag = dashboard1.contactsupporticon();
        Assert.assertTrue(flag, "Contact support icon is not displaying in institute details page");
    }
    @Test(priority = 17)
    public void validateClickContactSupportIconButtonTest() {
        dashboard1.clickcontactsupporticonbutton();
    }
    @Test(priority = 18)
    public void validateContactSupportHeadlineNameTest() throws InterruptedException {
        boolean flag = dashboard1.contactsupportname();
        Assert.assertTrue(flag, "Save button is not displaying in institute details  Page");
    }
    @Test(priority = 19)
    public void validateContactSupportSideHeadlineNameTest() throws InterruptedException {
        boolean flag = dashboard1.contactsupportsideheading();
        Assert.assertTrue(flag, "Contact support side heading is not displaying in institute details  Page");
    }
    @Test(priority = 20)
    public void validateSelectIssueButtonTest() {
        dashboard1.clickselectissuebutton();
    }
    @Test(priority = 21)
    public void validateIssueWithPartnerPortalNameTest() throws InterruptedException {
        boolean flag = dashboard1.IssuewithPartnerPortal();
        Assert.assertTrue(flag, "Issue with Partner Portal is not displaying in institute details  Page");
    }
    @Test(priority = 22)
    public void validateIssueWithLoanIDNameTest() throws InterruptedException {
        boolean flag = dashboard1.IssuewithLoanID();
        Assert.assertTrue(flag, "Issue with Loan ID is not displaying in institute details Page");
    }
    @Test(priority = 23)
    public void validateIssuewithLoanIDClickTest() {
        dashboard1.IssuewithLoanIDclick();
    }
    @Test(priority = 24)
    public void validateDescriptionBoxTest() throws InterruptedException {
        boolean flag = dashboard1.descriptionbox();
        Assert.assertTrue(flag, "Description box is not displaying in institute details Page");
    }

    @Test(priority = 25)
    public void validateClickPriorityBoxTest() {
        dashboard1.clickprioritybox();
    }



    }
