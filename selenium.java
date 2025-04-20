package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class NaukariUpdate {
    @Test(invocationCount = 1)
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();

        try {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            String userId = "tdeurmalle@gmail.com";
            driver.get("https://www.naukri.com/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//a[text()='Login']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@placeholder=\"Enter your active Email ID / Username\"]")).sendKeys("tdeurmalle@gmail.com");
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tushar@2211");
            driver.findElement(By.xpath("//button[text()='Login']")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//a[normalize-space()='View profile']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//em[@class='icon edit ' and @data-ga-track='spa-event|EditProfile|Basic Details|EditOpen']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);
            WebElement uploadBtn = driver.findElement(By.xpath("//input[@type='button']"));   //Resume update
            js.executeScript("arguments[0].click();", uploadBtn);
            WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
            fileInput.sendKeys("/Users/tusharnilkanthdeurmalle/Desktop/WORK/QA/Tushar.pdf");
            Thread.sleep(5000);
            System.out.println("Resume uploaded");

            driver.findElement(By.xpath("//div[@class='card mt15']//div//span[@class='edit icon'][normalize-space()='editOneTheme']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);
            System.out.println("Resume Headline updated");
            driver.findElement(By.xpath("//div[@class='widgetHead typ-16Bold']//span[@class='edit icon'][normalize-space()='editOneTheme']")).click();
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);
            System.out.println("Key skills Updated");
            js.executeScript("window.scrollBy(0,600)");
            Thread.sleep(5000);
            driver.findElement(By.xpath("(//span[@class='edit icon typ-14Medium' and @tabindex='0'])[1]")).click();
            Thread.sleep(5000);   //Employee section update
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("(//span[@class='edit icon typ-14Medium' and @tabindex='0'])[2]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//span[@data-prefillid='f3803c093e07abfb8d54be7442fc5ec6a1a7a45fc1230658f79fd6c296adc7b6']")).click();
            Thread.sleep(5000);     //Education
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);    //BE
            driver.findElement(By.xpath("//span[@data-prefillid='7936adbda3607f77ffa242d53c2bd0f18ea3b9200d0e5b5f']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);   //12th
            driver.findElement(By.xpath("//span[@data-prefillid='234a010ed7294b519d4740cbc07c843557e2d4e6983e0674']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);   //10th

            js.executeScript("window.scrollBy(0,600)");
            driver.findElement(By.xpath("//span[@data-prefillid='3407d0593c7148c9e29bdc7d3b4075c4b28687af8783ec73f79fd6c296adc7b6']")).click();
            Thread.sleep(5000);      //IT Skill
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//span[@data-prefillid='a0ce96e4db57ecd0207229c03f7d6c647264089d3f6efdc2113f03cb115cb3db']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//span[@data-prefillid='656f57ec567c3b982ccee34785d95f38429ad11519438bc511e56d4c06f64435']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//span[@data-prefillid='9c8af8d3858763055fcda8c045c4ca569d483041ded0b3715c4f31944917d4da']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//span[@data-prefillid='fc09ebac8b38ae75ec65d778d289c44ff712e8aa9e75467911e56d4c06f64435']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//span[@data-prefillid='fcc62553a6e775b7b7d439a266130112f0aacb99031c36c55c4f31944917d4da']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//span[@data-prefillid='dda5c45417e57f2c1702b2ebadd7c4e901e5b4fc786eb440f79fd6c296adc7b6']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//span[@data-prefillid='5f52150c44cffbcb67988ca24d22500bbdc8305737596f8a11e56d4c06f64435']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//span[@data-prefillid='98cca5b55e0f440f729149f6e7d8a3d8eda395fc90e4b48db679862093b973de']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//span[@data-prefillid='7dd597f5535b5a46a8c1dc90839f37b143e55b457773625c5c4f31944917d4da']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);

            js.executeScript("window.scrollBy(0,1100)");
            Thread.sleep(5000);
            driver.findElement(By.xpath("(//span[@class='edit icon' and text()='editOneTheme'])[3]")).click();
            Thread.sleep(5000); //Project Summary
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("(//span[@class='edit icon' and text()='editOneTheme'])[4]")).click();
            Thread.sleep(5000);  //Career profile
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//div[@class='widgetHead']//span[@class='icon edit']")).click();
            Thread.sleep(5000);  //Personal details
            driver.findElement(By.xpath("//button[text()='Save']")).click();
            Thread.sleep(5000);

            System.out.println(" Tushar Naukari.com Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(" I am Sorry not updated");
        } finally {
            driver.quit();
        }


    }
}
