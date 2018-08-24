Feature: Github Login

Scenario: Sign in to github account
   Given that I am on github page
   When I enter username as 14pa1a0287@vishnu.edu.in
   And I enter password as Subbu@123
   Then I should be Logged into my github account 


Scenario: Sign in failed Relogin should appear
   Given that I am on github page 
   When I enter username as 14pa1a0287@vishnu.edu.in
   And I enter password as Subbu@1231
   Then I should relogin
