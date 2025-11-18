package com.sparsh.qa.testcases;

import com.sparsh.qa.base.TestBase;
import com.sparsh.qa.pages.LoginPage;
import com.sparsh.qa.pages.PersonalDetailsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static com.sparsh.qa.base.TestBase.initialization;
import static com.sparsh.qa.base.TestBase.prop;

public class PersonalDetailsPageTests extends TestBase {


    public PersonalDetailsPageTests()
    {
        super();
    }
    PersonalDetailsPage personalDetails;
    LoginPage loginPage1;

    @BeforeClass
    public void setUp(){
      //  initialization();
        personalDetails= new PersonalDetailsPage();
        loginPage1= new LoginPage();

    }

    @Test(priority = 1)
    public void validateApplicationTitleTest() {
        String actualApplicationTitle = personalDetails.validateApplicationTitle();
        String expectedApplicationTitle = prop.getProperty("applicationTitle");
        Assert.assertEquals(actualApplicationTitle, expectedApplicationTitle,
                "Application title \"Sparsh - Varthana\" is not displayed");
    }
    @Test(priority = 2)
    public void validateSparshLogoTest() {
        boolean flag = loginPage1.validateSparshLogo();
        Assert.assertTrue(flag, "Sparsh logo is not displaying in UploadPan and KYC Page");
    }

    @Test(priority = 3)
    public void validateVarthnaLogoTest() {
        boolean flag = loginPage1.validateVarthnaLogo();
        Assert.assertTrue(flag, "Varthana logo is not displaying in Login Page");
    }

    @Test(priority = 4)
    public void validateCollegeNameTest() {
        String actualCollegeName = loginPage1.validateCollegeName();
        String expectedCollegeName = prop.getProperty("collegeName");
        Assert.assertEquals(actualCollegeName, expectedCollegeName, "College name is not matching");
    }

    @Test(priority = 5)
    public void validateCollegeAddressTest() {
        String actualCollegeAddress = loginPage1.validateCollegeAddress();
        String expectedCollegeAddress = prop.getProperty("collegeAddress");
        Assert.assertEquals(actualCollegeAddress, expectedCollegeAddress,
                "invalid college address in Login Page");
    }

    @Test(priority = 6)
    public void validateCollegeCityTest() {
        String actualCollegeCityName = loginPage1.validateCollegeCity();
        String expectedCollegeCityName = prop.getProperty("collegeCity");
        Assert.assertEquals(actualCollegeCityName, expectedCollegeCityName,
                "College name is not displayed in Login Page");
    }

    @Test(priority = 7)
    public void validateCollegeStateTest() {
        String actualCollegeStateName = loginPage1.validateCollegeState();
        String expectedCollegeStateName = prop.getProperty("collegeState");
        Assert.assertEquals(actualCollegeStateName, expectedCollegeStateName,
                "State name is not displayed in Login Page");
    }

    @Test(priority = 8)
    public void validateCollegePinCodeTest() {
        String actualCollegePinCode = loginPage1.validateCollegePinCode();
        String expectedCollegePinCode = prop.getProperty("collegePincode");
        Assert.assertEquals(actualCollegePinCode, expectedCollegePinCode,
                "College pinCode is not displaying Login page");
    }

    @Test(priority = 9)
    public void validateLocationIconTest() {
        boolean flag = loginPage1.validateLocationIcon();
        Assert.assertTrue(flag, "Location icon is not displayed in the Login Page");
    }
    @Test(priority = 10)
    public void validateReferanceIdnameTest() {
        boolean flag = personalDetails.validateReferanceIdName();
        Assert.assertTrue(flag, "Help Button is not there displayed in the Upload Pan and KYC page");
    }

    @Test(priority = 11)
    public void validatePersonalDetailsTest() {
        boolean flag = personalDetails.validatePersonalDetailsHeader();
        Assert.assertTrue(flag, "Personal details header is not display");
    }

    @Test(priority = 12)
    public void validatePanDetailsMessageTest() {
        boolean flag = personalDetails.validatePanDetailsFetchedBox();
        Assert.assertTrue(flag, "Personal details header is not display");
    }

    @Test(priority = 13)
    public void validateApplicantIconTest() {
        boolean flag = personalDetails.validateApplicantIcon();
        Assert.assertTrue(flag, "Applicant icon is not display");
    }

