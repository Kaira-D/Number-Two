import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class TestMT {

    @Test
    public void CheckMoneyTransfer(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://next.privat24.ua/money-transfer/card");
        By CardSource = By.xpath("//input[@data-qa-node='numberdebitSource']");
        By expSource = By.xpath("//input[@data-qa-node='expiredebitSource']");
        By cvvSource = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        By fNameSource = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        By lNameSource = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        By CardReciever = By.xpath("//input[@data-qa-node='numberreceiver']");
        By fNameReciever = By.xpath("//input[@data-qa-node='firstNamereceiver']");
        By lNameReciever = By.xpath("//input[@data-qa-node='lastNamereceiver']");
        By amount = By.xpath("//input[@data-qa-node='amount']");
        By currency = By.xpath("//button[@data-qa-node='currency']");
        By curEUR = By.xpath("//button[@data-qa-value='EUR']");
        By comment = By.xpath("//span[@data-qa-node='toggle-comment']");
        By commentAdd = By.xpath("//textarea[@data-qa-node='comment']");
        By submitBtn = By.xpath("//button[@type='submit']");

        driver.findElement(CardSource).sendKeys("4006895689048337");
        driver.findElement(fNameSource).sendKeys("MAIEV");
        driver.findElement(lNameSource).sendKeys("SHADOWSONG");
        driver.findElement(expSource).sendKeys("1222");
        driver.findElement(cvvSource).sendKeys("999");
        driver.findElement(CardReciever).sendKeys("4558032855841715");
        driver.findElement(fNameReciever).sendKeys("ILLIDAN");
        driver.findElement(lNameReciever).sendKeys("STORMRAGE");
        driver.findElement(amount).sendKeys("11");
        driver.findElement(currency).click();
        driver.findElement(curEUR).click();
        driver.findElement(comment).click();
        driver.findElement(commentAdd).sendKeys("HAPPY RELEASE DAY");
        driver.findElement(submitBtn).submit();
    }


}
