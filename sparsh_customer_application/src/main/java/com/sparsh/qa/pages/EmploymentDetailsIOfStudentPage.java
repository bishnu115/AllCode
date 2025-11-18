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

public class EmploymentDetailsIOfStudentPage extends TestBase {
    public EmploymentDetailsIOfStudentPage() {
        PageFactory.initElements(driver, this);
    }

    EmploymentDetailsIOfStudentPage employmentDetailsIOfStudentPage;

    @FindBy(xpath = "//span[text()='Loan ID']")
    WebElement loanId;


    @FindBy(xpath = "//ul/li/div[3]")
    WebElement loanIdNumber;

    @FindBy(xpath = "//p[text()='Employment details of student']")
    WebElement EmploymentDetailsOfStudentHeader;

    @FindBy(id = "1")
    WebElement occupationName;

    @FindBy(css = "svg[data-testid='WorkIcon']")
    WebElement occupationIcon;

    @FindBy(id = "571")
    WebElement OccupationTextBox;

    @FindBy(xpath = "//li[text()='Self Employed']")
    WebElement occupationSelfEmployed;

    @FindBy(xpath = "//li[text()='Retired']")
    WebElement occupationRetired;

    @FindBy(xpath = "//li[text()='Salaried']")
    WebElement occupationSalaried;

    @FindBy(xpath = "//label[text()='Business Type']")
    WebElement businessTypeName;

    @FindBy(css = "svg[data-testid='WorkspacePremiumIcon']")
    WebElement businessTypeIcon;

    @FindBy(id = "665")
    WebElement businessTypeDropdown;

    @FindBy(xpath = "//li[text()='Proprieter']")
    WebElement businessTypeProprieter;

    @FindBy(xpath = "//li[text()='Partnership Firm']")
    WebElement businessTypePartnershipFirm;

    @FindBy(xpath = "//li[text()='Private Limited']")
    WebElement businessTypePrivateLimited;

    @FindBy(xpath = "//label[text()='Business Type']")
    WebElement NameOfBusinessName;

    @FindBy(css = "svg[data-testid='BadgeIcon']")
    WebElement nameOfBusinessIcon;

    @FindBy(id = "572")
    WebElement nameOfBusinessTextBox;


    @FindBy(xpath = "//p[text()='Please enter valid business name']")
    WebElement errormessageNameOfBusiness;

    @FindBy(id = "573")
    WebElement addressOfBusinessTextBox;

    @FindBy(id = "573-label")
    WebElement addressOfBusinessName;

    @FindBy(css = "svg[data-testid=\"BusinessIcon\"]")
    WebElement addressOfBusinessIcon;

    @FindBy(id = "573")
    WebElement addressOfEmployertextBox;


    @FindBy(id = "573-label")
    WebElement addressOfEmployerName;

    @FindBy(css = "svg[data-testid=\"BusinessIcon\"]")
    WebElement addressOfEmployerIcon;


    @FindBy(id = "576")
    WebElement numberOfYearInBusiness;

    @FindBy(id = "576-helper-text")
    WebElement errorMessagenumberOfYearInBusiness;

    @FindBy(id = "576-label")
    WebElement numberOfYearInBusinessName;

    @FindBy(css = "svg[data-testid=\"DateRangeIcon\"]")
    WebElement numberOfYearInBusinessIcon;


    @FindBy(id = "576")
    WebElement currentEmploymentInYears;

    @FindBy(id = "672")
    WebElement numberOfMonthInbusinessTypeTextBox;
    @FindBy(id = "672")
    WebElement currentEmploymentMonthsTypeTextBox;

    @FindBy(id = "669")
    WebElement totalBusinessExperience;

    @FindBy(id = "669")
    WebElement totalWorkExperienceTextBox;

    @FindBy(id = "673")
    WebElement BusinessExperienceinMonthsTextBox;

    @FindBy(id = "673")
    WebElement workExperienceInMonthsTextBox;

    @FindBy(css = "svg[data-testid=\"FiberPinIcon\"]")
    WebElement pincodeIcon;

