package testo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tselen {

    @Test
    public void sel() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\junit4vepay\\src\\main\\resources\\driver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
    }

}
