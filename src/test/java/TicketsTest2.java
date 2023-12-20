import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TicketsTest2 {
    private final By FROM =By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN =By.xpath(".//span[@class='gogogo']");

    private final By NAME_INPUT=By.id("name");
    private final By SURNAME_INPUT = By.id("surname");
    private final By DISCOUNT_INPUT= By.id("discount");
    private final By TRAVELLER_COUNT_INPUT = By.id("adults");
    private final By CHILDREN_COUNT_INPUT = By.id("children");
    private final By LUGGAGE_COUNT = By.id("bugs");
    private final By NEXT=By.id("flight");

    private final String URL="http://www.qaguru.lv:8089/tickets";
    private final String DEPARTURE_AIRPORT = "RIX";
    private final String ARRIVAL_AIRPORT = "MEL";

    private final String NAME = "Elnara";
    private final String SURNAME="Test";
    private final String DISCOUNT="1234567";
    private final String ADULTS ="2";
    private final String CHILDREN ="2";
    private final String LUGGAGE = "2";
    private final String NEXT_FLIGHT="14-05-2018";
    @Test
    public void successTicketsBookCheck() {
        //Open browser
        WebDriver browser=new ChromeDriver();
        browser.manage().window().maximize();
        //open home page
        browser.get(URL);
        //select Departure airport
      WebElement fromDropdown=browser.findElement(FROM);
        Select fromSelect=new Select(fromDropdown);
        fromSelect.selectByValue(DEPARTURE_AIRPORT);
        //select arrival airport
        WebElement toDropdown=browser.findElement(TO);
        Select toSelect=new Select(toDropdown);
        toSelect.selectByValue(ARRIVAL_AIRPORT);
        //press GoGoGo btn
        browser.findElement(GO_BTN).click();
        //fill in passenger  personal info
        WebElement nameInputField = browser.findElement(NAME_INPUT);
        nameInputField.clear();
        nameInputField.sendKeys(NAME);

        WebElement surnameInputField = browser.findElement(SURNAME_INPUT);
        surnameInputField.clear();
        surnameInputField.sendKeys(SURNAME);

        WebElement discountInputField =browser.findElement(DISCOUNT_INPUT);
        discountInputField.clear();
        discountInputField.sendKeys(DISCOUNT);

        WebElement travelerInputField = browser.findElement(TRAVELLER_COUNT_INPUT);
        travelerInputField.clear();
        travelerInputField.sendKeys(ADULTS);

        WebElement childrenInputField=browser.findElement(CHILDREN_COUNT_INPUT);
        childrenInputField.clear();
        childrenInputField.sendKeys(CHILDREN);

        WebElement luggageInputField=browser.findElement(LUGGAGE_COUNT);
        luggageInputField.clear();
        luggageInputField.sendKeys(LUGGAGE);

        WebElement nextDropdown= browser.findElement(NEXT);
        Select nextSelect= new Select(nextDropdown);
        nextSelect.selectByValue(NEXT_FLIGHT);

        //press get price link
        //press book btn
        //Select seat Nr
        //Press Book btn
        //Check if successful msg appears

    }
}
