package pageObjects;

import helper.DropDownHelper;
import model.Policy;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.DateUtilities;
import utils.RandomGenerator;
import utils.TestRunConfig;

public class Policy_end_to_end_PO extends Base_PO {


    //Account dropdown Tab
    private @FindBy(name = "Login-LoginScreen-LoginDV-username")
    WebElement username_TextField;

    private @FindBy(xpath = "//*[@id=\'Login-LoginScreen-LoginDV-password\']/div/input")
    WebElement password_TextField;

    private @FindBy(xpath = "//*[@id=\'Login-LoginScreen-LoginDV-submit\']/div")
    WebElement login_Button;
    //Search box
    private @FindBy(xpath = "//*[@id=\"Desktop-DesktopMenuActions\"]/div[1]")
    WebElement action_menu;
    //changed this
    public static @FindBy(xpath = "//*[@id=\"Desktop-DesktopMenuActions-DesktopMenuActions_Create-DesktopMenuActions_NewSubmission\"]")
    WebElement New_submission;
    private @FindBy(xpath = "//*[@id=\"NewSubmission-NewSubmissionScreen-SelectAccountAndProducerDV-Account\"]/div[1]/input")
    WebElement Account_TextBox;
    //*[@id="NewSubmission-NewSubmissionScreen-SelectAccountAndProducerDV-Account"]/div[1]/input

    private @FindBy(xpath = "//*[@id=\"NewSubmission-NewSubmissionScreen-SelectAccountAndProducerDV-Account-SelectAccount\"]")
    WebElement SearchButton_In_New_Submission;
    //*[@id="NewSubmission-NewSubmissionScreen-SelectAccountAndProducerDV-Account"]/div[1]/input


    //*[@id="NewSubmission-NewSubmissionScreen-SelectAccountAndProducerDV-AccountName_button"]
    private @FindBy(xpath = " //*[@id=\"NewSubmission-NewSubmissionScreen-SelectAccountAndProducerDV-AccountName_button\"]")
    WebElement Name_of_New_Submission;
    public @FindBy(xpath = "//*[@id=\"AccountFile_Summary-AccountSummaryDashboard-OpenPolicyTransactionsAccountListViewTile-NewSubmission\"]")
    WebElement policy_new_submission;

