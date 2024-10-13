package pageObjects;

import helper.CheckBoxOrRadioButtonHelper;
import helper.DropDownHelper;
import helper.JavaScriptHelper;
import model.Policy;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.Global_Vars;
import utils.TestRunConfig;

public class Login_PO_cp extends Base_PO {

    private DropDownHelper drop_down_helper;
    private CheckBoxOrRadioButtonHelper CB;
    private JavaScriptHelper JH;
    public Login_PO_cp(DropDownHelper drop_down_helper, CheckBoxOrRadioButtonHelper CB, JavaScriptHelper JH){
        this.drop_down_helper=drop_down_helper;
        this.CB = CB;
        this.JH = JH;
    }
    @FindBy(xpath = "//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox\"]/div/input")
    public WebElement Extra_Expense_Coverage_Check_Box;
    @FindBy(xpath = "//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-1-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-CovTermDirectInputSet-DirectTermInput\"]/div/input")
    public  WebElement limit;
    @FindBy(xpath = "//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-1-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-PackageTermInput\"]/div/div/select")
    public  WebElement Monthly_Limit;
    @FindBy(xpath = "//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions\"]/div[1]")
    public WebElement Bind_Options;
    @FindBy(xpath = "//*[@id=\"SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue\"]/div")
    public WebElement Issue_Policy;

