package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //Setup browser driver
        WebDriverManager.chromedriver().setup();

        //Create instance of Chrome browser
        WebDriver driver = new ChromeDriver();

        //This line will maximize the currently opened browser
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();   this is only for mac

        //go to Tesla.com
        driver.get("https:www.tesla.com");

        //user.getCurrentUrl method to print out current URL
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //get title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //Use navigate back() to go back
        driver.navigate().back();

        //Stop execution for 3 seconds
        Thread.sleep(3000);

        //User navigate forward() to go forward
        driver.navigate().forward();

        //Stop execution for 3 seconds
        Thread.sleep(3000);

        //Use refreshes the page using navigate.fresh
        driver.navigate().refresh();

        //navigate to google.com using navigate.to()
        driver.navigate().to("https://www.google.com");

        //user.getCurrentUrl method to print out current URL
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //get title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());

        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //Closes only the currently focused on
        driver.close();

        //Closes all-of the opened browsers
        driver.quit();


    }
}
