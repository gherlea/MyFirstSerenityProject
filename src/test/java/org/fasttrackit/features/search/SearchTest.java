package org.fasttrackit.features.search;

import org.junit.Test;

public class SearchTest extends BaseTest{


    @Test
    public void searchProductTest(){
        loginSteps.doLogin("crina.bacio@gmail.com", "cristi1992.");
        searchSteps.doSearch("necklace");
        searchSteps.verifyProductInResults("Silver Desert Necklace");
    }
}