    @FindBy(id = "574-label")
    WebElement pincodeName;

    @FindBy(id = "574")
    WebElement pincode;


    @FindBy(id = "574-helper-text")
    WebElement errormessagePinCode;

    @FindBy(id = "575")
    WebElement citystate;

    @FindBy(id = "588")
    WebElement designationTextBox;

    @FindBy(id = "588-helper-text")
    WebElement ErrorMessageDesignationTextBox;

    @FindBy(id = "588-label")
    WebElement designationName;

    @FindBy(id = "572")
    WebElement employerNameTextBox;
    @FindBy(id = "572-label")
    WebElement EmployeNameName;

    @FindBy(css = "svg[data-testid='BadgeIcon']")
    WebElement EmployeNameIcon;

    @FindBy(id = "572-helper-text")
    WebElement ErrorMessageEmployerName;
    @FindBy(id = "573")
    WebElement addressOfEmployer;

    @FindBy(id = "576")
    WebElement currentEmploymentYears;

    @FindBy(xpath = "//button[text()='NEXT']")
    WebElement next;

    @FindBy(css = "svg[data-testid=\"CloseIcon\"]")
    WebElement CloseIcon;
    @FindBy(xpath = "//div[text()='List of documents required']")
    WebElement ListOfDocumentsRequired;

    @FindBy(xpath = "//p[text()='As per our evaluation process please be ready with the following documents for further steps']")
    WebElement ParagraphOfDocumentList;

    @FindBy(xpath = "//p[text()='Latest 6 month bank statement']")
    WebElement Latest6MonthBankStatement;

    @FindBy(xpath = "//p[text()='Latest 3 month bank statement']")
    WebElement Latest3MonthBankStatement;

    @FindBy(xpath = "//p[text()='ITR']")
    WebElement ITR;

    @FindBy(xpath = "//p[text()='3. Computation income for the last 2 years']")
    WebElement ComputationIncomeForTheLast2Years;

    @FindBy(xpath = "//p[text()='Salary Slip']")
    WebElement salarySlip;


    @FindBy(xpath = "//button[text()='Okay']")
    WebElement OkayButton;

    JavascriptExecutor script = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public String validateApplicationTitle() {
        String title = driver.getTitle();
        System.out.println("================================================Employment Details Page=========================================================");
        System.out.println("Title is displayed in Employment Details Page = " + title);
        return title;
    }

