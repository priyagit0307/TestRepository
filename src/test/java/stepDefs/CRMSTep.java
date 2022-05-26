package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMSTep {
	
	@Before("@RegressionTest")
	public void initialize()
	{
		System.out.println("Before each scenario");
	}
	
	@After("@SmokeTest")
	public void Teardown()
	{
		System.out.println("After each scenario");	
	}
	
	@Given("User must have logged in")
	public void user_must_have_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("user must be logged in");  
	}
	
	@When("User create a new contact")
	public void user_create_a_new_contact() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User create a new contact");  
	}

	@When("User view a contact details")
	public void user_view_a_contact_details() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("User view a contact details");  
	}
	
	@When("User edit a contact details")
	public void user_edit_a_contact_details() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("User edit a contact details");  
	}

	@When("User delete a contact")
	public void user_delete_a_contact() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User delete a contact");  
	}


	@When("User create a new Deal")
	public void user_create_a_new_deal() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User create a new Deal");  
	}
		
	
		@When("User view a Deal details")
		public void user_view_a_deal_details() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("User view a Deal details");  
		}

		@When("User edit a Deal details")
		public void user_edit_a_deal_details() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("User edit a Deal details");
		}

		@When("User delete a Deal")
		public void user_delete_a_deal() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("User delete a Deal");
		}

		@When("User create a new Task")
		public void user_create_a_new_task() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("User create a new Task");
		}

	  @When("User view a Task details")
		public void user_view_a_task_details() {
		    // Write code here that turns the phrase above into concrete actions
		  System.out.println("User view a Task details");
		}

	 @When("User edit a Task details")
	  public void user_edit_a_task_details() {
	      // Write code here that turns the phrase above into concrete actions
		 System.out.println("User edit a Task details");
	  }

	 @When("User delete a Task")
	 public void user_delete_a_task() {
	     // Write code here that turns the phrase above into concrete actions
		 System.out.println("User delete a Task");
	 }


}