Feature: Verify Logging In into Hudl website

  Scenario: Loggin into Hudl webiste
    Given I visit Hudl website
    When I click on Login button
    Then I should be able to enter user credentials 
    Then I login to the webiste
    Then I should be able to land on user homepage
    