    public boolean validateLoanId() throws InterruptedException {
        Thread.sleep(2000);
        boolean flag = loanId.isDisplayed();
        System.out.println("Loan id is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public String printLoanId() {
        String lonenumber = loanIdNumber.getText();
        System.out.println("New loan id is    " + lonenumber);
        return lonenumber;
    }

    public boolean validateEmploymentDetailsOfStudentHeader() {
        boolean flag = EmploymentDetailsOfStudentHeader.isDisplayed();
        System.out.println("Employment Detail sOf Student Header is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateOccupationName() {
        boolean flag = occupationName.isDisplayed();
        System.out.println("Occuption  name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateOccupationIcon() throws InterruptedException {
        boolean flag = occupationIcon.isDisplayed();
        System.out.println("Occuption icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public void clickOccuptionTextBox() {
        Actions actions = new Actions(driver);
        actions.moveToElement(OccupationTextBox).perform();
        OccupationTextBox.click();
    }

    public boolean validateOccupationSelfEmployed() throws InterruptedException {
        Thread.sleep(500);
        boolean flag = occupationSelfEmployed.isDisplayed();
        System.out.println("Occupation Self Employed is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateOccupationRetired() throws InterruptedException {
        boolean flag = occupationRetired.isDisplayed();
        System.out.println("Occupation Retired is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateOccupationSalaried() throws InterruptedException {
        boolean flag = occupationSalaried.isDisplayed();
        System.out.println("Occupation Salaried is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public void clickSelfEmployed() throws InterruptedException {
        occupationSelfEmployed.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(citystate).perform();
        Thread.sleep(500);
    }

    //occuption self employed


    public boolean validateOccupationSelfEmployedAllTextBox() throws InterruptedException {

        boolean isBusinessTypeDropdownDisplayed = businessTypeDropdown.isDisplayed();
        boolean isNameOfBusinessDisplayed = nameOfBusinessTextBox.isDisplayed();
        boolean isAddressOfBusinessTextBoxDisplayed = addressOfBusinessTextBox.isDisplayed();
        boolean isNumberOfYearInBusinessDisplayed = numberOfYearInBusiness.isDisplayed();
        boolean isnumberOfMonthInbusinessTypeTextBoxDisplayed = numberOfMonthInbusinessTypeTextBox.isDisplayed();
        boolean istotalBusinessExperienceDisplayed = totalBusinessExperience.isDisplayed();
        boolean isBusinessExperienceinMonthsTextBoxDisplayed = BusinessExperienceinMonthsTextBox.isDisplayed();
        boolean ispincodeTextBoxDisplayed = pincode.isDisplayed();
        boolean iscitystateTextBoxDisplayed = citystate.isDisplayed();


        System.out.println("Business Type dropdown is " + (isBusinessTypeDropdownDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("Name Of Business Text Box is " + (isNameOfBusinessDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("Address Of Business Text Box is " + (isAddressOfBusinessTextBoxDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("Number Of Year In Business Text Box is " + (isNumberOfYearInBusinessDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("Number Of Month In Business Text Box is " + (isnumberOfMonthInbusinessTypeTextBoxDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("Number Of Year In Business Experience in year Text Box is " + (istotalBusinessExperienceDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("Number Of Year In Business Experience in month Text Box is " + (isBusinessExperienceinMonthsTextBoxDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("Pincode Text Box is " + (ispincodeTextBoxDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("city and State Text Box is " + (iscitystateTextBoxDisplayed ? "Displayed" : "Not Displayed"));

        return isBusinessTypeDropdownDisplayed &&
                isNameOfBusinessDisplayed &&
                isAddressOfBusinessTextBoxDisplayed &&
                isNumberOfYearInBusinessDisplayed &&
                isnumberOfMonthInbusinessTypeTextBoxDisplayed &&
                istotalBusinessExperienceDisplayed &&
                isBusinessExperienceinMonthsTextBoxDisplayed &&
                ispincodeTextBoxDisplayed &&
                iscitystateTextBoxDisplayed;
    }

    public boolean validatebusinessTypeName() throws InterruptedException {
        boolean flag = businessTypeName.isDisplayed();
        System.out.println("Business Type name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public void validatebusinessTypeDropdown() throws InterruptedException {
        businessTypeDropdown.click();
        Thread.sleep(500);
    }

    public boolean validatebusinessTypeProprieter() throws InterruptedException {
        boolean flag = businessTypeProprieter.isDisplayed();
        System.out.println("Business Type Proprieter is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateBusinessTypePartnershipFirm() throws InterruptedException {
        boolean flag = businessTypePartnershipFirm.isDisplayed();
        System.out.println("Business Type Partnership Firm is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validatebusinessTypePrivateLimited() throws InterruptedException {
        boolean flag = businessTypePrivateLimited.isDisplayed();
        businessTypePrivateLimited.click();
        System.out.println("business Type Private Limited is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateBusinessTypeIcon() {
        boolean flag = false;
        List<WebElement> svgElements = driver.findElements(By.cssSelector("svg[data-testid='WorkspacePremiumIcon']"));
        if (svgElements.size() >= 2) {
            WebElement businessTypeIcon = svgElements.get(0);
            flag = businessTypeIcon.isDisplayed();
            System.out.println("Business type Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        } else {

        }

        return flag;
    }

    public boolean validateNameOfBusinessName() throws InterruptedException {
        boolean flag = NameOfBusinessName.isDisplayed();
        System.out.println("name of business text box is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validatenameOfBusinessIcon() {
        boolean flag = nameOfBusinessIcon.isDisplayed();
        System.out.println("Name of business  Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public String ValidatenameOfbusinessonlyNumber() {
        nameOfBusinessTextBox.click();
        nameOfBusinessTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        nameOfBusinessTextBox.sendKeys(Keys.chord("12345"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Please enter valid business name']")));
        String errorMessage = errormessageNameOfBusiness.getText();
        nameOfBusinessTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String ValidatenameOfBusinessonlySpacialcharacter() {
        nameOfBusinessTextBox.click();
        nameOfBusinessTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        nameOfBusinessTextBox.sendKeys(Keys.chord("!@#$%"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Please enter valid business name']")));
        String errorMessage = errormessageNameOfBusiness.getText();
        nameOfBusinessTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String ValidatenameOfBusinessNumberwithSpacialcharacter() {
        nameOfBusinessTextBox.click();
        nameOfBusinessTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        nameOfBusinessTextBox.sendKeys(Keys.chord("!@#$%1234"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Please enter valid business name']")));
        String errorMessage = errormessageNameOfBusiness.getText();
        nameOfBusinessTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String ValidatenameOfBusinessAlphabetwithSpacialcharacter() {
        nameOfBusinessTextBox.click();
        nameOfBusinessTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        nameOfBusinessTextBox.sendKeys(Keys.chord("varthana@#$"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Please enter valid business name']")));
        String errorMessage = errormessageNameOfBusiness.getText();
        nameOfBusinessTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public boolean ValidatenameOfBusinessAlphabetwithNumber() {
        nameOfBusinessTextBox.click();
        nameOfBusinessTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        nameOfBusinessTextBox.sendKeys(Keys.chord("varthana123"));
        boolean isErrorDisplayed = false;
        try {
            wait.until(ExpectedConditions.invisibilityOf(errormessageNameOfBusiness));
            System.out.println("No error message displayed. Valid data accepted.");
        } catch (Exception e) {
            isErrorDisplayed = true;
            System.out.println("Error: Unexpected error message appeared. Exception: " + e.getMessage());
        }
        nameOfBusinessTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return !isErrorDisplayed;
    }

    public boolean ValidatenameOfbusinessAlphabet() {
        nameOfBusinessTextBox.click();
        nameOfBusinessTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        nameOfBusinessTextBox.sendKeys(Keys.chord("varthana"));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean isErrorDisplayed = false;
        try {
            WebElement errorMessage = driver.findElement(By.xpath("//p[text()='Please enter valid business name']"));
            if (errorMessage.isDisplayed()) {
                isErrorDisplayed = true;
                System.out.println("Error message displayed: " + errorMessage.getText());
            }
        } catch (NoSuchElementException e) {
            System.out.println("No error message displayed. Valid data accepted.");
        }
        nameOfBusinessTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return !isErrorDisplayed;
    }


    public boolean validateaddressOfBusinessName() throws InterruptedException {
        boolean flag = addressOfBusinessName.isDisplayed();
        System.out.println("name of business name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateaddressOfBusinessIcon() {
        boolean flag = addressOfBusinessIcon.isDisplayed();
        System.out.println("Name of business  Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public void validateAddressOfBusinessTextBox() {
        addressOfBusinessTextBox.click();
        addressOfBusinessTextBox.sendKeys(Keys.chord("#21 varthana bangalore."));
        addressOfBusinessTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
    }

    public boolean validatenumberOfYearInBusinessName() throws InterruptedException {
        boolean flag = numberOfYearInBusinessName.isDisplayed();
        System.out.println("name of business text box is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean numberOfYearInBusinessIcon() {
        boolean flag = false;
        List<WebElement> svgElements = driver.findElements(By.cssSelector("svg[data-testid=\"DateRangeIcon\"]"));
        if (svgElements.size() >= 2) {
            WebElement numberOfYearInBusinessIcon = svgElements.get(0);
            flag = numberOfYearInBusinessIcon.isDisplayed();
            System.out.println("number Of Year In Business Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        } else {

        }
        return flag;
    }

    public String ValidatenumberOfYearInBusinessAs0Years() {
        numberOfYearInBusiness.click();
        numberOfYearInBusiness.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        numberOfYearInBusiness.sendKeys(Keys.chord("0"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("576-helper-text")));
        String errorMessage = errorMessagenumberOfYearInBusiness.getText();
        numberOfYearInBusiness.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;

    }

    public String ValidatenumberOfYearInBusinessabove99Yeays() {
        numberOfYearInBusiness.click();
        numberOfYearInBusiness.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        numberOfYearInBusiness.sendKeys(Keys.chord("122"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("576-helper-text")));
        String errorMessage = errorMessagenumberOfYearInBusiness.getText();
        numberOfYearInBusiness.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;

    }

    public boolean ValidatePincodeName() throws InterruptedException {
        boolean flag = pincodeName.isDisplayed();
        System.out.println("Pincode name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean ValidatepincodeIcon() {
        boolean flag = pincodeIcon.isDisplayed();
        System.out.println("Pincode  Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public String ValidatePinCodeLessThan6Digit() {

        pincode.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        pincode.sendKeys(Keys.chord("1234"));
        Actions actions = new Actions(driver);
        actions.moveToElement(errormessagePinCode).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("574-helper-text")));
        String errorMessage = errormessagePinCode.getText();
        pincode.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String ValidatePinCodeMoreThan6Digit() throws InterruptedException {
        pincode.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        pincode.sendKeys(Keys.chord("56006443"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("574-helper-text")));
        String errorMessage = errormessagePinCode.getText();
        pincode.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    //occuption salaried


    public void clickSalaried() throws InterruptedException {
        OccupationTextBox.click();
        occupationSalaried.click();
        Thread.sleep(500);
    }

    public boolean validateOccupationSalarieddAllTextBox() throws InterruptedException {
        Thread.sleep(1000);
        boolean isdesignationTextBoxDisplayed = designationTextBox.isDisplayed();
        boolean isemployerNameTextBoxDisplayed = employerNameTextBox.isDisplayed();
        boolean isaddressOfEmployerextBoxDisplayed = addressOfEmployertextBox.isDisplayed();
        boolean iscurrentEmploymentInYearsDisplayed = currentEmploymentInYears.isDisplayed();
        boolean iscurrentEmploymentMonthsTypeTextBoxDisplayed = currentEmploymentMonthsTypeTextBox.isDisplayed();
        boolean istotalWorkExperienceTextBoxDisplayed = totalWorkExperienceTextBox.isDisplayed();
        boolean isworkExperienceInMonthsTextBoxDisplayed = workExperienceInMonthsTextBox.isDisplayed();
        boolean ispincodeTextBoxDisplayed = pincode.isDisplayed();
        boolean iscitystateTextBoxDisplayed = citystate.isDisplayed();

        System.out.println("Designation Text Box is " + (isdesignationTextBoxDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("employer NameText Box is " + (isemployerNameTextBoxDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("Address Of EmployereText Box is " + (isaddressOfEmployerextBoxDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("Current Employment In Years Text Box is " + (iscurrentEmploymentInYearsDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("Current Employment In YearsText Box is " + (iscurrentEmploymentMonthsTypeTextBoxDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("Total Work Experience in year Text Box is " + (istotalWorkExperienceTextBoxDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("Total Work Experience in month Text Box is " + (isworkExperienceInMonthsTextBoxDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("Pincode Text Box is " + (ispincodeTextBoxDisplayed ? "Displayed" : "Not Displayed"));
        System.out.println("city and State Text Box is " + (iscitystateTextBoxDisplayed ? "Displayed" : "Not Displayed"));

        return isdesignationTextBoxDisplayed &&
                isemployerNameTextBoxDisplayed &&
                isaddressOfEmployerextBoxDisplayed &&
                iscurrentEmploymentInYearsDisplayed &&
                iscurrentEmploymentMonthsTypeTextBoxDisplayed &&
                istotalWorkExperienceTextBoxDisplayed &&
                isworkExperienceInMonthsTextBoxDisplayed &&
                ispincodeTextBoxDisplayed &&
                iscitystateTextBoxDisplayed;
    }

    public boolean validateDesignationName() throws InterruptedException {
        boolean flag = designationName.isDisplayed();
        System.out.println("Designation name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateDesignationIcon() {
        boolean flag = false;
        List<WebElement> svgElements = driver.findElements(By.cssSelector("svg[data-testid='WorkspacePremiumIcon']"));
        if (svgElements.size() >= 2) {
            WebElement DesignationIcon = svgElements.get(1);
            flag = DesignationIcon.isDisplayed();
            System.out.println("Designation Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        } else {

        }

        return flag;
    }

    public String ValidateDesignationTextBoxLessThan5Character() {
        designationTextBox.click();
        designationTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        designationTextBox.sendKeys(Keys.chord("Bcom"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("588-helper-text")));
        String errorMessage = ErrorMessageDesignationTextBox.getText();
        designationTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;

    }

    public String ValidateDesignationTextBoxMoreThan40Character() {
        designationTextBox.click();
        designationTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        designationTextBox.sendKeys(Keys.chord("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRST"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("588-helper-text")));
        String errorMessage = ErrorMessageDesignationTextBox.getText();
        designationTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;

    }

    public boolean validateEmployeNameName() throws InterruptedException {
        boolean flag = EmployeNameName.isDisplayed();
        System.out.println("name Of Business Name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validatenEmployeNameIcon() {
        boolean flag = EmployeNameIcon.isDisplayed();
        System.out.println("Name of business  Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public String ValidateEmployeeNameWithOnlyNumaricValue() {
        employerNameTextBox.click();
        employerNameTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        employerNameTextBox.sendKeys(Keys.chord("1234"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("572-helper-text")));
        String errorMessage = ErrorMessageEmployerName.getText();
        employerNameTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String ValidateEmployeeNameWithSpacialCharacter() {
        employerNameTextBox.click();
        employerNameTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        employerNameTextBox.sendKeys(Keys.chord("!@#$%^"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("572-helper-text")));
        String errorMessage = ErrorMessageEmployerName.getText();
        employerNameTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String ValidateEmployeeNameWithAlphbetAndSpacialCharacter() {
        employerNameTextBox.click();
        employerNameTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        employerNameTextBox.sendKeys(Keys.chord("bishnu!@#$%^"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("572-helper-text")));
        String errorMessage = ErrorMessageEmployerName.getText();
        employerNameTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public boolean validateAddressOfEmployerName() throws InterruptedException {
        boolean flag = addressOfEmployerName.isDisplayed();
        System.out.println("name of business name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateaddressOfEmployerIcon() {
        boolean flag = addressOfEmployerIcon.isDisplayed();
        System.out.println("Name of business  Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public void validateAddressOfEmployerTextBox() {
        addressOfEmployertextBox.click();
        addressOfEmployertextBox.sendKeys(Keys.chord("#21 varthana bangalore."));
        addressOfEmployertextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
    }

    public boolean validatePincodeName() throws InterruptedException {
        boolean flag = pincodeName.isDisplayed();
        System.out.println("Pincode name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validatepincodeIcon() {
        boolean flag = pincodeIcon.isDisplayed();
        System.out.println("Pincode  Icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public String ValidatePinCodeLessThan6digit() throws InterruptedException {

        pincode.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        pincode.sendKeys(Keys.chord("5604"));
        Actions actions = new Actions(driver);
        actions.moveToElement(errormessagePinCode).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("574-helper-text")));
        String errorMessage = errormessagePinCode.getText();
        pincode.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String ValidatePinCodeMoreThan6digit() throws InterruptedException {
        pincode.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        pincode.sendKeys(Keys.chord("560064421"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("574-helper-text")));
        String errorMessage = errormessagePinCode.getText();
        pincode.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }
    // Retired

    public void clickOccupationRetired() throws InterruptedException {
        OccupationTextBox.click();
        occupationRetired.click();
        Thread.sleep(500);
    }

    public boolean validateNextButton() throws InterruptedException {
        boolean flag = next.isDisplayed();
        System.out.println("Next button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    //validate ocuption with real data
    public void validateOccuptionClick() throws InterruptedException {
        OccupationTextBox.click();
        String occupation = prop.getProperty("occuption");
        if ("Salaried".equalsIgnoreCase(occupation)) {
            occupationSalaried.click();
            Actions actions = new Actions(driver);
            actions.moveToElement(citystate).perform();
            System.out.println("Occupation salaried click successfully");
        } else if ("Self employed".equalsIgnoreCase(occupation)) {
            occupationSelfEmployed.click();
            Actions actions = new Actions(driver);
            actions.moveToElement(citystate).perform();
            System.out.println("Occupation Self employed click successfully");
        } else if ("Retired".equalsIgnoreCase(occupation)) {
            occupationRetired.click();
            System.out.println("Occupation Retired click successfully");

        } else {
            System.out.println("You are not selected OCCUPATION type : please select the Occupation type");
        }

    }

    public void FillAllThaData() throws InterruptedException {
        String occupation = prop.getProperty("occuption");
        if ("Salaried".equalsIgnoreCase(occupation)) {
            designationTextBox.sendKeys(prop.getProperty("Designation"));
            employerNameTextBox.sendKeys(prop.getProperty("EmployerName"));
            addressOfEmployertextBox.sendKeys(prop.getProperty("AddressOfEmployer"));
            currentEmploymentInYears.sendKeys(prop.getProperty("currentEmploymentInYears"));
//           numberOfMonthInbusinessTypeTextBox.click();
//            Select objSelect =new Select(driver.findElement(By.id("")));
//            objSelect.selectByVisibleText("Automation");
            totalWorkExperienceTextBox.sendKeys(prop.getProperty("totalWorkExperience"));
            //workExperienceInMonthsTextBox.click();
            pincode.sendKeys(prop.getProperty("pincode"));
            String Citystate = citystate.getText();
            String cityAndState = prop.getProperty("cityAndState");
            if (Citystate.equals(cityAndState)) {
                System.out.println("city and state value is match according to the pin code");
            } else {
                System.out.println("city and state value is not match according to the pin code");
            }

        } else if ("Self employed".equalsIgnoreCase(occupation)) {
            businessTypeDropdown.click();
            String BusinessType = prop.getProperty("BusinessType");
            if ("Proprieter".equalsIgnoreCase(BusinessType)) {
                businessTypeProprieter.click();
                System.out.println("Business type is proprieter");
            } else if ("Partnership Firm".equalsIgnoreCase(BusinessType)) {
                businessTypePartnershipFirm.click();
                System.out.println("Business type is Partnership Firm");
            } else if ("private limited".equalsIgnoreCase(BusinessType)) {
                businessTypePrivateLimited.click();
                System.out.println("Business type is private limited");
            } else {
                System.out.println("You are not selected business type : please select the Business type");
            }
            nameOfBusinessTextBox.sendKeys(prop.getProperty("nameOfBusiness"));
            addressOfBusinessTextBox.sendKeys(prop.getProperty("addressOfBusiness"));

            pincode.sendKeys(prop.getProperty("PinCode"));
            String Citystate = citystate.getText();
            String cityAndState = prop.getProperty("cityAndState");
            if (Citystate.equals(cityAndState)) {
                System.out.println("city and state value is match according to the pin code");
            } else {
                System.out.println("city and state value is not match according to the pin code");
            }

        } else if ("Retired".equalsIgnoreCase(occupation)) {
            occupationRetired.click();
            System.out.println("Occupation Retired click successfully");

        } else {
            System.out.println("You are not selected occupation : please select the occupation");
        }

    }

    public boolean validateNextButtonClick() {
        boolean flag = next.isDisplayed();
        System.out.println("Next button is display = " + (flag ? "Displayed" : "Not Displayed"));
        next.click();
        return flag;
    }

    public boolean validateTheDocumentUploadPopup() throws InterruptedException {
        String occupation = prop.getProperty("occuption");
        if ("Salaried".equalsIgnoreCase(occupation)) {
            boolean isCloseIconDisplayed = CloseIcon.isDisplayed();
            boolean isListOfDocumentsRequiredTextDisplayed = ListOfDocumentsRequired.isDisplayed();
            boolean isParagraphOfDocumentListDisplayed = ParagraphOfDocumentList.isDisplayed();
            boolean isLatest3MonthBankStatementDisplayed = Latest3MonthBankStatement.isDisplayed();
            boolean isSalarySlipDisplayed = salarySlip.isDisplayed();
            boolean isOkayButtonDisplayed = OkayButton.isDisplayed();


            System.out.println("Close icon is " + (isCloseIconDisplayed ? "Displayed" : "Not Displayed"));
            System.out.println("List Of Documents Required Text is " + (isListOfDocumentsRequiredTextDisplayed ? "Displayed" : "Not Displayed"));
            System.out.println("Paragraph Of Document List is " + (isParagraphOfDocumentListDisplayed ? "Displayed" : "Not Displayed"));
            System.out.println("Latest 3 Month Bank Statement is " + (isLatest3MonthBankStatementDisplayed ? "Displayed" : "Not Displayed"));
            System.out.println("Latest 3 Month Bank Statement is " + (isSalarySlipDisplayed ? "Displayed" : "Not Displayed"));
            System.out.println("Okay Button is " + (isOkayButtonDisplayed ? "Displayed" : "Not Displayed"));



            return  isCloseIconDisplayed &&
                    isListOfDocumentsRequiredTextDisplayed &&
                    isParagraphOfDocumentListDisplayed &&
                    isLatest3MonthBankStatementDisplayed &&
                    isSalarySlipDisplayed &&
                    isOkayButtonDisplayed;



        }
         else if ("Self employed".equalsIgnoreCase(occupation)) {


            boolean isCloseIconDisplayed = CloseIcon.isDisplayed();
            boolean isListOfDocumentsRequiredTextDisplayed = ListOfDocumentsRequired.isDisplayed();
            boolean isParagraphOfDocumentListDisplayed = ParagraphOfDocumentList.isDisplayed();
            boolean isLatest6MonthBankStatementDisplayed = Latest6MonthBankStatement.isDisplayed();
            boolean isITRDisplayed = ITR.isDisplayed();
            boolean isComputationIncomeForTheLast2YearsDisplayed = ComputationIncomeForTheLast2Years.isDisplayed();
            boolean isOkayButtonDisplayed = OkayButton.isDisplayed();


            System.out.println("Close icon is " + (isCloseIconDisplayed ? "Displayed" : "Not Displayed"));
            System.out.println("List Of Documents Required Text is " + (isListOfDocumentsRequiredTextDisplayed ? "Displayed" : "Not Displayed"));
            System.out.println("Paragraph Of Document List is " + (isParagraphOfDocumentListDisplayed ? "Displayed" : "Not Displayed"));
            System.out.println("Latest 6 Month Bank Statement is " + (isLatest6MonthBankStatementDisplayed ? "Displayed" : "Not Displayed"));
            System.out.println("ITR is " + (isITRDisplayed ? "Displayed" : "Not Displayed"));
            System.out.println("Computation Income For The Last 2 Years is " + (isComputationIncomeForTheLast2YearsDisplayed ? "Displayed" : "Not Displayed"));
            System.out.println("Okay Button is " + (isOkayButtonDisplayed ? "Displayed" : "Not Displayed"));

            return isCloseIconDisplayed &&
                    isListOfDocumentsRequiredTextDisplayed &&
                    isParagraphOfDocumentListDisplayed &&
                    isLatest6MonthBankStatementDisplayed &&
                    isITRDisplayed &&
                    isComputationIncomeForTheLast2YearsDisplayed &&
                    isOkayButtonDisplayed;

        }
        else if ("Retired".equalsIgnoreCase(occupation)) {


        }

        return false;
    }
}
