package GenomeSample.PageObjects;

/*
 * Genome Sample Automation Test
 * Author: Rafael E. Medrano
 * Date: 7/9/2018
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GIFSite {
    WebDriver driver;

    By CopyLink = By.xpath("//*[@id=\"gif-results\"]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/span");
    By ShortenURL = By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div/div[2]/div[1]/div[1]/div/div/div[2]/div[4]/div[1]/input");

    public GIFSite(WebDriver driver)
    {
        this.driver = driver;
    }

    public void CopyLinkAction ()
    {
        driver.findElement(CopyLink).click();
    }

    public void ConfirmShorten ()
    {
        driver.findElement(ShortenURL).getText();
    }
}
