package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;
import utilities.FacilityUtilityCode;

public class MoveRequestPage extends FacilityUtilityCode{
	WebDriver driver = BaseClass.getDriver();
	@FindBy(id = "customfield_12701")
	WebElement officeLocation;
	@FindBy(id ="customfield_11553")
	WebElement currentSeatLocation;
	@FindBy(id = "react-select-5-input")
	WebElement dropdownInput;
	@FindBy(xpath="//div[@id='select2-drop']/div/input")
	WebElement Input;
	@FindBy(id="customfield_11554")
	WebElement newSeatLocation;
	@FindBy(id="customfield_11558")
	WebElement shortDescription;
	@FindBy(xpath="//div[@role='textbox']/p")
	WebElement detailedDescription;
	
	public void addFields(String OfficeLocation, String CurrentSeatLocation, String NewSeatLocation, String ShortDescription,
			String DetailedDescription) throws InterruptedException {
		Thread.sleep(2000);
		fillDropdownField(officeLocation, OfficeLocation);
		Thread.sleep(2000);
		fillTextField(currentSeatLocation, CurrentSeatLocation);
		Thread.sleep(2000);
		fillTextField(newSeatLocation, NewSeatLocation);
		Thread.sleep(2000);
		fillTextField(shortDescription, ShortDescription);
		Thread.sleep(2000);
		fillTextField(detailedDescription, DetailedDescription);
	}
	
	public void UserApproval() throws InterruptedException {
		String name = driver.findElement(By.xpath("//li[@class='sd-approval-status-panel']/dl/dd/ul/li[4]")).getText();
		switchUser();
		userProfileSwitch(name);
	}
}
