Feature:Policy End to End Scenarios

  @General-liability-test
  Scenario Outline:Validate the user is able to new submission for General Liability
    Given User navigate to Guidewire "PolicyCenter" and logs in
      | User Role   |
      | Underwriter |
    And user click on action menu
    Then user click on action menu and select  new submission from drop-down
    Then user enter the"<AccountNumber>" and click on search button
    And user click on new submission button
    And user enter the details needed for policy creation and select Genaral Liability
    Then select offerings from drop-down and click on next pre-qualification page navigated
    When User selects Yes for Excess option and user enters the needed policy information
    And user enter policy information and set Effective date, Written date and click on next "<Insurance Carrier>" "<Policy Number>" "<Effective Date>" "<Expiration Date>" "<Retroactive Date>" "<Limit>" "<Premium>"
    Then user clicks on new location update his location details "<Location Code>" and "<Location Name>" and "<Address>" and "<Phone>"and "<Zip code>" and "<City>" and "<County>" select some details from drop-down
    Then user enter the coverage details and additional coverages E&C verify the deductibles "<Ret Amt>" "<Prior Acts>"
    And user add exposures and enter "<Class code>" and"<Basis>" and click on next and quote generated
    And user enters modifiers data"<Value>"
    And form page is displayed and click on  next, after payment page should be displayed  and click on bind option and issue policy
    Then Save the Policy which is created
    And user logout from guidewire policy center

    Given User navigate to Guidewire "ClaimCenter" and logs in
      | User Role   |
      | ClaimCenter |
    And click on claim tab and select new claim from drop-down menu
    Then user search for policy and click on search then enter the loss date and type of claim and click on next
    Then user add basic information click on update then click on next
    And user add claim information and click on injury incident button and enter information about  injury incident and click on ok
    Then user click on finish button at Save And Assign Claim Page and policy claim is saved
    And user logout from guidewire policy center

    Given User navigate to Guidewire "BillingCenter" and logs in
      | User Role   |
      | BillingCenter |
    And user enter existed "<AccountNumber>" and click on search icon

    Examples:
      | AccountNumber | Location Code | Location Name | Address         | Phone        | Class code | Basis | Effective Date |  Zip code | City      | County    |Insurance Carrier|Policy Number|Effective Date|Expiration Date|Retroactive Date| Limit|Premium|       Value|Ret Amt|Prior Acts|
      | 3682639598    | 001           | MIDC          | 3181 Leo street | +17208733311 | 0007       | 5000  | 09/13/2023     |  80001    | Englewood | Jefferson |Textiles         |     12345678        |09/30/2022    |09/30/2023     |09/30/2023     |10000 |20000  |100   |1000  |          2|