    @FindBy(xpath = "//*[@id=\"SubmissionWizard-Next\"]/div")
    public WebElement Buildings_and_Location_Next;

    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBlanketScreen-CPBlanketPanelSet-CPBlanket_tb-AddBlanket\"]/div")
    public  WebElement Add_Blankets_Button;

    //Should verify 5000 and 10000 in the dropdown
    //Shouldv write function also below
    @FindBy(xpath = "//*[@id=\"CPBlanketPopup-CPBlanketCovDeductible\"]/div/div/select")
    public WebElement Blanket_Details_Deductibles;

    @FindBy(xpath = "//*[@id=\"CPBlanketPopup-Cancel\"]/div")
    public WebElement Blanket_Details_Cancel_Button;

    @FindBy(xpath = "//*[@id=\"SubmissionWizard-Next\"]/div")
    public WebElement Next_Button;

    @FindBy(xpath = "//*[@id=\"FNOLWizard-Next\"]/div")
    public WebElement Next_Button_Claims;


    @FindBy(xpath = "//*[@id=\"SubmissionWizard-SubmissionWizard_PolicyReviewScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Rate\"]/div")
    public WebElement Policy_Review_Rate;

    @FindBy(xpath = "//*[@id=\"CPBuildingPopup-Update\"]/div")
    public WebElement New_Submission_Ok_Button;

    @FindBy(xpath = "//*[@id=\"FNOLWizard-Next\"]/div")
    public WebElement Next_Button_Claim;


        @FindBy(xpath = "//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-CovTermDirectInputSet-DirectTermInput\"]/div/input")
        public WebElement Income_Limit_Not_Mfg_or_Rental;

        @FindBy(xpath = "//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-CovTermDirectInputSet-DirectTermInput\"]/div/input")
        public WebElement Income_Limit_Mfg_Only;

        @FindBy(xpath = "//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-2-CovTermInputSet-CovTermDirectInputSet-DirectTermInput\"]/div/input")
        public  WebElement Income_Limit_Rental_Only;



    @FindBy(xpath="//*[@id=\"NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-3-addSubmission\"]")
        public WebElement commercial_property;

        @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-cpExcessSurplusInd_Ext_0\"]")
        public WebElement excess_radio;


        @FindBy(xpath = "//*[@id=\"CPBuildingPopup-Update\"]/div")


        public  WebElement Coverages_Tab_Ok_But;
        @FindBy(xpath="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV_tb-addLocationsTB\"]/div[1]")
        public WebElement Add_location;
        @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV_tb-addLocationsTB-AddNewLocation\"]/div")
        public WebElement New_Location;
        @FindBy(xpath = "//*[@id=\"CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City\"]/div[1]/input")
        public WebElement City;
        @FindBy(xpath="//*[@id=\"CPLocationPopup-LocationDetailDV-LocationDetailInputSet-LocationCode\"]/div/input")
        public WebElement Location_code;
        @FindBy(xpath="//*[@id=\"CPLocationPopup-LocationDetailDV-LocationDetailInputSet-LocationName\"]/div/input")
        public WebElement Location_name;
        @FindBy(xpath="//*[@id=\"CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1\"]/div/input")
        public WebElement Address;
        @FindBy(xpath ="//*[@id=\"CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode\"]/div[1]/input")
        public WebElement Zipcode;
        @FindBy(xpath="//*[@id=\"CPLocationPopup-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-NationalSubscriberNumber\"]/div/input")
        public WebElement Phone;
        @FindBy(xpath ="//*[@id=\"CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State\"]/div/div/select")
        public WebElement State;
        @FindBy(xpath ="//*[@id=\"CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-AutofillLink\"]")
        public WebElement Territory;
        @FindBy(xpath="//*[@id=\"CPLocationPopup-Update\"]/div")
        public WebElement ok;

        @FindBy(xpath ="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-Actions-ActionsMenuIcon\"]/div[1]")
        public WebElement building_dropdown;
        @FindBy(xpath ="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-Actions-AddBuilding\"]/div[1]")
        public WebElement Add_building;
        @FindBy(xpath ="//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-Actions-AddBuilding-AddNewBuilding\"]/div")
        public WebElement New_building;

        @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-1-Actions-AddBuilding-AddNewBuilding\"]/div")
        public WebElement Action2;
        @FindBy(xpath ="//*[@id=\"CPBuildingPopup-DetailsDV-ClassCode-SelectClassCode\"]")
        public WebElement property_class_code;
        @FindBy(xpath="//*[@id=\"CPClassCodeSearchPopup-CPClassCodeSearchScreen-ClassCodeSearchResultsLV-0-_Select\"]/div")
        public WebElement property_code;
        @FindBy(xpath ="//*[@id=\"CPBuildingPopup-DetailsDV-CoverageForm\"]/div/div/select")
        public WebElement coverage_type;
        @FindBy(xpath ="//*[@id=\"CPBuildingPopup-BuildingCoveragesTab\"]/div")
        public WebElement coverage_tab;

        @FindBy(xpath ="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovCauseOfLoss\"]/div/div/select")
        public WebElement cause_of_loss;
    //*[@id="CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovCauseOfLoss"]/div/div/select
        @FindBy(xpath="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovExcludeVandalism_1\"]")
        public WebElement vandalisim;
        @FindBy(xpath ="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovExcludeSprinkler_1\"]")
        public WebElement sprinkler;
    @FindBy(xpath ="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovDeductible\"]/div/div/select")
        public WebElement deductible;
    @FindBy(xpath ="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovWindDeductible\"]/div/div/select")
    public WebElement wind_deduct;
    @FindBy(xpath = "//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovValuationMethod\"]/div/div/select")
    public WebElement valuation_method;
    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-0-_Checkbox\"]/input")
    public WebElement Building_Select_Check_Box;
    @FindBy(xpath = "//*[@id=\"FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryPropertyLV-0-PropertySelected\"]/div/input")
    public WebElement Select_Property;
    @FindBy(xpath ="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovCoinsurance\"]/div/div/select")
    public WebElement coinsurance;

    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-1-Actions-ActionsMenuIcon\"]/div[1]")
    public WebElement Add_Location_Action_2;

    @FindBy(xpath =  "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-1-Actions-AddBuilding\"]/div[1]")
    public WebElement Loc;

    @FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-1-Actions-AddBuilding-AddNewBuilding\"]/div")
    public WebElement Action_NewLocation;
    @FindBy(xpath="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-2-CoverageInputSet-CovPatternInputGroup-_checkbox\"]/div/input")
    public WebElement Excess_surpless;
    @FindBy(xpath ="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovCauseOfLoss\"]/div/div/select")
    public WebElement Bussiness_cause_of_loss;
    @FindBy(xpath="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox\"]/div/input")
    public WebElement Builder_Risk_Renovations;
    @FindBy(xpath="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-3-CoverageInputSet-CovPatternInputGroup-_checkbox\"]/div/input")
    public WebElement Follow_Form_Coverage ;
    @FindBy(xpath ="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovReportingForm\"]/div/div/select")
    public WebElement Bussiness_reporting;
    @FindBy(xpath="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-2-CovTermInputSet-CovTermDirectInputSet-DirectTermInput\"]/div/input")
    public WebElement Bussiness_income_coverage_rent;
    @FindBy(xpath="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-CovTermDirectInputSet-DirectTermInput\"]/div/input")
    public WebElement Bussiness_income_coverage_mfg;
    @FindBy (xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-1-Actions-AddBuilding-AddNewBuilding\"]/div")
    public WebElement New_Build2;
    @FindBy(xpath="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-CovTermDirectInputSet-DirectTermInput\"]/div/input")
    public WebElement Bussiness_income_coverage_not_mfg;
    @FindBy(xpath="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-3-CovTermInputSet-TypekeyTermInput\"]/div/div/select")
    public WebElement Bussiness_income_coverage_cause_of_loss;
    @FindBy(xpath="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-4-CovTermInputSet-OptionTermInput\"]/div/div/select")
    public WebElement Bussiness_income_coverage_coinsurance;
    @FindBy(xpath="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-5-CovTermInputSet-OptionTermInput\"]/div/div/select")
    public WebElement Bussiness_income_coverage_wait_period;
    @FindBy(xpath="//*[@id=\"CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-6-CovTermInputSet-OptionTermInput\"]/div/div/select")
    public WebElement Bussiness_income_coverage_period_of_coverage;
    @FindBy(xpath = "//*[@id=\"CPBlanketPopup-CPBlanketCovDeductible\"]/div/div/select")
    public WebElement Blanket_Deductible_DropDown;
