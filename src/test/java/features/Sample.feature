@Test
Feature: Facebook friends count

  Scenario: 01_Searching for Facebook friends
    Given Facebook Website is opened in Chrome browser
    When User enter 'testcount11145@gmail.com' at name field - registered email
    And User enter 'qwertyQ1' at password field - valid password
    And User click Enter at enter button
    And Facebook's friends page for user 'kseniya.maskalik' is opened in Chrome browser
    Then Scroll friends to bottom
    And Count friends is shown


