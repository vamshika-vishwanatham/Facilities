Feature: Facilities Request type and complete flow
  I want to use this template for HotelingSpace Request

  @HotelingSpacerequest
  Scenario: Hoteling Space Request Request type complete flow
    Given User navigates to login page
    When User enters email and password
    And User clicks on login button
    Then User redirects to Dashboard page
    Then User is on Facilities Form
    Then User select Request Type as "Hoteling Space"
    And User selects all the field values of Hoteling Space Request
    | Office Location | Start Date | End Date | Short Description | Detailed Description |
    | Hyderabad | 25/Feb/25 |  1/Mar/25 | Test ticket | Test ticket please ignore |    
    Then User submit the form
    And User Selects IT request number
    Then Open subtask of ticket in same page
    And User updates the ticket Assignment group
    And User assigns the ticket
    And User moves the ticket to inprogress
    Then User cancel the ticket and check subtask is cancelled