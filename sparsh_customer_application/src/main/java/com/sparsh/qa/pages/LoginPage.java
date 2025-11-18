package com.sparsh.qa.pages;

import com.sparsh.qa.base.TestBase;
import com.sun.tools.jconsole.JConsoleContext;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginPage extends TestBase {
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "button>div>img[alt=\"VarthanaLogo\"]")
    WebElement sparshLogo;

    @FindBy(css = "div[class*=\"MuiBox-root\"]>div>img[alt=\"VarthanaLogo\"]")
    WebElement varthanaLogo;

    @FindBy(xpath = "//p[contains(text(),\"SHESHDRIPURAM COLLEGE\")]")
    WebElement collegeName;

    @FindBy(xpath = "//p[contains(text(),\"Yelahanka New Town, Bengaluru, Karnataka\")]")
    WebElement collegeAddress;

    @FindBy(xpath = "//p[contains(text(),\"Bengaluru\")]")
    WebElement collegeCity;

    @FindBy(xpath = "//p[contains(text(),\"Karnataka\")]")
    WebElement collegeState;

    @FindBy(xpath = "//p[contains(text(),\"560064\")]")
    WebElement collegePinCode;

    @FindBy(css = "svg[data-testid=\"PlaceOutlinedIcon\"]")
    WebElement locationIcon;

    @FindBy(xpath = "//h2[contains(text(),\"Verify Your Phone Number\")]")
    WebElement headingVerifyYourPhoneNumber;

    @FindBy(css = "input[name=\"phone_number\"]")
    WebElement phoneNumberTextBox;

    @FindBy(css = "p[id*=\"helper-text\"]")
    WebElement errorMessagePleaseEnterValidNumber;

    @FindBy(css = "input[type=\"checkbox\"]")
    WebElement numberLinkedAadhaarCheckBox;

    @FindBy(css = "p[class*=\"MuiTypography-root MuiTypography-body2\"]")
    WebElement phoneNumberAndAadhaarLinkText;

    @FindBy(css = "span[class=\"MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-1sfc6bq\"]")
    List<WebElement> radioBtns;

    @FindBy(xpath = "//span[contains(text(),\"Self Funded\")]")
    WebElement radioBtnForStudentFunded;

    @FindBy(xpath = "//span[contains(text(),\"Parent/Guardian Funded\")]")
    WebElement radioBtnForParentFunded;

    @FindBy(xpath = "//span[contains(text(),\"Having Trouble?\")]")
    WebElement resendOTPTimer;

    @FindBy(css = "svg[data-testid=\"VisibilityOffIcon\"]")
    WebElement toggleShowOTPButton;

    @FindBy(css = "svg[data-testid=\"VisibilityIcon\"]")
    WebElement toggleHideOTPButton;

    @FindBy(css = "svg[data-testid=\"EditIcon\"]")
    WebElement editPhoneNumberButton;

    @FindBy(xpath = "//a[contains(text(),\"GET OTP\")]")
    WebElement getOtpButton;

    @FindBy(xpath = "//a[contains(text(),\"Resend OTP\")]")
    WebElement resendOtpButton;

    @FindBy(xpath = "//button[contains(text(),\"Verify OTP\")]")
    WebElement verifyOtpButton;

    @FindBy(css = "input[name=\"otp\"]")
    WebElement otpTextBox;

    @FindBy(xpath = "//p[contains(text(),\"OTP expired, please generate a new OTP!\")]")
    WebElement expiredOtpMessage;

    @FindBy(css="div[role=\"dialog\"]")
    WebElement otpValidationDialogBox;

    @FindBy(xpath = "//button[contains(text(),\"Okay\")]")
    WebElement okButton;

    @FindBy(xpath = "//p[contains(text(),\"Invalid OTP entered. Please enter valid OTP\")]")
    WebElement invalidOtpText;

    @FindBy(xpath = "//button[text()='Okay']")
    WebElement okayButton;

    @FindBy(xpath = "//p[contains(text(), 'This phone number is registered with')]")
    WebElement whatsappAuthenticationCheckbox;

    @FindBy(xpath = "//button[contains(text(), 'No')]")
    WebElement noButtonforWhatsappAuthentication;


    JavascriptExecutor script = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));


    public String validateApplicationTitle() {
        String title = driver.getTitle();
        System.out.println("================================================Login Page=========================================================");
        System.out.println("Title is displayed in Instructions Page = " + title);
        return title;
    }

    public boolean validateSparshLogo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("button>div>img[alt=\"VarthanaLogo\"]")));
        boolean flag = sparshLogo.isDisplayed();
        System.out.println("Sparsh logo is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateVarthnaLogo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div[class*=\"MuiBox-root\"]>div>img[alt=\"VarthanaLogo\"]")));
        boolean flag = varthanaLogo.isDisplayed();
        System.out.println("varthana logo is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public String validateCollegeName(){
        String cName=collegeName.getText();
        System.out.println("College name = "+cName);
        return cName;
    }

    public String validateCollegeAddress() {
        String address = collegeAddress.getText();
        System.out.println("Students's college address = " + address);
        return address;
    }

    public String validateCollegeCity() {
        String address = collegeCity.getText();
        address = address.replaceAll(" ", "");
        String splitAddress[] = address.split(",");
        String city = splitAddress[1];
        System.out.println("Student's college city = " + city);
        return city;
    }

    public String validateCollegeState() {
        String address = collegeState.getText();
        address = address.replaceAll(" ", "");
        String splitAddress[] = address.split(",");
        String state = splitAddress[2];
        System.out.println("Student's college State = " + state);
        return state;
    }

    public String validateCollegePinCode() {
        String address = collegePinCode.getText();
        address = address.replaceAll(" ", "");
        String splitAddress[] = address.split(",");
        String pinCode = splitAddress[3];
        System.out.println("Student's college pincode = " + pinCode);
        return pinCode;
    }

    public Boolean validateLocationIcon() {
        boolean flag = locationIcon.isDisplayed();
        System.out.println("Location icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public String validateHeadingVerifyYourPhoneNumber(){
        String heading = headingVerifyYourPhoneNumber.getText();
        System.out.println("Phone verification heading = "+heading);
        return heading;
    }

    public String validatePhoneNumberWithZero(){
        phoneNumberTextBox.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        phoneNumberTextBox.sendKeys("0");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[id*=\"helper-text\"]")));
        String errorMessage = errorMessagePleaseEnterValidNumber.getText();
        System.out.println("Entered zero in phone number text box = "+errorMessage);
        phoneNumberTextBox.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        return  errorMessage;
    }

    public String validatingPhoneNumberWithNegativeValues(){
        phoneNumberTextBox.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        phoneNumberTextBox.sendKeys("-12345");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[id*=\"helper-text\"]")));
        String errorMessage = errorMessagePleaseEnterValidNumber.getText();
        System.out.println("Entered Negative value in phone number text box = "+errorMessage);
        phoneNumberTextBox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        return  errorMessage;
    }

    public String validatePhoneNumberWithLessThanTenDigits() {
        phoneNumberTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        phoneNumberTextBox.sendKeys("123456789");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[id*=\"helper-text\"]")));
        String errorMessage = errorMessagePleaseEnterValidNumber.getText();
        System.out.println("Entered Less than 10 digits in phone number text box = " + errorMessage);
        phoneNumberTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String validatePhoneNumberWithMoreThanTenDigits() {
        phoneNumberTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        phoneNumberTextBox.sendKeys("12345678901");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[id*=\"helper-text\"]")));
        String errorMessage = errorMessagePleaseEnterValidNumber.getText();
        System.out.println("Entered More than 10 digits in phone number text box = " + errorMessage);
        phoneNumberTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public boolean validateRadioBtnForSelfFunded() {
        boolean flag = radioBtnForStudentFunded.isDisplayed();
        System.out.println("Radio Button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateRadioBtnForParentFunded() {
        boolean flag = radioBtnForParentFunded.isDisplayed();
        System.out.println("Radio Button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateWhatsappAuthenticationChackbox() {
        boolean flag = whatsappAuthenticationCheckbox.isDisplayed();
        System.out.println("Whatapp Authentication checkbox is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateWorkingOfWhatsappAuthenticationCheckbox() {
        System.out.println(prop.getProperty("whatsappAuthenticationCheckbox"));
        if(prop.getProperty("whatsappAuthenticationCheckbox").equals("SMS")) {
            System.out.println("Yes");
            whatsappAuthenticationCheckbox.click();
            noButtonforWhatsappAuthentication.click();
        }
        boolean flag = driver.findElement(By.cssSelector("span[class*=\"Mui-checked\"]")).isDisplayed();
        return flag;
    }

    public boolean validateChoosingOfLoanType() {
        System.out.println(prop.getProperty("loanType"));
        if(prop.getProperty("loanType").equals("Student")) {
            System.out.println("Yes");
            radioBtnForStudentFunded.click();
        }
        else if(prop.getProperty("loanType").equals("Parent")) {
            radioBtnForParentFunded.click();
        }
        boolean flag = driver.findElement(By.cssSelector("span[class*=\"Mui-checked\"]")).isDisplayed();
        return flag;
    }

    public String validateGetOtpButton() {
//        radioBtnForSelfFunded.click();
        phoneNumberTextBox.sendKeys("1111111112");
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(text(),\"GET OTP\")]")));
        String getOtpButtonText = getOtpButton.getText();
        System.out.println("Get otp Button = " + getOtpButtonText);
        return getOtpButtonText;
    }

    public boolean validateEditPhoneNumberButton() {
        getOtpButton.click();
        boolean flag = editPhoneNumberButton.isDisplayed();
        System.out.println(flag);
        return flag;
    }

    public boolean validateEditingOfPhoneNumber() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg[data-testid=\"EditIcon\"]")));
        editPhoneNumberButton.click();
        String initialPhoneNumber = phoneNumberTextBox.getAttribute("value");
        phoneNumberTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        phoneNumberTextBox.sendKeys(prop.getProperty("phoneNumber"));
        String editedPhoneNumber = phoneNumberTextBox.getAttribute("value");
        System.out.println(initialPhoneNumber);
        System.out.println(editedPhoneNumber);
        return (initialPhoneNumber != editedPhoneNumber);
    }

    public boolean validateResendOTPTimer() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),\"GET OTP\")]")));
        getOtpButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),\"Having Trouble?\")]")));
        boolean flag = resendOTPTimer.isDisplayed();
        System.out.println("Resend OTP Timer is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateToggleOTPButton() throws InterruptedException {
        otpTextBox.sendKeys("0000");
        boolean flag = toggleShowOTPButton.isDisplayed();
        System.out.println("Toggle OTP Button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        toggleShowOTPButton.click();
        toggleHideOTPButton.click();
        System.out.println("Toggle OTP Button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public String validateResendOtpButton() {
        String resetOtpButtonText = "";
        getOtpButton.click();
        try {
            Thread.sleep(300000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),\"Resend OTP\")]")));
            resetOtpButtonText = resendOtpButton.getText();
            System.out.println("ReSend OTP button text = " + resetOtpButtonText);
        } catch (Exception E) {
            E.printStackTrace();
        }
        return resetOtpButtonText;
    }

