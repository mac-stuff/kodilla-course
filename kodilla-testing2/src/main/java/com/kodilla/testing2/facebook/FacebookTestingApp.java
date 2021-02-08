package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_ACCEPT_ALL = "//*[@id=\"u_0_h\"]";
    public static final String XPATH_CREATE_ACCOUNT = "//*[@id=\"u_0_2\"]";

    public static final String XPATH_SELECT_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_SELECT_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_SELECT_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath(XPATH_ACCEPT_ALL)).click();
        driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT)).click();

        while (!driver.findElement(By.xpath(XPATH_SELECT_MONTH)).isDisplayed());

        Select selectMonth = new Select(driver.findElement(By.name(XPATH_SELECT_MONTH)));
        selectMonth.selectByValue("7");

        Select selectDay = new Select(driver.findElement(By.xpath(XPATH_SELECT_DAY)));
        selectDay.selectByValue("13");

        Select selectYear = new Select(driver.findElement(By.xpath(XPATH_SELECT_YEAR)));
        selectYear.selectByValue("1983");
    }
}