    @Test(priority = 14)
    public void validateApplicantNameIconTest() {
        boolean flag = personalDetails.validateApplicantIcon();
        Assert.assertTrue(flag, "Applicant icon is not display");
    }

    @Test(priority = 15)
    public void validateApplicantNameTest() {
        boolean flag = personalDetails.validateApplicantName();
        Assert.assertTrue(flag, "Applicant name is not display");
    }
    @Test(priority = 15)
    public void validateApplicantNameFromNSDLTest() {
        personalDetails.validateApplicantNameFromNSDL();
    }


    @Test(priority = 16)
    public void validateCoApplicantIconTest() {
        boolean flag = personalDetails.validateCoApplicantIcon();
        Assert.assertTrue(flag, "CoApplicant icon is not display");
    }

    @Test(priority = 17)
    public void validateCoApplicantNmeTest() {
        boolean flag = personalDetails.validateCoApplicantName();
        Assert.assertTrue(flag, "CoApplicant name is not display");
    }
    @Test(priority = 17)
    public void validateCoApplicantNameFromNSDLTest() {
        personalDetails.validateCoApplicantNameFromNSDL();
    }

    @Test(priority = 18)
    public void validatePhoneIconTest() {
        boolean flag = personalDetails.validatePhoneIcon();
        Assert.assertTrue(flag, "Phone icon is not display");
    }

    @Test(priority = 19)
    public void validatePhoneNumberTest() {
        boolean flag = personalDetails.validatePhoneNumber();
        Assert.assertTrue(flag, "Phone number text is not display");
    }
    @Test(priority = 19)
    public void validatePhoneNumberFromPanDetailsTest() {
        personalDetails.validatePhoneNumberFromPanDetails();
    }

    @Test(priority = 20)
    public void validateDobIconTest() {
        boolean flag = personalDetails.validateDobIcon();
        Assert.assertTrue(flag, "DOB icon is not display");
    }

    @Test(priority = 21)
    public void validateDobTest() {
        boolean flag = personalDetails.validateDob();
        Assert.assertTrue(flag, "Phone number text is not display");
    }
    @Test(priority = 21)
    public void validateDateOfBirthFromNSDLTest() {
        personalDetails.validateDateOfBirthFromNSDL();
    }

    @Test(priority = 22)
    public void validateAgeIconTest() {
        boolean flag = personalDetails.validateAgeIcon();
        Assert.assertTrue(flag, "Phone icon is not display");
    }

    @Test(priority = 23)
    public void validateAgeTest() {
        boolean flag = personalDetails.validateAge();
        Assert.assertTrue(flag, "Phone icon is not display");
    }
    @Test(priority = 23)
    public void validateAgeFromNSDLTest() {
        personalDetails.validateAgeFromNSDL();
    }
    @Test(priority = 23)
    public void validateEnterPersonalDetailsTest() {
        boolean flag = personalDetails.validateEnterPersonalDetailsHeader();
        Assert.assertTrue(flag, "Enter Personal details header is not display");
    }

                                                                                 // GENDER BOX
    @Test(priority = 24)
    public void validateGenderIconTest() throws InterruptedException {
        boolean flag = personalDetails.validateGenderIcon();
        Assert.assertTrue(flag, "Gender icon is not display");
    }
    @Test(priority = 24)
    public void genderNameNameTest() throws InterruptedException {
        boolean flag = personalDetails.genderNameName();
        Assert.assertTrue(flag, "Gender name is Not displayed");
    }

    @Test(priority = 25)
    public void validateGenderboxTest() {
        personalDetails.clickGenderBox();
        System.out.println("Gender box click successfully");
    }
    @Test(priority = 26)
    public void validateGenderMaleTest() throws InterruptedException {
        boolean flag = personalDetails.validateGenderMale();
        Assert.assertTrue(flag, "Gender male is not display");
    }
    @Test(priority = 27)
    public void validateGenderFemaleTest() {
        boolean flag = personalDetails.validatGenderFemale();
        Assert.assertTrue(flag, "Gender female is not display");
    }

    @Test(priority = 28)
    public void validateGenderMaleClickTest() {
        personalDetails.clickGenderClick();
        System.out.println("Gender click successfully");
    }
                                                                           //MARITAL STATUS

