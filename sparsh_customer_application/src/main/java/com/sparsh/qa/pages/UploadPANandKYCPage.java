package com.sparsh.qa.pages;

import com.sparsh.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class UploadPANandKYCPage extends TestBase {
    public UploadPANandKYCPage() {
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

    @FindBy(xpath = "//h5[contains(text(),\"Upload and Verify your PAN Details\")]")
    WebElement headingUploadAndVerifyPan;

    @FindBy(css = "svg[data-testid=\"UploadFileIcon\"]")
    WebElement uploadPANButton;

    @FindBy(css = "input[id=\"pan-upload\"]")
    WebElement sendingPath;

    @FindBy(xpath = "//span[contains(text(), \"Your PAN has been successfully uploaded\")]")
    WebElement uploadPanSuccessfulMsg;

    @FindBy(xpath = "//span[contains(text(), \"You have uploaded the wrong PAN image or may be a Server Error\")]")
    WebElement uploadPanUnsuccessfulMsg;

    @FindBy(css = "svg[data-testid=\"CameraAltOutlinedIcon\"]")
    WebElement cameraButton;

    @FindBy(css = "svg[data-testid=\"QuestionMarkOutlinedIcon\"]")
    WebElement helpButton;

    @FindBy(css = "button[type=\"button\" ][elevation=\"3\"]")
    WebElement continueButton;

    @FindBy(css = "svg[data-testid=\"CloseIcon\"]")
    WebElement closeButton;

    @FindBy(css = "img[alt=\"PAN illustration\"]")
    List<WebElement> panIllustration;

    @FindBy(className = "css-bknbrw")
    WebElement helpSection;


    //    JavascriptExecutor script = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    Actions action = new Actions(driver);

    public String validateApplicationTitle() {
        String title = driver.getTitle();
        System.out.println("================Upload PAN Page==============================================");
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

    public boolean validateLocationIcon() {
        boolean flag = locationIcon.isDisplayed();
        System.out.println("Location icon is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateHelpButton() {
        boolean flag = helpButton.isDisplayed();
        System.out.println("Help button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public String validateHeadingUplaodAndVerifyPAN() {
        String heading = headingUploadAndVerifyPan.getText();
        System.out.println("Upload Pan heading heading = "+heading);
        return heading;
    }

    public boolean validateUploadPanbutton() {
        boolean flag = uploadPANButton.isDisplayed();
        System.out.println("Upload Pan Button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateCameraButton() {
        boolean flag = cameraButton.isDisplayed();
        System.out.println("Camera Button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateContinueButtonBeforePanUpload() {
        return continueButton.isEnabled();
    }

    public String validatePanIllustration() {
        String imgUrl = panIllustration.get(1).getAttribute("src");
        return imgUrl;
    }

    public boolean validateCloseButtonBeforePanUpload() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        boolean flag = driver.findElements(By.cssSelector("svg[data-testid=\"CloseIcon\"]")).size() > 0;
        System.out.println("Close Button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateUploadingPanFunctionality() throws InterruptedException {
        wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.
                        cssSelector("svg[data-testid=\"UploadFileIcon\"]")));
        System.out.println(uploadPANButton.isDisplayed());
//        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", uploadPANButton);

        String path = "docs/verify_pan.jpg";
        File file = new File(path);
        String absolutePath=  file.getAbsolutePath();

        sendingPath.sendKeys(absolutePath);

        wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.
                        cssSelector("span[class=\"MuiTypography-root MuiTypography-caption " +
                                "MuiTypography-gutterBottom css-8jg8zg\"]")));
        return uploadPanSuccessfulMsg.isDisplayed();
    }

    public boolean validateContinueButtonAfterPanUpload() {
        return continueButton.isEnabled();
    }

    public boolean validateCloseButtonAfterPanUpload() {
        boolean flag = closeButton.isDisplayed();
        System.out.println("Close Button is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateCameraButtonAfterPanUpload() {
        boolean flag = driver.findElements(By.cssSelector("svg[data-testid=\"CameraAltOutlinedIcon\"]")).size() > 0;
        System.out.println("Camera Button is displayed After Pan Upload = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean validateUploadPanButtonAfterPanUpload() {
        boolean flag = driver.findElements(By.cssSelector("svg[data-testid=\"UploadFileIcon\"]")).size() > 0;
        System.out.println("Upload Pan Button is displayed After Pan Upload = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public String  validatePANIllustrationAfterPanUpload() {
//        System.out.println(panIllustration.get(1));
        String imgUrl = panIllustration.get(1).getAttribute("src");
        return imgUrl;
    }

    public boolean validateCloseButtonFuntionality() {
        closeButton.click();
        return (driver.findElements(By.cssSelector("svg[data-testid=\"CloseIcon\"]")).isEmpty()) &&
                !(driver.findElements(By.cssSelector("svg[data-testid=\"CameraAltOutlinedIcon\"]")).isEmpty()) &&
                !(driver.findElements(By.cssSelector("svg[data-testid=\"UploadFileIcon\"]")).isEmpty()) &&
                !(continueButton.isEnabled());
    }

    public boolean validateInvalidPanUpload() {
        String path = "docs/Invalid_pan.jpeg";
        File file = new File(path);
        String absolutePath=  file.getAbsolutePath();

        sendingPath.sendKeys(absolutePath);

        wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.
                        cssSelector("span[class=\"MuiTypography-root MuiTypography-caption " +
                                "MuiTypography-gutterBottom css-1ixh19b\"]")));
        return uploadPanUnsuccessfulMsg.isDisplayed();
    }

    public boolean validateEmptyPanUpload() {
        closeButton.click();
        String path = "docs/Empty_pan.jpeg";
        File file = new File(path);
        String absolutePath=  file.getAbsolutePath();

        sendingPath.sendKeys(absolutePath);

        wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.
                        cssSelector("span[class=\"MuiTypography-root MuiTypography-caption " +
                                "MuiTypography-gutterBottom css-8jg8zg\"]")));
        return uploadPanSuccessfulMsg.isDisplayed();
    }

//    public boolean validateHelpButtonOnHover() throws InterruptedException {
//        Thread.sleep(1000);
//        action.moveToElement(helpButton).perform();
//        boolean flag = helpSection.isDisplayed();
//        return flag;
//    }


    public PersonalDetailsPage validateContinueButtonFunctionalityAfterPanUpload() {
        closeButton.click();
        String path = "docs/verify_pan.jpg";
        File file = new File(path);
        String absolutePath=  file.getAbsolutePath();

        sendingPath.sendKeys(absolutePath);

        wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.
                        cssSelector("span[class=\"MuiTypography-root MuiTypography-caption " +
                                "MuiTypography-gutterBottom css-8jg8zg\"]")));
        continueButton.click();
        return new PersonalDetailsPage();

    }

}