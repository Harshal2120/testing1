package web.tests.login;

import io.unity.framework.init.base;
import org.testng.annotations.Test;
import web.object_repository.Login.Valid_login.LoginPage;

public class LoginPageTest extends base{

    LoginPage test;
        //1
        @Test
        public void enter_email() {
         test = new LoginPage(driver);
         test.enter_text_at_mail();
         test.enter_text_at_password();
         test.click_on_login_button();
        }
    }


