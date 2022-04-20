package com.ct.tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.testng.Assert.assertEquals;


public class RozetkaTestSelenide {

    @Test
    public void openTest() {
        open("https://rozetka.com.ua/");
        String actualTitle = title();

        assertEquals(actualTitle, "Интернет-магазин ROZETKA™: официальный сайт самого популярного онлайн-гипермаркета в Украине");
    }
}
