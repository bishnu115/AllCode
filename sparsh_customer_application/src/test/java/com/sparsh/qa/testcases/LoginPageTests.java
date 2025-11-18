package com.sparsh.qa.testcases;

import com.sparsh.qa.base.TestBase;
import com.sparsh.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTests extends TestBase {
    public LoginPageTests(){
        super();
    }
    LoginPage loginPage;

    @BeforeClass
    public void setUp(){
        initialization();
        loginPage= new LoginPage();
    }

    @Test(priority = 1)
    public void validateApplicationTitleTest() {
        String actualApplicationTitle = loginPage.validateApplicationTitle();
        String expectedApplicationTitle = prop.getProperty("applicationTitle");
        Assert.assertEquals(actualApplicationTitle, expectedApplicationTitle,
                "Application title \"Sparsh - Varthana\" is not displayed");
    }

    @Test(priority = 2)
    public void validateSparshLogoTest() {
        boolean flag = loginPage.validateSparshLogo();
        Assert.assertTrue(flag, "Sparsh logo is not displaying in Login page Page");
    }

    @Test(priority = 3)
    public void validateVarthnaLogoTest() {
        boolean flag = loginPage.validateVarthnaLogo();
        Assert.assertTrue(flag, "Varthana logo is not displaying in Login Page");
    }

    @Test(priority = 4)
    public void validateCollegeNameTest() {
        String actualCollegeName = loginPage.validateCollegeName();
        String expectedCollegeName = prop.getProperty("collegeName");
        Assert.assertEquals(actualCollegeName, expectedCollegeName, "College name is not matching");
    }

    @Test(priority = 5)
    public void validateCollegeAddressTest() {
        String actualCollegeAddress = loginPage.validateCollegeAddress();
        String expectedCollegeAddress = prop.getProperty("collegeAddress");
        Assert.assertEquals(actualCollegeAddress, expectedCollegeAddress,
                "invalid college address in Login Page");
    }

    @Test(priority = 6)
    public void validateCollegeCityTest() {
        String actualCollegeCityName = loginPage.validateCollegeCity();
        String expectedCollegeCityName = prop.getProperty("collegeCity");
        Assert.assertEquals(actualCollegeCityName, expectedCollegeCityName,
                "College name is not displayed in Login Page");
    }

    @Test(priority = 7)
    public void validateCollegeStateTest() {
        String actualCollegeStateName = loginPage.validateCollegeState();
        String expectedCollegeStateName = prop.getProperty("collegeState");
        Assert.assertEquals(actualCollegeStateName, expectedCollegeStateName,
                "State name is not displayed in Login Page");
    }

    @Test(priority = 8)
    public void validateCollegePinCodeTest() {
        String actualCollegePinCode = loginPage.validateCollegePinCode();
        String expectedCollegePinCode = prop.getProperty("collegePincode");
        Assert.assertEquals(actualCollegePinCode, expectedCollegePinCode,
                "College pinCode is not displaying Login page");
    }

    @Test(priority = 9)
    public void validateLocationIconTest() {
        boolean flag = loginPage.validateLocationIcon();
        Assert.assertTrue(flag, "Location icon is not displayed in the Login Page");
    }

    @Test(priority = 10)
    public void validateHeadingVerifyYourPhoneNumberTest() {
        String actualHeading = loginPage.validateHeadingVerifyYourPhoneNumber();
        String expectedHeading = "Verify Your Phone Number";
        Assert.assertEquals(actualHeading, expectedHeading,
                "Phone verification heading is not displaying Login Page");
    }

    @Test(priority = 11)
    public void validatePhoneNumberWithZeroTest() {
        String actualErrorMessage = loginPage.validatePhoneNumberWithZero();
        String expectedErrorMessage = "Please enter a valid number";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter a valid number\" is not displaying");

    }

    @Test(priority = 12)
    public void validatingPhoneNumberWithNegativeValuesTest() {
        String actualErrorMessage = loginPage.validatingPhoneNumberWithNegativeValues();
        String expectedErrorMessage = "Please enter a valid number";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter a valid number\" is not displaying");
    }

    @Test(priority = 13)
    public void validatePhoneNumberWithLessThanTenDigitsTest() {
        String actualErrorMessage = loginPage.validatePhoneNumberWithLessThanTenDigits();
        String expectedErrorMessage = "Please enter a valid number";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter a valid number\" is not displaying");
    }

    @Test(priority = 14)
    public void validatePhoneNumberWithMoreThanTenDigitsTest() {
        String actualErrorMessage = loginPage.validatePhoneNumberWithMoreThanTenDigits();
        String expectedErrorMessage = "Please enter a valid number";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter a valid number\" is not displaying");
    }

    @Test(priority = 15)
    public void validateRadioBtnForSelfFundedTest() {
        boolean flag= loginPage.validateRadioBtnForSelfFunded();
        Assert.assertTrue(flag, "Radio button is not displaying");
    }

    @Test(priority = 16)
    public void validateRadioBtnForParentFundedTest() {
        boolean flag= loginPage.validateRadioBtnForParentFunded();
        Assert.assertTrue(flag, "Radio button is not displaying");
    }


