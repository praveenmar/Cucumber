@General-liability-test5
Feature: Commercial property validation
Scenario Outline:Validate the user is able to new submission for Excess and Surplus in Commercial Property
  Given User navigate to Guidewire "PolicyCenter" and logs in
  | User Role   |
  | Underwriter |
  And user click on action menu
  Then user click on action menu and select  new submission from drop-down
  Then user enter the"<AccountNumber>" and click on search button
  And user click on new submission button
  And user enter the details needed for policy creation and select Commercial Property
  And Now select "yes" option for Excess and Surplus in policy information page
  And user enter policy information and set Effective date, Written date and click on next in policy information page
  And user enter policy information and set Effective date, Written date and click on next"<Insurance Carrier>" "<Policy Number>" "<Effective Date>" "<Expiration Date>" "<Retroactive Date>" "<Limit>" "<Premium>"
  Then user clicks on new location update his location details "<Location Code>" and "<Location Name>" and "<Address>" and "<Phone>"and "<Zip code>" and "<City>" and select some details
  Then user clicks on Action button to add details about new building
  And user navigates to the Coverages Tab and validate Building Coverage, Business Personal Property Coverage, Excess Limits, Business Income Coverage "<IL- Not Mfg or Rental>" "<IL-M>" "<IL-R>"
#Then click on Add Coverages and verify that System should display the screen Search Coverages for Building Name
  Then user navigates to Blanket Screen and click on add blanket screen to verify values are added to blanket coverage, click on next "<M1>" "<M2>" "<M3>" "<M4>"
 And user able to view Risk Analysis Screen and click on next
  And user able to view policy review screen
  Then user redirected to Quote Screen and click on Finish Quote
  Then Save the Policy which is created
  And user logout from guidewire policy center

  Given User navigate to Guidewire "ClaimCenter" and logs in
  | User Role   |
  | ClaimCenter |
  And click on claim tab and select new claim from drop-down menu
  Then user search for policy and click on search then enter the loss date and type of claim and click on next
  And user will enter the building to be claimed and click on Next
  Then user add basic information like Name, relation insured and click on Next "<LName>"
  Then user add required claim information and click on Next
  And user add claim information and click on injury incident button and enter information about  injury incident
  #Then user click on finish button at Save And Assign Claim Page and policy claim is saved
  And user logout from guidewire policy center

  Given user navigate to Guidewire "BillingCenter" and logs in
  | User Role   |
  | BillingCenter |
  And user enter existed "<AccountNumber>" and click on search icon

  Examples:
  | AccountNumber | Location Code | Location Name | Address         | Phone        | Class code | Basis |  Last name        | Effective Date | Written Date | Zip code | City      | County    |IL- Not Mfg or Rental|IL-M|IL-R|LName|Insurance Carrier|Policy Number|Effective Date|Expiration Date|Retroactive Date| Limit|Premium|       Value|M1|M2|M3|M4|
  | 3682639598    | 001           | MIDC          | 3181 Leo street | +17208733311 | 0007       | 5000  |  Trident Textiles | 09/13/2023     | 09/13/2022   | 80001    | Englewood | Jefferson |10000                |15000|1239|  Harry  |Textiles         |     12345678        |09/30/2022    |09/30/2023     |09/30/2023     |10000 |20000  |100   |23|24|25|25|