    private @FindBy(xpath = "//*[@id=\"NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-4-addSubmission\"]")
    WebElement general_liability;
    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-OfferingScreen-OfferingSelection\"]/div/div/select")
    WebElement offering;


    private @FindBy(xpath = " //*[@id=\"SubmissionWizard-Next\"]/div")
    WebElement Submit_Button_In_Offerings;

    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-Next\"]/div/div[2]")
    WebElement prequalified_Next;
    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-Next\"]/div\n")
    WebElement Exposures_Next;

    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote\"]/div")
    //*[@id="SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote"]/div
    WebElement Modifiers_Quote;
    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-SubmissionWizard_PolicyReviewScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote\"]/div")
    WebElement Policy_Review_Quote;
    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions\"]/div[1]")
    WebElement Policy_Review_Bind_Option;

    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue\"]/div")
    WebElement Policy_Review_Issue_Policy;


    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions\"]/div[1]")
    WebElement Bind_Options_Quote;
    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue\"]/div")
    WebElement Bind_Option;

    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-WrittenDate\"]/div/input")
    WebElement Written_date;
    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate\"]/div/input")
    WebElement effective_date;
    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-BaseState\"]/div/div/select")
    WebElement base_code;
    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-TermType\"]/div/div/select")
    WebElement term;
    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP_tb-Add\"]/div")
    WebElement new_location;
    //*[@id="SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP_tb-Add"]/div
    private @FindBy(xpath = "//*[@id=\"LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-LocationCode\"]/div/input")
    WebElement Location_Code;

    //---------------------------------------------------
    private @FindBy(xpath = "//*[@id=\"LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode\"]/div[1]/input")
    WebElement Zip_code;
    private @FindBy(xpath = "//*[@id=\"LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon\"]/span")
    WebElement Zip_code_button;
    private @FindBy(xpath = "//*[@id=\"LocationPopup-LocationScreen-ttlBar\"]/div[1]/div")
    WebElement L;


    private @FindBy(xpath = "//*[@id=\"LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-AutofillLink\"]")
    WebElement Autofill_territory;
    private @FindBy(xpath = "//*[@id=\"LocationPopup-LocationScreen-Update\"]/div/div[2]")
    WebElement Ok_button;

    private @FindBy(xpath = "//*[@id=\"LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-LocationName\"]/div/input")
    WebElement Location_Name;


    private @FindBy(xpath = "//*[@id=\"LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1\"]/div/input")
    WebElement Address;
    private @FindBy(xpath = "//*[@id=\"LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-NationalSubscriberNumber\"]/div/input")
    WebElement Phone;


    private @FindBy(xpath = "//*[@id=\"LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City\"]/div[1]/input")
    WebElement City;

    private @FindBy(xpath = "//*[@id=\"LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County\"]/div/input")
    WebElement County;
    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-Next\"]/div")
    WebElement Next_locations;
    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-PolicyLineDV-GLGroupIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox\"]/div/input")
    WebElement GL_Deduct_Check_box;
    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV_tb-Add\"]/div")
    WebElement Add_button;

    @FindBy(xpath ="//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-IncidentPanelRef-InjuryAndFixedPropertyIncidentsPanelSet_tb-AddInjuryButton\"]/div")
    public
    WebElement Add_Injury;

    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-ClassCode\"]/div[1]/input")
    WebElement Class_code;

    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-BasisAmount\"]/div/input")
    WebElement Base_Exposure;
    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-Location\"]/div/div/select")
    WebElement Exposure_Dropdown;

    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions\"]/div[1]")
    WebElement Bind_Option_Drop_Down;
    //*[@id="SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions"]/div[1]
    //*[@id="SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions"]/div[1]

    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-Next\"]/div")
    WebElement Covergaes_Next;
    private @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityEUScreen-GeneralLiabilityEUDV-SubmissionWizard_GL_ExposureUnitsLV-0-Location\"]/div/div/select/option")
    WebElement location_drop;

    @FindBy(xpath = "//div[@data-gw-tooltip='Options']")
    public WebElement Options;

    @FindBy(xpath = "//div[@id='TabBar-LogoutTabBarLink']")
    public WebElement LogOutSuperUser;

    @FindBy(xpath = "//div[@id=\"TabBar-ClaimTab\"]/div[@class='gw-action--expand-button']")
    public WebElement ClaimDropDown;

    @FindBy(xpath = "//div[@id='TabBar-ClaimTab-ClaimTab_FNOLWizard']")
    public WebElement NewClaim;


    @FindBy(xpath = "//div[contains(@id,'PolicyNumber')]//div[2]")
    public WebElement PolicyNumber;

    @FindBy(xpath = "//input[contains(@name,'policyNumber')]")
    public WebElement searchPolicyNumber_TextField;

    @FindBy(xpath = "//div[contains(@id,'FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Search')]")
    public WebElement searchButton;

    @FindBy(xpath = "//input[contains(@name,'Claim_LossDate')]")
    public WebElement lossDate;

    @FindBy(xpath = "//span[text()='Liability']")
    public WebElement typeOfClaim_Liability;

    @FindBy(xpath = "//*[@id=\"FNOLWizard-Next\"]/div")
    public WebElement nextButton;

    @FindBy(xpath = "//div[contains(text(),'Basic information')]")
    public WebElement title_Basicinformation;

    @FindBy(xpath = "//div[contains(@id,'Name-ReportedBy_NameMenuIcon')]")
    public WebElement reporterName_DropDownIcon;

    @FindBy(xpath = "//div[contains(@id,'ReportedBy_Name-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem')]")
    public WebElement newPerson_menuItem;
    @FindBy(xpath = "//input[contains(@name,'GlobalPersonNameInputSet-LastName')]")
    public WebElement lastName;

    @FindBy(xpath = "//div[contains(text(),'pdate')]")
    public WebElement update_Button;
    @FindBy(xpath = "//select[contains(@name,'Claim_ReportedByType')]")
    public WebElement relationToInsured;

    @FindBy(xpath = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-NewLossDetailsGeneralLiabilityDV-Claim_LossCause\"]/div/div/select")
            public WebElement Loss_Cause;


    @FindBy (xpath = "//*[@id=\"FNOLInjuryIncidentPopup-FNOLInjuryIncidentScreen-ContactDV-ClaimContactPerson\"]/div/div/select")
            public WebElement Injury_Incident_Person;


    @FindBy(xpath = "//*[@id=\"FNOLInjuryIncidentPopup-FNOLInjuryIncidentScreen-ContactDV-FNOLContactInputSet-GlobalPersonNameInputSet-LastName\"]/div/input")
            public WebElement Last_Name__Person_Injury;


    @FindBy(xpath = "//*[@id=\"FNOLInjuryIncidentPopup-FNOLInjuryIncidentScreen-ContactDV-InjuryIncidentInputSet-LossParty\"]/div/div/select")
            public WebElement Loss_Party;

    @FindBy(xpath = "//*[@id=\"FNOLInjuryIncidentPopup-FNOLInjuryIncidentScreen-Update\"]/div")
            public WebElement Ok_button_Injury_Incident;

    @FindBy(xpath = "//*[@id=\"FNOLWizard-Finish\"]/div")
            public WebElement Save_And_Assign_Claim;

    @FindBy(xpath = "//*[@id=\"FNOLWizard-Next\"]/div")
            public  WebElement Add_Claim_Next;
    @FindBy(xpath="//*[@id=\"NewClaimDuplicatesWorksheet-NewClaimDuplicatesScreen-NewClaimDuplicatesWorksheet_CloseButton\"]/div")
            public WebElement click_duplicates_ok;
    @FindBy(xpath="//*[@id=\"TabBar-AccountsTab\"]/div[1]")
            public WebElement billing_account_tab;
    @FindBy(xpath="//*[@id=\"Accounts-AccountSearchScreen-AccountSearchDV-AccountNumberCriterion\"]/div/input")
            public WebElement billing_account_number;
    @FindBy(xpath="//*[@id=\"Accounts-AccountSearchScreen-AccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search\"]")
               public WebElement billing_search_button;
    @FindBy(xpath = "//*[@id=\"Accounts-AccountSearchScreen-AccountSearchResultsLV-0-AccountNumber_button\"]")
        WebElement Billing_Account_Button;

    @FindBy(xpath = "//*[@id=\"SubmissionWizard-Next\"]/div")
            WebElement Risk_Analysis_Next;
    @FindBy(xpath = "//*[@id=\"SubmissionWizard-Next\"]/div")
            WebElement Modifiers_Next;
    @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-glExcessSurplusInd_Ext_0\"]")
            WebElement excess_radio;

                    ////****STANDARD COVERAGES****////

    @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-PolicyLineDV-GLPolicyClaimsMade\"]/div/div/select")
            WebElement policy_basis;
    @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-PolicyLineDV-ClaimsMadeOrigEffDate\"]/div/input")

        WebElement effective_date1;

    @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-PolicyLineDV-Retrodate\"]/div/input")

        WebElement retroactive_date;
    @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-PolicyLineDV-RetentionType\"]/div/div/select")
            WebElement retention_type;
    @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-PolicyLineDV-ALAETypeId\"]/div/div/select")

            WebElement ALAE_type;
    @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-PolicyLineDV-NumberOfPriorActsID\"]/div/input")
            WebElement Number_of_prior_acts;
    @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-PolicyLineDV-DateId\"]/div/input")
            WebElement prior_act_date;
        @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-PolicyLineDV-GLGroupIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox\"]/div/input")
    public WebElement Gl_deductible;
    @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-PolicyLineDV-GLGroupIterator-2-CoverageInputSet-CovPatternInputGroup-_checkbox\"]/div/input")
           public  WebElement Medical_payments;
    @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-PolicyLineDV-GLGroupIterator-3-CoverageInputSet-CovPatternInputGroup-_checkbox\"]/div/input")

     public WebElement Damage_to_premises;
    @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-PolicyLineDV-GLGroupIterator-4-CoverageInputSet-CovPatternInputGroup-_checkbox\"]/div/input")
    public WebElement personla_advertise_injury;
    @FindBy(xpath="//*[@id=\"WebMessageWorksheet-WebMessageWorksheetScreen-WebMessageWorksheet_ClearButton\"]/div")
    WebElement clear;

                                              /////END//////
    //////Underlying Policy Information/////
    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_ESLayers_ExtScreen-SubmissionWizard_ESLayers_ExtLV_tb-Add\"]/div")
    WebElement UPI_Add_Button;


    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_ESLayers_ExtScreen-SubmissionWizard_ESLayers_ExtLV-0-carrierName\"]/div/input")
    WebElement Insurance_Carrier;

    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_ESLayers_ExtScreen-SubmissionWizard_ESLayers_ExtLV-0-PolicyNumber\"]/div/input")
    WebElement UPI_Policy_Number;

    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_ESLayers_ExtScreen-SubmissionWizard_ESLayers_ExtLV-0-ulEffDate\"]/div/input")
    WebElement UPI_Effective_Date;

    @FindBy(xpath =  "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_ESLayers_ExtScreen-SubmissionWizard_ESLayers_ExtLV-0-ulExpDate\"]/div/input")
    WebElement UPI_Expiration_Date;

    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_ESLayers_ExtScreen-SubmissionWizard_ESLayers_ExtLV-0-retroactiveDate\"]/div/input")
    WebElement UPI_Retroactive_Date;

    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_ESLayers_ExtScreen-SubmissionWizard_ESLayers_ExtLV-0-ALAEType\"]/div/div/select")
    WebElement UPI_ALAE_Type_DD;

    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_ESLayers_ExtScreen-SubmissionWizard_ESLayers_ExtLV-0-ULLimit\"]/div/input")
    WebElement UPI_Limit;

    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_ESLayers_ExtScreen-SubmissionWizard_ESLayers_ExtLV-0-ULPremium\"]/div/input")
    WebElement UPI_Premium;
    ////////End///////////////////////////////

    /////////////ADDITIONAL COVERAGES AND EXCLUSIONS AND CONDITIONALS//////
    @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-GeneralLiability_AdditionalCoveragesCardTab\"]/div")
    WebElement Additional_coverage;
    @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-AdditionalCoveragesPanelSet-AdditionalCoveragesDV_tb-Add\"]/div")
    WebElement Add_coverages;
    @FindBy(xpath="//*[@id=\"CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search\"]")
    WebElement search;
    @FindBy(xpath="//*[@id=\"CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-0-_Checkbox\"]/input")
    WebElement pollution_coverage;
    @FindBy(xpath="//*[@id=\"CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV_tb-AddCoverageButton\"]")
    WebElement add_selected_coverage;

    @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-ExclusionsAndConditionsCardTab\"]/div")
    WebElement Exclusionsandconditions;
    @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-AdditionalExclusionsAndConditionsPanelSet-AddExclusionsOrCondition\"]/div")
    WebElement Add_exclusion;
    @FindBy(xpath="//*[@id=\"CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-0-_Checkbox\"]/input")
    WebElement exclude_pollution;
    @FindBy(xpath="//*[@id=\"CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV_tb-AddCoverageButton\"]/div")
    WebElement 	add_selected_exclusions;
    @FindBy(xpath="//*[@id=\"SubmissionWizard-Next\"]/div")
    WebElement Next;
    @FindBy(xpath="//*[@id=\"SubmissionWizard-JobWizardInfoBar-excessAndSurplus_Ext\"]/div")
    WebElement Excess_Text;