    @Test(priority = 29)
    public void validateMaritalStatusIconTest() {
        boolean flag = personalDetails.validateMaritalIcon();
        Assert.assertTrue(flag, "Marital status icon is not display");
    }
    @Test(priority = 29)
    public void maritalStatusNameTest() throws InterruptedException {
        boolean flag = personalDetails.maritalStatusName();
        Assert.assertTrue(flag, "Marital status name is Not displayed");
    }

    @Test(priority = 30)
    public void validateMaritalStatusBoxTest() {
        personalDetails.clickMaritalStatusBox();
        System.out.println("Marital Status click successfully");
    }
    @Test(priority = 31)
    public void validateMaritalStausMarriedTest() throws InterruptedException {
        boolean flag = personalDetails.validateMaritalStatusMarried();
        Assert.assertTrue(flag, "Marital Status Married is not display");
    }
    @Test(priority = 32)
    public void validateMaritalStatusSignalTest() throws InterruptedException {
        boolean flag = personalDetails.validateMaritalStatusSingle();
        Assert.assertTrue(flag, "Marital Status Single is not display");
    }

    @Test(priority = 33)
    public void validateMaritalStatusClickTest() throws InterruptedException {
        personalDetails.clickMaritalStatusClick();
        System.out.println("Marital Status Signal click successfully");
    }
                                                                                //LOAN AMOUNT

    @Test(priority = 34)
    public void validateLoanAmountIconTest() {
        boolean flag = personalDetails.validateLoanAmountIcon();
        Assert.assertTrue(flag, "Marital status icon is not display");
    }
    @Test(priority = 34)
    public void loanAmountNameTest() throws InterruptedException {
        boolean flag = personalDetails.loanAmountName();
        Assert.assertTrue(flag, "Loan amount name is Not displayed");
    }

