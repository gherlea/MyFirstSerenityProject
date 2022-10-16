package org.fasttrackit.features.search;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

    public class SearchTest extends BaseTest{

    private String searchItem = "necklace";

    @Test
    public void searchProductTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("necklace");
        searchSteps.verifyProductInResults("SILVER DESERT NECKLACE");
    }
    @Test
    public void searchAnotherProductTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("pillow");
        searchSteps.verifyProductInResults("SHAY PRINTED PILLOW");
    }
    @Test
        public void searchSecondProductTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
            searchSteps.doSearch("memory");
            searchSteps.verifyProductInResults("8GB MEMORY CARD");
    }
}

