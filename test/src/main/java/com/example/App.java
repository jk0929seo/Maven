package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.setProperty("webdriver.chrome.driver", "D:\\jk.seo\\work\\Maven\\test\\chromedriver.exe");
        

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.kt.com");

        driver.manage().window().fullscreen();

        
    }
}
