package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

public class CartPage extends BasePage {
    @FindBy(css = ". succes-msg span")
    private WebElementFacade successMessage;

    @FindBy(css = ".product-cart-total .price")
    private List<WebElementFacade> listOfProductsSubTotalSpan;

    @FindBy(css = "tr:first-child .a-right > .price")
    private WebElementFacade cartSubtotalPriceSpan;

    @FindBy(css = "tr:last-child .a-right > .price")
    private WebElementFacade cartShippingFeeSpan;

    @FindBy(css = "tr:tfoot .a-right > .price")
    private WebElementFacade cartGrandTotalPriceSpan;

    public void verifySuccessMessage(String productName) {
        successMessage.shouldContainOnlyText(productName + " was added to your shopping cart.");
    }
    public int getSubtotalPriceFromProducts() {
            int sum =0;

            for(WebElementFacade element: listOfProductsSubTotalSpan){
            sum+=getPriceFromString(element.getText());
            }
            return sum;
            }

            public boolean isSubTotalPriceCalculatedCorrecty(){
        int actual = getPriceFromString(cartSubtotalPriceSpan.getText());
        int expected = getSubtotalPriceFromProducts();
        return actual ==expected;
        }

        public boolean isGrandTotalpriceCorrect(){
        int subtotal = getPriceFromString(cartSubtotalPriceSpan.getText());
        int fees = getPriceFromString(cartShippingFeeSpan.getText());
        int expected = subtotal + fees;
        int actual = getPriceFromString(cartGrandTotalPriceSpan.getText());
        return expected == actual;

    }
}
