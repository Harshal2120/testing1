package web.object_repository.Login.invalid_Login;

import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import io.unity.performaction.autoweb.Window;
import org.openqa.selenium.WebDriver;
import io.unity.framework.init.base;

public class Invalid_login extends base {

    WebDriver driver;
    Element element;
    Verify verify;
    Window window;
    Wait wait;


    public Invalid_login(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        window = new Window(driver);
        wait = new Wait(driver);
    }

    //2
    public void verify_valid_message_is_present_when_only_click_on_login_button() {
        element.click("login button");
        verify.element_is_present("button");
    }

    //3
    public void verify_valid_message_is_present_when_entering_invalid_email() {
        element.enter_text("Email", "harshaaaaa2223@gmail.com");
        element.click("login button");
        verify.element_is_present("button");
    }

    //4
    public void verify_valid_message_is_present_when_entering_invalid_password() {
        element.enter_text("password", "harshal@2110");
        element.click("login button");
        verify.element_is_present("button");
    }

    //5
    public void verify_forgotten_password_text_is_present() {
        verify.element_is_present("Forgot password text");
    }

    //6
    public void verify_forgotten_password_link_is_working() {
        element.click("Forgot password text");
        verify.element_is_present("Forgot password link");
    }

    //7
    public void verify_facebook_logo_is_present() {
        verify.element_is_present("Facebook logo");
    }

    //8
    public void verify_facebook_page_text_is_present() {
        verify.element_is_present("Facebook page text");
    }

    //9
    public void verify_create_a_page_hypertext_is_present() {
        verify.element_is_present("Create a page hypertext");
    }

    //10
    public void verify_create_a_page_hyperlink_is_working() {
        element.click("Create a page hypertext");
        element.enter_text("Email", "harshalsomani23@gmail.com");
        element.enter_text("password", "Harshal@2110");
        element.click("Create a page hyperlink login button");
    }

    //11
    public void verify_create_new_account_text_is_visible() {
        verify.element_is_present("Create new account text");
    }

    //12
    public void verify_create_new_account_hypertext_link_is_working() {
        element.click("Create new account");
    }

    //13
    public void verify_gujarati_language_text_is_present_on_page() {
        verify.element_is_present("Gujarati hypertext");
    }

    //14
    public void verify_gujarati_hypertext_link_is_working() {
        element.click("Gujarati hypertext");
    }

    //15
    public void verify_marathi_language_text_is_present_on_page() {
        verify.element_is_present("Marathi hypertext");
    }

    //16
    public void verify_marathi_hypertext_link_is_working() {
        element.click("Marathi hypertext");
    }

    //17
    public void verify_valid_email_id_and_invalid_password() {
        element.enter_text("Email", "harshalsomani23@gmail.com");
        element.enter_text("password", "harshal@2000");
        element.click("login button");
        verify.element_is_present("valid Email_invalid_password");
    }

    //18
    public void verify_invalid_email_id_and_valid_password() {
        element.enter_text("Email", "orangejuice3323@gmail.com");
        element.enter_text("password", "Harshal@2110");
        element.click("login button");
        verify.element_is_present("button");
    }

    //19
    public void verify_invalid_email_id_with_numbers() {
        element.enter_text("Email", "1234455669826892732093799@gmail.com");
        element.enter_text("password", "Harshal@2110");
        element.click("login button");
        verify.element_is_present("button");
    }

    //20
    public void verify_invalid_password_with_numbers() {
        element.enter_text("Email", "harshalsomani23@gmail.com");
        element.enter_text("password", "Harshal@21100000000000000");
        element.click("login button");
        verify.element_is_present("valid Email_invalid_password");
    }

    //21
    public void verify_urdu_language_text_is_present_on_page() {
        verify.element_is_present("Urdu hypertext");
    }

    //22
    public void verify_urdu_hypertext_link_is_working() {
        element.click("Urdu hypertext");
    }

    //23
    public void verify_punjabi_language_text_is_present_on_page() {
        verify.element_is_present("Punjabi hypertext");
    }

    //24
    public void verify_punjabi_hypertext_link_is_working() {
        element.click("Punjabi hypertext");
    }

    //25
    public void verify_tamil_language_text_is_present_on_page() {
        verify.element_is_present("Tamil hypertext");
    }

    //26
    public void verify_tamil_hypertext_link_is_working() {
        element.click("Tamil hypertext");
    }

    //27
    public void verify_telugu_language_text_is_present_on_page() {
        verify.element_is_present("Telugu hypertext");
    }

    //28
    public void verify_telugu_hypertext_link_is_working() {
        element.click("Telugu hypertext");
    }

    //29
    public void verify_bengali_language_text_is_present_on_page() {
        verify.element_is_present("Bengali hypertext");
    }

    //30
    public void verify_bengali_hypertext_link_is_working() {
        element.click("Bengali hypertext");
    }

    //31
    public void verify_malayalam_language_text_is_present_on_page() {
        verify.element_is_present("Malayalam hypertext");
    }

    //32
    public void verify_malayalam_hypertext_link_is_working() {
        element.click("Malayalam hypertext");
    }

    //33
    public void verify_spanish_language_text_is_present_on_page() {
        verify.element_is_present("Spanish hypertext");
    }

    //34
    public void verify_spanish_hypertext_link_is_working() {
        element.click("Spanish hypertext");
    }

    //35
    public void verify_sign_up_text_is_present_on_page() {
        verify.element_is_present("Sign up hypertext");
    }

    //36
    public void verify_sign_up_hypertext_link_is_working() {
        element.click("Sign up hypertext");
    }

    //37
    public void verify_log_in_hypertext_text_is_present_on_page() {
        verify.element_is_present("Log in hypertext");
    }

    //38
    public void verify_log_in_hypertext_link_is_working() {
        element.click("Log in hypertext");
    }

    //39
    public void verify_Messenger_hypertext_is_present_on_page() {
        verify.element_is_present("Messenger hypertext");
    }

    //40
    public void verify_Messenger_hypertext_link_is_working() {
        element.click("Messenger hypertext");
    }

    //41
    public void verify_facebook_lite_hypertext_is_present_on_page() {
        verify.element_is_present("Facebook lite hypertext");
    }

    //42
    public void verify_facebook_lite_hypertext_link_is_working() {
        element.click("Facebook lite hypertext");
    }

    //43
    public void verify_video_hypertext_is_present_on_page() {
        verify.element_is_present("Video hypertext");
    }

    //44
    public void verify_video_hypertext_link_is_working() {
        element.click("Video hypertext");
    }

    //45
    public void verify_places_hypertext_is_present_on_page() {
        verify.element_is_present("Places hypertext");
    }

    //46
    public void verify_places_hypertext_link_is_working() {
        element.click("Places hypertext");
    }

    //47
    public void verify_games_hypertext_is_present_on_page() {
        verify.element_is_present("Games hypertext");
    }

    //48
    public void verify_games_hypertext_link_is_working() {
        element.click("Games hypertext");
    }

    //49
    public void verify_marketplace_hypertext_is_present_on_page() {
        verify.element_is_present("Marketplace hypertext");
    }

    //50
    public void verify_marketplace_hypertext_link_is_working() {
        element.click("Marketplace hypertext");
    }
}
