package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T3_checkboxes_radiobuttons {
    public static void main(String[] args) throws InterruptedException {

    //TC#3: Checkboxes
        //1. Go to https://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https://practice.cydeo.com/checkboxes");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //Locate checkbox #1 and #2
       WebElement checkBox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
       WebElement checkBox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //2. Confirm checkbox #1 is Not selected by default
        //3. Confirm checkbox #2 is SELECTED by default
        System.out.println("checkBox1.isSelected(), expecting false = " + checkBox1.isSelected());
        System.out.println("checkBox2.isSelected(), expecting true = " + checkBox2.isSelected());

        //4. Click checkbox #1 to select it
        Thread.sleep(2000);
        checkBox1.click();

        //5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checkBox2.click();
        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkBox1.isSelected(), expeting true = " + checkBox1.isSelected());
        //7. Confirm checkbox #2 is Not selected.
        System.out.println("checkBox2.isSelected(), expecting false = " + checkBox2.isSelected());

        driver.quit();
    }
}
