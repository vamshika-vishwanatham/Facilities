package stepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import pageObjects.HotelingSpacePage;

public class HotelingSpaceSteps {

	HotelingSpacePage hsp = new HotelingSpacePage();
	@And("User selects all the field values of Hoteling Space Request")
	public void UserselectsallthefieldvaluesofHotelingSpaceRequest(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> user : users) {
			String OfficeLocation = user.get("Office Location");
			String StartDate = user.get("Start Date");
			String EndDate = user.get("End Date");
			String ShortDescription = user.get("Short Description");
			String DetailedDescription = user.get("Detailed Description");
			hsp.addFields(OfficeLocation,StartDate,EndDate,ShortDescription,DetailedDescription);
		}
	}
}
