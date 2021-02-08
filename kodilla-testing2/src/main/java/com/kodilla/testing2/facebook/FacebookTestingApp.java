package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_ACCEPT_ALL = "//*[@id=\"u_0_h\"]";
    public static final String XPATH_CREATE_ACCOUNT = "//*[@id=\"u_0_2\"]";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath(XPATH_ACCEPT_ALL)).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT)).click();
        Thread.sleep(1000);

        Select selectMonth = new Select(driver.findElement(By.name("birthday_month")));
        selectMonth.selectByVisibleText("Jul");

        Select selectDay = new Select(driver.findElement(By.name("birthday_day")));
        selectDay.selectByVisibleText("13");

        Select selectYear = new Select(driver.findElement(By.name("birthday_year")));
        selectYear.selectByVisibleText("1983");
    }
}
