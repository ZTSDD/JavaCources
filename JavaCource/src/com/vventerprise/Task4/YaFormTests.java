package com.vventerprise.Task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Random;

public class YaFormTests {
    private WebDriver driver;
    public void setup() {
        System.setProperty("webdriver.Gecko.driver", "D:\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    public void testForm(){
        driver.get("https://forms.yandex.ru/u/605f06437b4a91f0625f5f00/");

        WebElement nameField = driver.findElement(By.name("answer_short_text_6881753"));
        nameField.sendKeys("Владислав");

        List<WebElement> whatChoises = driver.findElements(By.name("answer_choices_6881757"));
        int index = 2;
        whatChoises.get(index).click();

        WebElement selector = driver.findElement(By.className("select__button"));
        selector.click();

        List<WebElement> selectList = driver.findElements(By.className("select__text"));
        int index2 = 2;
        selectList.get(index2).click();

        WebElement submitBtn = driver.findElement(By.className("button_role_submit"));
        submitBtn.click();
    }
}
