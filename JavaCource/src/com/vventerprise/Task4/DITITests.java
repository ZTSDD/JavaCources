package com.vventerprise.Task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DITITests {
    private  WebDriver driver;
    public void setup() {
        System.setProperty("webdriver.Gecko.driver", "D:\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    public void showNews(){
        driver.get("https://mephi.ru/");

        WebElement searchToggle = driver.findElement(By.id("search-toggle"));
        searchToggle.click();

        WebElement searchField = driver.findElement(By.id("edit-search-block-form--2"));
        searchField.sendKeys("ДИТИ НИЯУ МИФИ");

        WebElement submitButton = driver.findElement(By.id("edit-submit"));
        submitButton.click();
    }
}
