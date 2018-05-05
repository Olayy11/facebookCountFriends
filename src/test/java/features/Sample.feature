@smokeTest
Feature: Google search page test

  Scenario: 01_Searching for Wikipedia website
    Given Google Website is opened in Chrome browser
    When User enters 'Wikipedia' in the Google Search Field
    And User select '1' Search result link
    Then Wikipedia Website is loaded
    And User can see Wikipedia Logo

  Scenario: 02_Searching for Youtube website
    Given Google Website is opened in Chrome browser
    When User enters 'Youtube' in the Google Search Field
    And User select '1' Search result link
    Then Youtube Website is loaded
    And User can see Youtube Logo

  Scenario: 03_Searching for Facebook friends
    Given Facebook Website is opened in Chrome browser
    When  User enter 'ollayy@mail.ru' at name field
    And  User enter 'margaritamargarita' at password field
    Then User click Enter at enter button
    Then Facebook's friends page for user 'maksim.koshelenko' is opened in Chrome browser
    Then Scroll friends to bottom
    And  Count friends is shown


