package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.DateUtilities;

public class MPL_PO extends Base_PO {

    private Login_PO_cp login_po_cp;
    private Policy_end_to_end_PO Poli_e2e_po;

    public MPL_PO(Login_PO_cp login_po_cp, Policy_end_to_end_PO Poli_e2e_po ){
        this.login_po_cp = login_po_cp;
        this.Poli_e2e_po = Poli_e2e_po;
    }
@FindBy(xpath="//*[@id=\"SubmissionWizard-JobWizardInfoBar-excessAndSurplus_Ext\"]")
    WebElement EandS_Validation;

@FindBy(xpath = "//*[@id=\"NewSubmission-NewSubmissionScreen-ProductOffersDV-ProductSelectionLV-7-addSubmission\"]")
    WebElement Miscellaneous_Professional_Liability;

@FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-MiscProfLiabLine_ExtScreen-MPLClassCode_ExtDV-mplClassCode\"]/div[1]/input")
WebElement MPL_Line_Class_Code;

@FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-MiscProfLiabLine_ExtScreen-MPLClassCode_ExtDV-eachClaimLimit\"]/div/input")
WebElement MPL_Line_Each_Claim_Limit;

@FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-MiscProfLiabLine_ExtScreen-MPLClassCode_ExtDV-aggregateLimit\"]/div/input")
WebElement Aggregate_Limit;

@FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-MiscProfLiabLine_ExtScreen-MPLClassCode_ExtDV-revenue\"]/div/input")
WebElement Revenue;
@FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-MiscProfLiabLine_ExtScreen-MPLClassCode_ExtDV-RetentionTypeId\"]/div/div/select")
WebElement Retention_Type;

@FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-MiscProfLiabLine_ExtScreen-MPLClassCode_ExtDV-ALAETypeId\"]/div/div/select")
WebElement ALAE_Type;
@FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-MiscProfLiabLine_ExtScreen-MPLClassCode_ExtDV-NumberOfPriorActsID\"]/div/input")
WebElement Number_of_Prior_Acts;

@FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-MiscProfLiabLine_ExtScreen-MPLClassCode_ExtDV-DateId\"]/div/input")
WebElement Prior_Act_Date;

@FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-MiscProfLiabLine_ExtScreen-MiscProfLiabLine_ExtCovDV-0-CoverageInputSet-CovPatternInputGroup-_checkbox\"]/div/input")
WebElement Employed_Lawyers;

@FindBy(xpath = "//*[@id=\"SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-MiscProfLiabLine_ExtScreen-MiscProfLiabLine_ExtCovDV-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-CovTermDirectInputSet-DirectTermInput\"]/div/input")
WebElement EL_Sublimit;

public void Prior_Act_Date(){
    sendKeys(Prior_Act_Date, DateUtilities.getDateWithModifiedDay(0));
}

public void Employed_Lawyers(){
        //CB.selectCheckBox(Employed_Lawyers);
    }

    public void EL_Sublimit(String EL_Val){
    sendKeys(EL_Sublimit,EL_Val);
    }
public WebElement ALAE_Type(){
    waitForWebElementAndClick(ALAE_Type);
    return ALAE_Type;
}
    public void Number_of_Prior_Acts(String N_P_A){
    sendKeys(Number_of_Prior_Acts, N_P_A);
    }


public WebElement Miscellaneous_Professional_Liability(){
    waitForWebElementAndClick(Miscellaneous_Professional_Liability);
    return Miscellaneous_Professional_Liability;
}
public void EandS_Validation(){
//    String txt = "Excess and Surplus";
//    String txt_1 = getDriver().findElement((By)EandS_Validation).getText();
//    if(txt == txt_1){
//
//    }
    if(getDriver().findElement((By)EandS_Validation).isDisplayed()){
        login_po_cp.Next_Button();
    }


}

    public void MPL_Line_Class_Code(String CC){
        sendKeys(MPL_Line_Class_Code,CC);

    }

    public void MPL_Line_Each_Claim_Limit(String ECL){
    sendKeys(MPL_Line_Each_Claim_Limit,ECL);}

public void Aggregate_Limit(String AL){
    sendKeys(Aggregate_Limit,AL);
}
public void Revenue(String Rev){
    sendKeys(Revenue, Rev);
}

public WebElement Retention_Type(){
    waitForWebElementAndClick(Retention_Type);
    return Retention_Type;
}


}
