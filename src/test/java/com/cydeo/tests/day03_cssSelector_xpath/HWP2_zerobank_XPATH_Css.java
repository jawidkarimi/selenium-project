package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP2_zerobank_XPATH_Css {
    public static void main(String[] args) {

        //HWP #2: Zero Bank header verification
        //1. Open Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");


        //3. Verify header text
        //solution with xpath location
         //WebElement headerText = driver.findElement(By.xpath("//h3"));

        //solution with cssSelector locator
        //--- > tag[attribute='value]
         WebElement headerText = driver.findElement(By.cssSelector("h3"));


        //Expected: "Log in to ZeroBank
        String expetedHeader = "Log in to ZeroBank";
        String actualHeader = headerText.getText();

        if(actualHeader.equals(expetedHeader)){
            System.out.println("Header text value PASSED!");
        }else{
            System.out.println("Header text value FAILED!");
        }
    }
}
