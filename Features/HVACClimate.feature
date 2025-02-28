Feature: Facilities Request type and complete flow
  I want to use this template for HVAC Climate Request

  @HVAC/Office
  Scenario Outline: Facilities Request types complete flow
    Given User navigates to login page
    When User enters email and password
    And User clicks on login button
    Then User redirects to Dashboard page
    Then User is on Facilities Form
    And User selects all the field values of "<Request Type>","<Office Location>","<Short Description>","<Detailed Description>"       
    Then User submit the form
    And User Selects IT request number
    Then Open subtask of ticket in same page
    And User updates the ticket Assignment group
    And User assigns the ticket
    And User moves the ticket to inprogress
    Then User cancel the ticket and check subtask is cancelled

    Examples: 
   	| Request Type | Office Location | Short Description | Detailed Description |
   	| HVAC | Hyderabad | Test ticket | Test ticket please ignore |
   	| Office | Richmond | Test ticket | Test ticket please ignore | 
   	
