package com.sparsh.qa.testcases;

import com.sparsh.qa.base.TestBase;
import com.sparsh.qa.pages.LoginPage;
import com.sparsh.qa.pages.UploadPANandKYCPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class UploadPANandKYCPageTests extends TestBase {
    public UploadPANandKYCPageTests() {
        super();
    }

    UploadPANandKYCPage uploadPANandKYCPage;
    LoginPage loginPage;

    @BeforeClass
    public void setUp() throws IOException {
        loginPage = new LoginPage();
//        uploadPANandKYCPage = loginPage.validateLoginFunctionality();
        uploadPANandKYCPage = new UploadPANandKYCPage();
    }

    @Test(priority = 1)
    public void validateApplicationTitleTest() {
        String actualApplicationTitle = uploadPANandKYCPage.validateApplicationTitle();
        String expectedApplicationTitle = prop.getProperty("applicationTitle");
        Assert.assertEquals(actualApplicationTitle, expectedApplicationTitle,
                "Application title \"Sparsh - Varthana\" is not displayed");
    }

    @Test(priority = 2)
    public void validateSparshLogoTest() {
        boolean flag = uploadPANandKYCPage.validateSparshLogo();
        Assert.assertTrue(flag, "Sparsh logo is not displaying in UploadPan and KYC Page");
    }

    @Test(priority = 3)
    public void validateVarthnaLogoTest() {
        boolean flag = uploadPANandKYCPage.validateVarthnaLogo();
        Assert.assertTrue(flag, "Varthana logo is not displaying in UploadPan and KYC Page");
    }

    @Test(priority = 4)
    public void validateCollegeNameTest() {
        String actualCollegeName = uploadPANandKYCPage.validateCollegeName();
        String expectedCollegeName = prop.getProperty("collegeName");
        Assert.assertEquals(actualCollegeName, expectedCollegeName, "College name is not matching in UploadPan and KYC Page");
    }

    @Test(priority = 5)
    public void validateCollegeAddressTest() {
        String actualCollegeAddress = uploadPANandKYCPage.validateCollegeAddress();
        String expectedCollegeAddress = prop.getProperty("collegeAddress");
        Assert.assertEquals(actualCollegeAddress, expectedCollegeAddress,
                "invalid college address in Upload Pan and KYC Page");
    }

    @Test(priority = 6)
    public void validateCollegeCityTest() {
        String actualCollegeCityName = uploadPANandKYCPage.validateCollegeCity();
        String expectedCollegeCityName = prop.getProperty("collegeCity");
        Assert.assertEquals(actualCollegeCityName, expectedCollegeCityName,
                "College name is not displayed in Upload Pan and KYC Page");
    }

    @Test(priority = 7)
    public void validateCollegeStateTest() {
        String actualCollegeStateName = uploadPANandKYCPage.validateCollegeState();
        String expectedCollegeStateName = prop.getProperty("collegeState");
        Assert.assertEquals(actualCollegeStateName, expectedCollegeStateName,
                "State name is not displayed in Upload Pan and KYC Page");
    }

    @Test(priority = 8)
    public void validateCollegePinCodeTest() {
        String actualCollegePinCode = uploadPANandKYCPage.validateCollegePinCode();
        String expectedCollegePinCode = prop.getProperty("collegePincode");
        Assert.assertEquals(actualCollegePinCode, expectedCollegePinCode,
                "College pinCode is not displaying Upload Pan and KYC Page");
    }

    @Test(priority = 9)
    public void validateLocationIconTest() {
        boolean flag = uploadPANandKYCPage.validateLocationIcon();
        Assert.assertTrue(flag, "Location icon is not displayed in the Upload Pan and KYC Page");
    }

    @Test(priority = 10)
    public void validateHelpButtonTest() {
        boolean flag = uploadPANandKYCPage.validateHelpButton();
        Assert.assertTrue(flag, "Help Button is not there displayed in the Upload Pan and KYC page");
    }

    @Test(priority = 11)
    public void validateHeadingUplaodAndVerifyPANTest() {
        String actualHeading = uploadPANandKYCPage.validateHeadingUplaodAndVerifyPAN();
        String expectedHeading = "Upload and Verify your PAN Details";
        Assert.assertEquals(actualHeading, expectedHeading,
                "PAN Uploading and Verification Heading is not displayed in the Uplaad PAN Page");
    }

    @Test(priority = 12)
    public void validateUploadPanbuttonTest() {
        boolean flag = uploadPANandKYCPage.validateUploadPanbutton();
        Assert.assertTrue(flag, "Upload Button is not displayed in the Upload Pan and KYC Page");
    }

    @Test(priority = 13)
    public void validateCameraButtonTest() {
        boolean flag = uploadPANandKYCPage.validateCameraButton();
        Assert.assertTrue(flag, "Camera Button is not displayed in the Upload Pan and KYC Page");
    }

    @Test(priority = 14)
    public void validateContinueButtonBeforePanUploadTest() {
        boolean flag = uploadPANandKYCPage.validateContinueButtonBeforePanUpload();
        Assert.assertTrue(!flag, "Continue Button is enabled Before uploading Pan");
    }

    @Test(priority = 15)
    public void validatePanIllustrationTest() {
        String actualImg = uploadPANandKYCPage.validatePanIllustration();
        String expectedImg = "https://sparsh-qa.varthana.com/static/media/Pan%20Card.5595062ce24eeb30b25bcf1c4f9e212c.svg";
        Assert.assertEquals(actualImg, expectedImg, "Incorrect Pan Illustration image is available Before Pan Upload");
    }

    @Test(priority = 16)
    public void validateCloseButtonBeforePanUploadTest() {
        boolean flag = uploadPANandKYCPage.validateCloseButtonBeforePanUpload();
        Assert.assertTrue(!flag, "Close Button is displayed even Before Uploading Pan");
    }

    @Test(priority = 17)
    public void validateUploadingPanFunctionalityTest() throws InterruptedException {
        boolean flag = uploadPANandKYCPage.validateUploadingPanFunctionality();
        Assert.assertTrue(flag, "PAN is not getting uploaded");
    }

    @Test(priority = 18)
    public void validateContinueButtonAfterPanUploadTest() {
        boolean flag = uploadPANandKYCPage.validateContinueButtonAfterPanUpload();
        Assert.assertTrue(flag, "Continue Button is not enabled After uploading Pan");
    }

    @Test(priority = 19)
    public void validateCloseButtonAfterPanUploadTest() {
        boolean flag = uploadPANandKYCPage.validateCloseButtonAfterPanUpload();
        Assert.assertTrue(flag, "Close Button is not displayed After Uploading Pan");
    }

    @Test(priority = 20)
    public void validateCameraButtonAfterPanUploadTest() {
        boolean flag = uploadPANandKYCPage.validateCameraButtonAfterPanUpload();
        Assert.assertTrue(!flag, "Camera Button is displayed even After Uplaoding Pan");
    }

    @Test(priority = 21)
    public void validateUploadPanButtonAfterPanUploadTest() {
        boolean flag = uploadPANandKYCPage.validateUploadPanButtonAfterPanUpload();
        Assert.assertTrue(!flag, "Uplaod Pan button is displayed even After Uplaoding Pan");
    }

    @Test(priority = 22)
    public void validatePANIllustrationAfterPanUploadTest() {
        String actual = uploadPANandKYCPage.validatePANIllustrationAfterPanUpload();
        String expected  = "/static/media/Pan Card.5595062ce24eeb30b25bcf1c4f9e212c.svg";
        Assert.assertNotEquals(actual, expected, "Incorrect PAN Illustration image is there After Uploading Pan");
    }

    @Test(priority = 23)
    public void validateCloseButtonFuntionalityTest() {
        boolean flag = uploadPANandKYCPage.validateCloseButtonFuntionality();
        Assert.assertTrue(flag, "Close Button is not working correctly");
    }

    @Test(priority = 24)
    public void validateInvalidPanUploadTest() {
        boolean flag = uploadPANandKYCPage.validateInvalidPanUpload();
        Assert.assertTrue(flag, "Validation for Invalid Pan upload is incorrect");
    }

    @Test(priority = 25)
    public void validateEmptyPanUploadTest() {
        boolean flag = uploadPANandKYCPage.validateEmptyPanUpload();
        Assert.assertTrue(flag, "Validation for Empty Pan upload is incorrect");
    }

//    @Test(priority = 26)
//    public void validateHelpButtonOnHoverTest() throws InterruptedException {
//        boolean flag = uploadPANandKYCPage.validateHelpButtonOnHover();
//        Assert.assertTrue(flag, "Validation for hovering of Help button is incorrect");
//    }

    @Test(priority = 27)
    public void validateContinueButtonFunctionalityAfterPanUploadTest() {
        uploadPANandKYCPage.validateContinueButtonFunctionalityAfterPanUpload();
        String actualResult= driver.getCurrentUrl();
        String expectedResult = "https://sparsh-qa.varthana.com/kyc";
        Assert.assertEquals(actualResult,expectedResult,"Continue Button Functionality didn't work");
    }
}