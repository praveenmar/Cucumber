Feature:Mpl end to end scenario
  @Misc-professional-liability
  Scenario Outline: validate the misc professional liability
    Given User navigate to Guidewire "PolicyCenter" and logs in
      | User Role   |
      | Underwriter |
    And user click on action menu
    Then user click on action menu and select  new submission from drop-down
    Then user enter the"<AccountNumber>" and click on search button
    And user click on new submission button
    And user enter the details needed for policy creation and select MPL
    When User selects Yes for Excess option and user enters the needed policy information
    And user enter policy information and set Effective date, Written date and click on next "<Insurance Carrier>" "<Policy Number>" "<Effective Date>" "<Expiration Date>" "<Retroactive Date>" "<Limit>" "<Premium>"
    Then user clicks on new location update his location details "<Location Code>" and "<Location Name>" and "<Address>" and "<Phone>"and "<Zip code>" and "<City>" and "<County>" select some details from drop-down
    And User Enters MPL_Line and give required data and selects MPL Lines then adds sublimit and click on next
    Then User will go to Modifiers Screen and fill required fields and click on next
    And user will go to risk analysis screen click on next so redirected to policy review screen
    And user will click quote button in policy review screen then redirected to quote screen and issue the policy
    Examples:
      | AccountNumber | Location Code | Location Name | Address         | Phone        | Class code | Basis | Effective Date |  Zip code | City      | County    |Insurance Carrier|Policy Number|Effective Date|Expiration Date|Retroactive Date| Limit|Premium|       Value|
      | 3682639598    | 001           | MIDC          | 3181 Leo street | +17208733311 | 0007       | 5000  | 09/13/2023     |  80001    | Englewood | Jefferson |Textiles         |     12345678        |09/30/2022    |09/30/2023     |09/30/2023     |10000 |20000  |100   |