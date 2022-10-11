package org.fasttrackit.features.search;

import org.junit.Test;

public class LoginTests extends BaseTest{


    @Test
    public void loginWithValidCredentialsTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials( "crina.bacio@gmail.com","cristi1992.");
        loginSteps.clickLogin();
    }
}
