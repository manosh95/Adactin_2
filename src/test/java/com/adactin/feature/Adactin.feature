Feature: Booking functionality of Adaction application 


Scenario Outline: : verify the user login to application 
	Given user launch the application 
	When  user enter the valid "<username>" in the username field 
	And user  enter the valid "<password>" in the password field 
	And user click the login button 
	Then user verify home page navigate to search hotel page 
	
	Examples: 
		|username|password|
		|AAA|111|
		|BBB|222|
		|manosh95|manosh95|
		
Scenario: verify the  user in search hotel page 
	When user select the location in location field 
	And user select the hotel in hotel field 
	And user select the room type in Room type field 
	And user select the number of rooms 
	And user select the check in date 
	And user select the check out date 
	And user select the adult per room 
	And user select the child per room 
	And user click the search button to search the page 
	Then user verify search page naviagte the select hotel page 
	
	
Scenario: verify the user in select hotel page
	When verify the user given data and click the Radio button 
	And  user click the continue button 
	Then user verify select hotel page to book hotel page 
	
Scenario: verify the user in Book hotel page 
	When user enter the valid first name in first nname field 
	And  user enter the valid last name in last name field 
	And  user enter billing address in address column 
	And user enter the cc no in cc column 
	And user select the card type in type column 
	And  user select the month of expiry date field 
	And  user select the year of expiry date field 
	And  user enter the cvv number of cvv field 
	And  user click the booknow button to book now page 
	Then  user verify the book page navigate to booked itineray page 
	
	
	
	
	
	
	
	
        