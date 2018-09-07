package GenomeSample;

/*
 * Genome Sample Automation Test
 * Author: Rafael E. Medrano
 * Date: 7/9/2018
 */
import GenomeSample.PageObjects.GIFSite;
import GenomeSample.PageObjects.MainSite;
import GenomeSample.PageObjects.SearchSite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SearchBottleTC {
    @BeforeTest
    public void BrowserSetup() {
        String exePath = "/Users/emanuelmedrano/Desktop/Automation/chromedriver";
        System.setProperty("webdriver.chrome.driver", exePath);
    }

    @Test
    public void SearchBottleTC() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://giphy.com/"); //giphy.com loads smoothly


        MainSite SearchForBottleGIF = new MainSite(driver);
        SearchForBottleGIF.SearchBottle("Bottle");
        SearchForBottleGIF.Click(); //Until here, the word bottle is introduced and the search button is clicked.

        SearchSite TheGIF = new SearchSite(driver);
        TheGIF.GIFClick();//The GIF selected is clicked

        GIFSite ToCopy = new GIFSite(driver);
        ToCopy.CopyLinkAction();
        //Assert.assertEquals(driver.findElements(By.xpath("//*[@id=\"gif-results\"]/div[4]/div/div[2]/div[1]/div[1]/div/div/div[2]/div[4]/div[1]/input")), "Enter a URL to shorten") ;
        System.out.print("Shorten URL generated.");


        driver.quit();
    }

}