//    @FindBy(xpath="")
//            WebElement
//    @FindBy(xpath="")
//    WebElement

///////////////////////////End//////////////////////////
///////////////Modifiers check box///////////////
    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-WCModifiersInputSet-ModIteratorEligible-0-EligibilityInputGroup-ModifierInput\"]/div/input")
    WebElement CL_Expense_Modifier_Eligible;
    //*[@id="SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-WCModifiersInputSet-ModIteratorEligible-0-EligibilityInputGroup-ModifierInput"]/div/input
    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-WCModifiersInputSet-ModIteratorEligible-3-EligibilityInputGroup-ModifierInput\"]/div/input")
    WebElement CL_Agency_Brokerage_and_Expense_Mod_Eligible;

    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-WCModifiersInputSet-ModIteratorEligible-1-EligibilityInputGroup-ModifierInput\"]/div/input")
    WebElement CL_Combined_Ratio_Mod_Eligible;
    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-ModifiersScreen-WCModifiersInputSet-ModIteratorEligible-2-EligibilityInputGroup-ModifierInput\"]/div/input")
   WebElement CL_ALAE_Mod_Eligible;



    /////////////////

    @FindBy(xpath = "//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-FinishQuote\"]/div")
    WebElement Finish_Quote;

    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-PolicyLineDV-RetentionAmount\"]/div/input")
    WebElement Retention_Amt;
    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-GeneralLiabilityScreen-PolicyLineDV-NumberOfPriorActsID\"]/div/input")
    WebElement Prior_Act;

    public void Excess_Text(){

    }
   public void  Retention_Amount(String R_A ){
        sendKeys(Retention_Amt,R_A);
   }

    public void  Prior_Act(String P_A ){
        sendKeys(Prior_Act,P_A);
    }
    public void Finish_Quote(){
        waitForWebElementAndClick(Finish_Quote);
    }
    public void CL_Experience_Modifier_Eligible(String EM){
        sendKeys(CL_Expense_Modifier_Eligible,EM);
    }
    public void CL_Agency_Brokerage_and_Expense_Mod_Eligible(String AB){
        sendKeys(CL_Agency_Brokerage_and_Expense_Mod_Eligible,AB);
    }

    public void CL_ALAE_Mod_Eligible(String AM){
        sendKeys(CL_ALAE_Mod_Eligible,AM);
    }
    public void CL_Combined_Ratio_Mod_Eligible(String CR){
        sendKeys(CL_Combined_Ratio_Mod_Eligible,CR);
    }
    public void UPI_Add_Button(){
        waitForWebElementAndClick(UPI_Add_Button);

    }
    public void Insurance_Carrier(String Ins_Car){
        sendKeys(Insurance_Carrier,Ins_Car);
    }

    public void UPI_Policy_Number(String Pol_Num){
      sendKeys(UPI_Policy_Number,Pol_Num);
    }

    public void UPI_Effective_Date(String Eff_Date){
        sendKeys(UPI_Effective_Date,Eff_Date);
    }

    public void UPI_Expiration_Date(String Exp_Date){
        sendKeys(UPI_Expiration_Date,Exp_Date);
    }
    public void UPI_Retroactive_Date(String Retro_Date){
        sendKeys(UPI_Retroactive_Date,Retro_Date);
    }
    public WebElement UPI_ALAE_Type_DD(){
        waitForWebElementAndClick(UPI_ALAE_Type_DD);
        return  UPI_ALAE_Type_DD;
    }
    public void UPI_Limit(String UPI_Lim){
        sendKeys(UPI_Limit, UPI_Lim);
    }

    public void UPI_Premium(String UPI_Pre){
        sendKeys(UPI_Premium,UPI_Pre);
    }



    public WebElement policy_basis(){
        waitForWebElementAndClick(policy_basis);
        return policy_basis;
    }
    public void Effective_date1(String Date){
        sendKeys(effective_date1,Date);
    }
    public void Retroactive_date(String Retro_Date){
        sendKeys(retroactive_date,Retro_Date);
    }
    public WebElement Retention_type() {
        waitForWebElementAndClick(retention_type);
        return retention_type;
    }
    public WebElement ALAE_type(){
        waitForWebElementAndClick(ALAE_type);
        return ALAE_type;
    }
    public void Prior_act_date(String prior){
        sendKeys(prior_act_date,prior);

    }
    public void Clear(){
        waitForWebElementAndClick(clear);
    }
    public void Gl_deductible(){
        waitForWebElementAndClick(Gl_deductible);
    }
    public void Medical_payments(){
        waitForWebElementAndClick(Medical_payments);
    }
    public void Damage_to_premises(){
        waitForWebElementAndClick(Damage_to_premises);
    }
    public void Personla_advertise_injury(){
        waitForWebElementAndClick(personla_advertise_injury);
    }
    ///// Standard coverages end////

    public void Additional_coverage(){
        waitForWebElementAndClick(Additional_coverage);
    }
    public void Add_coverages(){
        waitForWebElementAndClick(Add_coverages);
    }
    public void search(){
        waitForWebElementAndClick(search);
    }
    public void Pollution_coverage(){
        waitForWebElementAndClick(pollution_coverage);
    }
    public void Add_selected_coverage(){
        waitForWebElementAndClick(add_selected_coverage);
    }
    public void execlusionandconditions(){
        waitForWebElementAndClick(Exclusionsandconditions);

    }
    public void Add_exclusion1(){
        waitForWebElementAndClick(Add_exclusion);
    }
