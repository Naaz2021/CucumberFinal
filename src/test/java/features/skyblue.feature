Feature: user should check for Skyblue background button  validation
@Scenario1
Scenario: user should check for skyblue background button exists

   Given When user is on the techfios page 
   When user checks set SkyBlue Background button exists 
   And   user clicks on the set skyblue background button 

   Then the background color will change to skyblue 