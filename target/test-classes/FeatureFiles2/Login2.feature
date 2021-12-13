@login
Feature: To Validate Login Functionality of Facebook Application

  Scenario: To Validate login by using valid email and invalid password
    Given User have to enter facebook login through chrome browser
    When User have to enter valid Email and invalid password
      | username | karthi               |
      | password |              1234567 |
      | email    | karthieie27@gmail.com |
    And User have to click login button
    Then User have to reach invaild credentials page

  Scenario: To Validate login by using invalid email and invalid password
    Given User have to enter facebook login through chrome browser
    When User have to enter invalid emailadd and invalid password
      | username             | password | username1 | password1 |
      | karthieie27912@gmail.com | 12345678 | selenium  |  12345678 |
      | python               |  1234567 | selenium  |  12345678 |
      | java                 |  1234567 | seleniuma | 123456789 |
      | Augular              |  1234567 | selenium  |  12345678 |
    And User have to click login button
    Then User have to reach invaild credentials page

