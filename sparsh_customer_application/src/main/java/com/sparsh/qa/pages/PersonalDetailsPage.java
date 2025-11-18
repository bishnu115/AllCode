package com.sparsh.qa.pages;

import com.sparsh.qa.base.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PersonalDetailsPage extends TestBase {
    public PersonalDetailsPage() {
        PageFactory.initElements(driver,this);
    }

    PersonalDetailsPage personalDetails;

    @FindBy(xpath = "//span[text()='Reference Id']")
    WebElement referanceIdname;

    @FindBy(xpath = "//div[2]/div[1]/div[2]/div[2]/div[2]/span")
    WebElement NameAsPerPan;

    @FindBy(xpath = "//div[2]/div[1]/div[2]/div[3]/div[2]/span")
    WebElement fatherNameAsPerPan;

    @FindBy(xpath = "//div[2]/div[1]/div[2]/div[4]/div[2]/span")
    WebElement ApplyPhoneNumber;

    @FindBy(xpath = "//div[2]/div[1]/div[2]/div[5]/div[2]/span")
    WebElement dateOfBirthAsPerPan;

    @FindBy(xpath = "//div[2]/div[1]/div[2]/div[6]/div[2]/span")
    WebElement ageAsPerPan;

    @FindBy(xpath = "//h2[text()='Personal Details']")
    WebElement personalDetailsHeader;

    @FindBy(xpath = "//p[text()='These details are fetched from PAN']")
    WebElement panDetailsFetchedBox;

    @FindBy(xpath = "//img[@src='/static/media/Applicant’s Name.66e76df30c5ccf58ab0f4288d7a02d2d.svg']")
    WebElement applicanIicon;

    @FindBy(xpath = "//span[text()='Name']")
    WebElement applicantName;

    @FindBy(xpath = "//img[@src='/static/media/Applicant’s Name.66e76df30c5ccf58ab0f4288d7a02d2d.svg']")
    WebElement coapplicantIcon;

    @FindBy(xpath = "//img[@src='/static/media/Co-Applicant’s Name.21e43c2c5ee1f3198015046bceca31b5.svg']")
    WebElement coapplicantName;

    @FindBy(css = "svg[data-testid=\"SmartphoneIcon\"]")
    WebElement phoneIcon;

    @FindBy(xpath = "//span[text()='Phone Number']")
    WebElement phoneNumber;

    @FindBy(css = "svg[data-testid=\"InsertInvitationIcon\"]")
    WebElement dobIcon;

    @FindBy(xpath = "//span[text()='Date Of Birth']")
    WebElement dob;

    @FindBy(css = "svg[data-testid=\"CakeIcon\"]")
    WebElement ageIicon;

    @FindBy(xpath = "//span[text()='Age']")
    WebElement age;

    @FindBy(xpath = "//h2[contains(text(), 'Enter Personal Details ')]")
    WebElement enterPersonaldetails;

    @FindBy(css = "svg[data-testid=\"WcIcon\"]")
    WebElement genderIcon;

    @FindBy(id = "595Gender")
    WebElement genderName;


    @FindBy(id = "595")
    WebElement gender;



    @FindBy(xpath = "//li[@data-value='Male']")
    WebElement genderMale;

    @FindBy(xpath = "//li[@data-value='Female']")
    WebElement genderFemale;

    @FindBy(css = "svg[data-testid=\"FavoriteIcon\"]")
    WebElement maritalStatusIcon;

    @FindBy(id = "596")
    WebElement maritalStatus;

    @FindBy(id = "596Marital Status")
    WebElement maritalStatusName;


    @FindBy(xpath = "//li[@data-value='Married']")
    WebElement maritalStatusMarried;

    @FindBy(xpath = "//li[@data-value='Single']")
    WebElement maritalStatusSingal;

    @FindBy(css = "svg[data-testid=\"CurrencyRupeeIcon\"]")
    WebElement loanAmountIcon;

    @FindBy(id = "599-label")
    WebElement loanAmountName;

    @FindBy(id = "599-helper-text")
    WebElement errorMessageloanAmount;


    @FindBy(name = "loan_amount")
    WebElement loanAmount;

    @FindBy(css = "svg[data-testid=\"PaidIcon\"]")
    WebElement netIncomeIcon;

    @FindBy(id = "608-helper-text")
    WebElement errorMessageMonthlyincome;

    @FindBy(id = "608-label")
    WebElement MonthlyincomeName;

    @FindBy(name = "net_income")
    WebElement netIncome;

    @FindBy(css = "svg[data-testid=\"EmailIcon\"]")
    WebElement EmailIcon;

    @FindBy(name = "email_address")
    WebElement email;
    @FindBy(id = "623-label")
    WebElement EmailName;

    @FindBy(css = "svg[data-testid=\"SchoolIcon\"]")
    WebElement highestQualificationIcon;

    @FindBy(id = "667-label")
    WebElement highestQualificationName;

    @FindBy(name = "highest_qualification")
    WebElement highestQualification;

    @FindBy(css = "svg[data-testid=\"FoundationIcon\"]")
    WebElement bachelorAccomodationIcon;

    @FindBy(id = "670Bachelor Accomodation")
    WebElement bachelorAccomodationName;
    @FindBy(id = "670")
    WebElement bachelorAccomodation;

    @FindBy(xpath = "//li[text()='Yes']")
    WebElement bachelorAccomodationYes;

    @FindBy(xpath = "//li[text()='No']")
    WebElement bachelorAccomodationNo;

    @FindBy(xpath = "//h2[contains(text(), 'Enter Current Address ')]")
    WebElement currentAddressHeader ;

    @FindBy(id = "520-helper-text")
    WebElement errormessagecurrentAddress;

    @FindBy(id = "520")
    WebElement currentAddress;


    @FindBy(id = "520-label")
    WebElement currentAddressName;


    @FindBy(id = "521")
    WebElement currenPincode;

    @FindBy(id = "521-label")
    WebElement currenPincodeName;

    @FindBy(id = "521-helper-text")
    WebElement errorcurrenPincode;

    @FindBy(id = "522")
    WebElement currentCity;
    @FindBy(id = "522-label")
    WebElement currentCityName;


    @FindBy(id = "601")
    WebElement residanceType;

    @FindBy(id = "601[object Object]")
    WebElement residenceTypeName;

    @FindBy(xpath = "//li[@data-value='RENTED']")
    WebElement residanceTypeRented;

    @FindBy(xpath = "//li[@data-value='OWNED']")
    WebElement residanceTypeOwned;

    @FindBy(css = "svg[data-testid=\"SchoolIcon\"]")
    WebElement NumberOfYearsInCurrentResidenceicon;


    @FindBy(id = "602-helper-text")
    WebElement ErrormessageNumberOfYearsInCurrentResidence;

    @FindBy(id = "602")
    WebElement NumberOfYearsInCurrentResidence;

    @FindBy(id = "602-label")
    WebElement NumberOfYearsInCurrentResidenceName;

    @FindBy(name = "asim")
    WebElement MyPermanentAddressIsSameAsCurrentCheckBox;

    @FindBy(id = "523")
    WebElement PermanentAddress;

    @FindBy(id = "523-label")
    WebElement PermanentAddressName;

    @FindBy(id = "524-helper-text")
    WebElement errorMessagePermanentPincode;

    @FindBy(id = "524")
    WebElement PermanentPincode;

    @FindBy(id = "524-label")
    WebElement PermanentPincodeName;

    @FindBy(id = "525")
    WebElement PermanentCity;

    @FindBy(id = "525-label")
    WebElement PermanentCityName;

    @FindBy(id = "533")
    WebElement PermanentResidenceType;

    @FindBy(id = "533[object Object]")
    WebElement PermanentResidenceTypeName;

    @FindBy(xpath = "//li[@data-value='RENTED']")
    WebElement PermanentResidenceTypeRented;

    @FindBy(xpath = "//li[@data-value='OWNED']")
    WebElement PermanentResidenceTypeOwned;

    @FindBy(css = "svg[data-testid='QuestionMarkOutlinedIcon']")
    WebElement questionMarkIcon;

    @FindBy(xpath = "//button[text()='Apply for Loan']")
    WebElement ApplyForLoanButton;

//question mark element locator should be write




    @FindBy(xpath = "//button[text()='Apply for Loan']")
    WebElement applyForLoanButton;

    JavascriptExecutor script = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    public String validateApplicationTitle() {
        String title = driver.getTitle();
        System.out.println("================================================Personal Details Page=========================================================");
        System.out.println("Title is displayed in employment Details Page = " + title);
        return title;
    }

    public boolean validateReferanceIdName() {
        boolean flag = referanceIdname.isDisplayed();
        System.out.println("referanceId is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validatePersonalDetailsHeader() {
        boolean flag = personalDetailsHeader.isDisplayed();
        System.out.println("personal Details Header is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
                                                                           //pan details fetched from NSDL
    public boolean validatePanDetailsFetchedBox() {
        boolean flag = panDetailsFetchedBox.isDisplayed();
        System.out.println("pan details fetched message is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateApplicantIcon() {
        boolean flag = applicanIicon.isDisplayed();
        System.out.println("Applicant icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateApplicantName() {
        boolean flag = applicantName.isDisplayed();
        System.out.println("Applicant name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean validateApplicantNameFromNSDL() {

        String ApplicantName = prop.getProperty("Name");
        String applicantName = NameAsPerPan.getText();

        if (ApplicantName.equals(applicantName)) {
            System.out.println("Applicant name is matching");
        }
        else  {
            System.out.println("Error message : Applicant name is miss match");
        }

        return false;
    }


    public boolean validateCoApplicantIcon() {
        boolean flag = coapplicantIcon.isDisplayed();
        System.out.println("CoApplicant icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateCoApplicantName() {
        boolean flag = coapplicantName.isDisplayed();
        System.out.println("CoApplicant name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean validateCoApplicantNameFromNSDL() {

        String CoApplicantName = prop.getProperty("FatherName");
        String CoapplicantName = fatherNameAsPerPan.getText();
        if (CoApplicantName.equals(CoapplicantName)) {
            System.out.println("Co-Applicant name is matching");
        }
        else  {
            System.out.println("Error message : Co-Applicant name is miss match");
        }

        return false;
    }

    public boolean validatePhoneIcon() {
        boolean flag = phoneIcon.isDisplayed();
        System.out.println("Phone icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validatePhoneNumber() {
        boolean flag = phoneNumber.isDisplayed();
        System.out.println("Phone number is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean validatePhoneNumberFromPanDetails() {

        String PhoneNumber = prop.getProperty("PhoneNumber");
        String Phonenumber = ApplyPhoneNumber.getText();
        if (PhoneNumber.equals(Phonenumber)) {
            System.out.println("Phone number  name is matching");
        }
        else  {
            System.out.println("Error message : Phone number is miss match");
        }

        return false;
    }

    public boolean validateDobIcon() {
        boolean flag = dobIcon.isDisplayed();
        System.out.println("DOB icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateDob() {
        boolean flag = dob.isDisplayed();
        System.out.println("dob is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateDateOfBirthFromNSDL() {

        String DateOfBirth = prop.getProperty("DateOfBirth");
        String DateOfbirth = dateOfBirthAsPerPan.getText();
        if (DateOfBirth.equals(DateOfbirth)) {
            System.out.println("Date Of birth is matching");
        }
        else  {
            System.out.println("Error message : Date Of birth  miss match");
        }

        return false;
    }

    public boolean validateAgeIcon() {
        boolean flag = ageIicon.isDisplayed();
        System.out.println("Age icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateAge() {
        boolean flag = age.isDisplayed();
        System.out.println("Age is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean validateAgeFromNSDL() {

        String Age = prop.getProperty("Age");
        String age = dateOfBirthAsPerPan.getText();
        if (Age.equals(age)) {
            System.out.println("Age is matching");
        }
        else  {
            System.out.println("Error message : Age is miss match");
        }

        return false;
    }
    public boolean validateEnterPersonalDetailsHeader() {
        boolean flag = enterPersonaldetails.isDisplayed();
        WebElement h3Element = driver.findElement(By.xpath("//h2[contains(text(), 'Enter Current Address ')]"));
        System.out.println("Found the headline: " + h3Element.getText());
        System.out.println("Enter Personal details Header is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;

    }


                                                                                         // GENDER BOX
    public boolean validateGenderIcon() throws InterruptedException {
        boolean flag = genderIcon.isDisplayed();
        System.out.println("gender icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean genderNameName() throws InterruptedException {
        boolean flag = genderName.isDisplayed();
        System.out.println("Gender Name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }



    public void clickGenderBox(){
        Actions actions = new Actions(driver);
        actions.moveToElement(gender).perform();
        gender.click();
    }

    public boolean validateGenderMale() throws InterruptedException {
        Thread.sleep(2000);
        boolean flag = genderMale.isDisplayed();
        System.out.println("gender male is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validatGenderFemale() {
        boolean flag = genderFemale.isDisplayed();
        System.out.println("gender female is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public void clickGenderClick(){
        Actions actions = new Actions(driver);
        actions.moveToElement(genderMale).perform();
        String Gender = prop.getProperty("gender");
        if ("Male".equalsIgnoreCase(Gender)) {
            genderMale.click();
        } else {
            genderFemale.click();
        }
    }
                                                                     //MARITAL STATUS

    public boolean validateMaritalIcon() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("svg[data-testid=\"FavoriteIcon\"]")));
        boolean flag = maritalStatusIcon.isDisplayed();
        System.out.println("Marital staus icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean maritalStatusName() throws InterruptedException {
        boolean flag = maritalStatusName.isDisplayed();
        System.out.println("Marital status Name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public void clickMaritalStatusBox(){
        Actions actions = new Actions(driver);
        actions.moveToElement(maritalStatus).perform();
        maritalStatus.click();
    }

    public boolean validateMaritalStatusMarried() throws InterruptedException {
        Thread.sleep(1000);
        boolean flag = maritalStatusMarried.isDisplayed();
        System.out.println("Marital status married is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateMaritalStatusSingle() throws InterruptedException {
        Thread.sleep(1000);
        boolean flag = maritalStatusSingal.isDisplayed();
        System.out.println("Marital status single is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public void clickMaritalStatusClick() throws InterruptedException {
            Actions actions = new Actions(driver);
            actions.moveToElement(maritalStatusSingal).perform();
            String maritalStatus = prop.getProperty("maritalStatus");
            if ("Single".equalsIgnoreCase(maritalStatus)) {
                maritalStatusSingal.click();
            } else {
                maritalStatusMarried.click();
            }

    }

                                                                                 //LOAN AMOUNT

    public boolean validateLoanAmountIcon() {
        boolean flag = loanAmountIcon.isDisplayed();
        System.out.println("loan amount icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean loanAmountName() throws InterruptedException {
        boolean flag = loanAmountName.isDisplayed();
        System.out.println("Loan amount Name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }


    public String ValidateLoanamountLessThan15000(){
        Actions actions = new Actions(driver);
        actions.moveToElement(loanAmount).perform();
        loanAmount.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        loanAmount.sendKeys(Keys.chord("14000"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("599-helper-text")));
        String errorMessage = errorMessageloanAmount.getText();
        System.out.println("Entered Loan Amount Less Than 15k = "+errorMessage);
        loanAmount.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return  errorMessage;
    }
    public String ValidateLoanamountMoreThan5lac(){
        Actions actions = new Actions(driver);
        actions.moveToElement(loanAmount).perform();
        loanAmount.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        loanAmount.sendKeys(Keys.chord("600000"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("599-helper-text")));
        String errorMessage = errorMessageloanAmount.getText();
        System.out.println("Entered Loan Amount more Than 5lac = "+errorMessage);
        loanAmount.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return  errorMessage;
    }



    public void validateLoanAmount() {
        Actions actions = new Actions(driver);
        actions.moveToElement(loanAmount).perform();
        loanAmount.click();
        loanAmount.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        loanAmount.sendKeys(prop.getProperty("loanAmount"));

    }
                                                                                           //MONTHLY INCOME IN HAND



    public boolean validateMonthlyIncomeInHandIcon() {
        boolean flag = netIncomeIcon.isDisplayed();
        System.out.println("Monthly income in hand icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }


    public boolean MonthlyincomeName() throws InterruptedException {
        boolean flag = MonthlyincomeName.isDisplayed();
        System.out.println("monthly income in hand Name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public String ValidateMonthlyIncomeLessThan5000(){
        Actions actions = new Actions(driver);
        actions.moveToElement(email).perform();
        netIncome.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        netIncome.sendKeys(prop.getProperty("monthlyincome"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("608-helper-text")));
        String errorMessage = errorMessageMonthlyincome.getText();
        System.out.println("Entered Monthly Income Less Than 5k = "+errorMessage);
        netIncome.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return  errorMessage;
    }
    public String ValidateMonthlyIncomeMoreThan10lac(){
        Actions actions = new Actions(driver);
        actions.moveToElement(email).perform();
        netIncome.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        netIncome.sendKeys(prop.getProperty("Monthlyincome"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("608-helper-text")));
        String errorMessage = errorMessageMonthlyincome.getText();
        System.out.println("Entered Monthly Income more Than 10lac = "+errorMessage);
        netIncome.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return  errorMessage;
    }


    public void validateMonthlyIncomeInHand() {
        Actions actions = new Actions(driver);
        actions.moveToElement(netIncome).perform();
        netIncome.click();
        netIncome.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        netIncome.sendKeys(prop.getProperty("Netincome"));
    }

                                                                                 //EmailIcon

    public boolean validateEmailIcon() {
        boolean flag = EmailIcon.isDisplayed();
        System.out.println("Email icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean EmailName() throws InterruptedException {
        boolean flag = EmailName.isDisplayed();
        System.out.println("Email Name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }



    public void validateEmailTextBox() {
        Actions actions = new Actions(driver);
        actions.moveToElement(email).perform();
        email.click();
        email.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        email.sendKeys(prop.getProperty("Email"));

    }
                                                                       //highest qualification

    public boolean validatehighestQualificationIcon() {
        boolean flag = highestQualificationIcon.isDisplayed();
        System.out.println("highest Qualification Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean highestQualificationName() throws InterruptedException {
        boolean flag = highestQualificationName.isDisplayed();
        System.out.println("Email Name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }


    public void validatehighestQualificationTextBox() {
        Actions actions = new Actions(driver);
        actions.moveToElement(highestQualification).perform();
        highestQualification.click();
        highestQualification.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        highestQualification.sendKeys(prop.getProperty("Qualification"));
    }
                                                                       //bachelor Accomodation

    public boolean validatebachelorAccomodationIcon() {
        boolean flag = bachelorAccomodationIcon.isDisplayed();
        System.out.println("bachelor Accomodation Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean bachelorAccomodationName() throws InterruptedException {
        boolean flag = bachelorAccomodationName.isDisplayed();
        System.out.println("Bachelor accomodation name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }



    public boolean validatebachelorAccomodationType() {

        String bachelorAccommodation = prop.getProperty("bachelorAccomodation");
        WebElement textField = driver.findElement(By.xpath("//div[text()='No']"));
        String BachelorAccomodation = textField.getText();
        if (BachelorAccomodation.equals(bachelorAccommodation)) {
            System.out.println("bachelor Accomodation is select by default No");
        }
        else  {
            System.out.println("Error message bachelor accomodation by default No is not selected");
        }

        return false;
    }
   public void validatebachelorAccomodationDropdown() throws InterruptedException {
       Actions actions = new Actions(driver);
       actions.moveToElement(bachelorAccomodation).perform();
       bachelorAccomodation.click();
       Thread.sleep(1000);
   }
    public boolean validatebachelorAccomodationYes() throws InterruptedException {
        boolean flag = bachelorAccomodationYes.isDisplayed();
        System.out.println("Bachelore accomodation yes is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validatebachelorAccomodationNo() throws InterruptedException {
        boolean flag = bachelorAccomodationNo.isDisplayed();
        System.out.println("Bachelore accomodation no is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public void clickbachelorAccomodationClick() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(bachelorAccomodationNo).perform();
        String BachelorAccomodation = prop.getProperty("BachelorAccomodation");
        if ("No".equalsIgnoreCase(BachelorAccomodation)) {
            bachelorAccomodationNo.click();
        } else {
            bachelorAccomodationYes.click();
        }

    }
                                                                                    //current address
    public boolean validateCurrentAddressHeader() {
        boolean flag = currentAddressHeader.isDisplayed();
        WebElement h2Element = driver.findElement(By.xpath("//h2[contains(text(), 'Enter Current Address ')]"));
        System.out.println("Found the headline: " + h2Element.getText());
        System.out.println("current AddressHeader Header is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean validateCurrentAddressIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(currentAddress).perform();
        boolean flag = false;
        List<WebElement> svgElements = driver.findElements(By.cssSelector("svg[data-testid='LocationOnIcon']"));
        if (svgElements.size() >= 2) {
            WebElement currentAddressIcon = svgElements.get(0);
            flag = currentAddressIcon.isDisplayed();
            System.out.println("Current Address Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        } else {

        }

        return flag;
    }

    public boolean currentAddressName() throws InterruptedException {
        boolean flag = currentAddressName.isDisplayed();
        System.out.println("Current address name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public String ValidateCurrentAddresswithonlyno(){
        currentAddress.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        currentAddress.sendKeys(Keys.chord("12345"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("520-helper-text")));
        String errorMessage = errormessagecurrentAddress.getText();
        System.out.println("Entered Current address only number = "+errorMessage);
        currentAddress.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return  errorMessage;
    }



    public void validateCurrentAddress()
    {
        currentAddress.click();
        currentAddress.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        currentAddress.sendKeys(prop.getProperty("currentaddress"));
    }
                                                                                        //pincode
    public boolean validateCurrentPincodeIcon() {
        boolean flag = false;
        List<WebElement> svgElements = driver.findElements(By.cssSelector("svg[data-testid='PushPinIcon']"));
        if (svgElements.size() >= 2) {
            WebElement currentpincodeIcon = svgElements.get(0);
            flag = currentpincodeIcon.isDisplayed();
            System.out.println("Current Address Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        } else {

        }
        return flag;
    }
    public boolean currenPincodeName() throws InterruptedException {
        boolean flag = currenPincodeName.isDisplayed();
        System.out.println("Current pincode name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public String ValidatePinCodeLessThan6Digit(){
        Actions actions = new Actions(driver);
        actions.moveToElement(currentCity).perform();
        currenPincode.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        currenPincode.sendKeys(Keys.chord("1234"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("521-helper-text")));
        String errorMessage = errorcurrenPincode.getText();
        currenPincode.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return  errorMessage;
    }
    public String ValidatePinCodeMoreThan6Digit(){
        Actions actions = new Actions(driver);
        actions.moveToElement(currentCity).perform();
        currenPincode.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        currenPincode.sendKeys(Keys.chord("56006432"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("521-helper-text")));
        String errorMessage = errorcurrenPincode.getText();
        currenPincode.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return  errorMessage;
    }

    public void validateCurrentPincode() {
        Actions actions = new Actions(driver);
        actions.moveToElement(currentCity).perform();
        currenPincode.click();
        currenPincode.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        currenPincode.sendKeys(prop.getProperty("currentPincode"));
    }
    public boolean validateCurrentCityIcon() {
        boolean flag = false;
        List<WebElement> svgElements = driver.findElements(By.cssSelector("svg[data-testid='LocationCityIcon']"));
        if (svgElements.size() >= 2) {
            WebElement currentCityIcon = svgElements.get(0);
            flag = currentCityIcon.isDisplayed();
            System.out.println("Current city Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        } else {

        }
        return flag;
    }
    public boolean validateCurrentCityName() throws InterruptedException {
        boolean flag = currentCityName.isDisplayed();
        System.out.println("Current city name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public void validateCurrentCurrentCity() {
        Actions actions = new Actions(driver);
        actions.moveToElement(currentCity).perform();
        currentCity.click();
        currentCity.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        currentCity.sendKeys(prop.getProperty("currentcity"));
    }

    public boolean validateResidenceTypeName() throws InterruptedException {
        boolean flag = residenceTypeName.isDisplayed();
        System.out.println("Residence name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean validateResidenceTypeIcon() {
        boolean flag = false;
        List<WebElement> svgElements = driver.findElements(By.cssSelector("svg[data-testid='ApartmentIcon']"));
        if (svgElements.size() >= 2) {
            WebElement currentResidenceTypeicon = svgElements.get(0);
            flag = currentResidenceTypeicon.isDisplayed();
            System.out.println("Current residence type Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        } else {

        }
        return flag;
    }

    public  void validateCurrentResidenceTypeDropdown() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(residanceType).perform();
        residanceType.click();
        Thread.sleep(1000);
    }
    public boolean validateCurrentResidenceTypeRented()  {
        boolean flag = residanceTypeRented.isDisplayed();
        System.out.println("Current Residance Type Rented is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateCurrentResidenceTypeOwned() {
        boolean flag = residanceTypeOwned.isDisplayed();
        System.out.println("residence Type Owned is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public void clickCurrentResidenceTypeOwned()  {

        String ResidenceType = prop.getProperty("ResidenceType");
        if ("RENTED".equalsIgnoreCase(ResidenceType)) {
            residanceTypeRented.click();
        } else {
            residanceTypeOwned.click();
        }
    }

    public boolean validateNumberOfYearInCurrentResidenceIcon() {
        boolean flag = NumberOfYearsInCurrentResidenceicon.isDisplayed();
        System.out.println("Number Of Years InCurrent Residence icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateNumberOfYearsInCurrentResidenceName() throws InterruptedException {
        boolean flag = NumberOfYearsInCurrentResidenceName.isDisplayed();
        System.out.println("Number Of Years In Current Residence Name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }


    public String ValidateNumberOfyearInCurrentResidenceLessThan1Year(){
        Actions actions = new Actions(driver);
        actions.moveToElement(NumberOfYearsInCurrentResidence).perform();
        NumberOfYearsInCurrentResidence.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        NumberOfYearsInCurrentResidence.sendKeys(Keys.chord("0"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("602-helper-text")));
        String errorMessage = ErrormessageNumberOfYearsInCurrentResidence.getText();
        System.out.println("Entered Number Of year In Current Residence Less Than 1 year = "+errorMessage);
        NumberOfYearsInCurrentResidence.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return  errorMessage;
    }
    public String ValidateNumberOfyearInCurrentResidenceMoreThan99Year(){
        Actions actions = new Actions(driver);
        actions.moveToElement(NumberOfYearsInCurrentResidence).perform();
        NumberOfYearsInCurrentResidence.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        NumberOfYearsInCurrentResidence.sendKeys(Keys.chord("101"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("602-helper-text")));
        String errorMessage = ErrormessageNumberOfYearsInCurrentResidence.getText();
        System.out.println("Entered Number Of year In Current Residence More Than 99 years = "+errorMessage);
        NumberOfYearsInCurrentResidence.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return  errorMessage;
    }

    public String ValidateNumberOfyearInCurrentResidenceAsNegativeYear(){
        Actions actions = new Actions(driver);
        actions.moveToElement(NumberOfYearsInCurrentResidence).perform();
        NumberOfYearsInCurrentResidence.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        NumberOfYearsInCurrentResidence.sendKeys(Keys.chord("-33"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("602-helper-text")));
        String errorMessage = ErrormessageNumberOfYearsInCurrentResidence.getText();
        System.out.println("Entered Number Of year In Current Residence as negative year = "+errorMessage);
        NumberOfYearsInCurrentResidence.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return  errorMessage;
    }


    public void validateNumberOfYearInCurrentResidenceTextBox() {
        Actions actions = new Actions(driver);
        actions.moveToElement(NumberOfYearsInCurrentResidence).perform();
        NumberOfYearsInCurrentResidence.click();
        NumberOfYearsInCurrentResidence.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        NumberOfYearsInCurrentResidence.sendKeys(prop.getProperty("NumberOfYearsInCurrentResidence"));

    }
                                                                                           //checkbox
    public boolean validateCheckbox() {
        Actions actions = new Actions(driver);
        actions.moveToElement(NumberOfYearsInCurrentResidence).perform();
        boolean isChecked = MyPermanentAddressIsSameAsCurrentCheckBox.isSelected();
        System.out.println("Checkbox is " + (isChecked ? "checked" : "unchecked"));
        if (!isChecked) {
            MyPermanentAddressIsSameAsCurrentCheckBox.click(); // Click to select it
            System.out.println("Checkbox was unchecked; now it is checked.");
        }
        return isChecked;
    }
    public boolean validateCurrentAddressIsSameAsPermanent() {
        Actions actions = new Actions(driver);
        actions.moveToElement(PermanentResidenceType).perform();
        String currentaddress = prop.getProperty("currentaddress");
        String permanentAddress = driver.findElement(By.id("523")).getText();
        if (currentaddress.equals(permanentAddress)) {
            System.out.println("Current address and permanent address data is same");
        }
        else  {
            System.out.println("Current address and permanent address data is same");
        }
        String currentPincode = prop.getProperty("currentPincode");
        String permanentpincode = driver.findElement(By.id("524")).getText();
        if (currentPincode.equals(permanentpincode)) {
            System.out.println("Current pincode and permanent pincode data is same");
        }
        else  {
            System.out.println("Current pincode and permanent pincode data is same");
        }
        String ResidenceType = prop.getProperty("ResidenceType");

        String permanentResidence = driver.findElement(By.id("533")).getText();
        if (ResidenceType.equals(permanentResidence)) {
            System.out.println("Current Residence Type and permanent Residence Type data is same");
        }
        else  {
            System.out.println("Current Residence Type and permanent Residence Type data is same");
        }
        return false;
    }
    public boolean validateCheckboxUncheck() {

        boolean isChecked = MyPermanentAddressIsSameAsCurrentCheckBox.isSelected();
        System.out.println("Checkbox is " + (isChecked ? "checked" : "unchecked"));
        if (isChecked) {
            Actions actions = new Actions(driver);
            actions.moveToElement(PermanentAddress).perform();
            MyPermanentAddressIsSameAsCurrentCheckBox.click();
            System.out.println("Checkbox is " + (isChecked ? "checked" : "unchecked"));
        }
        return isChecked;
    }

    public boolean validatePermanentAddressName() throws InterruptedException {
        boolean flag = PermanentAddressName.isDisplayed();
        System.out.println("Permanent address Name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
                                                                                                //permanent address
    public boolean validatePermanentAddressIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(PermanentAddress).perform();
        boolean flag = false;
        List<WebElement> svgElements = driver.findElements(By.cssSelector("svg[data-testid='LocationOnIcon']"));
        if (svgElements.size() >= 2) {
            WebElement currentAddressIcon = svgElements.get(1);
            flag = currentAddressIcon.isDisplayed();
            System.out.println("Permanent Address Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        } else {

        }

        return flag;
    }

    public void validatePermanentAddress()
    {
        PermanentAddress.click();
        PermanentAddress.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        PermanentAddress.sendKeys(prop.getProperty("permanentaddress"));
    }

                                                                                     //PermanentPincode
    public boolean validatepermanentPincodeIcon() {
        boolean flag = false;
        List<WebElement> svgElements = driver.findElements(By.cssSelector("svg[data-testid='PushPinIcon']"));
        if (svgElements.size() >= 2) {
            WebElement currentpincodeIcon = svgElements.get(1);
            flag = currentpincodeIcon.isDisplayed();
            System.out.println("permanent Address Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        } else {

        }
        return flag;
    }
    public boolean validatePermanentPincodeName() throws InterruptedException {
        boolean flag = PermanentPincodeName.isDisplayed();
        System.out.println("Permanent pincode Name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public String ValidatePermanentPincodeLessThan6Digit(){
        Actions actions = new Actions(driver);
        actions.moveToElement(PermanentCity).perform();
        PermanentPincode.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        PermanentPincode.sendKeys(Keys.chord("5600"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("524-helper-text")));
        String errorMessage = errorMessagePermanentPincode.getText();
        System.out.println("Entered PinCode less than 6 Digit = "+errorMessage);
        PermanentPincode.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return  errorMessage;
    }
    public String ValidatePermanentPincodeMoreThan6Digit(){
        PermanentPincode.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        PermanentPincode.sendKeys(Keys.chord("56006442"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("524-helper-text")));
        String errorMessage = errorMessagePermanentPincode.getText();
        System.out.println("Entered PinCode less than 6 Digit = "+errorMessage);
        PermanentPincode.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return  errorMessage;
    }

    public void validatePermanentPincode() {
        PermanentPincode.click();
        PermanentPincode.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        PermanentPincode.sendKeys(prop.getProperty("PermanentPincode"));
    }

    public boolean validatePermanentCityName() throws InterruptedException {
        boolean flag = PermanentCityName.isDisplayed();
        System.out.println("Permanent city Name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
                                                                                    //PermanentResidenceType

    public boolean PermanentResidenceTypeName() throws InterruptedException {
        boolean flag = PermanentResidenceTypeName.isDisplayed();
        System.out.println("Permanent Residence Type Name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public boolean validatePermanentResidenceTypeIcon() {
        boolean flag = false;
        List<WebElement> svgElements = driver.findElements(By.cssSelector("svg[data-testid='ApartmentIcon']"));
        if (svgElements.size() >= 2) {
            WebElement currentResidenceTypeicon = svgElements.get(1);
            flag = currentResidenceTypeicon.isDisplayed();
            System.out.println("permanent residence type Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        } else {

        }
        return flag;
    }


    public  void validatePermanentResidenceTypeDropdown() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(PermanentResidenceType).perform();
        PermanentResidenceType.click();
        Thread.sleep(1000);
    }
    public boolean validatePermanentResidenceTypeRented()  {
        boolean flag = PermanentResidenceTypeRented.isDisplayed();
        System.out.println("Permanent Residence Type Rented is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validatePermanentResidenceTypeOwned() {
        boolean flag = PermanentResidenceTypeOwned.isDisplayed();
        System.out.println("Permanent residence Type Owned is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }
    public void clickPermanentResidenceType()  {

        String PermanentResidenceType = prop.getProperty("PermanentResidenceType");
        if ("RENTED".equalsIgnoreCase(PermanentResidenceType)) {
            PermanentResidenceTypeRented.click();
        } else {
            PermanentResidenceTypeOwned.click();
        }
    }
    public boolean validateApplyForLoanButton() {
        boolean flag = ApplyForLoanButton.isDisplayed();
        System.out.println("Apply for loan button is display = " + (flag ? "Displayed" : "Not Displayed"));
        ApplyForLoanButton.click();
        return flag;
    }












}













