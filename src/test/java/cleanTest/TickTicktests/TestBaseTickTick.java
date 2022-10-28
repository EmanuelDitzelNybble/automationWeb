package cleanTest.TickTicktests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.TickTick.*;
import singletonSession.Session;

public class TestBaseTickTick {

    public MainPage mainPage = new MainPage();
    public SignUpPage signUp = new SignUpPage();
    public K k = new K();
    public SidebarMenu sidebarMenu = new SidebarMenu();
    public SignInPage signInPage = new SignInPage();
    public CenterTaskSection centerTaskSection = new CenterTaskSection();
    public CreateHabitModal createHabitModal = new CreateHabitModal();
    public HabitSection habitSection = new HabitSection();
    public CalendarModal calendarModal = new CalendarModal();
    public SettingsSection settingsSection = new SettingsSection();
    public PreferenceSection preferenceSection = new PreferenceSection();
    public TaskPage taskPage = new TaskPage();


    static String getAlphaNumericString(int n)
    {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get("https://ticktick.com/");
    }

    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}