////////////////////
    @FindBy(xpath =  "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-ReportedBy_Name-ReportedBy_NameMenuIcon\"]/div[1]")
    public  WebElement Basic_info_Name_Act;

    @FindBy(xpath = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-ReportedBy_Name\"]/div[1]/div/select")
    public WebElement New_Person_DD;



    @FindBy(xpath = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-ReportedBy_Name-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem\"]/div")
    public WebElement New_Person_Basic_Info;

    @FindBy(xpath = "//*[@id=\"NewContactPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-LastName\"]/div/input")
    public WebElement Last_Name;

    @FindBy(xpath = "//*[@id=\"NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-CustomUpdateButton\"]/div")
    public WebElement Update_Button;
    
    @FindBy(xpath = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-Claim_ReportedByType\"]/div/div/select")
    public WebElement Relation_to_Insured;
    @FindBy(xpath = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsPanel-FNOLWizard_NewLossDetailsPanelSet-Claim_LossCause\"]/div/div/select")
    public WebElement Loss_Cause1;

    @FindBy(xpath = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsPanel-FNOLWizard_NewLossDetailsPanelSet-CCAddressInputSet-globalAddressContainer-Address_Picker\"]/div/div/select")
    public WebElement Loss_Cause_Location;

    @FindBy(xpath = "//*[@id=\"CPBuildingPopup-AdditionalCoveragesPanelSet-AdditionalCoveragesDV_tb-Add\"]/div")
            public WebElement Add_Coverages;

    @FindBy(xpath = "//*[@id=\"CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search\"]")
            public  WebElement Search_Coverages;

    @FindBy(xpath = "//*[@id=\"CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-0-_Checkbox\"]/input")
            public WebElement Coverage_CB;

    @FindBy(xpath = "//*[@id=\"CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV_tb-AddCoverageButton\"]/div")
            public WebElement Add_Selected_Coverages;

    @FindBy(xpath = "//*[@id=\"CPBuildingPopup-Update\"]/div")
