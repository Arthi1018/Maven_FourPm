Feature: Checking the Adactin WebSite
Scenario Outline: checking the loginPage
Given Launch the Website
When  enter "<username>" username
And  enter "<password>" password
Then click login button

Examples:
|username|password|
|Arthiha1018|IA779U|
|Rifa1018|qwerty|
|Mano1018|password|
|suganya|1234|