//    public String validateTheVerifyOtpButton() {
////        getOtpButton.click();
//        otpTextBox.sendKeys(prop.getProperty("staticOtp"));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),\"Verify OTP\")]")));
//        String verifyOtpText= verifyOtpButton.getText();
//        System.out.println("Verify otp button = "+verifyOtpText);
//        return  verifyOtpText;
//    }

//    public boolean validateOtpValidationDialogBox(){
//        verifyOtpButton.click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[role=\"dialog\"]")));
//        boolean flag=otpValidationDialogBox.isDisplayed();
//        System.out.println("OTP validation dialogbox = "+(flag?"Displayed":"Not Displayed"));
//        return flag;
//    }

    public String validateExpiredOtp(){
        String expiredOtpMsg = expiredOtpMessage.getText();
        System.out.println("Expired OTP text = "+expiredOtpMsg);
        script.executeScript("arguments[0].click()",okButton);
        return expiredOtpMsg;
    }

    public String validateInvalidOtp(){
//        otpTextBox.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name=\"otp\"]")));
        System.out.println(otpTextBox.isDisplayed());
        otpTextBox.sendKeys("567890");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[role=\"dialog\"]")));
        String invalidOtpMsg = invalidOtpText.getText();
        System.out.println("Invalid OTP text = "+invalidOtpMsg);
        script.executeScript("arguments[0].click()",okButton);
        return invalidOtpMsg;
    }

    public UploadPANandKYCPage validateLoginFunctionality() throws IOException {
        okayButton.click();
        otpTextBox.sendKeys(prop.getProperty("staticOtp"));
        FileOutputStream output = new FileOutputStream(prop.getProperty("configPath"));
//        FileOutputStream output = new FileOutputStream("/home/rajkumar/selenium projects/Sparsh/sparsh_customer_application/src/main/java/com/sparsh/qa/config/config.properties");
        String currPhoneNumber = prop.getProperty("phoneNumber");
        long l = Long.parseLong(currPhoneNumber);
        l++;
        String updatedPhoneNumber = l + "";
        prop.setProperty("phoneNumber", updatedPhoneNumber);
        prop.store(output, "Phone Number Updated");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(),\"Upload and Verify your PAN Details\")]")));
        return new UploadPANandKYCPage();
    }

}