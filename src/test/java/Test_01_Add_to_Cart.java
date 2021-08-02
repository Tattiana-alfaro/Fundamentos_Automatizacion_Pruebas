import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_01_Add_to_Cart {

    @Test
    public void testAddToCart(){
        String URL = "https://demo.opencart.com/index.php?route=account/login";
        String pathToDriver = Main.class.getResource("/chromedriver.exe").getPath();
        System.setProperty("webdriver.chrome.driver", pathToDriver);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement searchBar = driver.findElement(By.xpath("//input[@name= 'search' and @type='text']"));
        searchBar.sendKeys("macbook");

        WebElement searchButton = driver.findElement(By.xpath("//button[@class= 'btn btn-default btn-lg' and @type='button']"));
        searchButton.click();

        //ASSERT PARA VALIDAR TEXTO DE MACBOOK

        WebElement firstElementDisplayed = driver.findElement(By.xpath("//*[@id='content']/div[3]/div[1]/div/div[2]/div[1]/h4/a"));
        firstElementDisplayed.click();

        WebElement addToCartButton = driver.findElement(By.xpath("//button[@id='button-cart']"));
        addToCartButton.click();

        WebElement successMessage = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        //Assert.assertTrue(successMessage.isDisplayed());
        driver.close();
        driver.quit();



    }
}
