package web.tests.login;

import io.unity.framework.init.base;
import org.testng.annotations.Test;
import web.object_repository.Login.invalid_Login.Invalid_login;

public class Invalid_Login_Test extends base{

    Invalid_login invalid;
    //2
    @Test
    public void verify_valid_message_is_present_when_only_clicks_on_logins_button(){
        invalid = new Invalid_login(driver);
        invalid.verify_valid_message_is_present_when_only_click_on_login_button();
    }
    //3
    @Test
    public void verify_valid_message_is_present_when_entering_invalid_email_id(){
        invalid = new Invalid_login(driver);
        invalid.verify_valid_message_is_present_when_entering_invalid_email();
    }
    //4
    @Test
    public void verify_valid_message_is_present_when_entering_invalid_password(){
        invalid = new Invalid_login(driver);
        invalid.verify_valid_message_is_present_when_entering_invalid_password();
    }
    //5
    @Test
    public void verify_forgotten_password_text_is_present(){
        invalid = new Invalid_login(driver);
        invalid.verify_forgotten_password_text_is_present();
    }
    //6
    @Test
    public void verify_forgotten_password_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_forgotten_password_link_is_working();
    }
    //7
    @Test
    public void verify_facebook_logo_is_present(){
        invalid = new Invalid_login(driver);
        invalid.verify_facebook_logo_is_present();
    }
    //8
    @Test
    public void verify_facebook_page_text_is_present(){
        invalid = new Invalid_login(driver);
        invalid.verify_facebook_page_text_is_present();
    }
    //9
    @Test
    public void verify_create_a_page_hypertext_is_present(){
        invalid = new Invalid_login(driver);
        invalid.verify_create_a_page_hypertext_is_present();
    }
    //10
    @Test
    public void verify_create_a_page_hyperlink_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_create_a_page_hyperlink_is_working();
    }
    //11
    @Test
    public void verify_create_new_account_text_is_visible(){
        invalid = new Invalid_login(driver);
        invalid. verify_create_new_account_text_is_visible();
    }
    //12
    @Test
    public void verify_create_new_account_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_create_new_account_hypertext_link_is_working();
    }
    //13
    @Test
    public void verify_gujarati_language_text_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_gujarati_language_text_is_present_on_page();
    }
    //14
    @Test
    public void verify_gujarati_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_gujarati_hypertext_link_is_working();
    }
    //15
    @Test
    public void verify_marathi_language_text_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_marathi_language_text_is_present_on_page();
    }
    //16
    @Test
    public void verify_marathi_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_marathi_hypertext_link_is_working();
    }
    //17
    @Test
    public void verify_valid_email_id_and_invalid_password(){
        invalid = new Invalid_login(driver);
        invalid.verify_valid_email_id_and_invalid_password();
    }
    //18
    @Test
    public void verify_invalid_email_id_and_valid_password(){
        invalid = new Invalid_login(driver);
        invalid.verify_invalid_email_id_and_valid_password();
    }
    //19
    @Test
    public void verify_invalid_email_id_with_numbers(){
        invalid = new Invalid_login(driver);
        invalid.verify_invalid_email_id_with_numbers();
    }
    //20
    @Test
    public void verify_invalid_password_with_numbers(){
        invalid = new Invalid_login(driver);
        invalid.verify_invalid_password_with_numbers();
    }
    //21
    @Test
    public void verify_urdu_language_text_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_urdu_language_text_is_present_on_page();
    }
    //22
    @Test
    public void verify_urdu_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_urdu_hypertext_link_is_working();
    }
    //23
    @Test
    public void verify_punjabi_language_text_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_punjabi_language_text_is_present_on_page();
    }
    //24
    @Test
    public void verify_punjabi_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_punjabi_hypertext_link_is_working();
    }
    //25
    @Test
    public void verify_tamil_language_text_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_tamil_language_text_is_present_on_page();
    }
    //26
    @Test
    public void verify_tamil_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_tamil_hypertext_link_is_working();
    }

    //27
    @Test
    public void verify_telugu_language_text_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_telugu_language_text_is_present_on_page();
    }

    //28
    @Test
    public void verify_telugu_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_telugu_hypertext_link_is_working();
    }

    //29
    @Test
    public void verify_bengali_language_text_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_bengali_language_text_is_present_on_page();
    }

    //30
    @Test
    public void verify_bengali_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_bengali_hypertext_link_is_working();
    }
    //31
    @Test
    public void verify_malayalam_language_text_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_malayalam_language_text_is_present_on_page();
    }

    //32
    @Test
    public void verify_malayalam_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_malayalam_hypertext_link_is_working();
    }
    //33
    @Test
    public void verify_spanish_language_text_is_present_on_page() {
        invalid = new Invalid_login(driver);
        invalid.verify_spanish_language_text_is_present_on_page();
    }
    //34
     @Test
    public void verify_spanish_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_spanish_hypertext_link_is_working();
    }

    //35
    @Test
    public void verify_sign_up_text_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_sign_up_text_is_present_on_page();
    }
    //36
    @Test
    public void verify_sign_up_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_sign_up_hypertext_link_is_working();
    }

    //37
    @Test
    public void verify_log_in_hypertext_text_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_log_in_hypertext_text_is_present_on_page();
    }

    //38
    @Test
    public void verify_log_in_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_log_in_hypertext_link_is_working();
    }

    //39
    @Test
    public void verify_Messenger_hypertext_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_Messenger_hypertext_is_present_on_page();
    }

    //40
    @Test
    public void verify_Messenger_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_Messenger_hypertext_link_is_working();
    }

    //41
    @Test
    public void verify_facebook_lite_hypertext_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_facebook_lite_hypertext_is_present_on_page();
    }

    //42
    @Test
    public void verify_facebook_lite_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_facebook_lite_hypertext_link_is_working();
    }

    //43
    @Test
    public void verify_video_hypertext_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_video_hypertext_is_present_on_page();
    }

    //44
    @Test
    public void verify_video_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_video_hypertext_link_is_working();
    }

    //45
    @Test
    public void verify_places_hypertext_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_places_hypertext_is_present_on_page();
    }

    //46
    @Test
    public void verify_places_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_places_hypertext_link_is_working();
    }

    //47
    @Test
    public void verify_games_hypertext_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_games_hypertext_is_present_on_page();
    }

    //48
    @Test
    public void verify_games_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_games_hypertext_link_is_working();
    }

    //49
    @Test
    public void verify_marketplace_hypertext_is_present_on_page(){
        invalid = new Invalid_login(driver);
        invalid.verify_marketplace_hypertext_is_present_on_page();
    }

    //50
    @Test
    public void verify_marketplace_hypertext_link_is_working(){
        invalid = new Invalid_login(driver);
        invalid.verify_marketplace_hypertext_link_is_working();
    }
}
