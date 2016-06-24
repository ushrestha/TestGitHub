package com.testSuite.maps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.step.HelloStep;

import net.thucydides.core.annotations.Steps;

public class HelloMap {
	
	@Steps
	HelloStep helloStep;
	
	@Given("I open google page")
	public void openGooglePage(){
         
		helloStep.openGooglePage();
	}
	@When("I search for term '$apple'")
	public void searchForTerm(String fruit){
		helloStep.searchForTerm(fruit);
		
	}
	@Then("I should see link for '$apple'")
		public void shouldSeeDefinitionOfApple(String fruit){
		helloStep.shouldSeeDefinitionOfApple(fruit);
		
	}
	

}


