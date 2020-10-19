package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    //import the selenium webDriver
    private WebDriver driver;

    //import chrome driver
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromeDriver.exe");
        driver = new ChromeDriver();

        //input project Url = deydam signin url
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        //waiting for globally
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        // maximize the window
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());
        //locate username field
        driver.findElement(By.id("username")).sendKeys("veragreen");
        //locate password field
        driver.findElement(By.id("password")).sendKeys("admin123");
        //click on the sign in button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
        Thread.sleep(10000);
        // close the browser after test
        driver.quit();

    }

    //initiate the test run command
    public static void main(String arg[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setup();

    }
  }

