Feature: Application login

Scenario Outline: Home page login
Given User is on Landing page
When User logging in with <username> and password <password>
Then User logged in
And Cards displayed <displayed>

Examples:
|username	|password	|displayed	|
|lenin		|pass!23	|1true1		|
|raj		|pass!23	|0false0	|
|pus		|pass!23	|0false2	|


#Scenario: Home page login
#Given User is on Landing page
#When User logging in with "negative" and password "wrong!23"
#Then User logged in
#And Cards displayed "false"