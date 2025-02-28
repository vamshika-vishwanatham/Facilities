package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;
import utilities.FacilityUtilityCode;

public class HotelingSpacePage extends FacilityUtilityCode{

	WebDriver driver = BaseClass.getDriver();
	@FindBy(id = "customfield_12701")
	WebElement officeLocation;
	@FindBy(id ="customfield_11551")
	WebElement startDate;
	@FindBy(id="customfield_11552")
	WebElement endDate;
	@FindBy(id="customfield_11558")
	WebElement shortDescription;
	@FindBy(xpath="//div[@role='textbox']/p")
	WebElement detailedDescription;
	
	public void addFields(String OfficeLocation, String StartDate, String EndDate, String ShortDescription,
			String DetailedDescription) throws InterruptedException {
		Thread.sleep(2000);
		fillDropdownField(officeLocation, OfficeLocation);
		Thread.sleep(2000);
		fillTextField(startDate, StartDate);
		Thread.sleep(2000);
		fillTextField(endDate, EndDate);
		Thread.sleep(2000);
		fillTextField(shortDescription, ShortDescription);
		Thread.sleep(2000);
		fillTextField(detailedDescription, DetailedDescription);
	}
}
