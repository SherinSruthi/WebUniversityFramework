Feature: Submit data to webdriveruniversity.com using contact us form
				If a user clicks on the reset button then all information should be removed from contact us form
				
Scenario: Reset the information on the contact us form
	Given: I access webdriveruniversity
	When  I click on the contact us button
	And I enter an firstname 
	And I enter a lastname 
	And I enter an emailaddress 
	And I enter a comment 
	When I clik on the reset button
	Then All the information should be removed