import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class BaseTestClass {



     @Test
    public static void function() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tanya.goyan\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),\"Fashion & Beauty\")]"))).build().perform();

        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
        WebElement target = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));

        action.dragAndDrop(source,target).build().perform();
        Thread.sleep(10);

    }
}

