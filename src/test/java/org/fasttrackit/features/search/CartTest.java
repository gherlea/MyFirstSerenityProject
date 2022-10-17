package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

    public class CartTest extends BaseTest {

    @Test
    public void addProductToCart() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("necklace");
        productSteps.selectProductFromList("SILVER DESERT NECKLACE");
        cartSteps.clickAddToCart();

        searchSteps.doSearch("pillow");
        productSteps.selectProductFromList("SHAY PRINTED PILLOW");
        cartSteps.clickAddToCart();

        searchSteps.doSearch("memory");
        productSteps.selectProductFromList("8GB MEMORY CARD");
        cartSteps.clickAddToCart();
    }

    @Test
    public void verifyPricesTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);

        searchSteps.doSearch("memory");
        productSteps.selectProductFromList("16GB MEMORY CARD");
        cartSteps.clickAddToCart();

        searchSteps.doSearch("memory");
        productSteps.selectProductFromList("8GB MEMORY CARD");
        cartSteps.clickAddToCart();

  //    navigare la cos
        cartSteps.checkCartSubtotalIsCorrect();
    }
}


