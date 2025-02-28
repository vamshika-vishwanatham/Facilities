package pageObjects;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.BaseClass;
import utilities.FacilityUtilityCode;

public class FacilityCommonStepsPage extends FacilityUtilityCode {

	ResourceBundle rb=ResourceBundle.getBundle("Config");
	public FacilityCommonStepsPage() {
		super();
		PageFactory.initElements(getDriver(), this);
	}
	WebDriver driver = BaseClass.getDriver();
	String frame = "rw_iframe";
	@FindBy(xpath = "//div[@id='select2-drop']/div/input")
    public WebElement enterInput;
	@FindBy(xpath = "//input[@name ='identifier']")
	WebElement emailId;
	@FindBy(xpath = "//input[@name='credentials.passcode']")
	WebElement passcode;
	@FindBy(xpath = "//input[@value='Sign in']")
	WebElement signIn;
	@FindBy(xpath = "//input[@value='Receive a code via SMS']")
	WebElement codeViaSMS;
	@FindBy(name = "credentials.passcode")
	WebElement enterCode;
	@FindBy(xpath = "//input[@value='Verify']")
	WebElement verify;
	@FindBy(linkText = "ServiceDesk Portal")
	WebElement serviceDeskPortal;
	@FindBy(xpath = "//img[@alt='Facilities']")
	WebElement  FacilitiesCatalog;
	@FindBy(id = "customfield_11548")
	WebElement requestType;
	@FindBy(id = "customfield_12701")
	WebElement officeLocation;
	@FindBy(id = "customfield_11558")
	WebElement shortDescription;
	@FindBy(xpath = "//div[@role='textbox']/p")
	WebElement detailedDescription;
	@FindBy(xpath = "//div[@class='rw_item_footer']/button[2]/span")
    WebElement submit;

	public void addFields(String Requesttype, String OfficeLocation, String ShortDescription, String DetailedDescription)
			throws InterruptedException {
		if(Requesttype == "HVAC") {
			Thread.sleep(2000);
		}
		else if(Requesttype == "Office"){
			Thread.sleep(3000);
		}
		else if(Requesttype == "Generic"){
			Thread.sleep(4000);
		}
		fillDropdownField(requestType, Requesttype);
		Thread.sleep(2000);
		fillDropdownField(officeLocation, OfficeLocation);
		Thread.sleep(2000);
		fillTextField(shortDescription, ShortDescription);
		Thread.sleep(2000);
		fillTextField(detailedDescription, DetailedDescription);
	}
	
	public void hitURL() throws InterruptedException {
		driver.get(rb.getString("appURL"));
		Thread.sleep(3000);
		
	}
	
	public void setEmail() {
		emailId.sendKeys(rb.getString("email"));
	}

	public void setPassword() {
		passcode.sendKeys(rb.getString("password"));
	}
	
	public void signIn() throws InterruptedException {
		signIn.click();
		Thread.sleep(5000);
		codeViaSMS.click();
		enterCode.click();
		Thread.sleep(15000);
		verify.click();
	}
	
	public void serviceDeskPortal() throws InterruptedException {
		serviceDeskPortal.click();
		windowHandle();
		FacilitiesCatalog.click();
		Thread.sleep(3000);
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
	}
	public void requestType(String text) throws InterruptedException {
		fillDropdownField(requestType, text);
	}
	 public void submitForm() throws InterruptedException {
		  driver.switchTo().parentFrame(); 
		  submit.click(); 
		  Thread.sleep(5000); // Wait for form submission 
		  }
	 
	 public void ITView() throws InterruptedException {
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[@class='rw_request_key rw_request_key_link']")).click();
			windowHandle();
			Thread.sleep(15000);
			driver.navigate().refresh();
			Thread.sleep(15000);
			driver.navigate().refresh();
			Thread.sleep(15000);
			driver.findElement(By.xpath("//div[@class='aui-sidebar-footer']/button")).click();
			Thread.sleep(3000);
		}
}
