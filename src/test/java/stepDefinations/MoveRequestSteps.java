package stepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import pageObjects.MoveRequestPage;

public class MoveRequestSteps {


	MoveRequestPage Mrp = new MoveRequestPage();

	@And("User selects all the field values of Move Request")
	public void UserselectsallthefieldvaluesofMoveRequest(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> user : users) {
			String OfficeLocation = user.get("Office Location");
			String CurrentSeatLocation = user.get("Current Seat Location");
			String NewSeatLocation = user.get("New Seat Location");
			String ShortDescription = user.get("Short Description");
			String DetailedDescription = user.get("Detailed Description");
			Mrp.addFields(OfficeLocation,CurrentSeatLocation,NewSeatLocation,ShortDescription,DetailedDescription);
		}
	}
	
	@And("User gets the approval from User Approver in Move Request ticket")
	public void user_gets_the_approval_from_User_approver_in_Move_Request_ticket() throws InterruptedException {
		Mrp.UserApproval();
	}
}