public void Exclude_pollution(){
        waitForWebElementAndClick(exclude_pollution);
}
public void Add_selected_exclusions(){
        waitForWebElementAndClick(add_selected_exclusions);
}
public void next(){
        waitForWebElementAndClick(Next);
}
    DropDownHelper dropDownHelper = new DropDownHelper();
    public void navigateTo_WebDriverUniversity_Login_Page() {
        navigateTo_URL(TestRunConfig.BASE_URL);
    }


    public void setUsername(String username) {
        sendKeys(username_TextField, username);
    }

    //*[@id="NewSubmission-NewSubmissionScreen-SelectAccountAndProducerDV-AccountName_button"]

    public void setPassword(String password) {
        sendKeys(password_TextField, password);
    }

    public void clickOn_Login_Button() {
        waitForWebElementAndClick(login_Button);
    }

    public void click_on_new_submission() {
        waitForWebElementAndClick(New_submission);
    }

    public void Account_textBox(String AccountNumber) {
        sendKeys(Account_TextBox, AccountNumber);
    }


    public void click_on_action_menu() {
        waitForWebElementAndClick(action_menu);
    }

    public void enter_account_number(String Account_number) {


    }

    public void Click_on_search() {
        waitForWebElementAndClick(SearchButton_In_New_Submission);
    }

    public void Click_on_Name_of_New_Submission() {
        waitForWebElementAndClick(Name_of_New_Submission);
    }

    public void policy_new_submission() {
        waitForWebElementAndClick(Name_of_New_Submission);
    }

    public void General() {
        waitForWebElementAndClick(general_liability);
    }

    public WebElement offer() {
        waitForWebElementAndClick(offering);
        return offering;
    }

    public void Submit_In_Offerings() {
        waitForWebElementAndClick(Submit_Button_In_Offerings);

    }

    public void prequalified() {
        waitForWebElementAndClick(prequalified_Next);
    }

    public void Effective(String Effect) {
        sendKeys(effective_date, Effect);
    }

    public void Written(String Written_Date) {
        try{
        sendKeys(Written_date, Written_Date);
    }
        catch (StaleElementReferenceException ex) {
            sendKeys(Written_date, Written_Date);
        }
        }

    public WebElement Base() {
        try {
            waitForWebElementAndClick(base_code);
        }catch(StaleElementReferenceException e){
            waitForWebElementAndClick(base_code);
        }
        return base_code;

    }

    public WebElement Term() {
        try {
            waitForWebElementAndClick(term);
        }
        catch(StaleElementReferenceException e){
            waitForWebElementAndClick(term);
        }
        return term;

    }

    public void New_Location() {
        waitForWebElementAndClick(new_location);


    }


    public void Location(String Location_code) {
        sendKeys(Location_Code, Location_code);
    }

    public void Locname(String Location_name) {
        sendKeys(Location_Name, Location_name);
    }

    public void address(String address) {
        sendKeys(Address, address);
    }

    public void phone(String name) {
        sendKeys(Phone, name);
    }

    public void Zip_Code(String zip_code) throws InterruptedException {

        sendKeys(Zip_code, zip_code);
    }

    public void County(String county) throws InterruptedException {

        sendKeys(County, county);
    }

    public void City(String city) {
        sendKeys(City, city);
    }


    public void Zip_Code_Button() throws InterruptedException {

        waitForWebElementAndClick(Zip_code_button);
    }

    public void la() {
        waitForWebElementAndClick(L);

    }

    //    public void Territory_Code(String territory_code){
