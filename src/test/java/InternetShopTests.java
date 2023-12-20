import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class InternetShopTests {
    private final String URL = "http://www.1a.lv";
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final String SECTION = "Instrumenti";
    @Test
    public void productPresenceInCartCheck() {
        //Open browser
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();

        //Open home Page
        browser.get(URL);

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));
        //Accept cookies Find Element
        WebElement acceptBtn = browser.findElement(ACCEPT_COOKIES_BTN);


        //Click on Element
        acceptBtn.click();

        //find All sections//
        //find necessary section (Instrumenti)
        //Click on it

    }

    @Test
    public void workingWithLists() {
        List<String> names = new ArrayList<>();
        names.add("Dmitriy");
        names.add("Laura");
        names.add("Vitalijs");
        names.add("Inna");
        names.add("Anna");

        //---------------------------For---------------------
        for (int i=0; i < names.size();i++) {
            System.out.println("The name number " + (i + 1) + " is: " + names.get(i));
        }

        //--------------------FOREACH-------------------------
        for (String name :names)  {
            System.out.println(name);
        }

//        System.out.println(names.isEmpty());
//        System.out.println(names.size());
//        System.out.println(names.get(2));
    }
}
