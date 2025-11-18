package com.sparsh.qa.pages;

import com.sparsh.qa.base.TestBase;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class CourseInformation extends TestBase {

    public CourseInformation() {
        PageFactory.initElements(driver,this);
    }
    CourseInformation  courseInformation;

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

    @FindBy(xpath = "//h2[text()='Course Information']")
    WebElement courdeinformationHeader;

    @FindBy(xpath = "//h3[text()='You are applying as a Student']")
    WebElement YouAreApplyingAsaStudentHeader;

    @FindBy(id = "590")
    WebElement courseDuration;

    @FindBy(id = "591")
    WebElement whatCourseAreYouStudying;

    @FindBy(id = "592")
    WebElement productType;

    @FindBy(xpath = "//li[text()='HYBRID 2 ADVANCE EMI']")
    WebElement HYBRID2ADVANCEEMI;

    @FindBy(id = "668")
    WebElement loanDuration;

    @FindBy(xpath = "//li[@data-value='6']")
    WebElement loanDuration7;

    @FindBy(xpath = "//button[text()='NEXT']")
    WebElement next;















}
