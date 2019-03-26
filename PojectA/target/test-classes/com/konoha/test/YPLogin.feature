Feature:YP Login

Scenario: Login into Yellow Page
Given user is in YP
And user log in as "qetest786@gmail.com"
Then user should be in YP homePage