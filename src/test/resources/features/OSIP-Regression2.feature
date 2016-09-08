Feature: OSIP Regression cases

  @TC54061
  Scenario: OSIP-Verify the functionality of create location button for Address Ranges
    Given I am in omnivue url
    When I log in as a "Admin" user
    And I clicked on "Create" tab
    And I go to "Inventory" create type
    And I fill all the mandatory fields
    When I click on Create button of Address range page
    Then Address Range should get created successfully
    And Log out from OMNIVue

  @TC54072
  Scenario: Verify user able to add address to a Range from Individual Location create form
    Given I am in omnivue url
    When I log in as a "Admin" user
    And I clicked on "Create" tab
    And I go to "Inventory" create type and select "Individual Location"
    And I select "Add to Range" and search for "Address Range"
    And I enter the PrimaryAddress
    And I enter the "SecondaryAddress" secoundaryaddress
    When I click on Create button in Individual Address page
    Then Location should get created successfully
    And Log out from OMNIVue

  @TC44383
  Scenario: OSIP-360 View Location - Individual Address_Verify Related Tab - Contacts Add Contact Button
    Given I am in omnivue url
    When I log in as a "Admin" user
    #When I goto Activation Page
    Then I clicked on "Search" tab
    And I searched for "TC44383-Location"
    And I clicked on search button for "Inventory"
    And I clicked on view icon of search result page
    When I verified view page and clicked on "Contacts" tab
    Then I validate Add contact button in contacts tab
    And Log out from OMNIVue

  @TC44385
  Scenario: Verify Migration of Create Activation Task functionality for MEF EVC Service
    Given I am in omnivue url
    When I log in as a "Admin" user
    And I clicked on "Create" tab
    #And I go to "Inventory" create type and select "Service" as service type
    And I go to "Inventory" create type and select "MEF EVC Service" as service type
    And I select service type as "MEF EVC" and launch the create form
    And I fill all the mandatory fields required for "MEF EVC"
    And I click on manual activation checkbox
    When I click on Create button of MEF EVC page
    Then Service should get created successfully
    And Task should be generated and displayed in related tab Tasks
    And Log out from OMNIVue

  @TC44387
  Scenario: Verify the create functionality of HOST Service
    Given I am in omnivue url
    When I log in as a "Admin" user
    And I clicked on "Create" tab
    And I go to "Inventory" create type and select "HOST Service" as the service type
    And I fill all the mandatory fields required for "HOST Service"
    When I click on create button
    Then Service should get created successfully
    And Log out from OMNIVue

  @TC44386
  Scenario: Verify Migration of Create Activation Task functionality for MEF OVC Service
    Given I am in omnivue url
    When I log in as a "Admin" user
    And I clicked on "Create" tab
    And I go to "Inventory" create type and select "MEF OVC Service" as the service type
    And I fill all the mandatory fields required for "MEF OVC"
    When I click on create button
    Then Service should get created successfully
    And Log out from OMNIVue

  @TC39276
  Scenario: Verify the functionality of Create Button when ICO is selected as NO
    Given I am in omnivue url
    When I log in as a "Admin" user
    And I clicked on "Create" tab
    And I go to "Inventory" create type and select "Individual Location"
    And I enter the "Primary Address" section details
    And I enter the "SecondaryAddress" secoundaryaddress
    When I click on Create button in Individual Address page
    Then Individual Location should get created successfully
    And Log out from OMNIVue

  @TC54068
  Scenario: Verify the functionality of create location button using Add Individual address button
    Given I am in omnivue url
    When I log in as a "Admin" user
    Then I clicked on "Search" tab
    And I go to "Inventory" search type and select "Location" as the inventory type
    And I click on Advanced search link
    And I select Address Range radio button
    And I search for an "TC54068-Address Range"
    #And I click on view icon
    And I clicked on view icon of search result page
    #And I click on Add Individual Address button from Address Range view page