    @Test(priority = 35)
    public void ValidateLoanAmountLessThan15000Test() {
        String actualErrorMessage = personalDetails.ValidateLoanamountLessThan15000();
        String expectedErrorMessage = "Loan Amount should be more than 15000";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Loan Amount should be more than 15000\" is not displaying");

    }

    @Test(priority = 36)
    public void ValidateLoanAmountmoreThan5lacTest() {
        String actualErrorMessage = personalDetails.ValidateLoanamountMoreThan5lac();
        String expectedErrorMessage = "Loan Amount should be less than 500000";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Loan Amount should be less than 500000\" is not displaying");

    }
    @Test(priority = 37)
    public void validateLoanAmountTest() {
        personalDetails.validateLoanAmount();
    }
                                                                            //MONTHLY INCOME IN HAND

    @Test(priority = 38)
    public void validateMonthlyIncomeInHandIconTest() {
        boolean flag = personalDetails.validateMonthlyIncomeInHandIcon();
        Assert.assertTrue(flag, "Monthly IncomeIn Hand icon is not display");
    }

    @Test(priority = 38)
    public void MonthlyincomeNameTest() throws InterruptedException {
        boolean flag = personalDetails.MonthlyincomeName();
        Assert.assertTrue(flag, "monthly income in hand name is Not displayed");
    }

    @Test(priority = 39)
    public void ValidateMonthlyIncomeLessThan5000Test() {
        String actualErrorMessage = personalDetails.ValidateMonthlyIncomeLessThan5000();
        String expectedErrorMessage = "Monthly Income should be more than 5000";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Monthly Income should be more than 5000\" is not displaying");

    }

    @Test(priority = 40)
    public void ValidateMonthlyIncomemoreThan10lacTest() {
        String actualErrorMessage = personalDetails.ValidateMonthlyIncomeMoreThan10lac();
        String expectedErrorMessage = "Monthly Income should be less than 1000000";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Monthly Income should be less than 1000000\" is not displaying");

    }



    @Test(priority = 41)
    public void validateMonthlyIncomeInHandTest() {
        personalDetails.validateMonthlyIncomeInHand();
    }
                                                                                      //EMAIL
                                                                                                                                                  @Ignore
    @Test(priority = 42)
    public void validateEmailIconTest() {
        boolean flag = personalDetails.validateEmailIcon();
        Assert.assertTrue(flag, "Email icon is not display");
    }
    @Test(priority = 42)
    public void EmailNameTest() throws InterruptedException {
        boolean flag = personalDetails.EmailName();
        Assert.assertTrue(flag, "Email name is Not displayed");
    }

    @Test(priority = 43)
    public void validateEmailtextBoxTest() {

        personalDetails.validateEmailTextBox();
    }

                                                                            //Qualification

    @Test(priority = 44)
    public void validateQualificationIconTest() {
        boolean flag = personalDetails.validatehighestQualificationIcon();
        Assert.assertTrue(flag, "Qualification icon is not display");
    }
    @Test(priority = 44)
    public void highestQualificationNameTest() throws InterruptedException {
        boolean flag = personalDetails.highestQualificationName();
        Assert.assertTrue(flag, "highest Qualification Name is Not displayed");
    }
    @Test(priority = 45)
    public void validateQualificationtextBoxTest() {
        personalDetails.validatehighestQualificationTextBox();
    }

                                                                                 //bachelor Accomodation

    @Test(priority = 46)
    public void validateBachelorAccomodationIconTest() {
        boolean flag = personalDetails.validatebachelorAccomodationIcon();
        Assert.assertTrue(flag, "bachelor Accomodation icon is not display");
    }
    @Test(priority = 46)
    public void bachelorAccomodationNameTest() throws InterruptedException {
        boolean flag = personalDetails.bachelorAccomodationName();
        Assert.assertTrue(flag, "highest Qualification Name is Not displayed");
    }

    @Test(priority = 47)
    public void validatebachelorAccomodationTypeTest() {
        personalDetails.validatebachelorAccomodationType();
    }
    @Test(priority = 48)
    public void validatebachelorAccomodationTypeDopdownTest() throws InterruptedException {
        personalDetails.validatebachelorAccomodationDropdown();
    }

    @Test(priority = 49)
    public void validatebachelorAccomodationYesTest() throws InterruptedException {
        boolean flag = personalDetails.validatebachelorAccomodationYes();
        Assert.assertTrue(flag, "Bachelore accomodation yes is Not displayed");
    }
    @Test(priority = 50)
    public void validatebachelorAccomodationNoTest() throws InterruptedException {
        boolean flag = personalDetails.validatebachelorAccomodationNo();
        Assert.assertTrue(flag, "Bachelore accomodation No is Not displayed");
    }

    @Test(priority = 51)
    public void validatebachelorAccomodationClickTest() throws InterruptedException {
        personalDetails.clickbachelorAccomodationClick();
        System.out.println("Bachelore accomodation No click successfully");
    }
                                                                                      //curent address
    @Test(priority = 52)
    public void validateCurrentAddressHeaderTest() {
        boolean flag = personalDetails.validateCurrentAddressHeader();
        Assert.assertTrue(flag, "current address header is not display");
    }
    @Test(priority = 53)
    public void currentAddressNameTest() throws InterruptedException {
        boolean flag = personalDetails.currentAddressName();
        Assert.assertTrue(flag, "Current address Name is Not displayed");
    }

    @Test(priority = 53)
    public void validateCurrentAddressIconTest() {
        boolean flag = personalDetails.validateCurrentAddressIcon();
        Assert.assertTrue(flag, "current address icon is not display");
    }
    @Ignore
    @Test(priority = 40)
    public void ValidateCurrentAddressWithOnlyNoTest() {
        String actualErrorMessage = personalDetails.ValidateCurrentAddresswithonlyno();
        String expectedErrorMessage = "Please enter valid address. only these @-,()#.' special characters are allowed";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter valid address. only these @-,()#.' special characters are allowed\" is not displaying");

    }


    @Test(priority = 54)
    public void validateCurrentAddressTextBox() {
        personalDetails.validateCurrentAddress();
    }
    @Test(priority = 55)
    public void currenPincodeNameTest() throws InterruptedException {
        boolean flag = personalDetails.currenPincodeName();
        Assert.assertTrue(flag, "Current pincode Name is Not displayed");
    }

    @Test(priority = 55)
    public void validateCurrentPincodeIconTest() {
        boolean flag = personalDetails.validateCurrentPincodeIcon();
        Assert.assertTrue(flag, "current pincode icon is not display");
    }

    @Test(priority = 56)
    public void ValidatePinCodeLessThan6DigitTest() {
        String actualErrorMessage = personalDetails.ValidatePinCodeLessThan6Digit();
        String expectedErrorMessage = "Please enter a valid pincode";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter a valid pincode\" is not displaying");
    }

    @Test(priority = 57)
    public void ValidatePinCodeMoreThan6DigitTest() {
        String actualErrorMessage = personalDetails.ValidatePinCodeMoreThan6Digit();
        String expectedErrorMessage = "Please enter a valid pincode";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter a valid pincode\" is not displaying");
    }

    @Test(priority = 58)
    public void validateCurrentPincodeTextBox() {
        personalDetails.validateCurrentPincode();
    }
    @Test(priority = 55)
    public void validateCurrentCityNameTest() throws InterruptedException {
        boolean flag = personalDetails.validateCurrentCityName();
        Assert.assertTrue(flag, "current city name is Not displayed");
    }

    @Test(priority = 59)
    public void validateCurrentCityIconTest() {
        boolean flag = personalDetails.validateCurrentCityIcon();
        Assert.assertTrue(flag, "current city icon is not display");
    }
    @Ignore
    @Test(priority = 60)
    public void validateCurrentCurrentCity() {
        personalDetails.validateCurrentCurrentCity();
    }
    @Test(priority = 61)
    public void validateCurrentresidanceTypeIconTest() {
        boolean flag = personalDetails.validateResidenceTypeIcon();
        Assert.assertTrue(flag, "current residence type icon is not display");
    }

    @Test(priority = 61)
    public void validateResidenceTypeNameTest() throws InterruptedException {
        boolean flag = personalDetails.validateResidenceTypeName();
        Assert.assertTrue(flag, "Residence type name is Not displayed");
    }

    @Test(priority = 62)
    public void validateCurrentResidenceTypeTypeDorpdownTest() throws InterruptedException {
        personalDetails.validateCurrentResidenceTypeDropdown();
    }

    @Test(priority = 63)
    public void validateCurrentResidenceTypeRentedTest()  {
        boolean flag = personalDetails.validateCurrentResidenceTypeRented();
        Assert.assertTrue(flag, "Current Residence type Rented is Not displayed");
    }
    @Test(priority = 64)
    public void validateCurrentResidenceTypeOwnedTest() throws InterruptedException {
        boolean flag = personalDetails.validateCurrentResidenceTypeOwned();
        Assert.assertTrue(flag, "Current Residence Type Owned is Not displayed");
    }

    @Test(priority = 65)
    public void clickCurrentResidenceTypeOwnedClickTest() throws InterruptedException {
        personalDetails.clickCurrentResidenceTypeOwned();
        System.out.println("Current Residence Type Owned click successfully");
    }
                                                                                 //number of years in current residence
    @Test(priority = 66)
    public void validateNumberOfYearInCurrentResidenceTextBoxIconTest() {
        boolean flag = personalDetails.validateNumberOfYearInCurrentResidenceIcon();
        Assert.assertTrue(flag, "Email icon is not display");
    }


    @Test(priority = 66)
    public void validateNumberOfYearsInCurrentResidenceNameTest() throws InterruptedException {
        boolean flag = personalDetails.validateNumberOfYearsInCurrentResidenceName();
        Assert.assertTrue(flag, "validate Number Of Years In Current Residence Name is Not displayed");
    }

    @Test(priority = 67)
    public void ValidateNumberOfyearInCurrentResidenceLessThan1YearTest() {
        String actualErrorMessage = personalDetails.ValidateNumberOfyearInCurrentResidenceLessThan1Year();
        String expectedErrorMessage = "Min Number of years is 1 year";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Min Number of years is 1 year\" is not displaying");

    }
    @Test(priority = 68)
    public void ValidateNumberOfyearInCurrentResidenceMoreThan99YearTest() {
        String actualErrorMessage = personalDetails.ValidateNumberOfyearInCurrentResidenceMoreThan99Year();
        String expectedErrorMessage = "Max Number of years is 99 years";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Max Number of years is 99 years\" is not displaying");

    }
    @Test(priority = 69)
    public void ValidateNumberOfyearInCurrentResidenceAsNegativeYearTest() {
        String actualErrorMessage = personalDetails.ValidateNumberOfyearInCurrentResidenceAsNegativeYear();
        String expectedErrorMessage = "Please enter Current Years in integers.";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter Current Years in integers.\" is not displaying");

    }

    @Test(priority = 70)
    public void validateNumberOfYearInCurrentResidenceTextBoxBoxTest() {
        personalDetails.validateNumberOfYearInCurrentResidenceTextBox();
    }
                                                                                          //checkbox
    @Test(priority = 71)
    public void validatecheckboxTest() throws InterruptedException {
        boolean flag =  personalDetails.validateCheckbox();
        Assert.assertTrue(flag, "check box is not display");
    }
       @Test(priority = 72)
    public void validateCurrentAddressIsSaneAsPermanentTest() {
        personalDetails.validateCurrentAddressIsSameAsPermanent();
    }

    @Test(priority = 73)
    public void validatecheckboxuncheckTest() throws InterruptedException {
        boolean flag =  personalDetails.validateCheckboxUncheck();
        Assert.assertTrue(flag, "check box is not display");
       // System.exit(0);
    }
    @Test(priority = 74)
    public void validatePermanentAddressIconTest() {
        boolean flag = personalDetails.validatePermanentAddressIcon();
        Assert.assertTrue(flag, "current address icon is not display");
    }
    @Test(priority = 74)
    public void validatePermanentAddressNameTest() throws InterruptedException {
        boolean flag = personalDetails.validatePermanentAddressName();
        Assert.assertTrue(flag, "Permanent Address Name is Not displayed");
    }
    @Test(priority = 75)
    public void validatePermanentAddressTest() {
        personalDetails.validatePermanentAddress();
    }
                                                                     //PermanentPincode
    @Test(priority = 76)
    public void validatepermanentPincodeIconTest() {
        boolean flag = personalDetails.validatepermanentPincodeIcon();
        Assert.assertTrue(flag, "Permanent pincode icon is not display");
    }
    @Test(priority = 76)
    public void validatePermanentPincodeNameTest() throws InterruptedException {
        boolean flag = personalDetails.validatePermanentPincodeName();
        Assert.assertTrue(flag, "Permanent pin code Name is Not displayed");
    }

    @Test(priority = 77)
    public void ValidatePermanentPincodeLessThan6DigitTest() {
        String actualErrorMessage = personalDetails.ValidatePermanentPincodeLessThan6Digit();
        String expectedErrorMessage = "Please enter a valid pincode";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter a valid pincode\" is not displaying");
    }

    @Test(priority = 78)
    public void ValidatePermanentPincodeMoreThan6DigitTest() {
        String actualErrorMessage = personalDetails.ValidatePermanentPincodeMoreThan6Digit();
        String expectedErrorMessage = "Please enter a valid pincode";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message \"Please enter a valid pincode\" is not displaying");
    }

    @Test(priority = 79)
    public void validatePermanentPincodeTest() {
        personalDetails.validatePermanentPincode();
    }
    @Test(priority = 80)
    public void validatePermanentCityNameTest() throws InterruptedException {
        boolean flag = personalDetails.validatePermanentCityName();
        Assert.assertTrue(flag, "Permanent city Name is Not displayed");
    }
    @Test(priority = 80)
    public void PermanentResidenceTypeNameTest() throws InterruptedException {
        boolean flag = personalDetails.PermanentResidenceTypeName();
        Assert.assertTrue(flag, "Permanent Residence Type Name is Not displayed");
    }

    @Test(priority = 80)
    public void validatePermanentResidenceTypeIconTest() {
        boolean flag = personalDetails.validatePermanentResidenceTypeIcon();
        Assert.assertTrue(flag, "Permanent residence type icon is not display");
    }

    @Test(priority = 81)
    public void validatePermanentResidenceTypeDropdownTest() throws InterruptedException {
        personalDetails.validatePermanentResidenceTypeDropdown();
    }

    @Test(priority = 82)
    public void validatePermanentResidenceTypeRentedTest()  {
        boolean flag = personalDetails.validatePermanentResidenceTypeRented();
        Assert.assertTrue(flag, "Permanent Residence type Rented is Not displayed");
    }
    @Test(priority = 83)
    public void validatePermanentResidenceTypeOwnedTest() throws InterruptedException {
        boolean flag = personalDetails.validatePermanentResidenceTypeOwned();
        Assert.assertTrue(flag, "Permanent Residence Type Owned is Not displayed");
    }

    @Test(priority = 84)
    public void clickPermanentResidenceTypeTest() throws InterruptedException {
        personalDetails.clickPermanentResidenceType();
        System.out.println("Permanent Residence Type Owned click successfully");
    }

    @Test(priority = 85)
    public void ValidateApplyForLoanButtonTest() throws InterruptedException {
        personalDetails.validateApplyForLoanButton();
        System.out.println("Apply for loan button is click successfully");
    }


























}
