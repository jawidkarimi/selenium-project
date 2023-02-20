package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP2_Zerobank_Header {
    public static void main(String[] args) {

        //HWP #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");


        //3. Verify header text
        //Expected: "Log in to ZeroBank"
        WebElement header = driver.findElement(By.tagName("h3"));
        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = header.getText();

        //verification of actual vs expected
        if (actualHeader.equals(expectedHeader)) {
            System.out.println("header verification PASSED");
        }else {
            System.out.println("header verification FAILED");
        }

    }
}
