Feature: To validate the prepyAI website functionalities

#  positive
  Scenario: Verify prepyAI website with valid url
    Given Launch the Chrome Browser
    When Enter the prepyAI website valid url
    Then The PrepyAI website should open successfuly

#  Negative
  Scenario: Verify prepyAI website with invalid url
    Given Launch the chrome browser
    When Enter the PrepyAI website invalid url
    Then The PrepyAI website should not open

  Scenario: To Verify the prepyAI website valid URL with HTTP insecure
    Given Launch the chrome browser
    When Enter the PrepyAI website valid url with insecure
    And validate the PrepyAI website
    Then The website should not shows any error message , it will automatically redirect as HTTPS

#    positive
    Scenario: Validate page title on the PrepyAI website
    Given Launch the chrome browser
    When Enter the PrepyAI website url and retrive the page title
    Then the page title should be show as - PrepyAI | Enhance exam preparation
#  Negative
  Scenario: verify correct page title is displayed on the prepyAI  website
    Given Launch the chrome browser
    When Enter the PrepyAI website url and retrive the page title
    And validate the page title
    Then The title should not mismatch or the old ones should not display without refreshing

#  Positive
  Scenario: verify Padlock icon visible when the website is not secure
    Given Launch the chrome browser
    When Enter the prepyAI valid url
    And the website is accessed with a insecure connection HTTP
    And the padlock icon should appear in the browser’s address bar
    Then the browser should indicate that the connection is secure

#  positive
  Scenario: To Verify the prepyAI website valid URL with HTTP insecure
    Given Launch the chrome browser
    When Enter the PrepyAI website valid url with insecure
    And validate the PrepyAI website
    Then The website should not shows any error message , it will automatically redirect as HTTPS

##Positive
#  Scenario: To verify intro of prepyAI is displayed on the homepage
#    Given Launch the chrome browser
#    When Pass the PrepyAI website valid url
#    Then Should display a short intro of prepyAI in the homepage
#
##  Negative
#  Scenario:To verify intro of prepyAI is not display on the homepage
#    Given Launch the chrome browser
#    When Pass the invalid or broken prepyAI website url
#    Then the homepage should not display the intro of PrepyAI
#    And an error message or blank page should be shown instead
#
##  Positive
#  Scenario: To verify the signin functionality with valid mailID and valid Password
#    Given Launch the chrome browser and enter the prepyAI url
#    When Then click on Sign in with Google
#    And Enter the valid email ID in the email field
#    And Click the Next button under email field
#    And Enter the valid password in the password field
#    And Click the next button under password field
#    Then The user logged in to the prepyAI
