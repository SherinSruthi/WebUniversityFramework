Feature: Submit data to webdriveruniversity.com using contact us form
				A user should be able to submit information via the contact us form
	
	Background: 		
	Given: I access webdriveruniversity
	When  I click on the contact us button
			
Scenario: submit information using the Contact us form with Valid information
	And I enter an valid firstname 
	And I enter a valid lastname 
	And I enter an valid emailaddress 
	And I enter a comment 
	When I clik on the submit button
	Then Information should be submitted successfully via contact us form
	
Scenario: Reset the information on the contact us form with invalid information
	And I enter an invalid firstname 
	And I enter a invalid lastname 
	And I enter an invalid emailaddress 
	And I enter a no comment 
	When I clik on the reset button
	Then Information should not be submitted  via contact us form