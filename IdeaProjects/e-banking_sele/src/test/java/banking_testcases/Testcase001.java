package banking_testcases;

import banking_pom.loginpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase001 extends baseClass{

    @Test
    public void logintest(){

        driver.get(baseurl);
        Logger.info("String iS open");

        loginpage lp= new loginpage(driver);
        lp.email(username);
        Logger.info("entered mail");
        lp.pass(password);
        Logger.info("entered pass");
        lp.btn();
        Logger.info("clicked");
        if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){

            Assert.assertTrue(true);

            Logger.info("passed");
        }
        else{

            Assert.assertTrue(false);
            Logger.info("Failed");
        }
    }

}
