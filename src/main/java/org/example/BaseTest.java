import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://only.digital/");
        try {
        WebElement elementByXPath = driver.findElement(By.xpath("/html/body/main/footer"));
            System.out.println("Элемент найден: " + elementByXPath.getText());
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Элемент не найден.");
        }
        driver.quit();
    }
}
