package GenomeSample.PageObjects;

/*
 * Genome Sample Automation Test
 * Author: Rafael E. Medrano
 * Date: 7/9/2018
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainSite {
    WebDriver driver;

    By SearchBox = By.id("search-box");
    By SearchButton = By.xpath("//*[@id=\"searchbar\"]/div/a/div/div[2]/img");

    public MainSite(WebDriver driver)
    {
        this.driver = driver;
    }

    public void SearchBottle (String GIF)
    {
        driver.findElement(SearchBox).sendKeys(GIF);
    }

    public void Click()
    {
        driver.findElement(SearchButton).click();;
    }
}
