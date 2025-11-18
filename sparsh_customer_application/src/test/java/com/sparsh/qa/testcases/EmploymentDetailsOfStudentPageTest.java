package com.sparsh.qa.testcases;

import com.sparsh.qa.base.TestBase;
import com.sparsh.qa.pages.EmploymentDetailsIOfStudentPage;
import com.sparsh.qa.pages.LoginPage;
import com.sparsh.qa.pages.PersonalDetailsPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class EmploymentDetailsOfStudentPageTest extends TestBase {

    public EmploymentDetailsOfStudentPageTest() {
        super();
    }

    EmploymentDetailsIOfStudentPage EmploymentDetails;
    LoginPage loginPage2;

    @BeforeClass
    public void setUp() {
        //  initialization();
        EmploymentDetails = new EmploymentDetailsIOfStudentPage();
        loginPage2 = new LoginPage();

    }
    @Test(priority = 1)
    public void validateApplicationTitleTest() {
        String actualApplicationTitle = EmploymentDetails.validateApplicationTitle();
        String expectedApplicationTitle = prop.getProperty("applicationTitle");
        Assert.assertEquals(actualApplicationTitle, expectedApplicationTitle,
                "Application title \"Sparsh - Varthana\" is not displayed");
    }
    @Test(priority = 2)
    public void validateSparshLogoTest() {
        boolean flag = loginPage2.validateSparshLogo();
        Assert.assertTrue(flag, "Sparsh logo is not displaying in UploadPan and KYC Page");
    }

    @Test(priority = 3)
    public void validateVarthnaLogoTest() {
        boolean flag = loginPage2.validateVarthnaLogo();
        Assert.assertTrue(flag, "Varthana logo is not displaying in Login Page");
    }

    @Test(priority = 4)
    public void validateCollegeNameTest() {
        String actualCollegeName = loginPage2.validateCollegeName();
        String expectedCollegeName = prop.getProperty("collegeName");
        Assert.assertEquals(actualCollegeName, expectedCollegeName, "College name is not matching");
    }

    @Test(priority = 5)
    public void validateCollegeAddressTest() {
        String actualCollegeAddress = loginPage2.validateCollegeAddress();
        String expectedCollegeAddress = prop.getProperty("collegeAddress");
        Assert.assertEquals(actualCollegeAddress, expectedCollegeAddress,
                "invalid college address in Login Page");
    }

    @Test(priority = 6)
    public void validateCollegeCityTest() {
        String actualCollegeCityName = loginPage2.validateCollegeCity();
        String expectedCollegeCityName = prop.getProperty("collegeCity");
        Assert.assertEquals(actualCollegeCityName, expectedCollegeCityName,
                "College name is not displayed in Login Page");
    }

    @Test(priority = 7)
    public void validateCollegeStateTest() {
        String actualCollegeStateName = loginPage2.validateCollegeState();
        String expectedCollegeStateName = prop.getProperty("collegeState");
        Assert.assertEquals(actualCollegeStateName, expectedCollegeStateName,
                "State name is not displayed in Login Page");
    }

    @Test(priority = 8)
    public void validateCollegePinCodeTest() {
        String actualCollegePinCode = loginPage2.validateCollegePinCode();
        String expectedCollegePinCode = prop.getProperty("collegePincode");
        Assert.assertEquals(actualCollegePinCode, expectedCollegePinCode,
                "College pinCode is not displaying Login page");
    }

    @Test(priority = 9)
    public void validateLocationIconTest() {
        boolean flag = loginPage2.validateLocationIcon();
        Assert.assertTrue(flag, "Location icon is not displayed in the Login Page");
    }
    @Test(priority = 10)
    public void validateLoanIdTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validateLoanId();
        Assert.assertTrue(flag, "Loan id is not display");

    }
    @Test(priority = 11)
    public void validateLoanIdNumber(){
        EmploymentDetails.printLoanId();
    }
    @Test(priority = 12)
    public void validateOccupationNameTest() {
        boolean flag = EmploymentDetails.validateOccupationName();
        Assert.assertTrue(flag, "Occupation Name is not display");
    }
    @Test(priority = 13)
    public void validateEmploymentDetailsOfStudentHeaderTest() {
        boolean flag = EmploymentDetails.validateEmploymentDetailsOfStudentHeader();
        Assert.assertTrue(flag, "Employment details header is not display");
    }
    @Test(priority = 14)
    public void validateOccupationIconTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validateOccupationIcon();
        Assert.assertTrue(flag, "occupation icon is not display");
    }
    @Test(priority = 15)
    public void validateClickOccuptionTextBoxTest() {
        EmploymentDetails.clickOccuptionTextBox();
        System.out.println("Occupation text box click successfully");
    }
    @Test(priority = 16)
    public void validateOccupationSelfEmployedTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validateOccupationSelfEmployed();
        Assert.assertTrue(flag, "Occuption self employed  is Not displayed");
    }

    @Test(priority = 17)
    public void validateOccupationRetiredTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validateOccupationRetired();
        Assert.assertTrue(flag, "Occuption retired is Not displayed");
    }

    @Test(priority = 18)
    public void validateOccupationSalariedTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validateOccupationSalaried();
        Assert.assertTrue(flag, "Occuption salaried is Not displayed");
    }
    @Test(priority = 19)
    public void validateOccupationselfEmployedTest() throws InterruptedException {
        EmploymentDetails.clickSelfEmployed();
    }

    @Test(priority = 20)
    public void validateOccupationSelfEmployedAllTextBoxTest() throws InterruptedException {
        boolean result = EmploymentDetails.validateOccupationSelfEmployedAllTextBox();
        Assert.assertTrue(result, "One or more occupation self-employed text boxes are not displayed as expected.");
    }
    @Test(priority = 21)
    public void validatebusinessTypeNameTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validatebusinessTypeName();
        Assert.assertTrue(flag, "Business Type Proprieter is Not displayed");
    }
    @Test(priority = 22)
    public void validatebusinessTypeDropdownTest() throws InterruptedException {
        EmploymentDetails.validatebusinessTypeDropdown();
    }
    @Test(priority = 23)
    public void validatebusinessTypeProprieterTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validatebusinessTypeProprieter();
        Assert.assertTrue(flag, "Business Type Proprieter is Not displayed");
    }
    @Test(priority = 24)
    public void validateBusinessTypePartnershipFirmTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validateBusinessTypePartnershipFirm();
        Assert.assertTrue(flag, "Business Type Partnership Firm is Not displayed");
    }
    @Test(priority = 25)
    public void validatebusinessTypePrivateLimitedTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validatebusinessTypePrivateLimited();
        Assert.assertTrue(flag, "business Type Private Limited is Not displayed");
    }
    @Test(priority = 26)
    public void validateBusinessTypeIconTest() {
        boolean flag = EmploymentDetails.validateBusinessTypeIcon();
        Assert.assertTrue(flag, "Business type icon is not display");
    }
    @Test(priority = 27)
    public void validateNameOfBusinessNameTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validateNameOfBusinessName();
        Assert.assertTrue(flag, "name of business text box is Not displayed");
    }
    @Test(priority = 28)
    public void validateBachelorAccomodationIconTest() {
        boolean flag = EmploymentDetails.validatenameOfBusinessIcon();
        Assert.assertTrue(flag, "Name of business icon is not display");
    }

    @Test(priority = 29)
    public void ValidatenameOfbusinessonlyNumberTest() {
        String actualErrorMessage = EmploymentDetails.ValidatenameOfbusinessonlyNumber();
        String expectedErrorMessage = "Please enter valid business name";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter valid business name\" is not displaying");

    }
    @Test(priority = 30)
    public void ValidatenameOfBusinessonlySpacialcharacterTest() {
        String actualErrorMessage = EmploymentDetails.ValidatenameOfBusinessonlySpacialcharacter();
        String expectedErrorMessage = "Please enter valid business name";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter valid business name\" is not displaying");
    }

    @Test(priority = 31)
    public void ValidatenameOfBusinessNumberwithSpacialcharacterTest() {
        String actualErrorMessage = EmploymentDetails.ValidatenameOfBusinessNumberwithSpacialcharacter();
        String expectedErrorMessage = "Please enter valid business name";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter valid business name\" is not displaying");
    }

    @Test(priority = 32)
    public void ValidatenameOfBusinessAlphabetwithSpacialcharacterTest() {
        String actualErrorMessage = EmploymentDetails.ValidatenameOfBusinessAlphabetwithSpacialcharacter();
        String expectedErrorMessage = "Please enter valid business name";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter valid business name\" is not displaying");
    }
    @Ignore
    @Test(priority = 33)
    public void ValidatenameOfBusinessAlphabetwithNumberTest() {
        boolean isDataValid = EmploymentDetails.ValidatenameOfBusinessAlphabetwithNumber();
        Assert.assertTrue(isDataValid, "Error message is displayed for valid data.");
    }
