Feature:GooglePage Login Function

Scenario: Valid Login
Given User is on Login Page
When User enters Login Credentials
| username | password |
| tomsmith | SuperSecretPassword! |
Then User should be navigated to Home page