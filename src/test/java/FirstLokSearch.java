import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLokSearch {
    private final By LOGO = By.xpath(".//a[@class='main-logo']");
    private final By TOP_MENU_LEFT_LINK=By.xpath(".//li[@class='site-top__menu-left-item'][last()]");
    private final By TOP_MENU_STORAGES_ADDRESS=By.xpath(".//a[@class='site-top__menu-right-link'] [@href='/stores']");
    private final By LANGUAGE_SWITCHER_RU=By.xpath(".//li[@class='site-top__menu-right-item language-switcher']");
    private final By SEARCH_BTN=By.xpath(".//i[@class='main-search-submit__icon icon-svg']");
    private final By SHOPPING_BAG_ICON=By.xpath(".//i[@class='cart-block__icon icon-svg']");
    private final By SMART_NET_BANNER_LOGO=By.xpath(".//img[@class='smart-net-banner__logo']");
    private final By SMART_NET_BANNER_GIFT_ICON=By.xpath(".//img[@src='/assets/smart_net/banner-icon-gift-a5f4be14455f68215791cf2fca3f688264cd5286c14ddb485388185484dbc715.svg']");
    private final By MAIN_MENU_CONTENT=By.xpath(".//i[@class='main-menu__handle-icon icon-svg']");

    private final By MAIN_LOGO=By.xpath(".//a[@aria-label='Amazon.de']");
    private final By SEARCH_FIELD=By.xpath(".//form[@id='nav-search-bar-form']");
    private final By SIGN_IN_BTN=By.xpath(".//a[@id='nav-link-accountList']");
    private final By SHOPPING_ICON=By.xpath(".//a[@class='nav-a nav-a-2 nav-progressive-attribute']");
    private final By HAMBURGER_MAIN_MENU=By.xpath(".//a[@id='nav-hamburger-menu']");
    private final By NEXT_ROUNDED_ICON=By.xpath(".//i[@class='a-icon a-icon-next-rounded']");
    private final By TV_HOME_AND_CINEMA_HEADLINE=By.xpath(".//div[@id='desktop-grid-2']");


    private final By HEADER_BOOKING_LOGO=By.xpath(".//a[@data-testid='header-booking-logo']");
    private final By HEADER_CURRENCY_BTN=By.xpath(".//button[@aria-label='Prices in Euro']");
    private final By NOTIFICATION_BTN=By.xpath("");
    private final By GENIUS_LEVEL_VALUE=By.xpath(".//div[@class='d8eab2cf7f faebca7547']");
    private final By AIRPORT_TAXI_TAB=By.xpath(".//a[@id='airport_taxis']");
    private final By SRCH_BTN =By.xpath(".//button[@type='submit']");
    private final By CHECK_IN_CHECK_OUT_DATE=By.xpath(".//div[@class='d606c76c5a']");
    private final By BANNER_WHERE_TO_NEXT=By.xpath(".//span[@data-testid='herobanner-title1']");
    private final By TRAVELING_BY_WORK=By.xpath(".//label[@for=':Ri:']");
    private final By ALERT_COVID_INFO=By.xpath(".//div[@data-testid='web-shell-global-alert']");
    private final By HUHIUJIJI=By.xpath("");



    private final By TASKBAR_CONSOLE=By.xpath(".//div[@class='RNNXgb']");
    private final By SETTINGS_BTN=By.xpath(".//span[@class='z1asCe E9hVAb']");
    private final By GOOGLE_ACCOUNT_NAME_BTN=By.xpath(".//img[@class='gb_j gbii']");
    private final By MORE_=By.xpath(".//div[@class='GOE98c']");
    private final By TOOLS_BTN=By.xpath(".//div[@class='t2vtad']");
    private final By RESULT_STATS_INFO=By.xpath(".//div[@id='result-stats']");











    @Test
    public void firstLokTry () {
        WebDriver browser = new ChromeDriver();
        browser.get("http://1a.lv");

        browser.get("amazon.de");

        browser.get("Booking.com");

        browser.get("https://www.google.com/search?q=google&sxsrf=APwXEdfKldStmni6KduWnBm4EQxfl0nkBQ%3A1683418086361&source=hp&ei=5utWZITxE7yYkdUPxbyekAc&iflsig=AOEireoAAAAAZFb59t8BICFMUhnE_Y2Ny57cgqYHWQI8&ved=0ahUKEwiE_KyI9eH-AhU8TKQEHUWeB3IQ4dUDCAo&uact=5&oq=google&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECcyEQguEIAEELEDEIMBEMcBENEDMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMggIABCABBCxAzILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATIICAAQgAQQsQM6BwgjEOoCECc6BwgjEIoFECc6EQguEIMBEMcBELEDENEDEIAEOgUIABCABFCtAljAD2DOEWgBcAB4AIABPogBvwKSAQE2mAEAoAEBsAEK&sclient=gws-wiz");
    }
}
