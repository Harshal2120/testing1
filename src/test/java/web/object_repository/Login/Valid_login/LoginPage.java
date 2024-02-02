package web.object_repository.Login.Valid_login;

import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Wait;
import io.unity.performaction.autoweb.Window;
import org.openqa.selenium.WebDriver;

public class LoginPage {

        WebDriver driver ;
        Element element ;
        Verify verify ;
        Window window ;
        Wait wait ;


        public LoginPage(WebDriver driver) {
            this.driver = driver;
            element = new Element(driver);
            verify = new Verify(driver);
            window = new Window(driver);
            wait = new Wait(driver);
        }

        //1
        public void enter_text_at_mail(){
            driver.manage().window().maximize();
            wait.wait_for_second(1);
            element.enter_text("Email", "harshalsomani23@gmail.com");

        }
        //1
        public void enter_text_at_password() {
            wait.wait_for_second(1);
            element.enter_text("password","Harshal@2110");
        }
        //1
        public void click_on_login_button(){
            element.click("login button");
            wait.wait_for_second(7);
        }

    }

