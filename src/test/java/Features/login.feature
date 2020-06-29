Feature: Application login

Scenario Outline: Home page deafult login
Given User at NetBanking landing page "http://www.qaclickacademy.com/"
When User login with username <username> and password <password>
Then Home page dashboard is populated
And Other options are displayed "true"
 
Examples:
|username |password|
|sheikh4027@gmail.com|Tufail529|
|tufail4027@gmail.com|Tufail529|