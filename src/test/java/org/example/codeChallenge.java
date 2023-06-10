package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class codeChallenge {
    public WebDriver driver;

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clicUser(){
        WebElement buscarUser;
        buscarUser = driver.findElement(By.cssSelector("#user-name"));
        buscarUser.click();
        buscarUser.sendKeys("standard_user");
    }

    public void clicPass() {
        WebElement buscarPass;
        buscarPass = driver.findElement(By.cssSelector("#password"));
        buscarPass.click();
        buscarPass.sendKeys("secret_sauce");
    }
    public void clicLogin() {
        WebElement login;
        login = driver.findElement(By.cssSelector("#login-button"));
        login.click();
    }

    public void agregarCarrito() {
        WebElement agg;
        agg = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
        agg.click();
    }

    public void agregarCarrito1() {
        WebElement agg;
        agg = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light"));
        agg.click();
    }

    public void eliminarCarrito1() {
        WebElement agg;
        agg = driver.findElement(By.cssSelector("#remove-sauce-labs-bike-light"));
        agg.click();
    }
    public void clicCarrito(){
        WebElement carrito;
        carrito = driver.findElement(By.cssSelector("#shopping_cart_container"));
        carrito.click();
    }

    @Test
    public void test(){
        setUp();
        clicUser();
        clicPass();
        clicLogin();
        agregarCarrito();
        agregarCarrito1();
        eliminarCarrito1();
        clicCarrito();
    }
}
