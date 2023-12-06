
package banking_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginpage {


    WebDriver ldriver;

   public loginpage(WebDriver rdriver){

        ldriver = rdriver;
        PageFactory.initElements(rdriver , this);
    }

     @FindBy(how = How.NAME, using = "uid")
    WebElement email;

     @FindBy(how = How.NAME , using = "password")
    WebElement pass;

     @FindBy(how = How.NAME , using = "btnLogin")
    WebElement btn;

     public void email(String uname){

         email.sendKeys(uname);
     }

     public void pass(String pws){
         pass.sendKeys(pws);


     }

     public void btn(){
         btn.click();

     }
}
