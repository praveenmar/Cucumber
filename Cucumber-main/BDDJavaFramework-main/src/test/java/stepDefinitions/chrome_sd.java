package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.Account;
import pageObjects.Base_PO;
import pageObjects.chrome_po;

public class chrome_sd extends Base_PO {

    public Account acc;
    public chrome_po chrome_po;

    public chrome_sd(chrome_po cpo, Account acc){
        this.chrome_po = cpo;
        this.acc = acc;
    }


    @Given("user open chrome and load the url {string}")
    public void user_open_chrome_and_load_the_url(String str) {

    getDriver().get("https://en.wikipedia.org/wiki/Batman");
//        chrome_po.search_field(str);
//        chrome_po.lucky();
    }
    @And("user search and get results")
    public void userSearchAndGetResults() {
        //chrome_po.NewSearch();
        chrome_po.google_text();
    }
}

