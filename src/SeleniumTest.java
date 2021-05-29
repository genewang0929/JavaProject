import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.event.InputEvent;

public class seleniumTest {
    public seleniumTest(String Account, String Password) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ais.ntou.edu.tw/Default.aspx");
        WebElement username = driver.findElement(By.name("M_PORTAL_LOGIN_ACNT"));
        username.sendKeys(Account);
        WebElement password = driver.findElement(By.name("M_PW"));
        password.sendKeys(Password);
        try {
            Robot r=new Robot();
            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            r.keyPress(KeyEvent.VK_F11);
        }catch (Exception e){
            return;
        }
        driver.findElement(By.xpath("//*[@id=\"LGOIN_BTN\"]")).click();

        //上教學務爬取登入者姓名
//       String Name = "";
        //TODO

        //將登入資料傳送到資料庫
//        connectToSQL connectToSQL = new connectToSQL();
//        connectToSQL.studentInfo(Account, Password, Name);
    }
}
