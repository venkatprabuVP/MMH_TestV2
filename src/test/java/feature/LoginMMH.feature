
Feature:  Login Manage my health
  @Test
Scenario:  As a user enter into the dashboard
  Given user is enter the URL
  And Enter the email and password
  Then Click the login button


#  Scenario: Login credential with Header
#    Given User navigate to websites
#    When Enter the Below credentials
#     |UserName | Password|
#     |romieojuliet1@mmh-demo.com | Manage@1234|
#    And Enter the Login Button
#
##Enter data value using Example
#  @Test
#  Scenario Outline: This is login Scenario
#    Given Patient enter URL
#    When patient enter "<UserName>" and "<Password>"
#    And click ok button
#
#    Examples:
#      | UserName               | Password |
#      | sherrysal@mmh-demo.com | Manage@123 |
