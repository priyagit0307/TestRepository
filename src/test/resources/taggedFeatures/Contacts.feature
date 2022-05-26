@PhaseOne
Feature: Contact Functions
user can create a contact, edit/view/delete a contact

@RegressionTest
Scenario: Create a contact
Given User must have logged in
When User create a new contact


Scenario: View contact
Given User must have logged in
When User view a contact details

@RegressionTest
Scenario: Edit a contact
Given User must have logged in
When User edit a contact details

@SmokeTest
Scenario: Delete a contact
Given User must have logged in
When User delete a contact

