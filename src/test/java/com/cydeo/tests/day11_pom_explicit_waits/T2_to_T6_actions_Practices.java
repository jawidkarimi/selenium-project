package com.cydeo.tests.day11_pom_explicit_waits;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2_to_T6_actions_Practices {

    @BeforeMethod
    public void setupMethod(){
        //1. Go to https://practice.cydeo.com/drag_and_drop_circles
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
    }

    @AfterMethod
    public void tearDownMethod(){
        Driver.closeDriver();
    }

    @Test
    public void test2_default_value_verification(){
        //TC2 #: Drag and drop default value verification

        //2. Verify big circle default text is as below.
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));


        //3. Assert:
        //-Text in big circle changed to: "Drag the small circle here."
        String expectedText = "Drag the small circle here.";
        String actualBigCircleText = bigCircle.getText();

        Assert.assertTrue(actualBigCircleText.equals(expectedText));
    }

    @Test
    public void test3_drop_into_the_big_circle(){

        //TC3 #: Drag and drop into the big circle


        //Locating the circle web element
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        //creating the actions object to do our actions
        Actions actions = new Actions(Driver.getDriver());

        //2. Drag and drop the small circle to bigger circle
        //actions.dragAndDrop(smallCircle,bigCircle).perform();  or
        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(bigCircle)
                .pause(1000)
                .release()
                .perform();

        //3. Assert
        //-Text in big circle changed to: "You did great!"
        String expectedText = "You did great!";
        String actualBigCircleText = bigCircle.getText();

        Assert.assertTrue(actualBigCircleText.equals(expectedText));
    }

    @Test
    public void test4_click_and_hold_small_circle(){

        //TC4 #: Click and hold


        //Locating the circle web element
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        //creating the actions object to do our actions
        Actions actions = new Actions(Driver.getDriver());

        //2. Drag and drop the small circle to bigger circle
        //actions.dragAndDrop(smallCircle,bigCircle).perform();  or
        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(Driver.getDriver().findElement(By.linkText("CYDEO")))
                .pause(1000)
                .perform();

        //3. Assert
        //-Text in big circle changed to: "You did great!"
        String expectedText = "Drop here.";
        String actualBigCircleText = bigCircle.getText();

        Assert.assertTrue(actualBigCircleText.equals(expectedText));
    }

    @Test
    public void test5_drop_outside_of_big_circle(){

        //TC5 #: drop_outside_of_big_circle


        //Locating the circle web element
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        //creating the actions object to do our actions
        Actions actions = new Actions(Driver.getDriver());

        //2. Drag and drop the small circle to bigger circle
        //actions.dragAndDrop(smallCircle,bigCircle).perform();  or
        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(Driver.getDriver().findElement(By.linkText("CYDEO")))
                .pause(1000)
                .release()
                .perform();

        //3. Assert
        //-Text in big circle changed to: "You did great!"
        String expectedText = "Try again!";
        String actualBigCircleText = bigCircle.getText();

        Assert.assertTrue(actualBigCircleText.equals(expectedText));
    }

    @Test
    public void test6_big_circle_hovering_text_verify(){

        //TC6 #: big_circle_hovering_text_verify

        //Locating the circle web element
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        //creating the actions object to do our actions
        Actions actions = new Actions(Driver.getDriver());

        //2. Drag and drop the small circle to bigger circle
        //actions.dragAndDrop(smallCircle,bigCircle).perform();  or
        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(bigCircle)
                .pause(1000)
                .perform();

        //3. Assert
        //-Text in big circle changed to: "Now Drop..."
        String expectedText = "Now drop...";
        String actualBigCircleText = bigCircle.getText();

        Assert.assertTrue(actualBigCircleText.equals(expectedText));
    }
}
