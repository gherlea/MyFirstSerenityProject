package org.fasttrackit.features.search;

import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addProductToCart(){
        loginSteps.doLogin("crina.bacio@gmail.com","cristi1992.");
        searchSteps.doSearch("necklace");
        productSteps.selectProductFromList("Silver Desert Necklace");
        cartSteps.clickAddToCart();


    }
}
