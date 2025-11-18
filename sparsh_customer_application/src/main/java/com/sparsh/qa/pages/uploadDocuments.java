package com.sparsh.qa.pages;

import com.sparsh.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class uploadDocuments extends TestBase {

    public uploadDocuments() {
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

    @FindBy(xpath = "//p[text()='Upload Documents']")
    WebElement uploadDocumentsHeader;

    @FindBy(xpath = "//div[text()='Bank Documents']")
    WebElement bankDocuments;
    




    @FindBy(xpath = "//div[text()='Salary Slip']")
    WebElement salarySlip;






}
