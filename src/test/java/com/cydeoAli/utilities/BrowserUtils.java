package com.cydeoAli.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtils {

    /*
    This method will accept int (in seconds)
 and execute Thread.sleep for given duration
      */

    public static void sleep(int second){
        second *= 1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }


    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedUrl, String expectedInTitle){

        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();


        for(String each : driver.getWindowHandles()){

            Driver.getDriver().switchTo().window(each);

            System.out.println("Current URL: "+Driver.getDriver().getCurrentUrl());

            if(Driver.getDriver().getCurrentUrl().contains(expectedUrl)){
                break;
            }

        }

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    public static void verifyTitle(WebDriver driver, String expectedTitle){

        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);

    }

}
