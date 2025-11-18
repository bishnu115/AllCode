package com.pp.qa.testcases;

import com.pp.qa.base.TestBase;
import com.pp.qa.pages.PP_InstituteDetailsPage;
import com.pp.qa.pages.PP_SparshPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PPSparshPageTest extends TestBase
{
    public PPSparshPageTest(){
        super();
    }
    PP_SparshPage sparsh;
    @BeforeClass
    public void setup(){
       // initialization();
        sparsh= new PP_SparshPage();
    }


    @Test(priority = 1)
    public void validateApplicationTitleTest()
    {
        String actualTitle=sparsh.validateApplicationDashboardTitleTest();
        String expectedTitle ="Partner Portal - Varthana";
        Assert.assertEquals(actualTitle, expectedTitle,
                "Application title \"Partner Portal - Varthana\" is not displayed");
    }
    @Test(priority = 2)
    public void validateVarthanaLogoTest() {
        boolean flag = sparsh.varthanaLogo();
        Assert.assertTrue(flag, "Varthana logo  is not displaying in sparsh Page");
    }
    @Test(priority = 3)
    public void validateGtrLogoTest() {
        boolean flag = sparsh.gtrLogo();
        Assert.assertTrue(flag, "gtr logo  is not displaying in sparsh Page");
    }
    @Test(priority = 4)
    public void validatePartnerPortalNameTest() {
        boolean flag = sparsh.partnerPortlName();
        Assert.assertTrue(flag, "Partner Portal name is not displaying in sparsh Page");
    }
    @Test(priority = 5)
    public void validatePartnerPortalVersionTest() {
        boolean flag = sparsh.partnerPortlVersion();
        Assert.assertTrue(flag, "Partner Portal version name is not displaying in sparsh Page");
    }
    @Test(priority = 6)
    public void validateDashboardNameTest() {
        boolean flag = sparsh.dashboardname();
        Assert.assertTrue(flag, "dashboard name is not displaying in sparsh Page");
    }
    @Test(priority = 7)
    public void validateInstituteDetailsNameTest() {
        boolean flag = sparsh.institutedetailaname();
        Assert.assertTrue(flag, "Institute details name is not displaying in sparsh Page");
    }
    @Test(priority = 8)
    public void validatSparshNameTest() {
        boolean flag = sparsh.sparshname();
        Assert.assertTrue(flag, "Sparsh name is not displaying in sparsh Page");
    }
    @Test(priority = 9)
    public void validateLeftsideCollapseIconTest() {
        boolean flag = sparsh.leftsidecollapseicon();
        Assert.assertTrue(flag, "Left side collapse icon is not displaying in sparsh Page");
    }
    @Test(priority = 10)
    public void validateUserMangmentIconTest() {
        boolean flag = sparsh.usermangment();
        Assert.assertTrue(flag, " User mangment icon is not displaying in sparsh Page");
    }
    @Test(priority = 11)
    public void validateUsernameTest() {
        boolean flag = sparsh.username();
        Assert.assertTrue(flag, "User name is not displaying in sparsh Page");
    }
    @Test(priority = 12)
    public void validateUsernamephotoTest() {
        boolean flag = sparsh.usernamephoto();
        Assert.assertTrue(flag, "User name photo is not displaying in sparsh Page");
    }
    @Test(priority = 13)
    public void validateSelectInstituteDropdownTest() {
        boolean flag = sparsh.selectinstitutedropdown();
        Assert.assertTrue(flag, "select institute dropdown is not displaying in sparsh Page");
    }
}
