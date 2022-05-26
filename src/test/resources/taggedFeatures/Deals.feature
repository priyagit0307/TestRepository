Feature: Deals Functions
user can create a contact, edit/view/delete a Deal

@RegressionTest
Scenario: Create a Deal
Given User must have logged in
When User create a new Deal

Scenario: View Deal
Given User must have logged in
When User view a Deal details

@RegressionTest
Scenario: Edit a Deal
Given User must have logged in
When User edit a Deal details

@SmokeTest
Scenario: Delete a Deal
Given User must have logged in
When User delete a Deal

