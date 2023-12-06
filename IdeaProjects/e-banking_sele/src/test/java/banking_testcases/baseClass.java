package banking_testcases;

import banking_utilitier.readconfig;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.logging.Logger;

public class baseClass {
//Userid- mngr542057
    //pass- sYjEnUm

    readconfig read = new readconfig();
    public String baseurl= read.getApplicationURL();
public String username=read.getUsername();
public String password=read.getpassword();
public static WebDriver driver;
public  static Logger Logger;
@Parameters("browser")
@BeforeClass
    public void setup(String br){

 /*   System.setProperty("webdriver.chrome.driver",read.getChromepath());
    driver=new ChromeDriver();*/

Logger = java.util.logging.Logger.getLogger("e-baking_sele");
    PropertyConfigurator.configure("C:\\Users\\Anuj\\IdeaProjects\\e-banking_sele\\src\\main\\resources\\Log4j.properties");

    if(br.equals("chrome")){
        System.setProperty("webdriver.chrome.driver",read.getChromepath());
        driver=new ChromeDriver();
    } else if (br.equals("firefox")) {
        System.setProperty("webdriver.gecko.driver",read.getfirefoxpath());
        driver=new FirefoxDriver();


    }
    driver.get(baseurl);
}
@AfterClass
    public void teardown(){

    driver.quit();
}

}
