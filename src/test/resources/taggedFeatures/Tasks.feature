Feature: Tasks Functions
user can create a contact, edit/view/delete a Task

@RegressionTest
Scenario: Create a Task
Given User must have logged in
When User create a new Task


Scenario: View Task
Given User must have logged in
When User view a Task details

@RegressionTest
Scenario: Edit a Task
Given User must have logged in
When User edit a Task details

@SmokeTest
Scenario: Delete a Task
Given User must have logged in
When User delete a Task

