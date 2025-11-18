package com.sparsh.qa.pages;

import com.sparsh.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankDetailsOfStudent extends TestBase {

    public BankDetailsOfStudent() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "button>div>img[alt=\"VarthanaLogo\"]")
    WebElement sparshLogo;

    @FindBy(css = "div[class*=\"MuiBox-root\"]>div>img[alt=\"VarthanaLogo\"]")
    WebElement varthanaLogo;

    @FindBy(css = "svg[data-testid=\"PlaceOutlinedIcon\"]")
    WebElement locationIcon;

    @FindBy(xpath = "//p[text()='SHESHDRIPURAM COLLEGE']")
    WebElement collegeNmae;

    @FindBy(xpath = "//p[text()='Yelahanka New Town, Bengaluru, Karnataka, 560064']")
    WebElement collegeAddress;

    @FindBy(xpath = "//span[text()='Loan ID']")
    WebElement loanId;

    @FindBy(xpath = "//p[text()='Bank details of Student']")
    WebElement BankDetailsOfStudentHeader;

    @FindBy(id = "ifsc_code")
    WebElement ifscode;

    @FindBy(name = "bank_name")
    WebElement bankName;

    @FindBy(name = "account_holder_name")
    WebElement accountHolderName;

    @FindBy(name = "account_type")
    WebElement accountType;

    @FindBy(name = "bank_account_number")
    WebElement bank_account_number;

    @FindBy(name = "confirm_bank_account_number")
    WebElement confirmBankAccountNumber;

    @FindBy(xpath = "//button[text()='Verify Account Number']")
    WebElement verifyAccountnumber;






}
