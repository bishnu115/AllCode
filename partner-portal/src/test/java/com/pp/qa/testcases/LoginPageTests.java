package com.pp.qa.testcases;

import com.pp.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.pp.qa.pages.PP_LoginPage;

public class LoginPageTests extends TestBase {
    public LoginPageTests(){
        super();
    }
    PP_LoginPage loginpage;
    @BeforeClass
    public void setUp(){
        initialization();
        loginpage= new PP_LoginPage();

    }
    @Test(priority = 1)
        public void validateApplicationTitleTest()
        {
            String actualTitle=loginpage.validateApplicationTitle();
            String expectedTitle ="Partner Portal - Varthana";
            Assert.assertEquals(actualTitle, expectedTitle,
                    "Application title \"Partner Portal - Varthana\" is not displayed");
        }
    @Test(priority = 2)
    public void validateGtrNameTest() {
        boolean flag = loginpage.gtrNamedisplay();
        Assert.assertTrue(flag, "GTR name  is not displaying in username Login Page");
    }

    @Test(priority = 3)
    public void validateGtrLogoTest() {
        boolean flag = loginpage.gtrLogo();
        Assert.assertTrue(flag, "GTR logo  is not displaying in username Login Page");
    }

    @Test(priority = 4)
    public void validateVarthanaLogoTest() {
        boolean flag = loginpage.varthanaLogo();
        Assert.assertTrue(flag, "Varthana logo  is not displaying in username Login Page");
    }

    @Test(priority = 5)
    public void validatePartnerPortalNameTest() {
        boolean flag = loginpage.partnerPortlName();
        Assert.assertTrue(flag, "Partner Portal name is not displaying in username Login Page");
    }

    @Test(priority = 6)
    public void validateUserEmailidWithSpaceTest() {
        String actualErrorMessage = loginpage.userNameValidateWithSpace();
        String expectedErrorMessage = "Email is required";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Email is required\" is not displaying");
    }
    @Test(priority = 7)
    public void validateUserEmailidWithContinue() {
        String actualErrorMessage = loginpage.userNameValidateWithContinue();
        String expectedErrorMessage = "Email is required";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Email is required\" is not displaying");
    }

    @Test(priority = 8)
    public void validateUserEmailidWithWrongNameTest() {
        String actualErrorMessage = loginpage.userNameValidateWithWrongName();
        String expectedErrorMessage = "Enter valid email";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Enter valid email\" is not displaying");
    }

    @Test(priority = 9)
    public void validateUserEmailidWithSpaceInMiddleTest() {
        String actualErrorMessage = loginpage.userNameValidateWithWSpaceInMiddle();
        String expectedErrorMessage = "Enter valid email";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Enter valid email\" is not displaying");
    }
   @Ignore
    @Test(priority = 10)
    public void validateUserEmailidWithSpaceInfistTest() {
        String actualErrorMessage = loginpage.userNameValidateWithWSpaceInFastplace();
        String expectedErrorMessage = "Enter valid email";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Enter valid email\" is not displaying");
    }
    @Ignore
    @Test(priority = 11)
    public void validateUserEmailidWithSpaceInLastTest() {
        String actualErrorMessage = loginpage.userNameValidateWithWpaceInLastplace();
        String expectedErrorMessage = "Enter valid email";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Enter valid email\" is not displaying");
    }

    @Test(priority = 11)
    public void validateUserEmailidUpperCaseTest() {
        String actualErrorMessage = loginpage.userNameValidateWithUpperCase();
        String expectedErrorMessage = "Invalid email or password. Try Again";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Enter valid email\" is not displaying");
    }

    @Test(priority = 12)
    public void validUsernameTest()
    {
        loginpage.validateUserName();
    }

    @Test(priority = 13)
    public void validateApplicationTitlePasswoardTest()
    {
        String actualTitle=loginpage.validateApplicationTPasswoarditle();
        String expectedTitle ="Partner Portal - Varthana";
        Assert.assertEquals(actualTitle, expectedTitle,
                "Application title \"Partner Portal - Varthana\" is not displayed");
    }

   @Test(priority = 14)
    public void validateGtrNamePasswordTest() {
        boolean flag = loginpage.gtrNamedisplay();
        Assert.assertTrue(flag, "GTR name  is not displaying in password Login Page");
    }

    @Test(priority = 15)
    public void validateGtrLogoPasswordTest() {
        boolean flag = loginpage.gtrLogo();
        Assert.assertTrue(flag, "GTR logo  is not displaying in password Login Page");
    }

    @Test(priority = 16)
    public void validateVarthanaLogoPasswordTest() {
        boolean flag = loginpage.varthanaLogo();
        Assert.assertTrue(flag, "Varthana logo  is not displaying in password Login Page");
    }

    @Test(priority = 17)
    public void validatePartnerPortalNamePasswordTest() {
        boolean flag = loginpage.partnerPortlName();
        Assert.assertTrue(flag, "Partner Portal name is not displaying in password Login Page");
    }

    @Test(priority = 18)
    public void validatePasswordWithloginTest() {
        String actualErrorMessage = loginpage.passwordValidateWithlogin();
        String expectedErrorMessage = "Password is required";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Enter valid password\" is not displaying");
    }

    @Test(priority = 19)
    public void validatePasswordWithSpaceTest() {
        String actualErrorMessage = loginpage.passwordValidateWithspace();
        String expectedErrorMessage = "Invalid email or password. Try Again";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Enter valid password\" is not displaying");
    }

    @Test(priority = 20)
    public void validatePasswordWithWrongNameTest() throws InterruptedException {
        String actualErrorMessage = loginpage.passwordValidateWithWrongname();
        String expectedErrorMessage = "Invalid email or password. Try Again";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Enter valid password\" is not displaying");
    }
@Ignore
    @Test(priority = 21)
    public void validatePasswordWithSpacefistPlaceTest() throws InterruptedException {
        String actualErrorMessage = loginpage.passwordValidateWithSpaceInFistPlace();
        String expectedErrorMessage = "Invalid email or password. Try Again";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Enter valid password\" is not displaying");
    }
@Ignore
    @Test(priority = 22)
    public void validatePasswordWithSpaceLastPlaceTest() throws InterruptedException {
        String actualErrorMessage = loginpage.passwordValidateWithSpaceInLastPlace();
        String expectedErrorMessage = "Invalid email or password. Try Again";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Enter valid password\" is not displaying");
    }
    @Test(priority = 23)
    public void validatePasswordWithUpperCaseTest() throws InterruptedException {
        String actualErrorMessage = loginpage.passwordValidateWithUpperCase();
        String expectedErrorMessage = "Invalid email or password. Try Again";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Enter valid password\" is not displaying");
    }

    @Test(priority = 24)
    public void validatePasswordWithLowerCaseTest() throws InterruptedException {
        String actualErrorMessage = loginpage.passwordValidateWithLowercase();
        String expectedErrorMessage = "Invalid email or password. Try Again";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Enter valid password\" is not displaying");
    }


    @Test(priority = 25)
    public void validPasswordTest() throws InterruptedException {

        loginpage.validatePassword();
    }



}
