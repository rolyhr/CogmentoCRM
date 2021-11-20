package step_definitions;

import baseAPI.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;
import pom.Login;

public class SharedStepsUI extends Base {

    public SharedStepsUI(){
        PageFactory.initElements(driver,this);
    }

    @Before
    public void setUp(){
        String browser = "Chrome";
        driverSetup(browser);
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    public Login navigateToCogmentoApp(){
        String s = "https://www.cogmento.com/";
        String url = s;
        driver.get(url);
        return new Login();
    }

}
