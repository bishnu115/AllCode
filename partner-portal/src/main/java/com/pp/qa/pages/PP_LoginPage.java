package com.pp.qa.pages;

import com.pp.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PP_LoginPage extends TestBase {
    public PP_LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@src='/static/media/GTR.01843a6e079306280b27.png']")
    WebElement GTR_name_display;
    @FindBy(xpath = "//img[@src='/static/media/formula1.3142dd0281fe0080648e.jpg']")
    WebElement GTR_logo;
    @FindBy(xpath = "//img[@alt='varthana logo']")
    WebElement Varthana_logo;
    @FindBy(xpath = "//h3[text()='Partner Portal']")
    WebElement Partner_portal_name;
    @FindBy(name = "email")
    WebElement username;
    @FindBy(xpath = "//p[text()='Enter valid email']")
    WebElement errorMessageUsername;
    @FindBy(xpath = "//p[text()='Email is required']")
    WebElement errorMessageUsername1;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement CONTINUE;
    @FindBy(name = "password")
    WebElement pwd;
    @FindBy(xpath = "//button[text()='Login']")
    WebElement login;
    @FindBy(xpath = "//p[text()='Password is required']")
    WebElement errorMessagePassword;
    @FindBy(id = "notistack-snackbar")
    WebElement errorMessagePassword1;

    JavascriptExecutor script = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    public String validateApplicationTitle() {
        String title = driver.getTitle();
        System.out.println("========================================(Login page(Enter Username)===============================================");
        System.out.println("Title is displayed in user login Page = " + title);
        return title;
    }

    public boolean gtrNamedisplay() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//img[@src='/static/media/GTR.01843a6e079306280b27.png']")));
        boolean flag = GTR_name_display.isDisplayed();
        System.out.println("GTR name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean gtrLogo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//img[@src='/static/media/formula1.3142dd0281fe0080648e.jpg']")));
        boolean flag = GTR_logo.isDisplayed();
        System.out.println("GTR logo is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean varthanaLogo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//img[@alt='varthana logo']")));
        boolean flag = Varthana_logo.isDisplayed();
        System.out.println("Varthana logo is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public boolean partnerPortlName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h3[text()='Partner Portal']")));
        boolean flag = Partner_portal_name.isDisplayed();
        System.out.println("Partner portal name is displayed = " + (flag ? "Displayed" : "Not Displayed"));
        return flag;
    }

    public String userNameValidateWithSpace() {
        username.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        username.sendKeys("      ");
        CONTINUE.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Email is required']")));
        String errorMessage = errorMessageUsername1.getText();
        System.out.println("Entered space email text box = " + errorMessage);
        username.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String userNameValidateWithContinue() {
        username.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        CONTINUE.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Email is required']")));
        String errorMessage = errorMessageUsername1.getText();
        System.out.println("Entered space email text box = " + errorMessage);
        username.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String userNameValidateWithWrongName() {
        username.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        username.sendKeys("udaykumar.nkkkm");
        CONTINUE.click();
        Varthana_logo.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Enter valid email']")));
        String errorMessage = errorMessageUsername.getText();
        System.out.println("Entered wrong name email text box = " + errorMessage);
        username.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String userNameValidateWithWSpaceInMiddle() {
        username.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        username.sendKeys("udaykumar.nm@   varthana.com");
        CONTINUE.click();
        Varthana_logo.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Enter valid email']")));
        String errorMessage = errorMessageUsername.getText();
        System.out.println("Entered space in middle email text box = " + errorMessage);
        username.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String userNameValidateWithWSpaceInFastplace() {
        username.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        username.sendKeys("         udaykumar.nm@varthana.com");
        CONTINUE.click();
        Varthana_logo.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Enter valid email']")));
        String errorMessage = errorMessageUsername.getText();
        System.out.println("Entered space in fist place email text box = " + errorMessage);
        username.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String userNameValidateWithWpaceInLastplace() {
        username.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        username.sendKeys("udaykumar.nm@varthana.com           ");
        CONTINUE.click();
        Varthana_logo.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Enter valid email']")));
        String errorMessage = errorMessageUsername.getText();
        System.out.println("Entered space in last place email text box = " + errorMessage);
        username.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String userNameValidateWithUpperCase() {
        username.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        username.sendKeys("UDAYKUMAR.NM@VARTHANA.COM");
        CONTINUE.click();
        Varthana_logo.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("notistack-snackbar")));
        String errorMessage = errorMessagePassword1.getText();
        System.out.println("Entered name uppercase email text box = " + errorMessage);
        username.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public void validateUserName() {
        username.sendKeys(prop.getProperty("pp_username"));
        CONTINUE.click();
    }

    public String validateApplicationTPasswoarditle() {
        String title = driver.getTitle();
        System.out.println("===================================================Login page(Password)=============================================");
        System.out.println("Title is displayed in password login Page = " + title);
        return title;
    }

    public String passwordValidateWithlogin() {
        pwd.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        login.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Password is required']")));
        String errorMessage = errorMessagePassword.getText();
        System.out.println("Direct click login button password text box = " + errorMessage);
        pwd.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String passwordValidateWithspace() {
        pwd.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        pwd.sendKeys("          ");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Login']")));
        login.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("notistack-snackbar")));
        String errorMessage = errorMessagePassword1.getText();
        System.out.println("Entered space in password text box = " + errorMessage);
        pwd.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String passwordValidateWithWrongname() throws InterruptedException {
        pwd.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        pwd.sendKeys("bishnu");
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Login']")));
        login.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("notistack-snackbar")));
        String errorMessage = errorMessagePassword1.getText();
        System.out.println("Entered wrong name in password text box = " + errorMessage);
        pwd.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String passwordValidateWithSpaceInFistPlace() throws InterruptedException {
        pwd.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        pwd.sendKeys("         Uday2kumar7#");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Login']")));
        Thread.sleep(3000);
        login.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("notistack-snackbar")));
        String errorMessage = errorMessagePassword1.getText();
        System.out.println("Entered space in fist place in password text box = " + errorMessage);
        pwd.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String passwordValidateWithSpaceInLastPlace() throws InterruptedException {
        pwd.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        pwd.sendKeys("Uday2kumar7#  ");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Login']")));
        login.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("notistack-snackbar")));
        String errorMessage = errorMessagePassword1.getText();
        System.out.println("Entered space in last place in password text box = " + errorMessage);
        pwd.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String passwordValidateWithLowercase() throws InterruptedException {
        pwd.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        pwd.sendKeys("uday2kumar7#");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Login']")));
        Thread.sleep(3000);
        login.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("notistack-snackbar")));
        String errorMessage = errorMessagePassword1.getText();
        System.out.println("Entered password in lower case in password text box = " + errorMessage);
        pwd.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public String passwordValidateWithUpperCase() throws InterruptedException {
        pwd.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        pwd.sendKeys("UDAY2KUMAR7#");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Login']")));
       Thread.sleep(2000);
        login.click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("notistack-snackbar")));
        String errorMessage = errorMessagePassword1.getText();
        System.out.println("Entered password in upper case in password text box = " + errorMessage);
        pwd.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        return errorMessage;
    }

    public void validatePassword() throws InterruptedException {
        pwd.sendKeys(prop.getProperty("pp_password"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Login']")));
        Thread.sleep(4000);
        login.click();
    }


}
