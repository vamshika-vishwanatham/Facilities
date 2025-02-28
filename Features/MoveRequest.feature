Feature: Facilities Request type and complete flow
  I want to use this template for Move Request

  @Moverequest
  Scenario: Move Request Request type complete flow
    Given User navigates to login page
    When User enters email and password
    And User clicks on login button
    Then User redirects to Dashboard page
    Then User is on Facilities Form
    Then User select Request Type as "Move Request"
    And User selects all the field values of Move Request
    | Office Location | Current Seat Location | New Seat Location | Short Description | Detailed Description |
    | Hyderabad | 201 |  210A | Test ticket | Test ticket please ignore |    
    Then User submit the form
    And User Selects IT request number
    And User gets the approval from User Approver in Move Request ticket
    Then Open subtask of ticket in same page
    And User updates the ticket Assignment group
    And User assigns the ticket
    And User moves the ticket to inprogress
    Then User closed the ticket and check parent ticket is closed
