package tests;

import core.DriverManager;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest{

    RegisterPage registerPage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void localSetup(){
        registerPage=new RegisterPage(driver);
        loginPage=new LoginPage(driver);
    }


    @Test
    public void registerUserTest(){
        registerPage.goToRegisterPage().registerUser();
        loginPage.loginUser(registerPage.getUsername(),registerPage.getPassword());
        Assert.assertTrue(registerPage.isUserRegistered());
    }




}