public WebElement  Ok_Button;

    DropDownHelper dropDownHelper = new DropDownHelper();

    public void Bind_Options(){
        waitForWebElementAndClick(Bind_Options);
    }
    public void Issue_Policy(){
        waitForWebElementAndClick(Issue_Policy);
    }

    public void Add_Selected_Coverages(){
        waitForWebElementAndClick(Add_Selected_Coverages);
    }
    public void Coverage_CB(){
        CB.selectCheckBox(Coverage_CB);
    }
    public  WebElement Add_Coverages(){
        waitForWebElementAndClick(Add_Coverages);
        return Add_Coverages;
    }

    public  void Search_Coverages(){
        waitForWebElementAndClick(Search_Coverages);
    }

    public void Loss_Cause_Location() throws InterruptedException {
//        dropDownHelper.SelectUsingIndex((By)Loss_Cause_Location,0);
//        return (WebDriver) Loss_Cause_Location;

            Select se = new Select(Loss_Cause_Location);
            se.selectByIndex(0);

    }
    public void Loss_Cause1(){
        JH.scrollIntoView(Loss_Cause1);
        dropDownHelper.SelectUsingVisibleValue(Loss_Cause1,"Earthquake");
    }

    public void Relation_to_Insured(){
        dropDownHelper.SelectUsingVisibleValue(Relation_to_Insured,"Self/Insured");

    }

    public void Next_Button_Claim(){
        waitForWebElementAndClick(Next_Button_Claim);
    }
    public  WebElement New_Person_DD(){
        waitForWebElementAndClick(New_Person_DD);
        return New_Person_DD;
    }
    public void Next_Button_Claims(){
        waitForWebElementAndClick(Next_Button_Claims);
    }
    public void Update_Button(){
        waitForWebElementAndClick(Update_Button);
    }
    public  void New_Person_Basic_Info(){
        waitForWebElementAndClick(New_Person_Basic_Info);
    }

    public void Enter_New_Name(String New_Person){
        sendKeys(Last_Name,New_Person);
    }


    public void Basic_info_Name_Act(){
        waitForWebElementAndClick(Basic_info_Name_Act);
    }
////////////////////////////////////////////////////////
    public  void Select_Property(){
        CB.selectCheckBox(Select_Property);
    }
    public WebElement Blanket_Deductible_DropDown(){
        waitForWebElementAndClick(Blanket_Deductible_DropDown);
        return  Blanket_Deductible_DropDown;
    }
    public void commercial_property(){
        waitForWebElementAndClick(commercial_property);
    }
    public void excess_radio(){
        waitForWebElementAndClick(excess_radio);
    }

    public void Coverages_Tab_Ok_But(){
        waitForWebElementAndClick(Coverages_Tab_Ok_But);
    }

    public  void New_Submission_Ok_Button(){
        waitForWebElementAndClick(New_Submission_Ok_Button);
    }
public void Loc(){
        waitForWebElementAndClick(Loc);
}
public void New_Build2(){
        waitForWebElementAndClick(New_Build2);
}
public void Add_location(){

    waitForWebElementAndClick(Add_location);
    waitForWebElementAndClick(New_Location);
}public void City(String Location_Code,String Location_Name,String Address_name,String Phone_no,String Zipcode_no,String city) throws InterruptedException {

        sendKeys(Location_code, Location_Code);
        Thread.sleep(1000);
        sendKeys(Location_name, Location_Name);
        Thread.sleep(1000);
        sendKeys(Address, Address_name);
        Thread.sleep(1000);

        sendKeys(Phone, Phone_no);
        Thread.sleep(1000);
        sendKeys(Zipcode, Zipcode_no);
        Thread.sleep(1000);
        sendKeys(City, city);
    }
public WebElement State(){
        waitForWebElementAndClick(State);
        return State;
}
public void territory() {
        waitForWebElementAndClick(Territory);
        waitForWebElementAndClick(ok);
}
public void Building_data() throws InterruptedException {
        Thread.sleep(1000);
    waitForWebElementAndClick(building_dropdown);
    waitForWebElementAndClick(Add_building);
    waitForWebElementAndClick(Add_building);
    Thread.sleep(1000);
    waitForWebElementAndClick(New_building);
    Thread.sleep(1000);
    waitForWebElementAndClick(property_class_code);
    waitForWebElementAndClick(property_code);
    //*[@id="SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-Actions-ActionsMenuIcon"]/div[1]
    //*[@id="SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-1-Actions-ActionsMenuIcon"]/div[1]

}

