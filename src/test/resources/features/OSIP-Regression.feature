Feature: OSIP Regression cases

  #@TC44383
  #Scenario: OSIP-360 View Location - Individual Address_Verify Related Tab - Contacts Add Contact Button
  #  Given I am in omnivue url
  #  When I log in as a "Admin" user
  # #When I goto Activation Page
  # Then I clicked on "Search" tab
  # And I searched for "TC44383-Location"
  #  And I clicked on search button for "Inventory"
  # And I clicked on view icon of search result page
  #  When I verified view page and clicked on "Contacts" tab
  #  Then I validate Add contact button in contacts tab
  #  And Log out from OMNIVue
    
    
    
    
    
   
    
    
    
    
    
    
     @TC39187
  Scenario: OSIP-360 View Location - Individual Address_Verify Related Tab - Contacts Add Contact Button
    Given I am in omnivue url
    When I log in as a "Admin" user
    Then I clicked on "Create" tab
    And I go to "Inventory" create type and select "Subscriber" type
    And I click on the Launch Create form button
    And I fill the mandatory fields with "TC39187-Subscriber" data
    And Log out from OMNIVue
    
    
    
 