//        sendKeys(Territory_code,territory_code);
//    }
//
//    public void Territory_Code_Button(){
//        waitForWebElementAndClick(Territory_code_button);
//
//    }
    public void Ok_Button() {
        waitForWebElementAndClick(Ok_button);
    }

    //*[@id="LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-AutofillLink"]
    public void Autofill_territory() {
        waitForWebElementAndClick(Autofill_territory);

    }

    public void New_locations() {
        waitForWebElementAndClick(Next_locations);
    }

    public void GL_Deduct_Check_Box() {
        waitForWebElementAndClick(GL_Deduct_Check_box);
    }

    public void Class_Code(String class_code) {
        sendKeys(Class_code, class_code);
    }

    public void Base_Exposure(String base_exposure) {
        sendKeys(Base_Exposure, base_exposure);
    }

    public WebElement Exposure_Dropdown() {
        waitForWebElementAndClick(Exposure_Dropdown);
        return Exposure_Dropdown;
    }

    public void Exposures_Next() {
        waitForWebElementAndClick(Exposures_Next);
    }

    public void Modifiers_Quote() {
        waitForWebElementAndClick(Modifiers_Quote);
    }

    public void Bind_Option() {
        waitForWebElementAndClick(Bind_Option);
    }

    public void Bind_Option_Drop_Down() {
        waitForWebElementAndClick(Bind_Option_Drop_Down);
    }

    public void Covergaes_Next() {
        waitForWebElementAndClick(Covergaes_Next);
    }

    public void Add_button() {
        waitForWebElementAndClick(Add_button);
    }

    public void location_add_() {
        waitForWebElementAndClick(location_drop);
    }

    public void logOut(){
        waitForWebElementAndClick(Options);
        waitForWebElementAndClick(LogOutSuperUser);
    }

    public void selectNewClaim(){
        waitForWebElementAndClick(ClaimDropDown);
        waitForWebElementAndClick(NewClaim);
    }

    public Policy savePolicyNumber(){
        Policy policy = new Policy();
        String policyCreated = PolicyNumber.getText();
        policy.setPolicyNumber(policyCreated);
        return policy;
    }

    public void searchPolicy(String policy){
        searchPolicyNumber_TextField.sendKeys(policy);
        searchButton.click();
    }

    public void enterLossDateAndClaimType(){
        sendKeys(lossDate, DateUtilities.getDateWithModifiedDay(0));
        //commented because getting error
        //waitForWebElementAndClick(typeOfClaim_Liability);
        waitForWebElementAndClick(nextButton);
        //error
        //waitFor(title_Basicinformation);
        //enterNameAndRelationToInsured();
    }

    public void enterNameAndRelationToInsured(){
        waitForWebElementAndClick(reporterName_DropDownIcon);
        waitForWebElementAndClick(newPerson_menuItem);
        waitFor(lastName);
        sendKeys(lastName, RandomGenerator.lastName());
        waitForWebElementAndClick(update_Button);
        dropDownHelper.SelectUsingVisibleValue(relationToInsured,"Self/Insured");
        waitForWebElementAndClick(nextButton);
    }

    public void Loss_Cause(){
        dropDownHelper.SelectUsingVisibleValue(Loss_Cause,"Broken glass");
    }

    public  void Add_injury(){
        waitForWebElementAndClick(Add_Injury);

    }

    public WebElement Injury_Incident_Person(){
        //dropDownHelper.getSelectedValue(Injury_Incident_Person);
        waitForWebElementAndClick(Injury_Incident_Person);
        return Injury_Incident_Person;

    }

    public WebElement Loss_Party(){
//        dropDownHelper.SelectUsingIndex((By)Loss_Party,1);
        waitForWebElementAndClick(Loss_Party);
        return Loss_Party;

    }

    public void Ok_button_Injury_Incident(){
        waitForWebElementAndClick(Ok_button_Injury_Incident);
    }
    
    public void Save_And_Assign_Claim(){
        waitForWebElementAndClick(Save_And_Assign_Claim);
    }

    public void Add_Claim_Inf_Next(){
        waitForWebElementAndClick(Add_Claim_Next);
    }
    public void click_on_duplicates_ok()
    {
        waitForWebElementAndClick(click_duplicates_ok);
    }
    public void click_on_billing(){
        waitForWebElementAndClick(billing_account_tab);


    }
    public void billing_account_number(String account_number){
        sendKeys(billing_account_number,account_number);
        waitForWebElementAndClick(billing_search_button);

    }

    public void Risk_Analysis_Next(){
        waitForWebElementAndClick(Risk_Analysis_Next);
    }

    public WebElement Modifiers_Next(){
        try{
        waitForWebElementAndClick(Modifiers_Next);
    }
        catch(StaleElementReferenceException e){

            waitForWebElementAndClick(Modifiers_Next);

        }
           return Modifiers_Next;
        }

    public void Policy_Review_Bind_Option(){
        waitForWebElementAndClick(Policy_Review_Bind_Option);
    }

    public void Policy_Review_Issue_Policy(){
        waitForWebElementAndClick(Policy_Review_Issue_Policy);
    }

    public void Policy_Review_Quote(){
        waitForWebElementAndClick(Policy_Review_Quote);
    }

    public void Billing_Account_Button(){
        waitForWebElementAndClick(Billing_Account_Button);
    }
    public void Excess_radio(){
        waitForWebElementAndClick(excess_radio);
    }
}

