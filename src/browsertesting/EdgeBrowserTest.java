package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl="https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();//using edgedriver
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximize size
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title=driver.getTitle();//get page title
        System.out.println(title);
        driver.getCurrentUrl();
        System.out.println("Current URL="+driver.getCurrentUrl());
        WebElement userName= driver.findElement(By.id("user-name"));//find username element
        userName.sendKeys("standard_user");
        WebElement password= driver.findElement(By.name("password"));//find password element
        password.sendKeys("secret_sauce");
        //closing browser
        driver.close();
    }
}