public void Ok_Button(){
        waitForWebElementAndClick(Ok_Button);
}
public void Building_data1(){
    waitForWebElementAndClick(property_class_code);
    waitForWebElementAndClick(property_code);
    drop_down_helper.SelectUsingVisibleValue(coverage_type,"Building and Personal Property");

}
public void data(){
        waitForWebElementAndClick(Add_building);
        waitForWebElementAndClick(Add_building);
}
public WebElement coverage(){
        waitForWebElementAndClick(coverage_type);
        return coverage_type;

}
public void Coverage_tab(){
        waitForWebElementAndClick(coverage_tab);
}
public WebElement cause_of_loss(){
        waitForWebElementAndClick(cause_of_loss);
        return cause_of_loss;

}
public WebElement deductible(){
        waitForWebElementAndClick(deductible);
        return deductible;
}
public void vandalisim_sprink(){
        waitForWebElementAndClick(vandalisim);
        waitForWebElementAndClick(sprinkler);
}
public WebElement Wind_deduct()
{
    waitForWebElementAndClick(wind_deduct);
    return wind_deduct;

}
public void Action2(){
        waitForWebElementAndClick(Action2);
}
    public WebElement Valuation_method(){
        waitForWebElementAndClick(valuation_method);
        return valuation_method;

    }
    public WebElement Coinsurance(){
        waitForWebElementAndClick(coinsurance);
        return coinsurance;
    }
public WebElement Excess_surpless(){
        waitForWebElementAndClick(Excess_surpless);
        return Excess_surpless;
}
public WebElement Bussiness_cause_of_loss(){
        waitForWebElementAndClick(Bussiness_cause_of_loss);
        return Bussiness_cause_of_loss;
}
public void Builder_Risk_Renovations(){
        CB.selectCheckBox(Builder_Risk_Renovations);
}
public void Follow_Form_Coverage(){
        CB.selectCheckBox(Follow_Form_Coverage);
}
public WebElement Bussiness_report(){
        waitForWebElementAndClick(Bussiness_reporting);
        return Bussiness_reporting;
}
public WebElement Bussiness_income_coverage_cause_of_loss(){
        waitForWebElementAndClick(Bussiness_income_coverage_cause_of_loss);
        return Bussiness_income_coverage_cause_of_loss;
}
public WebElement Bussiness_income_coverage_coinsurance(){
        waitForWebElementAndClick(Bussiness_income_coverage_coinsurance);
        return Bussiness_income_coverage_coinsurance;
}
public WebElement Bussiness_income_coverage_wait_period(){
        waitForWebElementAndClick(Bussiness_income_coverage_wait_period);
        return Bussiness_income_coverage_wait_period;
}
public WebElement Bussiness_income_coverage_period_of_coverage(){
        waitForWebElementAndClick(Bussiness_income_coverage_period_of_coverage);
        return Bussiness_income_coverage_period_of_coverage;
}

public void Business_and_Locations_Next(){
        waitForWebElementAndClick(Buildings_and_Location_Next);
}

public void Add_Blankets_Button(){
        waitForWebElementAndClick(Add_Blankets_Button);
}

public  void Blanket_Details_Cancel_Button(){
        waitForWebElementAndClick(Blanket_Details_Cancel_Button);
}

public void Next_Button(){
        waitForWebElementAndClick(Next_Button);
}
public void  Policy_Review_Rate(){
        waitForWebElementAndClick(Policy_Review_Rate);
    //*[@id="SubmissionWizard-SubmissionWizard_PolicyReviewScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Rate"]/div
}

public void Income_Limit_Not_Mfg_or_Rental(String in_M_R){
        sendKeys(Income_Limit_Not_Mfg_or_Rental, in_M_R);
}
public void Income_Limit_Mfg_Only(String in_M) {
        sendKeys(Income_Limit_Mfg_Only, in_M);
}
public void Income_Limit_Rental_Only(String in_R){
        sendKeys(Income_Limit_Rental_Only,in_R);
}

public void Building_Select_Check_Box(){
    CB.selectCheckBox(Building_Select_Check_Box);
}

public void Add_Location_Action_2(){
        waitForWebElementAndClick(Add_Location_Action_2);
}
public WebElement Action_NewLocation(){
        waitForWebElementAndClick(Action_NewLocation);
        return Action_NewLocation;
}




}
