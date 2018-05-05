@Test
Feature: Facebook friends count

  Scenario: 01_Searching for Facebook friends
    Given Facebook Website is opened in Chrome browser
    When  User enter 'ollayy@mail.ru' at name field
    And  User enter 'margaritamargarita' at password field
    And User click Enter at enter button
    And Facebook's friends page for user 'maksim.koshelenko' is opened in Chrome browser
    Then Scroll friends to bottom
    And  Count friends is shown


