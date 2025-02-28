package stepDefinations;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FacilityCommonStepsPage;

public class FacilityCommonSteps {

FacilityCommonStepsPage csp;
	
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() throws InterruptedException, IOException {
		csp = new FacilityCommonStepsPage();
		csp.hitURL();
		System.out.println("User is on Login page");
	}

	@When("User enters email and password")
	public void user_enters_email_and_password() {
		csp.setEmail();
		csp.setPassword();
	}

	@And("User clicks on login button")
	public void User_clicks_on_login_button() throws IOException, InterruptedException {
		csp.signIn();
	}

	@Then("User redirects to Dashboard page")
	public void User_redirects_to_dashboard_page() throws IOException, InterruptedException {
		System.out.println("User is on Dashboard Page");
		csp.serviceDeskPortal();
	}
	
	@Then("User is on Facilities Form")
	public void User_is_on_Facilities_Form() {
		System.out.println("User is on  Facilities form");
	}
	@Then("User select Request Type as {string}")
	public void UserselectRequestTypeas(String string) throws InterruptedException {
		csp.requestType(string);
	}
	@Then("User submit the form")
	public void Usersubmittheform() throws InterruptedException {
		csp.submitForm();
	}
	
	@And("User Selects IT request number")
	public void UserSelectsITrequestnumber() throws InterruptedException {
		csp.ITView();
	}
	@Then("Open subtask of ticket in same page")
	public void Opensubtaskofticketinsamepage() throws InterruptedException {
		csp.subtask();
	}

	@And("User updates the ticket Assignment group")
	public void UserupdatestheticketAssignmentgroup() throws InterruptedException {
		csp.updateAssignmentGroup();
	}

	@And("User assigns the ticket")
	public void Userassignstheticket() throws InterruptedException {
		csp.updateAssignee();
	}

	@And("User moves the ticket to inprogress")
	public void Usermovesthetickettoinprogress() throws InterruptedException {
		csp.inProgressTransition();
	}
	
	@Then("User closed the ticket and check parent ticket is closed")
	public void Userclosedtheticketandcheckparentticketisclosed() throws InterruptedException {
		csp.closeTransition();
	}
	
	@Then("User cancel the ticket and check subtask is cancelled")
	public void Usercanceltheticketandchecksubtaskiscancelled() throws InterruptedException {
		csp.cancelTransition();
	}
	@And("User selects all the field values of {string},{string},{string},{string}")
	public void userselectsallthefieldvaluesof(String requestType, String officeLocation, String shortDescription, String detailedDescription) throws InterruptedException {

	    csp.addFields(requestType, officeLocation, shortDescription, detailedDescription);
	}
}