//    @Test(priority = 17)
//    public void validateWhatsappAuthenticationChackboxTest() {
//        boolean flag = loginPage.validateWhatsappAuthenticationChackbox();
//        Assert.assertTrue(flag, "Whatsapp Authentication checkbox is not displayed");
//    }
//
//
//    @Test(priority = 18)
//    public void validateWorkingOfWhatsappAuthenticationCheckboxTest() {
//        boolean flag= loginPage.validateWorkingOfWhatsappAuthenticationCheckbox();
//        Assert.assertTrue(flag, "Whatsapp Authentication checkbox is not Selected");
//    }

    @Test(priority = 17)
    public void validateChoosingOfLoanTypeTest() {
        boolean flag= loginPage.validateChoosingOfLoanType();
        Assert.assertTrue(flag, "Loan Type is not Selected");
    }

    @Test(priority = 18)
    public void validateGetOtpButtonTest() {
        String actualResult = loginPage.validateGetOtpButton();
        String expectedResult = "GET OTP";
        Assert.assertEquals(actualResult, expectedResult, "Get otp button is not displayed");
    }

    @Test(priority = 19)
    public void validateEditPhoneNumberButtonTest() {
        boolean flag = loginPage.validateEditPhoneNumberButton();
        Assert.assertTrue(flag, "Edit Phone Number Button is not displayed");
    }

    @Test(priority = 20)
    public void validateEditingOfPhoneNumberTest() {
        boolean flag = loginPage.validateEditingOfPhoneNumber();
        Assert.assertTrue(flag, "Phone Number is not Edited");
    }

    @Test(priority = 21)
    public void validateResendOTPTimerTest() {
        boolean flag = loginPage.validateResendOTPTimer();
        Assert.assertTrue(flag, "Resend OTP Timer is not displaying");
    }

    @Test(priority = 22)
    public void validateToggleOTPButtonTest() throws InterruptedException{
        boolean flag = loginPage.validateToggleOTPButton();
        Assert.assertTrue(flag, "Toggle OTP Button is not displaying");
    }

//    @Test(priority = 18)
//    public void validateResendOtpButtonTest() {
//        String actualResult = loginPage.validateResendOtpButton();
//        String expectedResult = "Resend OTP";
//        Assert.assertEquals(actualResult, expectedResult, "Resend otp button is not displayed");
//    }

    @Test(priority = 23)
    public void validateInvalidOtpTest(){
        String actualInvalidOtpText = loginPage.validateInvalidOtp();
        String expectedInvalidOtpText = "Invalid OTP entered. Please enter valid OTP";
        Assert.assertEquals(actualInvalidOtpText,expectedInvalidOtpText,"Invalid OTP message is not displayed");
    }

//    @Test(priority = 24)
//    public void validateTheVerifyOtpButtonTest() {
//      String actualResult= loginPage.validateTheVerifyOtpButton();
//      String expectedResult = "VERIFY OTP";
//      Assert.assertEquals(actualResult,expectedResult,"Verify OTP button is not displayed");
//    }
//
//    @Test(priority = 18)
//    public void validateOtpValidationDialogBoxTest() {
//        boolean flag= loginPage.validateOtpValidationDialogBox();
//        Assert.assertTrue(flag,"OTP Validation dialog box is not displayed");
//    }

    @Test(priority = 25)
    public void validateLoginFunctionalityTest() throws IOException {
        loginPage.validateLoginFunctionality();
        String actualResult= driver.getCurrentUrl();
        String expectedResult = "https://sparsh-qa.varthana.com/kyc";
        Assert.assertEquals(actualResult,expectedResult,"Login Functionality didn't work");
    }

}