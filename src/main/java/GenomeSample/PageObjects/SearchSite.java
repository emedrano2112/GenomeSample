package GenomeSample.PageObjects;

/*
 * Genome Sample Automation Test
 * Author: Rafael E. Medrano
 * Date: 7/9/2018
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchSite {
    WebDriver driver;

    By FirstGIF = By.cssSelector("#gif-results > div:nth-child(4) > div._3Rk-bEWGMEWneVsv7_KwZS > div > div:nth-child(2) > div:nth-child(1) > div > a > img");
    By ShortLink = By.xpath("//*[@id=\"gif-results\"]/div[4]/div/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/input");

    public SearchSite(WebDriver driver)
    {
        this.driver = driver;
    }

    public void GIFClick ()
    {
        driver.findElement(FirstGIF).click();
    }

    public void LinkConf()
    {
        driver.findElement(ShortLink).getText();
    }
}