@Ignore
    @Test(priority = 34)
    public void ValidatenameOfbusinessAlphabetTest() {
        boolean isDataValid = EmploymentDetails.ValidatenameOfbusinessAlphabet();
        Assert.assertTrue(isDataValid, "Error message is displayed for valid data.");
    }

    @Test(priority = 35)
    public void validateaddressOfBusinessNameTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validateaddressOfBusinessName();
        Assert.assertTrue(flag, "name of business text box is Not displayed");
    }
    @Test(priority = 36)
    public void validateaddressOfBusinessIconTest() {
        boolean flag = EmploymentDetails.validateaddressOfBusinessIcon();
        Assert.assertTrue(flag, "Name of business icon is not display");
    }




    @Test(priority = 40)
    public void validateAddressOfBusinessTextBoxTest()
    {
        EmploymentDetails.validateAddressOfBusinessTextBox();
    }

    @Test(priority = 41)
    public void validatenumberOfYearInBusinessNameTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validatenumberOfYearInBusinessName();
        Assert.assertTrue(flag, "name of no of year in business is Not displayed");
    }

    @Test(priority = 42)
    public void numberOfYearInBusinessIconTest() {
        boolean flag = EmploymentDetails.numberOfYearInBusinessIcon();
        Assert.assertTrue(flag, "number Of Year In Business Icon is not display");
    }
    @Test(priority = 43)
    public void ValidatenumberOfYearInBusinessAs0YearsTest() {
        String actualErrorMessage = EmploymentDetails.ValidatenumberOfYearInBusinessAs0Years();
        String expectedErrorMessage = "Min Number of years in business is 1.";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Min Number of years in business is 1.\" is not displaying");
    }

    @Test(priority = 44)
    public void ValidatenumberOfYearInBusinessabove99YeaysTest() {
        String actualErrorMessage = EmploymentDetails.ValidatenumberOfYearInBusinessabove99Yeays();
        String expectedErrorMessage = "Max Number of years in business is 99.";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Max Number of years in business is 99\" is not displaying");
    }
    @Test(priority = 45)
    public void ValidatepincodeIconTest() {
        boolean flag = EmploymentDetails.ValidatepincodeIcon();
        Assert.assertTrue(flag, "Pincode icon is not display");
    }
    @Test(priority = 46)
    public void ValidatePincodeNameTest() throws InterruptedException {
        boolean flag = EmploymentDetails.ValidatePincodeName();
        Assert.assertTrue(flag, "Pincode name is Not displayed");
    }





    @Test(priority = 47)
    public void ValidatePinCodeLessThan6DigitTest() {
        String actualErrorMessage = EmploymentDetails.ValidatePinCodeLessThan6Digit();
        String expectedErrorMessage = "Please enter valid pincode";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter a valid pincode\" is not displaying");
    }

    @Test(priority = 48)
    public void ValidatePinCodeMoreThan6DigitTest() throws InterruptedException {
        String actualErrorMessage = EmploymentDetails.ValidatePinCodeMoreThan6Digit();
        String expectedErrorMessage = "Please enter valid pincode";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter valid pincode\" is not displaying");
    }

                                                                                      //occuption salaried

    @Test(priority = 60)
    public void validateOccupationsSalariedTest() throws InterruptedException {
        EmploymentDetails.clickSalaried();
    }

    @Test(priority = 61)
    public void validateOccupationSalariedAllTextBoxTest() throws InterruptedException {
        boolean result = EmploymentDetails.validateOccupationSalarieddAllTextBox();
        Assert.assertTrue(result, "One or more occupation self-employed text boxes are not displayed as expected.");
    }

    @Test(priority = 62)
    public void validateDesignationNameTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validateDesignationName();
        Assert.assertTrue(flag, "Designation name is Not displayed");
    }

    @Test(priority = 63)
    public void validateDesignationIconTest() {
        boolean flag = EmploymentDetails.validateDesignationIcon();
        Assert.assertTrue(flag, " Designation Icon is not display");
    }
    @Test(priority = 64)
    public void ValidateDesignationTextBoxLessThan5CharacterTest() {
        String actualErrorMessage = EmploymentDetails.ValidateDesignationTextBoxLessThan5Character();
        String expectedErrorMessage = "Minimum characters should be more than 5";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Minimum characters should be more than 5\" is not displaying");
    }

    @Test(priority = 65)
    public void ValidateDesignationTextBoxMoreThan40CharacterTest() {
        String actualErrorMessage = EmploymentDetails.ValidateDesignationTextBoxMoreThan40Character();
        String expectedErrorMessage = "Maximum characters should be less than 40";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Maximum characters should be less than 40\" is not displaying");
    }

    @Test(priority = 70)
    public void validateEmployeNameNameTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validateEmployeNameName();
        Assert.assertTrue(flag, "Name Of Business Name is Not displayed");
    }

    @Test(priority = 71)
    public void validatenEmployeNameIconTest() {
        boolean flag = EmploymentDetails.validatenEmployeNameIcon();
        Assert.assertTrue(flag, "Employe name icon is not display");
    }

    @Test(priority = 72)
    public void ValidateEmployeeNameWithOnlyNumaricValueTest() {
        String actualErrorMessage = EmploymentDetails.ValidateEmployeeNameWithOnlyNumaricValue();
        String expectedErrorMessage = "Please enter valid employer name";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter valid employer name\" is not displaying");
    }

    @Test(priority = 75)
    public void ValidateEmployeeNameWithSpacialCharacterTest() {
        String actualErrorMessage = EmploymentDetails.ValidateEmployeeNameWithSpacialCharacter();
        String expectedErrorMessage = "Please enter valid employer name";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter valid employer name\" is not displaying");
    }

    @Test(priority = 77)
    public void ValidateEmployeeNameWithAlphbetAndSpacialCharacterTest() {
        String actualErrorMessage = EmploymentDetails.ValidateEmployeeNameWithAlphbetAndSpacialCharacter();
        String expectedErrorMessage = "Please enter valid employer name";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter valid employer name\" is not displaying");
    }

    @Test(priority = 78)
    public void validateAddressOfEmployerNameTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validateAddressOfEmployerName();
        Assert.assertTrue(flag, "name of business text box is Not displayed");
    }
    @Test(priority = 79)
    public void validateaddressOfEmployerIconTest() {
        boolean flag = EmploymentDetails.validateaddressOfEmployerIcon();
        Assert.assertTrue(flag, "Name of business icon is not display");
    }




    @Test(priority = 80)
    public void validateAddressOfEmployerTextBoxTest()
    {
        EmploymentDetails.validateAddressOfEmployerTextBox();
    }

    @Test(priority = 100)
    public void validatepincodeIconTest() {
        boolean flag = EmploymentDetails.validatepincodeIcon();
        Assert.assertTrue(flag, "Pincode icon is not display");
    }
    @Test(priority = 101)
    public void validatePincodeNameTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validatePincodeName();
        Assert.assertTrue(flag, "Pincode name is Not displayed");
    }

    @Test(priority = 102)
    public void ValidatePinCodeLessThan6digitTest() throws InterruptedException {
        String actualErrorMessage = EmploymentDetails.ValidatePinCodeLessThan6digit();
        String expectedErrorMessage = "Please enter valid pincode";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter a valid pincode\" is not displaying");
    }

    @Test(priority = 103)
    public void ValidatePinCodeMoreThan6digitTest() throws InterruptedException {
        String actualErrorMessage = EmploymentDetails.ValidatePinCodeMoreThan6digit();
        String expectedErrorMessage = "Please enter valid pincode";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter valid pincode\" is not displaying");
    }

    @Test(priority = 105)
    public void clickOccupationRetiredTest() throws InterruptedException {
        EmploymentDetails.clickOccupationRetired();
    }

    @Test(priority = 106)
    public void validateNextButtonTest() throws InterruptedException {
        boolean flag = EmploymentDetails.validateNextButton();
        Assert.assertTrue(flag, "Next button is not display");
    }

    @Test(priority = 107)
    public void validateOccupationClickTest() throws InterruptedException {
        EmploymentDetails.validateOccuptionClick();
    }
    @Test(priority = 108)
    public void validateFillAllThaDataTest() throws InterruptedException {
        EmploymentDetails.FillAllThaData();
    }
    @Test(priority = 109)
    public void validateNextButtonlickTest() throws InterruptedException {
        EmploymentDetails.validateNextButtonClick();
        System.out.println("Next button is click successfully");
    }
    @Test(priority = 110)
    public void validateOccupationSalarieddAllTextBoxTest() throws InterruptedException {
        boolean result = EmploymentDetails.validateOccupationSalarieddAllTextBox();
        Assert.assertTrue(result, "One or more data are not displayed as expected.");
    }





















































}